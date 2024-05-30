package UF3;
 
public class Instanciació_de_classes {
    private int valorPrimari;
    private int valorSecundari;

    public Instanciació_de_classes() {
        this.valorPrimari = 5;
        this.valorSecundari = 10;
    }

    public Instanciació_de_classes(int vp) {
        this.valorPrimari = vp;
        this.valorSecundari = 10;
    }

    public Instanciació_de_classes(int vp, int vs) {
        this.valorPrimari = vp;
        this.valorSecundari = vs;
    }

    public int getPrimari() {
        return this.valorPrimari;
    }

    public int getSecundari() {
        return this.valorSecundari;
    }

    public static final void main(String[] args) {
        Instanciació_de_classes a = new Instanciació_de_classes();
        Instanciació_de_classes b = new Instanciació_de_classes(20);
        Instanciació_de_classes c = new Instanciació_de_classes(20, 40);
        System.out.println("L'objecte _a:_ conté: " + a.getPrimari() + ", " + a.getSecundari());
        System.out.println("L'objecte _b:_ conté: " + b.getPrimari() + ", " + b.getSecundari());
        System.out.println("L'objecte _c:_ conté: " + c.getPrimari() + ", " + c.getSecundari());
    }
}