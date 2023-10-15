package estudantes.entidades;

public class AveQueVoa extends Ave {
    
    final int PACIENCIA_MAXIMA = 20;

    public AveQueVoa(int id, String nome, String especie, int andarDesejado,int peso, int temperaturaIdeal, String corDasPenas) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, corDasPenas);
    }
    public String voar(){
        return "voando";
    }
   

}
