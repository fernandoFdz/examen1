

public class Estacionamiento{
    private int capacidad;
    private int precio;
    private String placas;
    private arrayList<Auto> Autos; 
    
    private Estacionamiento(){
        capacidad=150;
        precio=15;
        placas=null;
        //Autos= arrayList<Auto> [150];
    }    
    
    public boolean Guarda(Auto Automovil){
        for(int i=0;i<Autos.length;i++){
            
        }
            
    }
    
    /**
     * falso si aun tiene espacio true si esta lleno
     */
    public int busca(String placas){
        for(int i=0;i<Autos.lenght;i++){
            if(Autos[i]==null)
                return false;
            else return true;//
                
        }
    }
}