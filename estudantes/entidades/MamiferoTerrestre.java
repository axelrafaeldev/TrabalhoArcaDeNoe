package estudantes.entidades;

public class MamiferoTerrestre extends Mamifero {

    final int PACIENCIA_MAXIMA = 35;

    public MamiferoTerrestre(int id, String nome, String especie, int andarDesejado,int peso, int temperaturaIdeal, boolean peludo) 
    {super(id, nome, especie, andarDesejado, peso, temperaturaIdeal,peludo);}


    public String anda(){
        return "está andando";
    }
    
}
