package uebungen.uebung2;

import java.util.ArrayList;

public class Container {

    ArrayList<Member> members = new ArrayList<>();

    public void addMember(Member member) throws ContainerException {
        if (members.stream().filter(m -> m.getID() == member.getID()).count() > 0)
            throw new ContainerException(member.getID());
        members.add(member);
    }

    // Welche Nachteile ergeben sich aus ihrer Sicht für ein solchen Fehlerhandling gegenüber einer Lösung mit Exceptions? Kurzes Statement!
    // Fehler können später zu Problemen in der Laufzeit führen.
    public String deleteMember(Integer id) {
        if (members.stream().filter(m -> m.getID() == id).count() == 0)
            return "Es gibt keinen Member mit der ID " + id + " in dem Container!";
        members.remove(members.stream().filter(m -> m.getID() == id).findAny().get());
        return "Member mit der ID " + id + " wurde entfernt!";
    }

    public void dump() {
        System.out.println(members);
    }

    public int size() {
        return members.size();
    }
}
