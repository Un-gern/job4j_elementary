package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        if (amount != 0) {
            double bal = amount * percent / 100.0 + amount - salary;
            year = 1;
            while (bal > 0) {
                bal = bal * percent / 100.0 + bal - salary;
                year++;
            }
        }

        return year;
    }
}