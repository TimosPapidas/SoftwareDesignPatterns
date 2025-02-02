package structural.composite;

public class Clone implements Troop {
    private String designation;

    public Clone(String designation) {
        this.designation = designation;
    }

    @Override
    public void doYouCopy() {
        System.out.printf("%s, copy that\n", designation);
    }

}
