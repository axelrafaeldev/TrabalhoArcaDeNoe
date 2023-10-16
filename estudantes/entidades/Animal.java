package estudantes.entidades;

import java.util.Objects;
/**
 * Classe que define um animal da arca.
 * <br><br>
 * Essa classe pode ser estendida. Adicionalmente, ela deve:
 * <br><br>
 * 1) ter um construtor completo,<br>
 * 2) implementar métodos de acesso (getters), sendo que métodos de modificação
 * (setters) NÃO devem ser implementados,<br>
 * 3) sobre-escrever os métodos toString, equals e hashCode,<br>
 * 4) deve implementar o método <i>aumentaEspera</i> conforme indicado na
 * documentação.
 * <br><br>
 * <strong>Não devem ser criados métodos adicionais nessa classe.</strong>
 * 
 * @author Ana
 * @version 1.2
 */

public class Animal {
    private static final int PACIENCIA_MAXIMA = 0;
    private int id;
    private String nome;
    private String especie;
    private int andarDesejado;
    private int peso;
    private int tempoDeEspera;
    private int temperaturaIdeal;

    // Construtor
    public Animal(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.andarDesejado = andarDesejado;
        this.peso = peso;
        this.tempoDeEspera = 0;
        this.temperaturaIdeal = temperaturaIdeal;
    }

    public int getId() {
        return id;
    }

    public int getPeso() {
        return peso;
    }

    public void aumentaEspera() {
        if (tempoDeEspera >= PACIENCIA_MAXIMA) {
            throw new RuntimeException("Animal esperou demais na fila e desistiu.");
        }
        tempoDeEspera++;
    }

    public int getAndarDesejado() {
        return andarDesejado;
    }

    public int getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    public void resetTempoEspera() {
        tempoDeEspera = 0;
    }

    public boolean podeSerTransportadoNoAgua() {
        if (this instanceof ReptilAquatico || this instanceof Peixe || this instanceof MamiferoAquatico || this instanceof Anfibio) {
            return true;
        }
    
        // Caso contrário, o animal não pode ser transportado na água.
        return false;
    }
     @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", andarDesejado=" + andarDesejado +
                ", peso=" + peso +
                ", tempoDeEspera=" + tempoDeEspera +
                ", temperaturaIdeal=" + temperaturaIdeal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id &&
                andarDesejado == animal.andarDesejado &&
                peso == animal.peso &&
                tempoDeEspera == animal.tempoDeEspera &&
                temperaturaIdeal == animal.temperaturaIdeal &&
                Objects.equals(nome, animal.nome) &&
                Objects.equals(especie, animal.especie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, especie, andarDesejado, peso, tempoDeEspera, temperaturaIdeal);
    }
    public int getTempoEspera() {
        return 0;
    }
}
