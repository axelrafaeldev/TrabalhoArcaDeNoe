package estudantes.entidades;

public class Peixe extends Animal {
    private String corDasEscamas;

    /**
     * Construtor completo para criar uma instância de Peixe.
     *
     * @param id           O número de identificação do peixe.
     * @param nome         O nome do peixe.
     * @param especie      A espécie do peixe.
     * @param andarDesejado O andar para o qual o peixe deseja ir (0 é o térreo).
     * @param peso         O peso do peixe em quilos.
     * @param temperaturaIdeal A temperatura ideal do peixe em graus Celsius.
     * @param corDasEscamas A cor das escamas do peixe.
     */
    public Peixe(int id, String nome, String especie, int andarDesejado,
                 int peso, int temperaturaIdeal, String corDasEscamas) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.corDasEscamas = corDasEscamas;
    }

    /**
     * Obtém a cor das escamas do peixe.
     *
     * @return A cor das escamas do peixe.
     */
    public String getCorDasEscamas() {
        return corDasEscamas;
    }

    /**
     * Retorna uma mensagem indicando que o peixe está nadando.
     *
     * @return Mensagem indicando que o peixe está nadando.
     */
    public String nadar() {
        return "nadando";
    }

    @Override
    public String toString() {
        return "Peixe [corDasEscamas=" + corDasEscamas + "] " + super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + corDasEscamas.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Peixe other = (Peixe) obj;
        return super.equals(obj) && corDasEscamas.equals(other.corDasEscamas);
    }
}
