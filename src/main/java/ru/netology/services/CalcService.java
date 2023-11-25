package ru.netology.services;

public class CalcService {
    public int calculate(int income, int expenses, int threshold) {
        int balance = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                // отдыхаем
                balance = balance - expenses;
                balance = balance / 3;
                counter++;
            } else {
                // работаем
                balance = balance + income - expenses;

            }
        }
        return counter;
    }
}
