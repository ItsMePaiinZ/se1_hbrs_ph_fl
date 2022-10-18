package uebungen.uebung2;

import java.util.ArrayList;

public class Container {

private ArrayList<Member> members = new ArrayList<>();

public void addMember(Member member) throws ContainerException {
    if(members.stream().filter(m -> m.getID() == member.getID()).count() > 0)
        throw new ContainerException(member.getID());
    members.add(member);
}

public String deleteMember(Integer id){
    if(members.stream().filter(m -> m.getID() == id).count() == 0)
        return "Es gibt keinen Member mit der ID " + id + " in dem Container!";
    members.remove(members.stream().filter(m -> m.getID() == id).findAny().get());
    return "moin!";
}

public void dump(){
    System.out.println(members);
}

public int size(){
    return members.size();
}

    public static void main(String[] args) throws ContainerException {
        Container c = new Container();
        ConcreteMember cm = new ConcreteMember();

        for(int i = 0; i < 10; i++)
            c.addMember(new ConcreteMember());
        c.addMember(cm);
        c.dump();
        c.deleteMember(0);
        c.dump();
    }

}
