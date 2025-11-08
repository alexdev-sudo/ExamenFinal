import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figura c1 = new circulo(3);
        Figura r1 = new Rectangulo(3, 8);
        Figura T1 = new Triangulo(3, 8);

        List<Figura> figuras = Arrays.asList(c1, r1, T1);
        CalculadoraDeareas calculadora = new CalculadoraDeareas();
        double total = calculadora.CalcularArea(figuras);
        System.out.println("el area total de las figuras es: " + total);
    }
}
