package introducaoPOO.domain;

public class AreaTriangulo {
    double a;
    double b;
    double c;

    public AreaTriangulo(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculoPerimetro() {
        return (a + b + c) / 2.0;

    }
    public double calculoArea() {
        return Math.sqrt(calculoPerimetro() * (calculoPerimetro() - a) * (calculoPerimetro() - b) * (calculoPerimetro() - c));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
