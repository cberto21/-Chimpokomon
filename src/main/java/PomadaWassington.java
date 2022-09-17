public class PomadaWassington extends DecoratorAtaques {
    PomadaWassington(AtaqueConcret aDecorar) {
        super(aDecorar);
    }
    public void realizarAtaque(Chinpokomon atacado, Chinpokomon atacante) {
        var total = this.getRecupera();
        if(this.tieneVentaja(atacado,atacante)){
            total += this.getVentaja();
            atacante.modificarVida( this.getRecupera() + this.getVentaja() );
        }else{
            atacante.modificarVida( + this.getRecupera());
        }
        atacado.setRecuperacionRecibido( total );
    }
}