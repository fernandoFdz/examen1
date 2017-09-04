import java.until.arrayList; 


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
       
       if(busca(placas)==1){
           return false;
            }
       else return true;
                   
    }
    
    /**
     * 0 si aun tiene espacio 1 si esta lleno
     */
    public int busca(String placas){
        for(int i=0;i<Autos.lenght;i++){
            if(Autos[i]==null)
                return 0;
            else return 1;//
                
        }
    }
    
    public void sale(String BuscaPlaca){
        
    }
}
