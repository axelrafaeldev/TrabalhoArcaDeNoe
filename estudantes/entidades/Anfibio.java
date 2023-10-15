package estudantes.entidades;

import java.util.Objects;


public class Anfibio extends Animal {

    /**
     * Construtor completo para criar uma instância de Anfíbio.
     *
     * @param id           O número de identificação do anfíbio.
     * @param nome         O nome do anfíbio.
     * @param especie      A espécie do anfíbio.
     * @param andarDesejado O andar para o qual o anfíbio deseja ir (0 é o térreo).
     * @param peso         O peso do anfíbio em quilos.
     * @param temperaturaIdeal A temperatura ideal do anfíbio em graus Celsius.
     */
    public Anfibio(int id, String nome, String especie, int andarDesejado,
                   int peso, int temperaturaIdeal) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }

    /**
     * Método para andar.
     *
     * @return Uma string com a indicação "O anfíbio está andando."
     */
    public String andar() {
        return "O anfíbio está andando.";
    }

    /**
     * Método para nadar.
     *
     * @return Uma string com a indicação "O anfíbio está nadando."
     */
    public String nadar() {
        return "O anfíbio está nadando.";
    }

    @Override
    public String toString() {
        return "Anfíbio " + super.toString();
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
