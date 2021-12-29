package Design_Patterns.Creational_Design_Patterns.Singleton_Design;

public class SingletonPattern {

    private static SingletonPattern singleton = null;

    private SingletonPattern(){
        System.out.println("Object Created.");
    }

    public static SingletonPattern getInstance() {

    if(singleton == null) {
       synchronized (SingletonPattern.class){  // synchronized = aynı anda 2 thread bu metodu kullanamaz !
        if(singleton==null) {
        singleton = new SingletonPattern();} } }
    return singleton;
     }
}