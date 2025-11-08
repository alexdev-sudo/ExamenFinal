public class circulo  extends Figura{
    private double radio;
public circulo(double radio){
    this.radio = radio;
}
@Override
    public double calculararea(){
    return Math.PI*radio*radio;
}
}
