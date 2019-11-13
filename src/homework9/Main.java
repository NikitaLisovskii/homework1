package homework9;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static int i = 0;

    public static void main(String[] args) {
        String[] mas = {"Никита", "Лера", "Саша", "Илья", "Григорий", "Дима", "Гена", "Аня", "Валера", "Диана", "Вика"};

        Map<Integer, Person> personStream = Stream.generate(() -> {
            i++;
            String name = mas[(int) (Math.random() * 11)];
            float score = (float) (Math.round((Math.random() * 10) * 100.0) / 100);
            return new Person(i, name, score);
        })
                .limit(10000)
                .collect(Collectors.toMap(Person::getId, p -> p));


        List<String> topStudents = new ArrayList<>();
        personStream.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(new ValueComparator().reversed()))
                .limit(100)
                .sorted(Map.Entry.comparingByValue(new NameComparator()))
                .forEach(p -> topStudents.add(p.getValue().toString()));


        File file = new File ("Students.txt");

        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write(String.valueOf(topStudents));
            writer.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("----------------------------");

        try(FileReader reader = new FileReader("Students.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}

