package homework3;

public class Alcohol {
    private String name;
    private double procent;

    public Alcohol(String name, double procent) {
        this.name = name;
        this.procent = procent;
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "name='" + name + '\'' +
                ", procent=" + procent +
                '}';
    }
}
