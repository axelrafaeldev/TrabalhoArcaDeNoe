package estudantes.entidades;

public class AveQueVoa extends Ave {

    // Constante que define o valor máximo de paciência para a ave
    final int PACIENCIA_MAXIMA = 20;

    /**
     * Construtor da classe AveQueVoa.
     *
     * @param id             O ID da ave.
     * @param nome           O nome da ave.
     * @param especie        A espécie da ave.
     * @param andarDesejado  O andar desejado da ave.
     * @param peso           O peso da ave.
     * @param temperaturaIdeal A temperatura ideal para a ave.
     * @param corDasPenas    A cor das penas da ave.
     */
    public AveQueVoa(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal, String corDasPenas) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, corDasPenas);
    }

    /**
     * Método que permite à ave voar.
     *
     * @return Uma string indicando que a ave está voando.
     */
    public String voar() {
        return "voando";
    }
}
