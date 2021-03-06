import java.util.Objects;

public class Person /*implements Comparable*/{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * 按照name的长度进行比较
     * @param o
     * @return
     */
//    @Override
//    public int compareTo(Object o) {
//        Person person = (Person)o;
//        if (person.name.length()>this.name.length()){
//            return 1;
//        }else if (person.name.length()<this.name.length()){
//            return -1;
//        }else {
//            return 0;
//        }
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
