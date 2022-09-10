import org.junit.jupiter.api.Assertions;

public class test{
    public static void main(String[]args){
       BuilderChimpoko builder = new BuilderChimpoko();
       CreadorDirector creadorDirector = new CreadorDirector(builder);

       Chinpokomon carnotron = creadorDirector.crearCarnotron();
       Chinpokomon zapato = creadorDirector.crearZapato();

       while (!carnotron.estaMuerto() && !zapato.estaMuerto()){
           var numAtaqueA = NumAleatorio.aleatorio(zapato.listaDeAtaques.size() -1 );
           var numAtaqueB = NumAleatorio.aleatorio(carnotron.listaDeAtaques.size() -1 );
           zapato.atacarA(carnotron, zapato.listaDeAtaques.get(numAtaqueA));
           carnotron.atacarA(zapato, carnotron.listaDeAtaques.get(numAtaqueB));
           System.out.println(zapato.vidaActual);
           System.out.println(carnotron.vidaActual);
       }
       if (carnotron.estaMuerto()) {
           System.out.println(zapato.nombre + " Winner");
       } else if (zapato.estaMuerto()) {
           System.out.println(carnotron.nombre + " Winner");
       }
    }
}
