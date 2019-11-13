package homework7;

import java.util.Collection;
import java.util.List;

public class FilterApplicator<T extends Collection> {
    public static <T> Collection<T> filter (Collection<T> collectoin, Filter filter){
        return filter.filter(collectoin);
    }

    public static List<Films> sort(List <Films> collection){
        collection.sort(Films::compareTo);
        return collection;
    }
}