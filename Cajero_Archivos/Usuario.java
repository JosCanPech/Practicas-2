/**
 *
 * @author josue
 */
import static cajero_automaticov2023.Billetes.billetes;
import static cajero_automaticov2023.CajeroAutomaticoMain.funcUsuario;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class Usuario extends Client {
    static boolean cortador;
    //--------------
    private int saldousuario;
    private int id;
    static int cont;
    
    static Scanner in = new Scanner(System.in);
    static Scanner in2 = new Scanner(System.in);
    Scanner inD = new Scanner(System.in);
    
    static ArrayList <Usuario> usuarios = new ArrayList<>();
    
    
    
    public Usuario(String nombreusuario, int nip) {
        super(nombreusuario, nip);
        int pos = cont++;
        this.saldousuario = (int) (Math.random()*(50000-1000)+5000);
        this.id = cont++;
    }

    public static int getCont() {
        return cont;
    }

    public int getId() {
        return id;
    }
    
    
    public int getSaldousuario() {
        return saldousuario;
    }
    
    

    public void setSaldousuario(int saldousuario) {
        this.saldousuario = saldousuario;
    }
     
    
    public static void consultarsaldo(){
        do{
            try{
                int saldo = usuarios.get(0/*Usuario.getCont()*/).getSaldousuario();  
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("Su saldo disponible es: "+saldo);
        System.out.println("");
        funcUsuario();
                
            }catch(InputMismatchException a){
                System.out.println("Error de datos");
            }finally{
                funcUsuario();
            }
        }while(cortador = false);
        
       
        
    }     
 
    public static void retirarsaldo(){

         //int posicionuser = usuarios.IndexOf(usuarios.);
         
       int b100disponibles = (billetes.get(0).getCantidadbilletes()*100);
        int b200disponibles = (billetes.get(1).getCantidadbilletes())*200;
        int b500disponibles = (billetes.get(2).getCantidadbilletes())*500;
        int b1000disponibles = (billetes.get(3).getCantidadbilletes())*1000;
        
       int dinerodisponiblecajr = b100disponibles+b200disponibles+b500disponibles+b1000disponibles;
       int posicionuser = cont;//usuarios.IndexOf(Usuario.nombre nip);
       
       int saldouseract = usuarios.get(0).getSaldousuario();
       System.out.println("");
       System.out.println("");
       System.out.println("-----------------------------------------");
       System.out.println("Su saldo disponible es: "+saldouseract);
       System.out.println("La cantidad máxima posible de retirar es: "+dinerodisponiblecajr);
       System.out.println("");
       System.out.print("Teclee la cantidad deseada a retirar: "); int cantidaddeseada = in2.nextInt();
       if(cantidaddeseada<=saldouseract){
           int bill1000= (int) (cantidaddeseada/1000);
           int bill500 =  (int) (cantidaddeseada/500);
           int bill200 =  (int) (cantidaddeseada/200);
           int bill100 =  (int) (cantidaddeseada/100);
           
           int newCantbill100 = (billetes.get(0).getCantidadbilletes())-bill100;
           int newCantbill200 = (billetes.get(1).getCantidadbilletes())-bill200;
           int newCantbill500 = (billetes.get(2).getCantidadbilletes())-bill500;
           int newCantbill1000 = (billetes.get(3).getCantidadbilletes())-bill1000;
           
           billetes.get(0).setCantidadbilletes(newCantbill100);
           billetes.get(1).setCantidadbilletes(newCantbill200);
           billetes.get(2).setCantidadbilletes(newCantbill500);
           billetes.get(1).setCantidadbilletes(newCantbill1000);
           
           int Valor100 = bill100*100;
           int Valor200 = bill200*200;
           int Valor500 = bill500*500;
           int Valor1000 = bill1000*1000;
           int saldoarestar = Valor100+Valor200+Valor500+Valor1000;
           int newSaldo = saldouseract-saldoarestar;
           usuarios.get(0).setSaldousuario(newSaldo);
           System.out.println("");
           System.out.println("Su saldo restante es: "+newSaldo);
           
       }else{
           if(cantidaddeseada<=0 && cantidaddeseada>saldouseract){
               System.out.println("");
               System.out.println("Cantidad no disponible");
           }
       }
       
         //CajFiles.escribir("billetes.dat",billetes);
    }    
}
