import java.util.HashMap;
import java.util.Scanner;


public class Search {
    public HashMap<String, String> searchParams() {
        System.out.println("Ввведите критерий поиска: m - марка, r - оперативная память, s - жесткий диск, o - операционная система, c - цвет");
        Scanner input = new Scanner(System.in);
        String find = input.nextLine();
        HashMap<String, String> map = new HashMap<>();

        switch (find) {

            case "m":
                System.out.println("Ввведите марку ноутбука для поиска:");
                String model = input.nextLine();
                map.put("model", model);
                break;

            case "r":
                System.out.println("Ввведите объем оперативной памяти:");
                String ram = input.nextLine();
                map.put("ram", ram);
                break;

            case "s":
                System.out.println("Ввведите объем жесткого диска:");
                String ssd = input.nextLine();
                map.put("ssd", ssd);
                break;

            case "o":
                System.out.println("Ввведите операционную систему:");
                String os = input.nextLine();
                map.put("os", os);
                break;

            case "c":
                System.out.println("Введите цвет:");
                String color = input.nextLine();
                map.put("color", color);
                break;
        }

        input.close();

        return map;
    }

}

