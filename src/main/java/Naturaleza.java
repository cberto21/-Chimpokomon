public abstract class Naturaleza {
    protected static Naturaleza ventaja;
    void setVentaja(Naturaleza naturaleza)  {
        Naturaleza.ventaja = naturaleza;
    }
    Naturaleza getVentaja() {
        return Naturaleza.ventaja;
    }
    protected boolean noHayInstancia() {
        return Naturaleza.ventaja == null;
    }
}

class Robot extends Naturaleza{
    @Override
    public Naturaleza getVentaja() {
        if(this.noHayInstancia()){
            this.setVentaja(new Animal());
        }
        return super.getVentaja();
    }
}
class Animal extends Naturaleza{
    @Override
    public Naturaleza getVentaja() {
        if(this.noHayInstancia()){
            this.setVentaja(new Cosa());
        }
        return super.getVentaja();
    }
}
class Cosa extends Naturaleza{
    @Override
    public Naturaleza getVentaja() {
        if(this.noHayInstancia()){
            this.setVentaja(new Robot());
        }
        return super.getVentaja();
    }
}


