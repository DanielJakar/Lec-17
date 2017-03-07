package course.Daniel.Java.zoo;

/**
 * Created by Jakars on 07/03/2017.
 */
public class Cow extends Animal{
    private String sound;

    public Cow(Food food, String name, String sound) {
        super(food, name);
        this.sound = sound;
    }

    @Override
    protected void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return "Cow{" +
                "sound='" + sound + '\'' +
                "} " + super.toString();
    }
}
