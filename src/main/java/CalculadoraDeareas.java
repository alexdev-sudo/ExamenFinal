import java.util.List;

public class CalculadoraDeareas {
    public double CalcularArea(List<Figura> figuras){
        double total = 0.0;
        for(Figura figura : figuras){
            total += figura.calculararea();

        }
        return total;
    }
}
