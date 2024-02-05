package by.academy.homework6;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {

        File dirs = new File("src/files");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }

        File file = new File(dirs, "task2.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        File result = new File(dirs, "result.txt");

        if (!result.exists()) {
            result.createNewFile();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file));
             BufferedWriter bwResult = new BufferedWriter(new FileWriter(result))) {

            String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                    "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                    "when an unknown printer took a galley of type and scrambled it to make a type " +
                    "specimen book. It has survived not only five centuries, but also the leap into " +
                    "electronic typesetting, remaining essentially unchanged. It was popularised in " +
                    "the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                    "and more recently with desktop publishing software like Aldus PageMaker including " +
                    "versions of Lorem Ipsum.";

            bw.write(str);
            br.readLine();
            bwResult.write(str.replace(" ", ""));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

