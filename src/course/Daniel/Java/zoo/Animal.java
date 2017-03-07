package course.Daniel.Java.zoo;

/**
 * Created by Jakars on 07/03/2017.
 */
public abstract class Animal {
    public Food food;
    public String name;

    public Animal(Food food, String name) {
        this.food = food;
        this.name = name;
    }

    public void eat(){
        System.out.println(food);
    }


}
