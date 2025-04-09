package com.gevernova.inbuilt;
import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        String scale = scanner.next().toLowerCase();
        if (scale.equals("c")) System.out.println(celsiusToFahrenheit(value));
        else if (scale.equals("f")) System.out.println(fahrenheitToCelsius(value));
    }
}
