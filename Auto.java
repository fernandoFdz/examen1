public class Auto{
    private String placas; 
    private int hora; 
    private int minuto; 
    
    private Auto(){
        hora=0;
        minuto=0;
        placas=null;
        
        }
        
    public void capturaAuto(String placa, int Horas, int minutos){
        hora=Horas;
        minuto=minutos;
        placas=placa; 
        }
        
    
    }
    
    
