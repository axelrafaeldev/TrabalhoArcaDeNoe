package estudantes.entidades;

public class Reptil extends Animal {

    /**
     * Construtor completo para criar uma instância de Reptil.
     *
     * @param id           O número de identificação do réptil.
     * @param nome         O nome do réptil.
     * @param especie      A espécie do réptil.
     * @param andarDesejado O andar para o qual o réptil deseja ir (0 é o térreo).
     * @param peso         O peso do réptil em quilos.
     * @param temperaturaIdeal A temperatura ideal do réptil em graus Celsius.
     */
    public Reptil(int id, String nome, String especie, int andarDesejado,
                  int peso, int temperaturaIdeal) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }

    /**
     * Método que indica que o réptil está andando.
     *
     * @return Uma string com a indicação "andando".
     */
    public String andar() {
        return "andando";
    }

    @Override
    public String toString() {
        return "Reptil " + super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return super.equals(obj);
    }
}
