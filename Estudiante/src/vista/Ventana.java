package vista;

import javax.swing.*;
import modelo.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener {
    Estudiante estudiante;
    private JPanel panel;
    private JTextField textField1, textField2, textField3, textField4;
    private JTextArea textArea1;
    private JButton procesarButton, limpiarButton, salirButton;

    public Ventana() {
        setTitle("Laboratorio 10");
        setSize(600, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inicializarComponentes();
        agregarComponentes();
    }

    private void inicializarComponentes() {
        panel = new JPanel(new GridLayout(6, 2, 5, 5));

        JLabel label1 = new JLabel("Nombre - Minúscula:");
        JLabel label2 = new JLabel("Apellido - Mayúscula:");
        JLabel label3 = new JLabel("Nota 1:");
        JLabel label4 = new JLabel("Nota 2:");

        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();

        procesarButton = new JButton("Procesar");
        limpiarButton = new JButton("Limpiar");
        salirButton = new JButton("Salir");

        textArea1 = new JTextArea(5, 30);
        textArea1.setEditable(false);

        procesarButton.addActionListener(this);
        limpiarButton.addActionListener(this);
        salirButton.addActionListener(this);
    }

    private void agregarComponentes() {
        panel.add(new JLabel("Nombre - Minúscula:"));
        panel.add(textField1);
        panel.add(new JLabel("Apellido - Mayúscula:"));
        panel.add(textField2);
        panel.add(new JLabel("Nota 1:"));
        panel.add(textField3);
        panel.add(new JLabel("Nota 2:"));
        panel.add(textField4);
        panel.add(procesarButton);
        panel.add(limpiarButton);
        panel.add(salirButton);

        add(panel, BorderLayout.CENTER);
        add(new JScrollPane(textArea1), BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == procesarButton) {
            procesar();
        } else if (e.getSource() == limpiarButton) {
            limpiar();
        } else if (e.getSource() == salirButton) {
            salir();
        }
    }

    private void procesar() {
        String nombre = textField1.getText();
        String apellido = textField2.getText();
        double nota1 = Double.parseDouble(textField3.getText());
        double nota2 = Double.parseDouble(textField4.getText());

        estudiante = new Estudiante(nombre, apellido, nota1, nota2);

        textArea1.append(estudiante.convertirMayuscula(estudiante.nombre) + "\n");
        textArea1.append(estudiante.convertirMinuscula(estudiante.apellido) + "\n");
        textArea1.append(estudiante.procesarPromedio() + "\n");
    }

    private void limpiar() {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField1.requestFocus();
    }

    private void salir() {
        dispose();
    }

}
