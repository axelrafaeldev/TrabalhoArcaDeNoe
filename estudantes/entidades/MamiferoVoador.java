package estudantes.entidades;

public class MamiferoVoador extends Mamifero {
    // Atributo estático constante (readOnly)
    public static final int PACIENCIA_MAXIMA = 15;

    // Atributo de instância
    private int pacienciaAtual;

    /**
     * Construtor para criar uma instância de MamiferoVoador.
     *
     * @param id           O número de identificação do mamífero.
     * @param nome         O nome do mamífero.
     * @param especie      A espécie do mamífero.
     * @param andarDesejado O andar para o qual o mamífero deseja ir (0 é o térreo).
     * @param peso         O peso do mamífero em quilos.
     * @param temperaturaIdeal A temperatura ideal do mamífero em graus Celsius.
     * @param peludo       Indica se o mamífero é peludo (true) ou não (false).
     */
    public MamiferoVoador(int id, String nome, String especie, int andarDesejado,
                          int peso, int temperaturaIdeal, boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, peludo);
        this.pacienciaAtual = PACIENCIA_MAXIMA;
    }

    /**
     * Faz o mamífero voar, diminuindo sua paciência atual.
     *
     * @return Uma mensagem indicando se o mamífero está voando ou sem paciência.
     */
    public String voar() {
        if (pacienciaAtual > 0) {
            pacienciaAtual--;
            return getNome() + "voando.";
        } else {
            return getNome() + " está sem paciência para voar.";
        }
    }

    /**
     * Retorna uma representação em forma de string do objeto MamiferoVoador.
     *
     * @return Uma string contendo informações sobre o objeto.
     */
    @Override
    public String toString() {
        return "MamiferoVoador(nome='" + getNome() + "', pacienciaAtual=" + pacienciaAtual + ")";
    }

    /**
     * Calcula um código hash para o objeto com base em seus atributos.
     *
     * @return O código hash calculado.
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getNome().hashCode();
        result = 31 * result + pacienciaAtual;
        return result;
    }

    /**
     * Compara o objeto MamiferoVoador com outro objeto para determinar se são iguais.
     *
     * @param o O objeto a ser comparado.
     * @return true se os objetos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MamiferoVoador that = (MamiferoVoador) o;
        return pacienciaAtual == that.pacienciaAtual &&
                getNome().equals(that.getNome());
    }
}
