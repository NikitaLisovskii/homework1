package homework7;

public class Films {
    private String name;
    private String genre;
    private int year;

    public Films(String name, String genre, int year) {
        this.name = name;
        this.genre = genre;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int compareTo(Films films){
        if(this.getYear() > films.getYear()){
            return 1;
        }
        if (this.getYear() < films.getYear()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Films{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}
