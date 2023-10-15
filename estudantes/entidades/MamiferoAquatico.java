package estudantes.entidades;

public class MamiferoAquatico extends Mamifero {

    final int PACIENCIA_MAXIMA = 40;

    public MamiferoAquatico(int id, String nome, String especie, int andarDesejado,
    int peso, int temperaturaIdeal, boolean peludo) {
super(id, nome, especie, andarDesejado, peso, temperaturaIdeal,peludo);}
    
public String nadar(){
    return "nadando";
}


}
