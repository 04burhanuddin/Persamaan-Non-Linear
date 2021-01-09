package metodeNumerik;

//menghitung akar f(x)=2e^x-3x^2 + 7 dengan metoda bagi dua

import java.text.DecimalFormat;

public class PenyelesaianPesamaanLinear {

    static double fx(double x) {
        double f_x;
        double e = 2.718281828459;
        f_x = (2 * Math.pow(e, x)) - (3 * Math.pow(x, 2)) + 7;
        return f_x;
    }

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("|    Program Penyelesaian Peramaan Non-Linear Menggunakan Metode Bagi-Dua (Bisection)    |");
        System.out.println("|                    Penyelesaian Perhitungan Akar f(x)=2e^x-3x^2 + 7                    |");
        System.out.println("------------------------------------------------------------------------------------------");
        int i;
        DecimalFormat df1 = new DecimalFormat("##0.000000");
        double e1 = 0.000001;
        double e2 = 0.0000001;
        double fa, fb, fc;
        fc = 1000;
        double a, b, c;
        a = -1.7;
        b = -1.6;
        c = 0;
        i = 0;
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("i\t\ta\t\t\t\tb\t\t\t\tc\t\t\t\tf(c)");
        System.out.println("------------------------------------------------------------------------------------------");
        while ((Math.abs(a - b) > e1) || (fc > e2)) {
            c = (a + b) / 2;
            fa = fx(a);
            fx(b);
            fc = fx(c);
            System.out.println(i + "  " + df1.format(a) + "\t\t" + df1.format(b) + "\t\t" + df1.format(c) + "\t\t" + df1.format(fc));
            if ((fa * fc) < 0) {
                b = c;
            } else {
                a = c;
            }
            i++;
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Hampiran akar = " + df1.format(c));
    }

}

