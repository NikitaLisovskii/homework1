package homework9;

public class Person {

    private Integer id;
    private String name;
    private float avgValue;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getAvgValue() {
        return avgValue;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvgValue(float avgValue) {
        this.avgValue = avgValue;
    }

    public Person(Integer id, String name, float avgValue) {
        this.id = id;
        this.name = name;
        this.avgValue = avgValue;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avgValue=" + avgValue +
                '}';
    }
}