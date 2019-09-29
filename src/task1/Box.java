package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> boxFruit;

    public List<T> getBoxFruit() {
        return boxFruit;
    }

    public Box() {
        this.boxFruit = new ArrayList<>();

    }

    public Box(List<T> boxFruit)
    {
        this.boxFruit = boxFruit;
    }

    public void addFruit(T fruit) {
        boxFruit.add(fruit);
    }
    public void addAllFruit(List<T> fruits) {
        boxFruit.addAll(fruits);
    }

    public float getWeight() {
        float weightBox = 0;
        for (T t : boxFruit) {
            weightBox = weightBox + t.getWeight();
        }
        return weightBox;

    }

    public boolean compare(Box<?> another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.001;
    }


}
