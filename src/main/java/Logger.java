public class Logger {
    private static Logger logger;
    private static Estados estado;
    Logger(Estados estado){
        if(!Logger.hayInstancia()){
            Logger.estado = estado;
        }
    }
    private static boolean hayInstancia(){
        return Logger.estado != null;
    }

    void setNivel(Estados estado){
        Logger.estado = estado;
    }
    public void debug(String string){
        estado.debug(string);
    }
    public void info(String string){
        estado.info(string);
    }
    public void warn(String string){
        estado.warn(string);
    }
    public void error(String string){
        estado.error(string);
    }
}
