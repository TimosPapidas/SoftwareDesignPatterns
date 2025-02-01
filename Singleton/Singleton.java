package SoftwareDesignPatterns.Singleton;

class Singleton {
    private static Singleton instance = new Singleton();
    private int counter;
    private Singleton(){
        counter = 0;
    }
    public static Singleton getInstance(){
        return instance;
    }

    public void addOne() {
        counter ++;
    }

    public int getCounter(){
        return counter;
    }

    public void resetCounter(){
        counter = 0;
    }
}