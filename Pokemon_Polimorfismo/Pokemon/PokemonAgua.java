package Pokemon;

/**
 *
 * @author josue
 */
public class PokemonAgua extends Pokemon {
    
     public PokemonAgua(String nombre, int nivel){
        super(nombre, Tipo.AGUA, nivel);
        
        ListaMovimientos listaMovimientos = new ListaMovimientos();
       
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Pistola Agua Water Gun"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Golpe de cabeza"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Placaje"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Cabezazo"));
       
    }
     
     @Override
     public double obtenerEfectividad(Pokemon pokemon){
       double efectividad = 1.0;
       
       if (pokemon.getTipo()== Tipo.DRAGON) efectividad = 0.0;
       if (pokemon.getTipo()== Tipo.PLANTA) efectividad = 2;
       
       return efectividad;
     }
    
}
