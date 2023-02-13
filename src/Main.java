/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("8", "256", "Windows", "черный");
        notebook1.setModel("Dell");
        Notebook notebook2 = new Notebook("16", "512", "Apple", "белый");
        notebook2.setModel("Apple");
        Notebook notebook3 = new Notebook("32", "128", "Dos", "черный");
        notebook3.setModel("HP");
        Notebook notebook4 = new Notebook("16", "1024", "linux", "серебристый");
        notebook4.setModel("HP");
        Notebook notebook5 = new Notebook("32", "1024", "Apple", "белый");
        notebook5.setModel("Apple");



        HashSet<Notebook> notebooksSet = new HashSet<>();
        notebooksSet.add(notebook1);
        notebooksSet.add(notebook2);
        notebooksSet.add(notebook3);
        notebooksSet.add(notebook4);
        notebooksSet.add(notebook5);

        System.out.println("Ноутбуки в наличии: \n");

        for (Notebook notebook : notebooksSet) System.out.println(notebook);

        System.out.println("\n");

        Search search = new Search();
        HashMap<String, String> notebookFind = search.searchParams();


        String key;
        String value;
        for (HashMap.Entry<String, String> item : notebookFind.entrySet()) {
            key = item.getKey();
            value = item.getValue();

            System.out.println("По параметрам поиска найдены следующие ноутбуки:");
            resFoundNotebooks(key, value, notebooksSet);
        }

    }

    private static void resFoundNotebooks(String key, String value, HashSet<Notebook> notebooksSet) {
        switch (key) {
            case "model" -> {
                for (var elem : notebooksSet) {
                    if (elem.model.equals(value)) {
                        System.out.println(elem);
                    }
                }
            }
            case "ssd" -> {
                for (var elem : notebooksSet) {
                    if (elem.ssd.equals(value)) {
                        System.out.println(elem);
                    }
                }
            }
            case "ram" -> {
                for (var elem : notebooksSet) {
                    if (elem.ram.equals(value)) {
                        System.out.println(elem);
                    }
                }
            }
            case "os" -> {
                for (var elem : notebooksSet) {
                    if (elem.os.equals(value)) {
                        System.out.println(elem);
                    }
                }
            }
            case "color" -> {
                for (var elem : notebooksSet) {
                    if (elem.color.equals(value)) {
                        System.out.println(elem);
                    }
                }
            }
            default -> System.out.println("Нет товаров, соответсвующих параметрам поиска");
        }

    }
}
