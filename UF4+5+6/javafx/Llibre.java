public class Llibre {
    private String titol;
    private String autor;

    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

public class Novel·la extends Llibre {
    public Novel·la(String titol, String autor) {
        super(titol, autor);
    }
}

public class CienciaFiccio extends Llibre {
    public CienciaFiccio(String titol, String autor) {
        super(titol, autor);
    }
}

public class Poesia extends Llibre {
    public Poesia(String titol, String autor) {
        super(titol, autor);
    }
}

import java.util.ArrayList;
import java.util.List;

public class LlistaLlibres<T extends Llibre> {
    private List<T> llibres;

    public LlistaLlibres() {
        this.llibres = new ArrayList<>();
    }

    public void afegirLlibre(T llibre) {
        llibres.add(llibre);
    }

    public boolean eliminarLlibre(String titol) {
        for (T llibre : llibres) {
            if (llibre.getTitol().equals(titol)) {
                llibres.remove(llibre);
                return true;
            }
        }
        return false;
    }

    public T buscarLlibre(String titol) {
        for (T llibre : llibres) {
            if (llibre.getTitol().equals(titol)) {
                return llibre;
            }
        }
        return null;
    }

    public void mostrarLlibres() {
        if (llibres.isEmpty()) {
            System.out.println("No hi ha llibres en aquesta llista.");
        } else {
            for (T llibre : llibres) {
                System.out.println(llibre);
            }
        }
    }
}

