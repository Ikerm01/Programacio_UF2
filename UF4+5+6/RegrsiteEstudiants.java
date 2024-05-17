import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Estudiant {
    String nom;
    String cognom;
    int edat;
    List<String> materias;

    public Estudiant(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.materias = new ArrayList<>();
    }
}

public class SistemaDeRegistre {
    private static List<Estudiant> estudiants = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Afegir un nou estudiant");
                System.out.println("2. Afegir una nova matèria a un estudiant existent");
                System.out.println("3. Eliminar una matèria d'un estudiant existent");
                System.out.println("4. Mostrar tots els estudiants registrats");
                System.out.println("5. Mostrar les matèries d'un estudiant específic");
                System.out.println("6. Sortir");
                System.out.print("Selecciona una opció: ");
                int opcio = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
