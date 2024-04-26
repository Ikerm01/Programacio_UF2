package Pacman;

public class Fantasma_Pinky {
    private int posX;
    private int posY;
    private String nom;

    public Fantasma_Pinky(int posX, int posY, String nom){
        this.posX = posX;
        this.posY = posY;
        this.nom = nom;
    }   
    
    public int getPosX(){
        return posX;
    }

    public void setPosX(int posX){
        this.posX = posX;
    }
    
    public int getPosY(){
        return posY;
    }

    public void setPosY(int posY){
        this.posY = posY;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
        
}
