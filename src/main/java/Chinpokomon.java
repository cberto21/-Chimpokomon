import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.min;

public class Chinpokomon {
    protected int vida;
    protected int vidaActual;
    protected Naturaleza naturaleza;
    protected String nombre;
    protected List<Ataque> listaDeAtaques = new ArrayList<Ataque>();

    void setVida(int vidaAPoner){ this.vida = vidaAPoner; }
    void setNaturaleza(Naturaleza naturalezaAPoner){ this.naturaleza = naturalezaAPoner;}
    void setNombre(String nombreAPoner){ this.nombre = nombreAPoner; }
    void setlistaDeAtaques(ArrayList<Ataque> ataquesAPoner){ this.listaDeAtaques.addAll(ataquesAPoner);}
    protected void inicializar(){
        this.vidaActual = this.vida;
    }

    Naturaleza getNaturaleza(){
        return this.naturaleza;
    }

    public void modificarVida(int modificador){ //entrega el minimo valor, pero si recuperas vida y supera a this.vida el maximo es this.vida
        vidaActual = min(modificador + this.vidaActual, this.vida);
    }
    public void atacarA(Chinpokomon atacado, Ataque ataque){
        if (!atacado.estaMuerto()){
            atacado.recibirDanioDe(this, ataque);
        }
    }
    private void recibirDanioDe(Chinpokomon atacante, Ataque ataque){
        ataque.realizarAtaque(this, atacante);
    }
    public boolean estaMuerto(){
        return this.vidaActual <= 0;
    }
}

