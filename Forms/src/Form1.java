import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    public JPanel mainPanel;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextArea num1LargoNum2AnchoTextArea;
    private JLabel label6;
    private JLabel label7;
    private JLabel resultado;
    private JButton AREAButton;
    private JButton PERIMETROButton;
    private JButton AREAButton1;
    private JButton PERIMETROButton1;
    private JButton AREAButton2;
    private JButton PERIMETROButton2;
    private JButton AREAButton3;
    private JButton PERIMETROButton3;
    private JButton AREAButton4;
    private JButton PERIMETROButton4;
    private JLabel resultadoLB;

    public Form1() {
        AREAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultado.setText(Double.toString(num1 * num2));
            }

        });
        PERIMETROButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultado.setText(Double.toString(num1 + num2*2));
            }
        });
        AREAButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultado.setText(Double.toString(num1*num2*0.5));
            }
        });

        PERIMETROButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultado.setText(Double.toString(num1*3));
            }
        });

        AREAButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultado.setText(Double.toString(num1*num2));
            }
        });
        PERIMETROButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultado.setText(Double.toString(num1*num2*2));
            }
        });
        AREAButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultado.setText(Double.toString(num1*num2*Math.PI));
            }
        });
        PERIMETROButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultado.setText(Double.toString(Math.PI*(3*(num1+num2)-Math.sqrt((3*num1+num2)*(num1+3*num2)))));
            }
        });

        AREAButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultado.setText(Double.toString((num1*num2)/2));
            }
        });

        PERIMETROButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultado.setText(Double.toString(num1*4));
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
