
import org.junit.jupiter.api.Assertions;

public class test{
    public static void main(String[]args){
        BuilderChimpoko builder = new BuilderChimpoko();
        CreadorDirector creadorDirector = new CreadorDirector(builder);

        Chinpokomon peleadorA = creadorDirector.crearCarnotron();
        Chinpokomon peleadorB = creadorDirector.crearZapato();

        Logger log = new Logger(new Debug());

        while (!peleadorA.estaMuerto() && !peleadorB.estaMuerto()){
            var numAtaqueA = NumAleatorio.aleatorio(peleadorA.listaDeAtaques.size() -1 );
            var numAtaqueB = NumAleatorio.aleatorio(peleadorB.listaDeAtaques.size() -1 );


            peleadorB.atacar_a(peleadorA, peleadorB.lista_ataques[numAtaqueB])
            peleadorA.atacar_a(peleadorB, peleadorA.lista_ataques[numAtaqueA])

            log.debug( peleadorA.getNombre() +"VidaActual:"+ peleadorB.getVidaActual() );
            log.debug( peleadorB.getNombre() +"VidaActual:"+ peleadorA.getVidaActual() );

            log.info( peleadorA.getNombre() +" Regenero:"+ peleadorB.vidaRegenerada());
            log.info( peleadorB.getNombre() +" Regenero:"+ peleadorA.vidaRegenerada())

            log.warn( peleadorA.getNombre() +" Hizo Daño:"+ peleadorB.golpeRecibido()))
            log.warn( peleadorB.getNombre() +" Hizo Daño:"+ peleadorA.golpeRecibido()))

            log.error( peleadorA.getNombre() +" Vida actual:"+ peleadorA.getVidaActual()) )
            log.error( peleadorB.getNombre() +" Vida actual:"+ peleadorB.getVidaActual()) )


        }
        if (peleadorB.estaMuerto()) {
            log.error(peleadorA.getNombre() + " Winner");
        } else if (peleadorA.estaMuerto()) {
            log.error(peleadorA.getNombre() + " Winner");
        }
    }
}