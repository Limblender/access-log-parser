import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите путь к файлу или директории (или 'exit' для завершения):");
            String path = scanner.nextLine();

            if (path.equalsIgnoreCase("exit")) {
                System.out.println("Программа завершена.");
                break;
            }

            File file = new File(path);
            boolean fileExists = file.exists();

            if (fileExists) {
                System.out.println("Путь существует!");
                if (file.isDirectory()) {
                    System.out.println("Это директория.");
                } else {
                    System.out.println("Это файл.");
                }
            } else {
                System.out.println("Путь не существует.");
            }
        }
        scanner.close();
    }
}