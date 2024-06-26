package swing;
import javax.swing.*;
import java.awt.*;



public class Finestra {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        JTextField pantalla = new JTextField();
        JButton[] numericButtons = new JButton[10];
        JPanel buttonsPanel = new JPanel();
        GridLayout managerButtons = new GridLayout(4, 3);
        BoxLayout managerGeneral = new BoxLayout(frame, BoxLayout.Y_AXIS);
        
        buttonsPanel.setLayout(managerButtons);

        for (int i = 0; i < numericButtons.length; i++) {
            numericButtons[i] = new JButton(Integer.toString(i));
        }

        pantalla.setEditable(false);

        
        for(JButton jButton : numericButtons){
            buttonsPanel.add(jButton);        
        }

        frame.add(pantalla);
        frame.add(buttonsPanel);
        frame.setLayout(managerButtons);
        frame.setSize(300,200); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}