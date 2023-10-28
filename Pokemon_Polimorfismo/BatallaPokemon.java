import Pokemon.PokemonAgua;
import Pokemon.PokemonIce;

public class BatallaPokemon {



    public static void main(String[] args) {
      
        PokemonAgua Blastoise = new PokemonAgua("Blastoise",10);
        
        PokemonIce Sealeo = new PokemonIce("Sealeo",10);
         
        Blastoise.atacar(0, Sealeo );
        
        Sealeo.atacar(0, Blastoise);
    }
    
}
