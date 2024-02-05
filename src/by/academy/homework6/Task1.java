package by.academy.homework6;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {

        String str;

        File dirs = new File("src/files");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }

        File file = new File(dirs, "task1.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(file);
        ) {

            System.out.println("Введите строку: ");
            do {
                str = br.readLine();
                if (str.compareTo("stop") == 0)
                    break;
                str = str + "\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
            System.out.println("Запись завершена");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}



