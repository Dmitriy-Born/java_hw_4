import java.io.*;
import java.util.*;
public class hw_4 {
    public static void main(String[] args) {

        Map<String, HashSet<String>> dict = new HashMap<>();
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        HashSet<String> set3 = new HashSet<>();

        String name1 = "Alex";
        set1.add("8999929834534");
        set1.add("8763874873459");
        dict.put(name1, set1);

        String name2 = "Petr";
        set2.add("8736487534534");
        dict.put(name2, set2);

        String name3 = "Svetlana";
        set3.add("89763847593");
        set3.add("3473948uy93");
        set3.add("75627368723");
        dict.put(name3, set2);

//        System.out.println(dict);

        menu(dict);

    }

    static void menu(Map<String, HashSet<String>> dict) {

        System.out.print("Введите номер операции для выбора действия: \n" +
                "1. Добавить контакт.\n" +
                "2. Найти контакт.\n" +
                "3. Удалить контакт.\n" +
                "4. Вывод всех записей.\n" +
                "5. Выход. \n" +
                ":_> ");

        int num = readInt();

        switch (num) {
            case 1 -> addNumber(dict);
            case 2 -> findNumber(dict);
            case 3 -> deleteNumber(dict);
            case 4 -> {System.out.println(dict);
                      System.out.println();
                      menu(dict);}
            case 5 -> {System.out.println("До скорой встречи!");
                      System.exit(0) ;}
        }
    }

    static void deleteNumber(Map<String, HashSet<String>> dict) {

        System.out.println("Введите имя контакта для удаления.");
        String name = readStr();
        dict.remove(name);
        System.out.println("Список контактов после удаления: \n" + dict);
        System.out.println();
        menu(dict);
    }

    static void findNumber(Map<String, HashSet<String>> dict) {
        System.out.println("Введите имя контакта для поиска.");
        String name = readStr();

        HashSet<String> value = dict.get(name);

        System.out.printf("Номера телефонов контакта %s", name + "\n" + value + "\n");
        System.out.println();
        menu(dict);
    }

    static void addNumber(Map<String, HashSet<String>> dict) {

        System.out.println("Введите имя: ");
        String name = readStr();

        System.out.println("Введите сколько номеров будет у данного пользователя (максимум 3): ");
        int countNumber = readInt();

        HashSet<String> set = new HashSet<>();
                switch (countNumber) {
            case (1):
                System.out.println("Введите номер телефона: ");
                String telNumber11 = readStr();
                set.add(telNumber11);
                break;
            case (2):
                System.out.println("Введите 1 номер телефона: ");
                String telNumber21 = readStr();
                System.out.println("Введите 2 номер телефона: ");
                String telNumber22 = readStr();
                set.add(telNumber21);
                set.add(telNumber22);
                break;
            case (3):
                System.out.println("Введите 1 номер телефона: ");
                String telNumber31 = readStr();
                System.out.println("Введите 2 номер телефона: ");
                String telNumber32 = readStr();
                System.out.println("Введите 3 номер телефона: ");
                String telNumber33 = readStr();
                set.add(telNumber31);
                set.add(telNumber32);
                set.add(telNumber33);
                break;
        } // switch

        dict.put(name, set);
        System.out.println(dict);
        menu(dict);
    }

    static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
    static String readStr() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
}