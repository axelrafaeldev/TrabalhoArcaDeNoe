package estudantes.entidades;

public class ReptilAquatico extends Reptil{
    
    final int PACIENCIA_MAXIMA = 15;

    public ReptilAquatico(int id, String nome, String especie, int andarDesejado,
    int peso, int temperaturaIdeal) {
super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);}

public String nada(){
    return "nadando";
}
}
