package vista;

import javax.swing.*;
import modelo.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener {
    Donacion monto;
    private JPanel panel;
    private JTextField textField1;
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

        textField1 = new JTextField();

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
        panel.add(new JLabel("Ingrese el monto de la Donaci`on: "));
        panel.add(textField1);

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
        double donacion = Double.parseDouble(textField1.getText());

        monto = new Donacion(donacion);

        textArea1.append(monto.reparticion());
    }

    private void limpiar() {
        textField1.setText("");
        textField1.requestFocus();
        textArea1.setText("");
    }

    private void salir() {
        dispose();
    }


}
