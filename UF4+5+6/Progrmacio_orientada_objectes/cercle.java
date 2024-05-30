package Progrmacio_orientada_objectes;

class Cercle {
    private double radi = 12;
    private double pi = 3.14;

    public double area(){
        double area_calculada = this.pi * (this.radi * this.radi);
        return area_calculada;
    }

    public double perimetre(){
        double perimetro_calculado = 2 * this.pi * this.radi;
        return perimetro_calculado;
    }
}

class Main {
    public static final void main (String[] args) {
        Cercle resultat_area = new Cercle();
        Cercle resultat_perimetre = new Cercle();
        System.out.println(resultat_area.area());
        System.out.println(resultat_perimetre.perimetre());
    }
}
