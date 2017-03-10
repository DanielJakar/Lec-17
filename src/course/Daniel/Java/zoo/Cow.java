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
        this.sound = sound;
    }

    public Cow(Food food, String name, String sound) {
        super(food, name);
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return super.toString() +
                "sound ='" + sound;
    }
}
