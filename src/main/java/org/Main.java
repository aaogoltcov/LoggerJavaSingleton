package org;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner in = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Введите размер списка: ");
        int arrayLength = in.nextInt();

        System.out.println("Введите верхнюю границу для значений: ");
        int arrayMaxValue = in.nextInt();

        logger.log("Создаём и наполняем список");

        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            arrayList.add(random.nextInt(arrayMaxValue));
        }

        System.out.println("Вот случайный список: " + arrayList.toString());

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите порог для фильтра: ");
        int filterRange = in.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(filterRange);
        List<Integer> arrayResult = filter.filterOut(arrayList);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + arrayResult.toString());

        logger.log("Завершаем программу");
    }
}