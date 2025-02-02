package structural.proxy;

public class Proxy implements Subject {
    private int accessCount;
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
        this.accessCount = 0;
    }

    @Override
    public void printHello() {
        accessCount++;
        realSubject.printHello();
    }

    public int getAccessCount() {
        return accessCount;
    }
}
