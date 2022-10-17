package uebungen.uebung2;

import java.util.ArrayList;

public class Container {

ArrayList<Member> members = new ArrayList<>();

public void addMember(Member member) throws ContainerException {
    if(members.stream().filter(m -> m.getID() == member.getID()).count() > 0)
        throw new ContainerException(member.getID());
    members.add(member);
}

}
