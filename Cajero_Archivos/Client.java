import java.io.File;


/**
 *
 * @author josue
 */
public class Client {
    
   
    
    
    
    private String nombreusuario;
    private int nip;
    //int client;
    
    
    public Client(String nombreusuario, int nip){
        this.nombreusuario = nombreusuario;
        this.nip = nip;
        //client ++;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

}
