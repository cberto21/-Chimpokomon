public abstract class DecoratorAtaques implements Ataque {
    private AtaqueConcret decorado;

    DecoratorAtaques(AtaqueConcret aDecorar) {
        decorado = aDecorar;
    }
    public String getNombre() {
        return decorado.getNombre();
    }
    public int getDanio() {
        return decorado.getDanio();
    }
    public int getRecupera() {
        return decorado.getRecupera();
    }
    public int getVentaja()  {
        return decorado.getVentaja();
    }

    public void realizarAtaque(Chinpokomon atacado, Chinpokomon atacante) {
        if (this.tieneEfecto()){
            atacado.modificarVida( - this.especialEfecto(atacado) );
        }else{
            decorado.realizarAtaque(atacado,atacante);
        }
    }
    public boolean tieneVentaja(Chinpokomon atacado, Chinpokomon atacante) {
        return decorado.tieneVentaja(atacado,atacante);
    }
    public boolean tieneEfecto() { return false;}
    int especialEfecto(Chinpokomon atacado) {
        return -1;
    }
}