import java.util.Objects;

public class Dog {
    /**
     * 名称
     */
    private String name;

    /**
     * 亲密度
     */
    private Integer closeness;

    public Dog() {
    }

    public Dog(String name, Integer closeness) {
        this.name = name;
        this.closeness = closeness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCloseness() {
        return closeness;
    }

    public void setCloseness(Integer closeness) {
        this.closeness = closeness;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", closeness='" + closeness + '\'' +
                '}';
    }

    //作比较
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(closeness, dog.closeness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, closeness);
    }
}
