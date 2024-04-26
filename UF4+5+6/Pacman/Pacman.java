package Pacman;

public class Pacman {
    private int posX;
    private int posY;
    private int vidas;
    private int puntuacion;

    public Pacman(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.vidas = 3;
        this.puntuacion = 0;
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

    public int getVidas(){
        return vidas;
    }

    public void setVidas(int vidas){
        this.vidas = vidas;
    }

    public int getPuntuacion(){
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion){
        this.puntuacion = puntuacion;
    }

    public void pickupBola(){
        this.puntuacion += 10;
    }
}
