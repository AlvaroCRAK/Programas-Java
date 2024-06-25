import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static double anchoMinimo(ArrayList<double[]> carros, double t) {
        double posicionMaxima = -1e5;
        double posicionMinima = 1e5;
        for (int i = 0; i < carros.size(); ++i) {
            double posicion = carros.get(i)[0] + carros.get(i)[1] * t;
            if (posicionMinima > posicion)
                posicionMinima = posicion;

            if (posicionMaxima < posicion)
                posicionMaxima = posicion;
        }
        return posicionMaxima - posicionMinima;
    }

    static double func(ArrayList<double[]> carros) {
        final double EPSILON = 1e-7;

        double low = 0;
        double higth = 1e5;

        while (higth - low > EPSILON) {
            double mid1 = low + (higth - low) / 3.0;
            double mid2 = higth - (higth - low) / 3.0;

            double ancho1 = anchoMinimo(carros, mid1);
            double ancho2 = anchoMinimo(carros, mid2);

            if (ancho1 < ancho2)
                higth = mid2;
            else
                low = mid1;
        }
        return anchoMinimo(carros, low);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<double[]> carros = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            double x = scanner.nextDouble();
            double v = scanner.nextDouble();
            carros.add(new double[]{x, v});
        }
        double result = func(carros);
        System.out.printf("%.7f\n", result);
    }
}
