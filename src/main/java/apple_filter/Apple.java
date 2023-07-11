package apple_filter;

public class Apple {
    private Double weight;

    private color color;

    public Apple(Double weight, apple_filter.color color) {
        this.weight = weight;
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public apple_filter.color getColor() {
        return color;
    }
}

