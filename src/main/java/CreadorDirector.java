import java.util.ArrayList;

public class CreadorDirector {
    private BuilderChimpoko builderChimpoko;
    CreadorDirector(BuilderChimpoko builder){
        builderChimpoko = builder;
    }
    Chinpokomon crearGallotronix(){
        ArrayList<Ataque> listaAtaques = new ArrayList<>();
        listaAtaques.add(crearGarraMecanica());

        builderChimpoko.setNombre("Gallotronix");
        builderChimpoko.setVida(25);
        builderChimpoko.setAtaques(listaAtaques);
        builderChimpoko.setNaturaleza(new Robot());
        return builderChimpoko.resultado();
    }
    Chinpokomon crearZapato(){
        ArrayList<Ataque> listaAtaques = new ArrayList<>();
        listaAtaques.add(crearZapatazo());

        builderChimpoko.setNombre("Zapato");
        builderChimpoko.setVida(30);
        builderChimpoko.setAtaques(listaAtaques);
        builderChimpoko.setNaturaleza(new Cosa());
        return builderChimpoko.resultado();
    }
    Chinpokomon crearZapatoEspecial(){
        ArrayList<Ataque> listaAtaques = new ArrayList<>();
        listaAtaques.add(crearZapatazo());
        listaAtaques.add(crearPomadaWassington());

        builderChimpoko.setNombre("ZapatoEspecial");
        builderChimpoko.setVida(30);
        builderChimpoko.setAtaques(listaAtaques);
        builderChimpoko.setNaturaleza(new Cosa());
        return builderChimpoko.resultado();
    }
    Chinpokomon crearCarnotron (){
        ArrayList<Ataque> listaAtaques = new ArrayList<>();
        listaAtaques.add(crearRayoVeloz());
        listaAtaques.add(crearCanionConico());

        builderChimpoko.setNombre("Carnotron");
        builderChimpoko.setVida(20);
        builderChimpoko.setAtaques(listaAtaques);
        builderChimpoko.setNaturaleza(new Animal());
        return builderChimpoko.resultado();
    }

    private Ataque crearGarraMecanica(){
        AtaqueConcret ataqueNuevo = new AtaqueConcret("Garra Mecanica", 2, 0, 2);
        return new ProbYDanioElevado( ataqueNuevo ,50.0,2);
    }
    private Ataque crearZapatazo(){
        AtaqueConcret ataqueNuevo = new AtaqueConcret("Zapatazo", 1, 0, 3);
        return new ProbYDanioVerdadero( ataqueNuevo ,10.0,50.0);
    }
    private Ataque crearPomadaWassington(){
        AtaqueConcret ataqueNuevo = new AtaqueConcret("Pomada Wassington", 0, 5,1);
        return new PomadaWassington(ataqueNuevo);
    }
    private Ataque crearRayoVeloz(){
        return new AtaqueConcret("Rayo Veloz", 3, 0,1);
    }
    private Ataque crearCanionConico(){
        return new AtaqueConcret("Canion Conico", 4, 0,1);
    }
}