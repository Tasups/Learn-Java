import java.util.Objects;

public class Contact {

    private String name;
    private int age;

    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.age = source.age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } 
        if (!(o instanceof Object)) {
            return false;
        }
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && age == contact.age;
    }
    // to overcome memory references of objects with the same field values, we set the hash arguments to the values and not the reference of the object
    public int hashCode() {
        return Objects.hash(name, age);
    }

}