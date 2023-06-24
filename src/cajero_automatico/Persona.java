package cajero_automatico;


public class Persona extends Cajero{
    
    private String nombre; 
    private String apellido; 

    
    
    public Persona(String nombre, String apellido, double Saldo,String Contrasena){
        super(Saldo,Contrasena); 
        this.nombre = nombre; 
        this.apellido = apellido;
        
    }
    
    @Override
    public void set_Atrrib(String atributo, String valor){
        String conversion = atributo.toLowerCase();
        switch(conversion){
            case "nombre"->{
                this.nombre = valor;
            }
            case "apellido"->{
                this.apellido = valor; 
            }

        }
    }
    
    @Override
    public String get_attrib(String atributo){
        String conversion = atributo.toLowerCase(); 
        switch(conversion){
            case "nombre"->{
                return this.nombre;
            }
            case "apellido"->{
                return this.apellido; 
            }
        }
        return super.get_attrib(conversion);
    }
    
    
    
    
}
