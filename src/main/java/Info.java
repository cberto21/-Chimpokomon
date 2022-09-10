public class Info implements Estados{
    private Logger logger;
    public void setLogger(Logger logger){
        this.logger = logger;
    }
    public void debug(String string){}
    public void info(String string){
        System.out.println(string);
    }
    public void warn(String string){
        System.out.println(string);
    }
    public void error(String string){
        System.out.println(string);
    }
}