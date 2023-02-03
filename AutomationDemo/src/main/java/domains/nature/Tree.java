package domains.nature;

public class Tree {

    private String name;
    private boolean hasLeafs;
    private String climate;
    private double maxHeight;

    public Tree(String name, boolean hasLeafs, String climate, double maxHeight) {
        this.name = name;
        this.hasLeafs = hasLeafs;
        this.climate = climate;
        this.maxHeight = maxHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasLeafs() {
        return hasLeafs;
    }

    public void setHasLeafs(boolean hasLeafs) {
        this.hasLeafs = hasLeafs;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

}
