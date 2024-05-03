package Arbre_Binari;

public class Principal {
    public static void main(String[] args){
        /*Creamos dos arboles de fondaria 5 */
        Arbre_Binari_Enters abb = new Arbre_Binari_Enters();
        Arbre_Binari_Enters abb = new Arbre_Binari_Enters();

         /*Creamos dos arboles de fondaria 3 */
         Arbre_Binari_Caracters abb = new Arbre_Binari_Caracters();
         Arbre_Binari_Caracters abb = new Arbre_Binari_Caracters();

        /*Forzar el Garbage Collector */
        System.gc();
    }
}
