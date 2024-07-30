class Logger {
    static Logger obj=new Logger();
    private Logger(){
        System.out.println("Singleton design is executed");
    }

    public static Logger getInstance(){
        return obj;
    }
}
