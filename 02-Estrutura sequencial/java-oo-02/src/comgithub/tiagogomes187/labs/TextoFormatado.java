package comgithub.tiagogomes187.labs;

import java.util.Locale;

public class TextoFormatado {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.format("%s, which price is $ %.2f %n",product1, price1);
        System.out.format("%s, which price is $ %.2f %n%n", product2, price2);

        System.out.format("Record: %d years old, code %d and gender: %s %n%n", age, code, gender);

        System.out.format("Measure with eight decimal places: %.8f %n", measure);
        System.out.format("Rouded (three decimal places): %.3f %n", measure);
        System.out.format(Locale.US, "US decimal point: %.3f %n", measure);
    }
}
