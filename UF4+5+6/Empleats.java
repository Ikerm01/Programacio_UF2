class Empleat {
    String nom;
    double salari;

    Empleat(String nom, double salari) {
        this.nom = nom;
        this.salari = salari;
    }

    void imprimirDetalls() {
        System.out.println("Nom: " + nom + ", Salari: " + salari);
    }
}

class EmpleatPerHores extends Empleat {
    int horesTreballades;
    double tarifaPerHora;

    EmpleatPerHores(String nom, double tarifaPerHora, int horesTreballades) {
        super(nom, 0); // Salari inicial 0, es calcularà després
        this.horesTreballades = horesTreballades;
        this.tarifaPerHora = tarifaPerHora;
    }

    double calcularSalari() {
        salari = horesTreballades * tarifaPerHora;
        return salari;
    }
}

class EmpleatAsalariat extends Empleat {
    EmpleatAsalariat(String nom, double salari) {
        super(nom, salari);
    }
}

class EmpleatPerComissio extends Empleat {
    double vendesRealitzades;
    double comissioPerVenda;

    EmpleatPerComissio(String nom, double salari, double vendesRealitzades, double comissioPerVenda) {
        super(nom, salari);
        this.vendesRealitzades = vendesRealitzades;
        this.comissioPerVenda = comissioPerVenda;
    }

    double calcularSalari() {
        salari = salari + (vendesRealitzades * comissioPerVenda);
        return salari;
    }
}

public class Main {
    public static void main(String[] args) {
        // Empleat per hores
        EmpleatPerHores empleatPerHores = new EmpleatPerHores("Joan", 15.50, 160);
        double salariPerHores = empleatPerHores.calcularSalari();
        empleatPerHores.imprimirDetalls();
        System.out.println("Salari: " + salariPerHores);

        // Empleat assalariat
        EmpleatAsalariat empleatAsalariat = new EmpleatAsalariat("Maria", 2500.0);
        empleatAsalariat.imprimirDetalls();

        // Empleat per comissió
        EmpleatPerComissio empleatPerComissio = new EmpleatPerComissio("Pere", 1800.0, 50000.0, 0.05);
        double salariPerComissio = empleatPerComissio.calcularSalari();
        empleatPerComissio.imprimirDetalls();
        System.out.println("Salari: " + salariPerComissio);
    }
}
