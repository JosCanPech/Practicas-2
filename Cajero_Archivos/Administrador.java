import static cajero_automaticov2023.Billetes.billetes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author josue
 */
public class Administrador extends Client{
    
    
    public Administrador(String usuario, int nip) {
        super(usuario, nip);
    }
    
    
    /*public static void adminleerlogs() {
        try (BufferedReader reader = new BufferedReader(new FileReader("logs.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de logs.");
        }
    }*/
    
    
}
    
    
    
    /*
    public static void mostrarlog(){
        
    }
    
    public void mostrarbilletesdisponibles(){
        
    }*/
