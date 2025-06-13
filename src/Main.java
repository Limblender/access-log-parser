import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validPathCount = 0;

        while (true) {
            System.out.println("Введите путь к файлу или директории (или 'exit' для завершения):");
            String path = scanner.nextLine();

            if (path.equalsIgnoreCase("exit")) {
                System.out.println("Программа завершена.");
                System.out.println("Общее количество корректных путей: " + validPathCount);
                break;
            }

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists) {
                System.out.println("Путь не существует.");
                continue;
            }

            validPathCount++;
            System.out.println("Путь существует!");

            if (isDirectory) {
                System.out.println("Это директория.");
            } else {
                System.out.println("Это файл.");
            }

            System.out.println("Общее количество корректных путей: " + validPathCount);
        }
        scanner.close();
    }
}
