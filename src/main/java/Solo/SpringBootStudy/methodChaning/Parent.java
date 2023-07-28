package Solo.SpringBootStudy.methodChaning;

public abstract class Parent<T extends Parent<T>>{ //Parent의 제네릭 타입을 Parent<T>로 Bound 시킴
    // => 하위 클래스에서 확장할때 Parent를 확장한 클래스만 타입으로 넣도록 강제함.
    private String name;
    private String family;

    public T setName(String name) {
        this.name = name;
        return getThis();
    }

    public T setFamily(String family) {
        this.family = family;
        return getThis();
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    protected abstract T getThis();
}
