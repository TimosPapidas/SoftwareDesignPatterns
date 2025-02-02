package structural.composite;

import java.util.ArrayList;

public class Squad implements Troop {
    ArrayList<Clone> squadMembers = new ArrayList<>();

    public void addSquadMember(Clone clone) {
        squadMembers.add(clone);
    }

    public void doYouCopy() {
        squadMembers.forEach(Clone::doYouCopy);
    }
}
