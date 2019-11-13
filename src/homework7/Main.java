package homework7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Filter filter = new Filter();
        FilterApplicator filterApplicator = new FilterApplicator();

        List<Films> list = new ArrayList<>();

        list.add(new Films("Тор", "Фантастика", 2011));
        list.add(new Films("Джокер", "Экшен", 2019));
        list.add(new Films("Риддик", "Фантастика", 2013));
        list.add(new Films("Одаренная", "Драма", 2017));
        list.add(new Films("Текст", "Драма", 2019));
        list.add(new Films("Веном", "Фантастика", 2018));

        System.out.println(filterApplicator.filter(list, filter));

        System.out.println(filterApplicator.sort(list));
    }
}
