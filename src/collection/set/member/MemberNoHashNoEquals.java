package collection.set.member;

public class MemberNoHashNoEquals {

    private String id;

    public MemberNoHashNoEquals(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEquals{" +
                "id='" + id + '\'' +
                '}';
    }
}
