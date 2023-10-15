package estudantes.entidades;

/**
 * Representa uma ave com características como cor das penas.
 */
public class Ave {
    /**
     * Valor máximo de paciência para uma ave.
     */
    public static final int PACIENCIA_MAXIMA = 30;

    private String corDasPenas;

    /**
     * Construtor completo para criar uma instância de Ave.
     *
     * @param corDasPenas A cor das penas da ave.
     */
    public Ave(String corDasPenas) {
        this.corDasPenas = corDasPenas;
    }

    /**
     * Obtém a cor das penas da ave.
     *
     * @return A cor das penas da ave.
     */
    public String getCorDasPenas() {
        return corDasPenas;
    }

    /**
     * Retorna uma mensagem indicando que a ave está andando.
     *
     * @return Mensagem indicando que a ave está andando.
     */
    public String andar() {
        return "andando";
    }
    @Override
    public String toString() {
        return "Ave [corDasPenas=" + corDasPenas + "]";
    }

    @Override
    public int hashCode() {
        return corDasPenas.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ave other = (Ave) obj;
        return corDasPenas.equals(other.corDasPenas);
    }
}

