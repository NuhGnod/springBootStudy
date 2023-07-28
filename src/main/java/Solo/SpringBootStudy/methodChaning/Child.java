package Solo.SpringBootStudy.methodChaning;

public class Child extends Parent<Child> {

    @Override
    protected Child getThis() {
        return this;
    }

    public static enum Relation {
        SUN, DAUGTHER
    }

    private int age;
    private Relation relationship;

    public Child setAge(int age) {
        this.age = age;
        return getThis();
    }

    public Child setRelationship(Relation relationship) {
        this.relationship = relationship;
        return getThis();
    }

    @Override
    public String toString() {
        return String.format("나이는 %d, 관계는 %s, 본가는 %s, 부모이름은 %s", age, relationship, super.getFamily(), super.getName());
    }
}
