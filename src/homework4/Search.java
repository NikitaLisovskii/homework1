package homework4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {

    public static void whilee(Matcher matcher, String s) {
        int i = 0;
        while (matcher.find()) {
            i++;
        }

        System.out.println("Слово [" + s + "], без учета регистра, встречается " + i + " раз");
    }

    public void search() throws IOException {
        File file = new File("C:\\Users\\ASUS\\Desktop\\Война и мир.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] mas = new byte[fileInputStream.available()];
        fileInputStream.read(mas);
        String str = new String(mas);

        Pattern pattern1 = Pattern.compile("война", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher(str);

        Pattern pattern2 = Pattern.compile(" +и +", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(str);

        Pattern pattern3 = Pattern.compile("мир", Pattern.CASE_INSENSITIVE);
        Matcher matcher3 = pattern3.matcher(str);

        whilee(matcher1, "война");
        whilee(matcher2, "и");
        whilee(matcher3, "мир");

        System.out.println();
    }
}
