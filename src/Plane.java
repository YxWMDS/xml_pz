public class Plane {
    private String model;
    private String origin;
    private Chars chars;
    private Integer price;

    public Plane(String model, String origin, Chars chars, Integer price) {
        this.model = model;
        this.origin = origin;
        this.chars = chars;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getOrigin() {
        return origin;
    }

    public Chars getChars() {
        return chars;
    }

    public Integer getPrice() {
        return price;
    }
}
