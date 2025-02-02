package SoftwareDesignPatterns.Structural.Adapter;

public class HexAdapter implements ColorPrinter {
    private HexPrinter hexPrinter = new HexPrinter();

    @Override
    public void print(String color){
        switch(color){
            case "r" : 
                hexPrinter.print(0xFF0000);
                break;
            case "g" :
                hexPrinter.print(0x00FF00);
                break;
            case "b" :
                hexPrinter.print(0x0000FF);
                break;
            default : System.out.println("unsupported color");
        }
    }
}
