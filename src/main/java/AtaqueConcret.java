interface Ataque {
    String getNombre();
    int getDanio();
    int getRecupera();
    void realizarAtaque(Chinpokomon atacado, Chinpokomon atacante);
    default boolean tieneEfecto() { return false;}
}

public class AtaqueConcret implements Ataque {
    public String nombre;
    protected int danio;
    protected int recupera = 0;
    public String getNombre() { return this.nombre;}
    public int getDanio() { return this.danio;}
    public int getRecupera() { return this.recupera;}

    AtaqueConcret(String nombre, int danio, int recupera){
        this.nombre = nombre;
        this.danio = danio;
        this.recupera = recupera;
    }
    public void realizarAtaque(Chinpokomon atacado, Chinpokomon atacante) {
       atacado.modificarVida( - this.danio );
    }

    public boolean tieneEfecto() { return false;}
}


