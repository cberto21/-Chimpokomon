public class PomadaWassington extends DecoratorAtaques {
    PomadaWassington(AtaqueConcret aDecorar) {
        super(aDecorar);
    }
    public void realizarAtaque(Chinpokomon atacado, Chinpokomon atacante) {
        if(this.tieneVentaja(atacado,atacante)){
            atacado.modificarVida( + this.getRecupera() + this.getVentaja() );
        }else{
            atacado.modificarVida( + this.getRecupera());
        }
    }
}