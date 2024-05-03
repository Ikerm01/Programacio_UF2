package Gestió_de_notes;

import java.util.Dictionary;

public class GestorNotes {
    Dictionary<String, double[]> alumnes = new Dictionary<String,double[]>();

    public void registrar_notes(String nom_alumne, double[] notes){
        alumnes.put(nom_alumne, notes);
    }
    
    public double[] obtenir_nota(String nom_alumne){
        return alumnes.get(nom_alumne);
    }
}