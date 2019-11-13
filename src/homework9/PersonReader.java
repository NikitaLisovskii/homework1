package homework9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PersonReader {
    public static Stream<Person> personReader() {
        boolean cont = true;
        List<Person> personsList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myFile.txt"))) {

            while (cont) {
                Person person = (Person) ois.readObject();
                if (person != null)
                    personsList.add(person);
                else
                    cont = false;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("finish read file");
        }
        return personsList.stream();
    }
}