package Pokemon;

public abstract class Pokemon {
    
    //Movimiento[] movimientos; 
    
    
    private int HP, nivel;
    private String nombre;
    Tipo tipo;
    // private Movimiento[] movimientos; 
    private Movimiento movimientos;
    
    public Pokemon(String nombre, Tipo tipo, int nivel/*Movimiento movimientos*/){
        this.nombre= nombre;
        this.tipo= tipo;
        this.nivel= nivel;
        HP = 250;
        //this.movimientos = movimientos;
        //this.movimientos = new Movimiento [4];
    }
    
    public int getHP(){
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Tipo getTipo(){
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    public int getNivel(){
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    public Movimiento getMovimientos(int pos) {
        return movimientos;
    }

    public void setMovimientos(int pos, Movimiento movimientos) {
        this.movimientos = movimientos;
    }

    /*
    public Movimiento[] getMovimientos(int pos) {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }*/
    
    
    private void calculaDanio(int danio, double efectividad){
        double puntosRestados = danio * efectividad;
        this.HP -= puntosRestados;
        System.out.printf("%s recibe %d puntos de danio\n",
        this.getNombre(), danio);
    }
    
    public void recibirAtaque(Movimiento movimiento, double efectividad){
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento.getNombre());
        calculaDanio(movimiento.getPuntosDeAtaque(), efectividad);     
    }
    
    protected boolean seHaConcretadoAtaque(Movimiento movimiento, Pokemon pokemon){
        System.out.printf("%s ataca a %s\n", this.getNombre(), pokemon.getNombre(), movimiento.getNombre());
        double efectividad = obtenerEfectividad(pokemon);
        
        if(movimiento.getPp()>0){
            pokemon.recibirAtaque(movimiento, efectividad);
            return true;
        }else{
         System.err.println("El movimiento no tiene puntos de pp");
         return false;
        }
    }
    
    public void atacar(int m, Pokemon pokemon){
        Movimiento movimientos = getMovimientos(m);
        boolean seHaConcretadoAtaque = seHaConcretadoAtaque(movimientos, pokemon);
        if (seHaConcretadoAtaque){
            pokemon.getMovimientos(m).setPp(movimientos.getPp()-1);
        }
    }
    
    public abstract double obtenerEfectividad(Pokemon pokemon);
    
    
    
}
