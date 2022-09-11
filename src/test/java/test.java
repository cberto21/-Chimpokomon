import org.junit.jupiter.api.Assertions;

public class test{
    public static void main(String[]args){
        BuilderChimpoko builder = new BuilderChimpoko();
        CreadorDirector creadorDirector = new CreadorDirector(builder);

        Chinpokomon carnotron = creadorDirector.crearCarnotron();
        Chinpokomon zapato = creadorDirector.crearZapato();

        Logger log2 = new Logger(new Error());
        Logger log = new Logger(new Debug());

        while (!carnotron.estaMuerto() && !zapato.estaMuerto()){
            var numAtaqueA = NumAleatorio.aleatorio(zapato.listaDeAtaques.size() -1 );
            var numAtaqueB = NumAleatorio.aleatorio(carnotron.listaDeAtaques.size() -1 );
            zapato.atacarA(carnotron, zapato.listaDeAtaques.get(numAtaqueA));
            carnotron.atacarA(zapato, carnotron.listaDeAtaques.get(numAtaqueB));

            log.debug( zapato.nombre +"VidaActual:"+ zapato.vidaActual );
            log.debug( carnotron.nombre +"VidaActual:"+ carnotron.vidaActual );
        }
        if (carnotron.estaMuerto()) {
            log.debug(zapato.nombre + " Winner");
        } else if (zapato.estaMuerto()) {
            log.debug(carnotron.nombre + " Winner");
        }
    }
}
