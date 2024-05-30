
package Progrmacio_orientada_objectes;

class Estudiant{
    private String nom;
    private int edad;
    private int curs;

    public Estudiant (){
    }
    
    public Estudiant (String nom, int edad, int curs){
        this.nom = nom;
        this.edad = edad;
        this.curs = curs;
    }

    public String getNom() {
        return this.nom;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getCurs() {
        return this.curs;
    }

    public void setNom(String nombre_recibido) {
        this.nom = nombre_recibido;
    }

    public void setEdad(int edad_recibido) {
        this.edad = edad_recibido;
    }

    public void setCurs(int curso_recibido) {
        this.curs = curso_recibido;
    }
}

class Main {
    public static final void main(String[] args) {
        Estudiant poner_nombre = new Estudiant();
        Estudiant poner_edad = new Estudiant();
        Estudiant poner_curs = new Estudiant();

        poner_nombre.setNom("Iker");
        poner_edad.setEdad(12);
        poner_curs.setCurs(4);

        String nombre_correcte = poner_nombre.getNom();
        int edad_correcte = poner_edad.getEdad();
        int curs_correcte = poner_curs.getCurs();
 
        System.out.println(nombre_correcte);
        System.out.println(edad_correcte);
        System.out.println(curs_correcte);
    }
}