interface Ataque {
    String getNombre();
    int getDanio();
    int getRecupera();
    void realizarAtaque(Chinpokomon atacado, Chinpokomon atacante);
    default boolean tieneEfecto() { return false;}
    boolean tieneVentaja(Chinpokomon atacado, Chinpokomon atacante);
}

public class AtaqueConcret implements Ataque {
    public String nombre;
    protected int danio;
    protected int recupera = 0;
    protected int ventaja;
    public String getNombre() { return this.nombre;}
    public int getDanio() { return this.danio;}
    public int getRecupera() { return this.recupera;}
    public int getVentaja(){ return this.ventaja;}
    AtaqueConcret(String nombre, int danio, int recupera, int ventaja){
        this.nombre = nombre;
        this.danio = danio;
        this.recupera = recupera;
        this.ventaja = ventaja;
    }
    public void realizarAtaque(Chinpokomon atacado, Chinpokomon atacante) {
        if(this.tieneVentaja(atacado,atacante)){
            atacado.modificarVida( - this.danio - this.getVentaja() );
        }else{
            atacado.modificarVida( - this.danio );
        }
    }
    public boolean tieneVentaja(Chinpokomon atacado, Chinpokomon atacante) {
        return atacante.getNaturaleza().getVentaja() == atacado.getNaturaleza();
    }

    public boolean tieneEfecto() { return false;}
}

