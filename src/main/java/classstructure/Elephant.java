package classstructure;

import classstructure.all.Animal;
import classstructure.some.powuru;

public class Elephant extends Animal implements powuru {

    @Override
    public void walk() {
        System.out.println("네 발로 걷는다");
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
