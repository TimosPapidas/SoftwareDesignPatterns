package structural.bridge;

public class B2Series extends Droid {

    public B2Series(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        System.out.printf("(menacing silence)");
        weapon.shoot();
    }

}
