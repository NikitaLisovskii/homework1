package homework7;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Filter {
    public <T> Collection<T> filter(Collection<T> collection){
        Enumeration enumeration = Collections.enumeration(collection);
        List<Films> list = Collections.list(enumeration);
        list.removeIf(clubsList -> clubsList.getYear() < 2018);
        return (Collection<T>) list;
    }
}
