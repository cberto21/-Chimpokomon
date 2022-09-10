public class Logger {
    private static Logger logger;
    private static Estados estado;
    private Logger(Estados estado){
        //this.logger = new Logger(new Debug());
        Logger.estado = estado;
    }
    public static Logger getInstancia(){
        if (!Logger.hayInstancia()){
            Logger.logger = new Logger(new Debug());
        }
        return Logger.logger;
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
