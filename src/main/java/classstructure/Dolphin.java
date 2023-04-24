package classstructure;

import classstructure.all.Animal;
import classstructure.some.aru;

public class Dolphin extends Animal implements aru {

    @Override
    public void swim() {
        System.out.println("헤엄!");
    }

    @Override
    public void grow() {
        this.age++;
    }

    @Override
    public void eat() {
        this.weight++;
    }
}
