public class Chars {
    private String type;
    private int seats;
    private Boolean amminution;
    private int rockets;
    private Boolean radar;
    private Parameters parametes;

    public Chars(String type, int seets, Boolean amminution, int rockets, Boolean radar, Parameters parametes) {
        this.type = type;
        this.seats = seets;
        this.amminution = amminution;
        this.rockets = rockets;
        this.radar = radar;
        this.parametes = parametes;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Boolean getAmminution() {
        return amminution;
    }

    public int getRockets() {
        return rockets;
    }

    public Boolean getRadar() {
        return radar;
    }

    public Parameters getParametes() {
        return parametes;
    }
}

class Parameters{
    private Integer length;
    private Integer width;
    private Integer height;

    public Parameters(Integer length, Integer width, Integer height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}
