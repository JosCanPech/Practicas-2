public class BatallaPokemon {

  
    public static void main(String[] args) {
      
        PokemonAgua Blastoise = new PokemonAgua("Blastoise",10);
        
        PokemonIce Sealeo = new PokemonIce("Sealeo",10);
         
        Blastoise.atacar("Nieve de polvo", Sealeo );
        
        Sealeo.atacar("Pistola de agua", Blastoise);
    }
    
}
