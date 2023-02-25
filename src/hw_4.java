import java.io.*;
import java.util.*;

public class hw_4 {
    public static void main(String[] args) {

//////////////////////////////////////////////////////////////////// Создание готового словаря
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

        System.out.println("Вы хотите просмотреть все записи? 1 - да, 2 - нет");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        if (num1 == 1) {
            System.out.println(dict);
        }

        System.out.println("Вы хотите добавить новую запись? 1 - да, 2 - нет");
        int num2 = scan.nextInt();
        if (num2 == 1) {
            newData(dict);
        }
        else {
            System.out.println(dict);
        }

        System.out.println("Выполним поиск по логину? 1 - да, 2 - нет");
        int num3 = scan.nextInt();
        if (num3 == 1){
            System.out.println("Чьи номера будем искать? Введите логин: ");
            String str1 = scan.next();
            System.out.printf("Номера телефонов по записи %s: ", str1 + " " + dict.get(str1));
        }

        System.out.println("Выполним удаление по логину? 1 - да, 2 - нет");
        int num4 = scan.nextInt();
        if (num4 == 1){
            System.out.println("Чью запись будем удалять? Введите логин: ");
            String str2 = scan.next();
            System.out.println("Все записи до удаления: \n" + dict);
            dict.remove(str2);
            System.out.println("Все записи после удаления: \n" + dict);
        }
        scan.close();
    }
    /////////////////////////////////////////////////////////////////// Добавление нового элемента в словарь
    public static void newData(Map<String, HashSet<String>> dict) {

        HashSet<String> set = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scan.next();
        System.out.println("Введите количество номеров телефона у данного человека (до 3-х): ");
        int countTel = scan.nextInt();

        switch (countTel) {
            case (1):
                System.out.println("Введите номер телефона: ");
                String telNumber11 = scan.next();
                set.add(telNumber11);
                break;
            case (2):
                System.out.println("Введите 1 номер телефона: ");
                String telNumber21 = scan.next();
                System.out.println("Введите 2 номер телефона: ");
                String telNumber22 = scan.next();
                set.add(telNumber21);
                set.add(telNumber22);
                break;
            case (3):
                System.out.println("Введите 1 номер телефона: ");
                String telNumber31 = scan.next();
                System.out.println("Введите 2 номер телефона: ");
                String telNumber32 = scan.next();
                System.out.println("Введите 3 номер телефона: ");
                String telNumber33 = scan.next();
                set.add(telNumber31);
                set.add(telNumber32);
                set.add(telNumber33);
                break;
        } // switch

        scan.close();

        dict.put(name, set);

        System.out.println(dict);
    }
}




