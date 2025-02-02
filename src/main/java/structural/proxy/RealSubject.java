package structural.proxy;

public class RealSubject implements Subject{

    @Override
    public void printHello() {
        System.out.println("Hello!");
    }
    
}
