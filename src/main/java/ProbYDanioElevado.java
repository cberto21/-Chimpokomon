public class ProbYDanioElevado extends DecoratorAtaques{
    private final double probabilidad;
    private final int danioElevado;

    ProbYDanioElevado(AtaqueConcret aDecorar,double probabilidad,int danioElevado) {
        super(aDecorar);
        this.probabilidad = probabilidad * 0.01;
        this.danioElevado = danioElevado;
    }
    int especialEfecto(Chinpokomon atacado){
        int resultado;
        if( Math.random() >= this.probabilidad){
            resultado = this.getDanio() * this.danioElevado;
        }else{
            resultado = this.getDanio();
        }
        return resultado;
    }

    public boolean tieneEfecto() { return true;}
}
