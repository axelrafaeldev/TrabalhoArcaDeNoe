package estudantes.entidades;

public class Ave extends Animal {
    private String corDasPenas;

    /**
     * Construtor completo para criar uma instância de Ave.
     *
     * @param id           O número de identificação da ave.
     * @param nome         O nome da ave.
     * @param especie      A espécie da ave.
     * @param andarDesejado O andar para o qual a ave deseja ir (0 é o térreo).
     * @param peso         O peso da ave em quilos.
     * @param temperaturaIdeal A temperatura ideal da ave em graus Celsius.
     * @param corDasPenas  A cor das penas da ave.
     */
    public Ave(int id, String nome, String especie, int andarDesejado,
               int peso, int temperaturaIdeal, String corDasPenas) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
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
        return "Ave [corDasPenas=" + corDasPenas + "] " + super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + corDasPenas.hashCode();
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
        return super.equals(obj) && corDasPenas.equals(other.corDasPenas);
    }
}
