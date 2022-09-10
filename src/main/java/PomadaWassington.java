public class PomadaWassington extends DecoratorAtaques {
    PomadaWassington(AtaqueConcret aDecorar) {
        super(aDecorar);
    }
    public void realizarAtaque(Chinpokomon atacado, Chinpokomon atacante) {
        atacante.modificarVida(this.getRecupera());
    }
}
