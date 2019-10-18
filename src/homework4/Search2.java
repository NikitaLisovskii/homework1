package homework4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Search2 {

    public static void cycle(String str, String s) {
        int j = 0;
        String[] l = str.split(" +");
        for (int i = 0; i < l.length; i++) {
            if (l[i].equals(s)) {
                j++;
            }
        }
        System.out.println("Слово " + s + " встречается " + j + " раз");
    }

    public void search() throws IOException {
        File file = new File("C:\\Users\\ASUS\\Desktop\\Война и мир.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] mas = new byte[fileInputStream.available()];
        fileInputStream.read(mas);
        String str = new String(mas);

        cycle(str, "война");
        cycle(str, "и");
        cycle(str, "мир");

        System.out.println();
    }
}
