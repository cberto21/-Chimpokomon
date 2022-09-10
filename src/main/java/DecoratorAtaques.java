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

    public void realizarAtaque(Chinpokomon atacado, Chinpokomon atacante) {
        if (this.tieneEfecto()){
            atacado.modificarVida( - this.especialEfecto(atacado) );
        }else{
            atacado.modificarVida( - this.getDanio() );
        }
    }
    public boolean tieneEfecto() { return false;}
    int especialEfecto(Chinpokomon atacado) {
        return -1;
    }

}
