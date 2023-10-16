package estudantes.entidades;

/**
 * Representa uma ave que pode voar, derivada da classe Ave.
 */
public class AveVoadora extends Ave {

    /**
     * Construtor para criar uma instância de AveQueVoa.
     *
     * @param id               O número de identificação da ave.
     * @param nome             O nome da ave.
     * @param especie          A espécie da ave.
     * @param andarDesejado    O andar para o qual a ave deseja ir (0 é o térreo).
     * @param peso             O peso da ave em quilos.
     * @param temperaturaIdeal A temperatura ideal da ave em graus Celsius.
     * @param corDasPenas      A cor das penas da ave.
     */
    public AveVoadora(int id, String nome, String especie, int andarDesejado,
                     int peso, int temperaturaIdeal, String corDasPenas) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, corDasPenas);
    }

    /**
     * Permite que a ave voe.
     *
     * @return Uma mensagem indicando que a ave está voando.
     */
    public String voar() {
        return "voando";
    }

    /**
     * Sobrescreve o método toString para representação em string da classe AveQueVoa.
     *
     * @return Uma representação em string da ave que voa.
     */
    @Override
    public String toString() {
        return "AveQueVoa [corDasPenas=" + getCorDasPenas() + "] " + super.toString();
    }

    /**
     * Sobrescreve o método equals para verificar a igualdade com outro objeto.
     *
     * @param obj O objeto a ser comparado com a ave que voa.
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
        AveQueVoa other = (AveQueVoa) obj;
        return super.equals(obj) && getCorDasPenas().equals(other.getCorDasPenas());
    }
}
