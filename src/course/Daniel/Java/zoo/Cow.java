package course.Daniel.Java.zoo;

import course.Daniel.Java.IO;

/**
 * Created by Jakars on 07/03/2017.
 */
public class Cow extends Animal{
    private String sound;
    private Food food = Food.GRASS;

    public Cow() {
        super();
    }

    public Cow(String name) {
        super(Food.GRASS, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

    @Override
    public String toString() {
        return super.toString() +
                "sound ='" + sound;
    }
}
