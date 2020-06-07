/**
 * 泛型类
 */
public class GenericClass<T> {
    private int id;
    private T t;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void show(){
        System.out.println("id: " + id + ", T: " + t);
    }
}
