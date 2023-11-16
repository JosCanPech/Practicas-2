import static cajero_automaticov2023.Billetes.billetes;
import static cajero_automaticov2023.Billetes.calculardinerodisponiblecajero;
import static cajero_automaticov2023.Usuario.usuarios;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CajeroAutomaticoMain {
    
    private static boolean ref1;
    int cont;
    static Scanner Source = new Scanner(System.in);
    static Scanner Source2 = new Scanner(System.in);
    private static boolean reg;
    private static boolean reg2;
    Scanner imput = new Scanner(System.in);

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
  
    public static void Bienvenida(){
        String datetime = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a")
                .format(LocalDateTime.now());
        
        //LocalDateTime datetime = LocalDateTime.now();
        System.out.println("");
        System.out.println("");
        System.out.println(ANSI_BLUE+"Hello / Hola"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"Welcome / Bienvenido"+ANSI_RESET);
        System.out.println("");
        System.out.println("Date time: "+datetime);
    }
    
  
    public static void Welcome(){
      do{
          try{
        System.out.println("");
        System.out.println("");
        System.out.println("Eres nuevo? Registrate pulsando 1");
        System.out.println("Pulsa 2 para continuar");
        System.out.println("Pulsa 0 para salir");
        System.out.println();
        System.out.print("Teclee su eleccion: ");int WelValidacion= Source2.nextInt();
        switch (WelValidacion){
            case 0:System.out.println("");
                   System.out.println("Gracias por su preferencia que tega un lindo dia!"); break;
            case 1: crearnuevousuario(); ref1=false; break;
            case 2: Ingreso(); ref1=false; break;
            default:System.out.println("");
        }
        System.out.println("");
              
          }catch(InputMismatchException a){
            System.out.println("Ingrese una opcion valida");
            System.out.println("");        
            ref1 = false;
          }finally{
             
          }
      }while(ref1 !=false);
            
    }
    
    public static void Ingreso(){        
        do{          
            try{ 
        System.out.println("");
        System.out.println("Ingrese su nombre: ");
        //Acá va el scanner de tipo string con valicadión de nombre admin o usuario común
        String usuario = Source.nextLine();
        System.out.println("Ingrese su NIP: ");
        int Nip = Source.nextInt();
        if(usuario != "admin" && Nip != 3243){
            Opsmenu(1); reg = false;
        }else{
            Opsmenu(2); reg = false;
        }
            }catch(InputMismatchException a){
            System.out.println("Ingrese un nip valido");
            System.out.println("");        
        }finally{         
            }
    }while(reg = false);
  }
     public static void crearnuevousuario(){
        try{
        
         System.out.println("");
         System.out.print("Ingrese un nombre de Usuario(8-10 Caracteres): ");String username = Source.nextLine();
         System.out.print("Ingrese un NIP (4 Caracteres): ");int Nip1 = Source2.nextInt();
         
        // int dinero = math.random
         usuarios.add(new Usuario(username,Nip1));
        
        }catch(InputMismatchException e){
         System.out.println();
        System.out.println("Verifique los datos");
    }finally{
            Welcome();
            }
     }
    
    public static void Opsmenu(int Val){
       switch (Val){
           case 1: funcUsuario(); break;
           case 2: funcAdmin(); break;
           default:System.out.println("");
       }
    }
    
    public static void interfazUusario(){
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("Hello user/ Hola usuario");
        System.out.println("Welcome / Bienvenido");
        System.out.println("");
        System.out.println("Pulse 1 para consultar su saldo");
        System.out.println("Pulse 2 para Retirar efectivo");
        System.out.println("Pulse 3 para salir al menu de inicio de sesion");
        System.out.println("Pulse 0 para salir del cajero");
        System.out.print("");
       
        
    }
    
    public static void AccionesUser(int Seleccion){
        switch (Seleccion){
            case 0: break;
            case 1 : Usuario.consultarsaldo(); break;
            case 2 : Usuario.retirarsaldo(); break;
            case 3:  Bienvenida(); Welcome();
            default: System.out.println("");
        }
    }
    
    public static void funcUsuario(){
        int OpcionUser;
        do{
             try{
                 interfazUusario();
                  System.out.print("Teclee su eleccion: ");OpcionUser=Source.nextInt();    
                  AccionesUser(OpcionUser);  
             }catch(InputMismatchException a){
            System.out.println("Ingrese un dato valido");
        }finally{
            System.out.println("");
        }   
        }while(ref1 = false);
    }
    
        
    public static void interfazAdministrador(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Bienvenido administrador, que tal su dia?");
        System.out.println("son las: " + dateFormat.format(date));
        System.out.println("");
        System.out.println("Pulse 1 para ver la lista de acciones");
        System.out.println("Pulse 2 para ver el saldo disponible y la cantidad de billetes restantes");
        System.out.println("Pulse 3 para salir al menu de inicio de sesion");
        System.out.println("Pulse 0 para salir del cajero");
        System.out.println("");
        
        
    }
    
    public static void funcAdmin(){
        int OpcionAdmin;
        do{
             try{
                  interfazAdministrador();
                  System.out.print("Teclee su eleccion: ");OpcionAdmin=Source2.nextInt(); 
                  AccionesAdmin(OpcionAdmin);
            }catch(InputMismatchException a){
            System.out.println("Ingrese un dato valido");
        }finally{
                System.out.println("");
        }
           
       }while(ref1 = false);   
    }
    
    public static void AccionesAdmin(int SeleccionAd){
        switch (SeleccionAd){
            case 0: break;
            case 1 : FileMov.leerlog("logs.txt"); break;
            case 2 : CajFiles.leer("billetes.dat"); break;
            case 3:  Bienvenida(); Welcome();
            default: System.out.println("");
        }
    }
    
  
    public static void main(String[] args) {
    
   //Dinero base del cajero, instanciamiento de los billetes disponibles y sus cantidades respectivas
   billetes.add(new Billetes(0,"100",100));
   billetes.add(new Billetes(1,"200",100));
   billetes.add(new Billetes(2,"500",20));
   billetes.add(new Billetes(3,"1000",10));
    
   //Admin
   Administrador administrador =  new Administrador("admin",3243);
    try {
     File Usuario = new File("logs.txt");
     if (Usuario.createNewFile()) {
        System.out.println("");//El archivo fue creado con exitop
      } else {
        System.out.println("");//"El archivo ya existe
      }
    } catch (IOException e) {
      System.out.println("");//Error incesperado
    }
  /* 
    try {
      File Billetes = new File("billetes.dat");
      if (Billetes.createNewFile()) {
        System.out.println("archivo creado: " + Billetes.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
    
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("billetes.dat"))) {
            oos.writeObject(billetes);
        } catch (IOException e) {
            
        }*/
    CajFiles binario = new CajFiles();
    binario.crear("billetes.dat");
    CajFiles.escribir("billetes.dat",billetes);
        
    
   
   //System.out.println(usuarios.toString());
   //System.out.println(billetes.toString());
   
   //calculardinerodisponiblecajero();
   Bienvenida();
   Welcome();
   //Ingreso();
   //Usuario.crearnuevousuario();
        
    }
    
}
