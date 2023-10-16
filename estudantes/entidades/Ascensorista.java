package estudantes.entidades;

import professor.entidades.Andar;
import professor.entidades.Arca;
import professor.entidades.Elevador;
import java.util.List;

/**
 * Classe que traz a lógica do algoritmo de uso do elevador.
 * <br><br>
 * Você pode incluir novos atributos e métodos nessa classe para criar
 * lógicas mais complexas para o gerenciamento do uso do elevador, mas esses
 * <strong>atributos e métodos devem ser todos privados</strong>. O único
 * método público deve ser "agir".
 * 
 * @author Ana
 * @version 1.2
 */
public class Ascensorista {
    private Elevador elevador;
    private Andar andarAtual;
    private List<Andar> andares;
    private int tempoEsperaMaximo;
    private int pesoMaximo;

    /**
     * Construtor da classe Ascensorista.
     *
     * @param elevador          Instância do elevador a ser gerenciada.
     * @param andares           Lista de andares do edifício.
     * @param tempoEsperaMaximo Tempo máximo que um animal pode esperar na fila.
     * @param pesoMaximo        Peso máximo que o elevador suporta.
     */
    public Ascensorista(Elevador elevador, List<Andar> andares, int tempoEsperaMaximo, int pesoMaximo) {
        this.elevador = elevador;
        this.andares = andares;
        this.tempoEsperaMaximo = tempoEsperaMaximo;
        this.pesoMaximo = pesoMaximo;
    }
public Ascensorista(){
    
}
    /**
     * Método público responsável por coordenar o uso do elevador.
     *
     * @param elevador2 Elevador a ser gerenciado.
     * @param andar     Andar para onde o elevador se move.
     */
    public void agir(Elevador elevador2, Andar andar) {
        andarAtual = andares.get(elevador.getAndar());

        // Verifica animais na fila e os transporta
        while (andarAtual.consultarTamanhoDaFila() > 0) {
            Animal animal = andarAtual.chamarProximoDaFila();

            if (podeEntrarNoElevador(animal)) {
                if (elevador.isCheioDeAgua() && !animal.podeSerTransportadoNoAgua()) {
                    elevador.drenar(); // Ação apropriada para tratar o animal que precisa de água
                }

                elevador.embarcar(animal);

                // Atualiza a temperatura do ar condicionado
                ajustarTemperaturaArCondicionado(animal.getTemperaturaIdeal());
            } else {
                if (animal.getTempoEspera() >= tempoEsperaMaximo) {
                    // Animal espera demais, remove da fila
                    andarAtual.tirarDaFila(animal);
                } else {
                    // Incrementa o tempo de espera do animal
                    animal.aumentaEspera();
                }
            }
        }
    }

    // Métodos privados

    /**
     * Verifica se um animal pode entrar no elevador com base em critérios como
     * capacidade do elevador, temperatura e outros fatores.
     *
     * @param animal Animal a ser verificado.
     * @return True se o animal pode entrar no elevador, false caso contrário.
     */
    private boolean podeEntrarNoElevador(Animal animal) {
        return (!elevador.isCheioDeAgua() || animal.podeSerTransportadoNoAgua())
            && elevador.getAndar() + elevador.andar <= Arca.QUANTIDADE_DE_ANDARES_NA_ARCA - 1
            && Math.abs(elevador.getTemperaturaDoArCondicionado() - animal.getTemperaturaIdeal()) <= 15;
    }

    /**
     * Ajusta a temperatura do ar condicionado do elevador para se aproximar da
     * temperatura ideal do animal.
     *
     * @param temperaturaIdeal Temperatura ideal do animal.
     */
    private void ajustarTemperaturaArCondicionado(int temperaturaIdeal) {
        int temperaturaAtual = elevador.getTemperaturaDoArCondicionado();
        int diferenca = Math.abs(temperaturaAtual - temperaturaIdeal);

        if (diferenca > 15) {
            if (temperaturaAtual < temperaturaIdeal) {
                while (temperaturaAtual < temperaturaIdeal && temperaturaAtual < 40) {
                    temperaturaAtual++;
                }
            } else {
                while (temperaturaAtual > temperaturaIdeal && temperaturaAtual > 0) {
                    temperaturaAtual--;
                }

                elevador.setTemperaturaDoArCondicionado(temperaturaAtual);
            }
        }
    }
}
