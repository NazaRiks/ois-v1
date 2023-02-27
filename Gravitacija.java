import java.util.Scanner;

public class Gravitacija {

    public static void main(String[] args) {

        System.out.println("OIS je zakon!");

    }
    public static double gravitacija(double v) {
        double C = Double.parseDouble("6.674E-11");
        double M = Double.parseDouble("5.972E24");
        double r = Double.parseDouble("6.371E6");
        double a = (C*M)/((r+v)*(r+v));

        return a;
    }
}