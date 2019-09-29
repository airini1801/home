package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(1.0f);
        Orange orange = new Orange(1.5f);
        List<Apple> listApple = new ArrayList<>();
        List<Orange>listOrange = new ArrayList<>();
        listOrange.add(orange);
        listApple.add(apple);
        Box<Apple> boxApple = new Box<>(listApple);
        Box<Apple>boxApple2 = new Box<>();
        Box<Orange>boxOrange = new Box<>(listOrange);
        Box<Orange>boxOrange2 = new Box<>();
        boxOrange2.addAllFruit(boxOrange.getBoxFruit());
        boxApple2.addAllFruit(boxApple.getBoxFruit());



        int[] number = new int[4];
        for (int i = 0; i < number.length; i++) {
            number[i] = i;
        }
        int tmp = number[0];
        number[0] = number[1];
        number[1] = tmp;
        for (int i : number) {
            System.out.println(i);
        }

        String[] test = {"q", "qw"};
        List<String> result = new ArrayList<>(Arrays.asList(test));
        System.out.println(result);
        result.add("ty");
        System.out.println(result);

    }
}
