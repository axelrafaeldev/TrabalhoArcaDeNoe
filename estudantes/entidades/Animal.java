package estudantes.entidades;

import java.util.Objects;


public class Animal {
    
    /**
     * Limite da paciência de um animal esperando na fila antes de ir embora.
     */
    public final int PACIENCIA_MAXIMA = 25; //em segundos (ciclos de espera)
    
    private int id;
    private String nome;
    private String especie;
    private int peso; //em quilos
    private int andarDesejado; //0 é o térreo
    private int tempoDeEspera;
    private int temperaturaIdeal; //em graus Celsius
    
    /**
     * Construtor do animal.
     * Todos os atributos são passados por parâmetro, exceto o tempo de espera
     * que sempre começa em 0.
     * 
     * @param id              O número de identificação do animal.
     * @param nome            O nome do animal.
     * @param especie         A espécie do animal.
     * @param andarDesejado   O andar para o qual o animal deseja ir (0 é o térreo).
     * @param peso            O peso do animal em quilos.
     * @param temperaturaIdeal A temperatura ideal do animal em graus Celsius.
     */
    public Animal(int id, String nome, String especie, int andarDesejado, 
            int peso, int temperaturaIdeal){
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.andarDesejado = andarDesejado;
        this.peso = peso;
        this.temperaturaIdeal = temperaturaIdeal;
        this.tempoDeEspera = 0;
    }

    /**
     * Retorna o número de identificação do animal.
     * 
     * @return O número de identificação do animal.
     */
    public int getId(){
        return id;
    }

    /**
     * Retorna o nome do animal.
     * 
     * @return O nome do animal.
     */
    public String getNome(){
        return nome;
    }

    /**
     * Retorna a espécie do animal.
     * 
     * @return A espécie do animal.
     */
    public String getEspecie(){
        return especie;
    }

    /**
     * Retorna o andar que o animal deseja ir.
     * 
     * @return O andar desejado pelo animal.
     */ 
    public int getAndarDesejado(){
        return andarDesejado;
    }

    /**
     * Retorna o peso do animal.
     * 
     * @return O peso do animal em quilos.
     */
    public int getPeso(){
        return peso;
    }

    /**
     * Retorna a temperatura ideal do animal.
     * 
     * @return A temperatura ideal do animal em graus Celsius.
     */
    public int getTemperaturaIdeal(){
        return temperaturaIdeal;
    }

    /**
     * Retorna o tempo de espera do animal.
     * 
     * @return O tempo de espera do animal em segundos (ciclos de espera).
     */
    public int getTempoDeEspera(){
        return tempoDeEspera;
    }

    /**
     * Retorna uma representação em String do animal.
     * A representação é composta por todos os atributos do animal, separados
     * por vírgula e espaço, e entre colchetes.
     * 
     * @return Uma representação em String do animal.
     */
    public String toString(){
        return "["+id+", "+nome+", "+especie+", "+andarDesejado+", "+peso+", "+temperaturaIdeal+", "+tempoDeEspera+"]";
    }

    /**
     * Aumenta o tempo de espera de um animal na fila quando passa um ciclo.
     * Esse é o tempo de espera na fila de um andar para embarcar no elevador.
     * Um ciclo ocorre sempre que o método de simular vida na arca é invocado.
     * Esse método não deve ser chamado fora da classe Arca.
     * <br><br>
     * A implementação desse método deve comparar a paciência do animal com
     * o tempo de espera depois de incrementado. Se ela for menor, uma exceção
     * deve ser lançada.
     * 
     * @throws RuntimeException Se o animal está esperando a mais tempo que a paciência.
     * @see professor.entidades.Arca#simularVida
     */
    public void aumentaEspera(){
        tempoDeEspera++;
        if(tempoDeEspera > PACIENCIA_MAXIMA){
            throw new RuntimeException("Animal esperando a mais tempo que a paciência");
        }
    }

    /**
     * Sobrescreve o método equals para comparar dois objetos Animal.
     * Dois animais são considerados iguais se tiverem o mesmo ID.
     * 
     * @param outro O objeto a ser comparado com o objeto atual.
     * @return true se os objetos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object outro) {
        if (this == outro) {
            return true;
        }
        if (outro == null || getClass() != outro.getClass()) {
            return false;
        }
        Animal outroAnimal = (Animal) outro;
        return id == outroAnimal.id;
    }

    /**
     * Sobrescreve o método hashCode para gerar um código de hash com base no ID.
     * 
     * @return O código de hash gerado.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}