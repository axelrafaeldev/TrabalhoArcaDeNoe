package estudantes.entidades;
public class Anfibio {
    public static final int PACIENCIA_MAXIMA = 45;

    // Construtor
    public Anfibio() {
        
    }

    // Método para andar
    public String andar() {
        return "O anfíbio está andando.";
    }

    // Método para nadar
    public String nadar() {
        return "O anfíbio está nadando.";
    }

    @Override
    public String toString() {
        return "Anfibio";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }
}
