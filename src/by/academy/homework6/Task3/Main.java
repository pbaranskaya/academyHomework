package by.academy.homework6.Task3;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<User> users = new ArrayList<>(10);

        users.add(new User("User", "1", 30));
        users.add(new User("User", "2", 31));
        users.add(new User("User", "3", 32));
        users.add(new User("User", "4", 33));
        users.add(new User("User", "5", 34));
        users.add(new User("User", "6", 35));
        users.add(new User("User", "7", 36));
        users.add(new User("User", "8", 37));
        users.add(new User("User", "9", 38));
        users.add(new User("User", "10", 39));

        File dir = new File("src/users");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        for (User u : users) {
            File file = new File(dir, u.getName() + "_" + u.getSurname() + ".txt");
            if (!file.exists()) {
                file.createNewFile();

                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {

                    oos.writeObject("Информация о пользователе:");
                    oos.writeObject(u.toString());

                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }
}

