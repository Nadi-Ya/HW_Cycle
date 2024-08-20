package ru.netology.services;

public class VacationCalculator {
    public int calculate(int income, int expense, int threshold) {
        int money = 0;
        int vacationMonths = 0;

        for (int i = 0; i < 12; i++) {

            if (money >= threshold) {
                // Можем отдохнуть
                vacationMonths++;
                money -= expense;
                money /= 3;
            } else {
                // Работаем
                money += income;
                money -= expense;
            }
        }
        return vacationMonths;
    }
}


