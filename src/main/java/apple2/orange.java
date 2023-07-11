package apple2;

import java.awt.*;

public class orange {
    private double weight;
private Color color;

    public orange(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String  getColor() {
     String out="";


      if (color.equals(Color.GREEN)){
        out="green";
      }else {out="red";}

      return out;

    }
}
