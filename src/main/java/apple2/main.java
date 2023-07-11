package apple2;

import apple_filter.Apple;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class main {



    public static void main(String[] args) {
        List<orange> invantory=new ArrayList<>();
        orange ora=new orange(123, Color.GREEN);
        orange ora2=new orange(234, Color.GREEN);
        orange ora3=new orange(1213, Color.GREEN);
        orange ora4=new orange(322, Color.GREEN);
        orange ora5=new orange(123, Color.GREEN);
        invantory.add(ora);
        invantory.add(ora2);
        invantory.add(ora3);
        invantory.add(ora4);
        invantory.add(ora5);






        orangePredicate orangePredicate=(orange oran)-> {
           String ch = oran.getWeight() > 150 ? "heavy" : "light";
           return "a " + ch + " " + oran.getColor() + " orange";
       };

printer(invantory,orangePredicate);
    }

public static void printer(List<orange> inventor,orangePredicate orangePredicate){
    for (orange orange : inventor) {
        String out=orangePredicate.test(orange);
        System.out.println(out);
    }

}
}
