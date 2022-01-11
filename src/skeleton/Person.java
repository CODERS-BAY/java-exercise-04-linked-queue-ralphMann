package skeleton;

import java.util.UUID;

/**
 * Model an abstract person class.
 *
 * @author your name
 *
 */
public abstract class Person {
    UUID ID;
    String name;

    public Person(String name) {
        this.ID = UUID.randomUUID();;
        this.name = name;
    }

    @Override
    public String toString() {
        return (ID.toString()+" "+name);
    }

}
