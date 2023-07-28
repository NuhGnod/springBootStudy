package Solo.SpringBootStudy.methodChaning;

public class Main {
    public static void main(String[] args) {

        Child child = new Child()
                .setAge(20)
                .setRelationship(Child.Relation.SUN)
                .setFamily("KIMHAE-KIM")
                .setName("PARENT");
        System.out.println("child => " + child);
    }
}
