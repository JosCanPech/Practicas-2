import Pokemon.Pidgey;
import Pokemon.Blastoise;
import Pokemon.Pidgey2T;
import Pokemon.Tipo;
import Pokemon.TipoMovimiento;
//import Pokemon.PokemonIce;

public class BatallaPokemon {



    public static void main(String[] args) {
      
        Blastoise Blastoise = new Blastoise("Blastoise",50,186,148,167,150,172,143);
        
        Pidgey pidgey = new Pidgey("Pidgey",Tipo.NORMAL,50,284,207,196,185,185,232);
        
        Pidgey2T pidgey2 = new Pidgey2T("Pidgey",Tipo.NORMAL,Tipo.VOLADOR,50,284,189,179,169,169,211);
       
        
//PokemonIce Sealeo = new PokemonIce("Sealeo",10);
        
        pidgey.atacar(0,Blastoise,Tipo.AGUA, TipoMovimiento.FISICO);
        
        Blastoise.atacar(0, pidgey,Tipo.NORMAL,TipoMovimiento.FISICO);
        
        pidgey2.atacar(1, Blastoise,Tipo.AGUA,TipoMovimiento.FISICO);;
         
    }
    
}
