public class Main {
    public static void main(String[] args) {
        LlistaLlibres<Novel·la> novel·les = new LlistaLlibres<>();
        LlistaLlibres<CienciaFiccio> cienciaFiccio = new LlistaLlibres<>();
        LlistaLlibres<Poesia> poesies = new LlistaLlibres<>();

        // Afegir llibres
        novel·les.afegirLlibre(new Novel·la("Novel·la 1", "Autor A"));
        novel·les.afegirLlibre(new Novel·la("Novel·la 2", "Autor B"));
        cienciaFiccio.afegirLlibre(new CienciaFiccio("Ciència-ficció 1", "Autor C"));
        poesies.afegirLlibre(new Poesia("Poesia 1", "Autor D"));

        // Mostrar llibres
        System.out.println("Novel·les:");
        novel·les.mostrarLlibres();
        System.out.println("\nCiència-ficció:");
        cienciaFiccio.mostrarLlibres();
        System.out.println("\nPoesies:");
        poesies.mostrarLlibres();

        // Buscar un llibre
        System.out.println("\nBuscar 'Novel·la 1': " + novel·les.buscarLlibre("Novel·la 1"));
        System.out.println("Buscar 'Ciència-ficció 2': " + cienciaFiccio.buscarLlibre("Ciència-ficció 2"));

        // Eliminar un llibre
        System.out.println("\nEliminar 'Novel·la 1': " + novel·les.eliminarLlibre("Novel·la 1"));
        System.out.println("Eliminar 'Ciència-ficció 2': " + cienciaFiccio.eliminarLlibre("Ciència-ficció 2"));

        // Mostrar llibres després d'eliminar
        System.out.println("\nNovel·les després d'eliminar:");
        novel·les.mostrarLlibres();
    }
}
