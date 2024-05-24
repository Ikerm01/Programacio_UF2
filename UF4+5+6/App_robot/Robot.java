package App_robot;

import javax.swing.*;
import java.awt.*;

class Robot {
    private JFrame frame; /*Ventana */
    private JPanel panel; /*Panel para meter los botones */
    private JButton Moure_Endevant, Moure_Enrere, Girar_Esquerra, Girar_Dreta, Guardar_Estat, Carregar_Estat; /*Botones */


    public Robot(){
        robot = new Robot();
        /*Configuracion de ventana */
        frame = new JFrame("Control de Robot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300); 


    }
}
