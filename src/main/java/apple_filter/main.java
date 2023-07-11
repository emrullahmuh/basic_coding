package apple_filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        appleTest appleweight=(Apple apple)->{return apple.getWeight()>200;};
        appleTest applecolor=(Apple apple)->{return apple.getColor().equals(color.GREEN);};

        Apple ap1=new Apple(203.0,color.GREEN);
        Apple ap2=new Apple(134.0,color.RED);
        Apple ap3=new Apple(125.0,color.GREEN);
        Apple ap4=new Apple(89.0,color.GREEN);
        Apple ap5=new Apple(53.0,color.RED);
        Apple ap6=new Apple(503.0,color.RED);
        List<Apple>inventory=new ArrayList<>();
       inventory.add(ap1);
        inventory.add(ap2);
        inventory.add(ap3);
        inventory.add(ap4);
        inventory.add(ap5);
        inventory.add(ap6);

        List<Apple>havyapple= filterApple( inventory,(Apple apple)->{return apple.getWeight()>200;} );
        System.out.println(havyapple);
        List<Apple>greenapple=filterApple(inventory,(Apple apple)->{return apple.getColor().equals(color.GREEN);});
        System.out.println(greenapple);



    }

public static List<Apple> filterApple(List<Apple>inventory,appleTest filter){
List<Apple>result=new ArrayList<>();
    for (Apple apple : inventory) {
        if (filter.test(apple)){
            result.add(apple);
        }
    }

   return result; }

}
