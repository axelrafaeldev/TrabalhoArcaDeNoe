package estudantes.entidades;

public class ReptilAquatico extends Reptil {
    // Atributo estático constante (readOnly)
    public static final int PACIENCIA_MAXIMA = 15;

    // Atributos de instância
    private int pacienciaAtual;

    /**
     * Construtor para criar uma instância de ReptilAquatico.
     *
     * @param id             O número de identificação do réptil aquático.
     * @param nome           O nome do réptil aquático.
     * @param especie        A espécie do réptil aquático.
     * @param andarDesejado  O andar para o qual o réptil deseja ir (0 é o térreo).
     * @param peso           O peso do réptil aquático em quilos.
     * @param temperaturaIdeal A temperatura ideal do réptil aquático em graus Celsius.
     */
    public ReptilAquatico(int id, String nome, String especie, int andarDesejado,
                          int peso, int temperaturaIdeal) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.pacienciaAtual = PACIENCIA_MAXIMA;
    }

    /**
     * Faz o réptil aquático nadar, diminuindo sua paciência atual.
     *
     * @return Uma mensagem indicando se o réptil está nadando ou sem paciência.
     */
    public String nadar() {
        if (pacienciaAtual > 0) {
            pacienciaAtual--;
            return getNome() + " está nadando na água.";
        } else {
            return getNome() + " está sem paciência para nadar.";
        }
    }

    private String getNome() {
        return null;
    }

    /**
     * Retorna uma representação em forma de string do objeto ReptilAquatico.
     *
     * @return Uma string contendo informações sobre o objeto.
     */
    @Override
    public String toString() {
        return "ReptilAquatico(nome='" + getNome() + "', pacienciaAtual=" + pacienciaAtual + ")";
    }

    /**
     * Compara o objeto ReptilAquatico com outro objeto para determinar se são iguais.
     *
     * @param o O objeto a ser comparado.
     * @return true se os objetos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReptilAquatico that = (ReptilAquatico) o;
        return pacienciaAtual == that.pacienciaAtual &&
                getNome().equals(that.getNome());
    }
}
