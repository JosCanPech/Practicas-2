/**
 *
 * @author josue daniel canul pech
 */

import java.util.ArrayList;

public class Billetes {
     
    public static ArrayList<Billetes> billetes = new ArrayList<>();
    
    //private static Billetes[] billetes2 = new Billetes [4];;
    private int id;
    private String valorbillete;
    private int cantidadbilletes;
    

    public Billetes(int id, String valorbillete, int cantidadbilletes){
        this.id = id;
        this.valorbillete = valorbillete;
        this.cantidadbilletes = cantidadbilletes;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValorbillete() {
        return valorbillete;
    }

    public void setValorbillete(String valorbillete) {
        this.valorbillete = valorbillete;
    }

    public int getCantidadbilletes() {
        return cantidadbilletes;
    }

    public void setCantidadbilletes(int cantidadbilletes) {
        this.cantidadbilletes = cantidadbilletes;
    }

    @Override
    public String toString() {
        return "Billetes{" + "id=" + id + ", valorbillete=" + valorbillete + ", cantidadbilletes=" + cantidadbilletes + '}';
    }
    
     public static void calculardinerodisponiblecajero(){
        
        int b100disponibles = (billetes.get(0).getCantidadbilletes()*100);
        int b200disponibles = (billetes.get(1).getCantidadbilletes())*200;
        int b500disponibles = (billetes.get(2).getCantidadbilletes())*500;
        int b1000disponibles = (billetes.get(3).getCantidadbilletes())*1000;
        
        int dinerodisponiblecaj = b100disponibles+b200disponibles+b500disponibles+b1000disponibles;
        System.out.println("");
        System.out.println("El dinero disponible en el cajero es: "+dinerodisponiblecaj);
    }
    

}
