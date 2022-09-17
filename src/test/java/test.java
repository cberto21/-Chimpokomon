import org.junit.jupiter.api.Assertions;

public class test{
    public static void main(String[]args){
        BuilderChimpoko builder = new BuilderChimpoko();
        CreadorDirector creadorDirector = new CreadorDirector(builder);

        Chinpokomon carnotron = creadorDirector.crearCarnotron();
        Chinpokomon zapatoEspecial = creadorDirector.crearZapatoEspecial();

        //Logger log2 = new Logger(new Error());
        Logger log = new Logger(new Debug());

        while (!carnotron.estaMuerto() && !zapatoEspecial.estaMuerto()){
            var numAtaqueA = NumAleatorio.aleatorio(zapatoEspecial.listaDeAtaques.size() -1 );
            var numAtaqueB = NumAleatorio.aleatorio(carnotron.listaDeAtaques.size() -1 );
            zapatoEspecial.atacarA(carnotron, zapatoEspecial.listaDeAtaques.get(numAtaqueA));
            carnotron.atacarA(zapatoEspecial, carnotron.listaDeAtaques.get(numAtaqueB));

            log.debug( zapatoEspecial.nombre +"VidaActual:"+ zapatoEspecial.vidaActual );
            log.debug( carnotron.nombre +"VidaActual:"+ carnotron.vidaActual );


        }
        if (carnotron.estaMuerto()) {
            log.setNivel(new Debug());
            log.debug(zapatoEspecial.nombre + " Winner");
        } else if (zapatoEspecial.estaMuerto()) {
            log.setNivel(new Debug());
            log.debug(carnotron.nombre + " Winner");
        }
    }
}
