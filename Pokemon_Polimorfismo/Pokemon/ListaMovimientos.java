package Pokemon;

//import static Pokemon.Tipo.AGUA;
//import static Pokemon.Tipo.HIELO;

import java.util.ArrayList;

public class ListaMovimientos {
    
    /*private String nombre;
    private int puntosDeAtaque;
    private Tipo Tipo;
    private int pp;*/
    
    /*public ListaMovimientos(String nombre, int puntosDeAtaque, Tipo tipo, int pp){
        this.nombre = nombre;
        this.puntosDeAtaque = puntosDeAtaque;
        this.Tipo = Tipo;
        this.pp = pp;
    }*/
    
    
    private ArrayList<Movimiento> movimientos = new ArrayList<>();
    
   
    
    public ListaMovimientos(){
        // Movimientos de tipo agua
        movimientos.add(new Movimiento("Pistola Agua Water Gun",40,Tipo.AGUA,25 ));
        movimientos.add(new Movimiento("Golpe de cabeza", 70,Tipo.AGUA,24 ));
        movimientos.add(new Movimiento("Placaje", 40,Tipo.AGUA,56 ));
        movimientos.add(new Movimiento("Cabezazo", 130,Tipo.AGUA,16 ));        
        
        
        //Movimientos de tipo Ice
        movimientos.add(new Movimiento("Tumba rocas", 15,Tipo.HIELO,60 ));
        movimientos.add(new Movimiento("Terremoto", 10,Tipo.HIELO,100 ));
        movimientos.add(new Movimiento("Bola hielo", 30,Tipo.HIELO,30 ));
        movimientos.add(new Movimiento("Nieve Polvo", 40,Tipo.HIELO,40 ));
    }   
    
    public Movimiento buscarMovimientoPorNombre(String nombre){
        for (Movimiento movimiento : movimientos){
            if(movimiento.getNombre().equals(nombre)){
                return movimiento;
            }
        }
        return null;
    }    

}
