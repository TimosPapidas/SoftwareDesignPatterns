package structural.bridge;

public abstract class Droid {
    protected Weapon weapon;

    public Droid(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract void attack();
}
