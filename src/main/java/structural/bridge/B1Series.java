package structural.bridge;

public class B1Series extends Droid {

    public B1Series(Weapon weapon) {
        super(weapon);
    }
    @Override
    public void attack() {
        System.out.printf("Roger Roger :3");
        weapon.shoot();
    }

}
