package Pokemon;

/**
 *
 * @author josue
 */
public class PokemonIce extends Pokemon {
    
     public PokemonIce(String nombre, int nivel){
        super(nombre, Tipo.HIELO, nivel);
        
        ListaMovimientos listaMovimientos = new ListaMovimientos();
         
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Tumba rocas"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Terremoto"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Bola hielo"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Nieve Polvo"));
         
          
    }
    
     
     @Override
     public double obtenerEfectividad(Pokemon pokemon){
         double efectividad = 1.0;
         
         if(pokemon.getTipo()== Tipo.ACERO) efectividad= 0.0;
         if(pokemon.getTipo()== Tipo.DRAGON) efectividad = 2;
         
         return efectividad;
     }
}
