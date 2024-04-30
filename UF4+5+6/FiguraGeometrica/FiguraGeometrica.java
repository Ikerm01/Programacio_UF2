package FiguraGeometrica;


/**
 * FiguraGeometrica
 */
public interface FiguraGeometrica {
    double calculararea();
    double calcularperimetre();
}

abstract class Figura2D implements FiguraGeometrica {
    public double base;
    public double altura;
    public double pi;
    public double radi;

    public Figura2D(double base, double altura, double pi, double radi){
        this.base = base;
        this.altura = altura;
        this.pi = pi;
        this.radi = radi;
    }
    public double calculararea(){
        double area_calculada = this.pi * (this.radi * this.radi);
        return area_calculada;
    }

    public double calcularperimetre(){
        double perimetro_calculado = 2 * this.pi * this.radi;
        return perimetro_calculado;
    }
}