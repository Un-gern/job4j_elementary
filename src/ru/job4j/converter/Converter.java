package ru.job4j.converter;

import java.util.jar.JarOutputStream;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }
    public static float dollarToEuro(float value) {
        float rsl = value / 1.08f;
        return rsl;
    }
    public static float euroToDollar(float value) {
        float rsl = value / 0.92f;
        return rsl;
    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollars = rubleToDollar(140);
        System.out.println("140 rubles are " + dollars + " dollars.");
        float dollar = dollarToEuro(5);
        System.out.println("5 dollars are " + dollar + " euro.");
        float euro1 = euroToDollar(5);
        System.out.println("5 euro are " + euro1 + " dollars.");

    }

}
