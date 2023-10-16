package estudantes.entidades;

/**
 * Representa um mamífero aquático que pode nadar, derivado da classe Mamifero.
 */
public class MamiferoAquatico extends Mamifero {
    // Constante para paciência máxima
    public static final int PACIENCIA_MAXIMA = 40;

    /**
     * Construtor para criar uma instância de MamiferoAquatico.
     *
     * @param id               O número de identificação do mamífero.
     * @param nome             O nome do mamífero.
     * @param especie          A espécie do mamífero.
     * @param andarDesejado    O andar para o qual o mamífero deseja ir (0 é o térreo).
     * @param peso             O peso do mamífero em quilos.
     * @param temperaturaIdeal A temperatura ideal do mamífero em graus Celsius.
     * @param peludo           Indica se o mamífero é peludo (true) ou não (false).
     */
    public MamiferoAquatico(int id, String nome, String especie, int andarDesejado,
                            int peso, int temperaturaIdeal, boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, peludo);
    }

    /**
     * Permite que o mamífero aquático nade.
     *
     * @return Uma mensagem indicando que o mamífero está nadando.
     */
    public String nadar() {
        return "nadando";
    }

    /**
     * Sobrescreve o método toString para representação em string da classe MamiferoAquatico.
     *
     * @return Uma representação em string do mamífero aquático.
     */
    @Override
    public String toString() {
        return "MamiferoAquatico [peludo=" + isPeludo() + "] " + super.toString();
    }

    /**
     * Sobrescreve o método hashCode.
     *
     * @return O código hash calculado com base nos atributos do mamífero aquático.
     */
    @Override
    public int hashCode() {
        return super.hashCode() + Boolean.hashCode(isPeludo());
    }

    /**
     * Sobrescreve o método equals para verificar a igualdade com outro objeto.
     *
     * @param obj O objeto a ser comparado com o mamífero aquático.
     * @return true se os objetos forem iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MamiferoAquatico other = (MamiferoAquatico) obj;
        return super.equals(obj) && isPeludo() == other.isPeludo();
    }
}
