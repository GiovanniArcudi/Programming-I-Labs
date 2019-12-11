import java.util.ArrayList;
import java.util.Collections;

/**
 * This program creates an ArrayList of Animal objects and prints them in age order.
 *
 * @author Giovanni Arcudi
 */
public class Demo {

    /**
     * After having created an ArrayList of Animals, it prints out all the animals' names and ages, then it sorts them
     * in age order, and finally prints the animals' list in age order (younger first).
     */
    public static void main(String[] args) {
        ArrayList<Animal> animalsArrayList = new ArrayList<Animal>();

        animalsArrayList.add(new Wolf("Wolfgang Amadeus", 40));
        animalsArrayList.add(new Wolf("Antonio", 38));
        animalsArrayList.add(new Cow("Johann Sebastian", 66));
        animalsArrayList.add(new Parrot("Ludwig", 34));
        animalsArrayList.add(new Parrot("Franz", 16));

        // To iterate over the array list we use an enhanced loop.
        for (Animal animal : animalsArrayList) {
            System.out.println("Animal name: " + animal.getName() + ", Animal age: " + animal.getAge());
        }

        // Sorts animals in age order (younger first).
        Collections.sort(animalsArrayList);

        // To iterate over the array list we use an enhanced loop.
        for (Animal animal : animalsArrayList) {
            System.out.println("Animal name: " + animal.getName() + ", Animal age: " + animal.getAge());
        }
    }
}

    /* Question:
       What is an interface? How does it differ from an abstract class?

       Answer:
       An interface is a special type of  "abstract class" that is used to group related methods with empty bodies.
       This is how it differs form a proper abstract class:

       1. Methods of a Java interface are implicitly abstract and cannot have implementations. A Java abstract class can
          have instance methods that implements a default behavior.
       2. Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
       3. Members of a Java interface are public by default. A Java abstract class can also have private, protected, etc.
       4. Java interface is implemented using keyword “implements”. A Java abstract class is extended using “extends”.
       5. A Java class can implement multiple interfaces but it can extend only one abstract class.
       6. Interface is absolutely abstract and cannot be instantiated; A Java abstract class also cannot be instantiated,
          but can be invoked if a main() exists.
       7. In comparison with java abstract classes, java interfaces are slow as it requires extra indirection.

       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

       Question:
       How could you make the animals be ordered from highest age to lowest age?

       Answer:
       To make the animals be ordered from highest to lowest age  we have to rewrite Animal's class compareTo method
       in this form:

                            public int compareTo(Animal compareToAnimal) {
                                if(this.getAge() == compareToAnimal.getAge()) {
                                    return 0;
                                } else if(this.getAge() > compareToAnimal.getAge()) {
                                    return compareToAnimal.getAge()-this.getAge();
                                } else {
                                    return compareToAnimal.getAge()-this.getAge();
                                }
                            }
    */
