package com.bolotin;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        System.out.println("Задание 1");

        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        for (n--; n > 0; n --) {
            System.out.print(n + " ");
        }

        // Задание 2

        System.out.println();
        System.out.println("Задание 2");


        for (int i = 1; i <= 31; i = i + 7) {

                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }

        // Задание 3

            System.out.println("Задание 3");

        int pastPeriod = 2022 - 200;
        int futurePeriod = 2022 + 100;
        int i = pastPeriod;
        while (i >= pastPeriod && i <= futurePeriod) {
            i++;
            if (i % 79 ==0) {
                System.out.println(i);
            }
        }


    }
}
