import java.util.ArrayList;

public interface interfaseChimpoko {
    void setVida(int vidaAponer);
    void setNombre(String nombreAPoner);
    void setAtaques(ArrayList<Ataque> listaAtaques);
    void setNaturaleza(Naturaleza naturaleza);
}
class BuilderChimpoko implements interfaseChimpoko{
    private Chinpokomon chinpokomon;
    BuilderChimpoko(){
        this.reset();
    }
    void reset(){
        chinpokomon = new Chinpokomon();
    }
    @Override
    public void setVida(int vidaAponer) {
        chinpokomon.setVida(vidaAponer);
    }
    @Override
    public void setNombre(String nombreAPoner) {
        chinpokomon.setNombre(nombreAPoner);
    }
    @Override
    public void setAtaques(ArrayList<Ataque> listaAtaques) {
        chinpokomon.setlistaDeAtaques(listaAtaques);
    }

    @Override
    public void setNaturaleza(Naturaleza naturaleza) {
        chinpokomon.setNaturaleza(naturaleza);
    }

    Chinpokomon resultado(){
        chinpokomon.inicializar();
        Chinpokomon nuevoChim = chinpokomon;
        this.reset();
        return nuevoChim;
    }
}