package domains.nature;

public class Flower {

    private String name;
    private boolean hasSmell;
    private String colour;

    public Flower(String name, boolean hasSmell, String colour) {
        this.name = name;
        this.hasSmell = hasSmell;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasSmell() {
        return hasSmell;
    }

    public void setHasSmell(boolean hasSmell) {
        this.hasSmell = hasSmell;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
