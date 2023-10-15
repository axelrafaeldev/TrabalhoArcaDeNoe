package estudantes.entidades;

public class Mamifero extends Animal {
    private boolean peludo;

    /**
     * Construtor completo para criar uma instância de Mamifero.
     *
     * @param id           O número de identificação do mamífero.
     * @param nome         O nome do mamífero.
     * @param especie      A espécie do mamífero.
     * @param andarDesejado O andar para o qual o mamífero deseja ir (0 é o térreo).
     * @param peso         O peso do mamífero em quilos.
     * @param temperaturaIdeal A temperatura ideal do mamífero em graus Celsius.
     * @param peludo       Indica se o mamífero é peludo (true) ou não (false).
     */
    public Mamifero(int id, String nome, String especie, int andarDesejado,
                    int peso, int temperaturaIdeal, boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.peludo = peludo;
    }

    /**
     * Verifica se o mamífero é peludo.
     *
     * @return true se o mamífero é peludo, false caso contrário.
     */
    public boolean isPeludo() {
        return peludo;
    }
}
