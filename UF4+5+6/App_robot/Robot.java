package App_robot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Robot {
    private JFrame frame; /*Ventana */
    private JPanel panel; /*Panel para meter los botones */
    private JButton Moure_Endevant, Moure_Enrere, Girar_Esquerra, Girar_Dreta, Guardar_Estat, Carregar_Estat; /*Botones */
    private EstatJugador EstatJugador;

    public Robot()
    {
        /*Inicializar el estado del jugador */
        EstatJugador = new EstatJugador(0, 0, "Nort");
        /*Configuracion de ventana */
        frame = new JFrame("Control de Robot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300); 

        /*Comfiguracion del panel y los botones */
        panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        Moure_Endevant = new JButton("Moure Endevant"); 
        Moure_Enrere = new JButton("Moure Enrere");
        Girar_Esquerra = new JButton("Girar Esquerra"); 
        Girar_Dreta = new JButton("Girar Dreta"); 
        Guardar_Estat = new JButton("Guardar Estat"); 
        Carregar_Estat = new JButton("Carregar Estat");

        /*Añadir los botones al panel */
        panel.add(Moure_Endevant);
        panel.add(Moure_Enrere);
        panel.add(Girar_Esquerra);
        panel.add(Girar_Dreta);
        panel.add(Guardar_Estat);
        panel.add(Carregar_Estat);
        
        

        /*Agregar actionlistener a cada boton */
        Moure_Endevant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Te has mogut cap endevant");
            }
        });
        Moure_Enrere.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Te has mogut cap enrere");
            }
        });
        Girar_Esquerra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Te has mogut cap l'esquerre");
            }
        });
        Girar_Dreta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Te has mogut cap la dreta");
            }
        });
        Guardar_Estat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Estat guardat");
            }
        });
        Carregar_Estat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Estat carregat");
            }
        });
        /*Mostrar la ventana */
        frame.setVisible(true);

    }

    public class EstatJugador {
        private int x;
        private int y;
        private String direccio;

        public EstatJugador(int x, int y, String direccio){
            this.x = x;
            this.y = y;
            this.direccio = direccio;
        }

        public int getX(){
            return x;
        }
        
        public void setX(int x){
            this.x = x;
        }
        
        public int getY(){
            return y;
        }

        public void setY(int y){
            this.y = y;
        }

        public String getDireccio(){
            return direccio;
        }

        public void setDireccio(String direccio){
            this.direccio = direccio;
        }
        
    }

    public static void main(String[] args) {
        new Robot();
    }
}
