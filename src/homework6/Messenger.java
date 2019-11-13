package homework6;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class Messenger {
    /**
     * 1. Вводить ник
     *  1.1 Должен быть только латинскими буквами
     *  1.2 Должен быть не меньше 5 симвлов
     *  1.3 Не должен начинаться с цифры
     *  1.4 Не должен содержать #,.\
     * 2. Сообщения вводится через консоль
     * 3. Сообщения хранятся в массиве
     * 4. Можно отредактировать свои сообщения если они не старше минуты
     * 5. Можно писать отложенные сообщения
     **/

    public static User getValidUser(){
        Scanner scanner = new Scanner(System.in);
        User user = null;
        boolean flag = false;

        String s1 = null;
        String s2 = null;

        do {
            System.out.println("Введите логин: ");
            s1 = scanner.nextLine();

            System.out.println("Введите пароль: ");
            s2 = scanner.nextLine();

            user = new User(s1, s2);
            flag = ValidateUser.checkUser(user);

            if (!flag) {
                System.out.println("Пользователь не валиден");
            }
        }
        while (!flag);
        return user;
    }

    public static void main(String[] args) {

        User user1 = getValidUser();
        User user2 = getValidUser();

        Scanner scanner = new Scanner(System.in);

        String mes1 = "";
        String mes2 = "";

        Dialogs dialogs = new Dialogs();

        while (true) {
            System.out.println(user1.getLogin() + " вводит сообщение");
            mes1 = scanner.nextLine();
            if (mes1.equalsIgnoreCase("exit")) {
                break;
            }
            dialogs.addMessages(new Message(mes1, user1, new Date()));

            System.out.println(user2.getLogin() + " вводит сообщение");
            mes2 = scanner.nextLine();
            if (mes2.equalsIgnoreCase("exit")) {
                break;
            }
            dialogs.addMessages(new Message(mes2, user2, new Date()));
        }

        for (Message message : dialogs.getMessages()) {
            System.out.println(message.toString());
        }
    }
}
