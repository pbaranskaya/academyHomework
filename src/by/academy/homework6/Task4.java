package by.academy.homework6;

import java.io.*;
import java.util.Objects;

public class Task4 {
    public static void main(String[] args) throws IOException {

        File dir = new File("src/task4");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File result = new File(dir, "result.txt");
        if (!result.exists()) {
            result.createNewFile();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("src/files/task2.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter(result))) {

            String str;
            int symbols = 0;
            String text = "";

            while ((str = br.readLine()) != null) {
                symbols += str.length();
                text = str;
            }

            System.out.println("Количество символов в файле: " + symbols);

            for (int i = 1; i <= 100; i++) {
                File file = new File(dir, i + ".txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fw = new FileWriter(file);
                int number = (int) (Math.random() * symbols);
                fw.write(text.substring(0, number));
                fw.close();
            }

            for (File f : Objects.requireNonNull(dir.listFiles())) {
                bw.write("Имя файла: " + f.getName() + " размер файла: " + f.length() + "\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


