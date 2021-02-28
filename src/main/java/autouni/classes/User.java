package autouni.classes;

import java.util.Objects;

public class User {

    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj instanceof User) {
            if (((User) obj).age == this.age && ((User) obj).name.equals(this.name)) {
                return true;
            } else return false;
        } else {
            System.out.println("One of the comparable classes is not the user");
        return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return (this.name + "," + this.age +" years old");
    }
}
