import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        JFrame frame = new JFrame("Calculadora de area y perimetro de figuras geometricas");
        frame.setContentPane(new Form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1900,1080);
        frame.setPreferredSize(new Dimension(1920,1800));
        frame.pack();
        frame.setVisible(true);
    }
}