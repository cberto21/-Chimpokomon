import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.min;

public class Chinpokomon {
    private ArrayList<Integer> golpe = new ArrayList<>();
    private ArrayList<Integer> regenero = new ArrayList<>();
    protected int vida;
    protected int vidaActual;
    protected Naturaleza naturaleza;
    protected String nombre;
    protected List<Ataque> listaDeAtaques = new ArrayList<Ataque>();
// SETS BUILDER Y GETS
    void setVida(int vidaAPoner){
        this.vida = vidaAPoner;
        this.vidaActual = vidaAPoner; }
    void setNaturaleza(Naturaleza naturalezaAPoner){ this.naturaleza = naturalezaAPoner;}
    void setNombre(String nombreAPoner){ this.nombre = nombreAPoner; }
    void setlistaDeAtaques(ArrayList<Ataque> ataquesAPoner){ this.listaDeAtaques.addAll(ataquesAPoner);}

    Naturaleza getNaturaleza(){
        return this.naturaleza;
    }
// SET Y GETS DE GOLPES Y REGENERACIONES EN BATALLA
    void setGolpeRecibido(int num){
        this.golpe.add(num);
    }
    void setRecuperacionRecibido(int num){
        this.regenero.add(num);
    }
    int golpeRecibido(){
        if (this.golpe.size() >= 1){
            var ultimo = this.golpe.get(this.golpe.size()-1);
            this.golpe.remove(this.golpe.size()-1);
            return ultimo;
        }
        return 0;
    }
    int vidaRegenerada(){
        if (this.regenero.size() >= 1){
            var ultimo = this.regenero.get(this.regenero.size()-1);
            this.regenero.remove(this.regenero.size()-1);
            return ultimo;
        }
        return 0;
    }
//------------------------------------------------
    public void modificarVida(int modificador){
        var momento = this.vidaActual;
        this.vidaActual = min(modificador + this.vidaActual, this.vida); //entrega el minimo valor, pero si recuperas vida y supera a this.vida el maximo es this.vida
        if (momento > this.vidaActual){
            this.setGolpeRecibido(modificador * -1);
        }
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

