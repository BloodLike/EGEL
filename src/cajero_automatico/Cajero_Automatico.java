
package cajero_automatico;
import java.util.Scanner;

public class Cajero_Automatico {

     
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int intentos = 3;
        String pin = "1234"; 
        String lectura;
        String usuario,apellido,contrasena;
        double SaldoInic; 
        
        
        
        System.out.println("Cajero Automatico");
        
        char repuesta = 'n';
        do{
            
            System.out.println("Ingresa el Pin");
            lectura = teclado.next(); 
            if(lectura.equals(pin)){
                System.out.println("Bienvenido");
                System.out.println("Ingresa Tu nombre");
                usuario = teclado.next();
                System.out.println("Ahora Ingresa tus apellidos");
                apellido = teclado.next(); 
                System.out.println("Ingresa tu Saldo Inicial");
                SaldoInic = teclado.nextDouble();
                Cajero C1 = new Persona(usuario,apellido,SaldoInic,pin);
                System.out.println("Bienvenido " + C1.get_attrib("nombre") + C1.get_attrib("apellido"));
                
                
                
            }
            else{
                System.out.println("Pin Invalido");
                intentos--;
                if(intentos == 0){
                    System.out.println("Maximo de Intentos alcanzado, intentalo mas tarde");
                    break; 
                }
            }
            
        
            
            
        }while(repuesta == 'n');
    }
    
}
