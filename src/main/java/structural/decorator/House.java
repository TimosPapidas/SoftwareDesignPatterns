package structural.decorator;

public class House implements HouseComponent {
    private int windows;
    private String color;
    private String doorColor;

    public House(int windows, String color, String doorColor) {
        this.windows = windows;
        this.color = color;
        this.doorColor = doorColor;
    }

    public String getDescription() {
        return String.format("A beautiful %s house with a %s door and %d windows.\n", color, doorColor, windows);
    }
}
