package ru.job4j.converter;

/**
 * @author Maksim Antonov
 * Конвертер валют
 * @since 25.05.2020
 * @version 1.0
 */

public class Converter {
    /**
     * Конвертация рублей в евро
     * @param value рубль
     * @return евро
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * Конвертация рублей в доллары
     * @param value рубль
     * @return евро
     */
    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    /**
     * Конвертаци долларов в евро
     * @param value доллары
     * @return евро
     */
    public static float dollarToEuro(float value) {
        float rsl = value / 1.08f;
        return rsl;
    }

    /**
     * Конвертация евро в доллары
     * @param value евро
     * @return доллары
     */
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
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int in1 = 140;
        float expected1 = 2.3333333f;
        float out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2.3333333 dollars. Test result : " + passed1);
        int in2 = 5;
        float expected2 = 4.6296296f;
        float out2 = dollarToEuro(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("5 dollars are 4.626296 euro. Test result : " + passed2);
        int in3 = 5;
        float expected3 = 5.4347825f;
        float out3 = euroToDollar(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("5 euro are 5.4347825 dollars. Test result : " + passed3);


    }

}
