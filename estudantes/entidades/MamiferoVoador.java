package estudantes.entidades;

public class MamiferoVoador extends Mamifero{

    final int PACIENCIA_MAXIMA = 15;

    public MamiferoVoador(int id, String nome, String especie, int andarDesejado,
    int peso, int temperaturaIdeal, boolean peludo) {
super(id, nome, especie, andarDesejado, peso, temperaturaIdeal,peludo);}
    
    public String voar(){
        return "voando";
    }
}
