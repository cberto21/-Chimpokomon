public class ProbYDanioVerdadero extends DecoratorAtaques{
    private final double probabilidad;
    private final double porcentajeDanioVerdadero;

    ProbYDanioVerdadero(AtaqueConcret aDecorar,double probabilidad,double porcentajeDanioVerdadero) {
        super(aDecorar);
        this.probabilidad = probabilidad * 0.01;
        this.porcentajeDanioVerdadero = porcentajeDanioVerdadero * 0.01;
    }
    int especialEfecto(Chinpokomon atacado){
        int resultado;
            if( Math.random() <= this.probabilidad){
            resultado = (int) (atacado.vidaActual * this.porcentajeDanioVerdadero);
        }else{
            resultado = this.getDanio();
        }
        return resultado;
    }

    public boolean tieneEfecto() { return true;}
}
