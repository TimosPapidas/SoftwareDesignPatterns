package structural.composite;

public class Main {
    public static void main(String[] args) {
        Clone clone1 = new Clone("CT-1111");
        Clone clone2 = new Clone("CT-2222");
        Clone clone3 = new Clone("CT-3333");
        Clone clone4 = new Clone("CT-4444");
        Squad squad = new Squad();
        squad.addSquadMember(clone1);
        squad.addSquadMember(clone2);
        squad.addSquadMember(clone3);
        squad.addSquadMember(clone4);

        clone1.doYouCopy();
        squad.doYouCopy();
    }
}