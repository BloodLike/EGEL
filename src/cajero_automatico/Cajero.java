package cajero_automatico;


public class Cajero {
    protected double Saldo; 
    protected String Contrasena; 
    
    
    public Cajero(){
        
    }
    
    public Cajero(double Saldo, String Contrasena){
        this.Saldo = Saldo; 
        this.Contrasena = Contrasena; 
    }
    
    
    public void set_Atrrib(String atributo, String valor){
        String conversion = atributo.toLowerCase();
        switch(conversion){
            case "saldo"->{
                double convertir = Double.parseDouble(valor);
                this.Saldo = convertir;
            }
            case "contrasena"->{
                this.Contrasena = valor; 
            }

        }
    }
    
    public double get_Saldo(){
       
        return Saldo;
    }
    
    public String get_attrib(String atributo){
        String conversion = atributo.toLowerCase(); 
        switch(conversion){
            case "saldo"->{
                String convertir = String.valueOf(this.Saldo); 
                return convertir; 
            }
            
            case "contrasena"->{
                return this.Contrasena; 
            }
        }
        return "atributo no encontrado";
    }
    
   
  
    
}
