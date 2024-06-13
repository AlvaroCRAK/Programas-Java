package vista;

import javax.swing.*;
import modelo.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener {
    Postulante persona;
    private JPanel panel;
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton procesarButton, limpiarButton, salirButton;
    private JRadioButton opcion1;
    private JRadioButton opcion2;

    public Ventana() {
        setTitle("Laboratorio 10");
        setSize(800, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inicializarComponentes();
        agregarComponentes();
    }

    private void inicializarComponentes() {
        panel = new JPanel(new GridLayout(3, 1, 5, 5));

        textField1 = new JTextField();

        procesarButton = new JButton("Procesar");
        limpiarButton = new JButton("Limpiar");
        salirButton = new JButton("Salir");

        textArea1 = new JTextArea(5, 30);
        textArea1.setEditable(false);

        procesarButton.addActionListener(this);
        limpiarButton.addActionListener(this);
        salirButton.addActionListener(this);

        opcion1 = new JRadioButton("Masculino: ");
        opcion2 = new JRadioButton("Femenino: ");

        ButtonGroup group = new ButtonGroup();
        group.add(opcion1);
        group.add(opcion2);
    }

    private void agregarComponentes() {
        // Panel para los botones de opción
        JPanel panelOpciones = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelOpciones.add(new JLabel("Ingrese su genero: "));
        panelOpciones.add(opcion1);
        panelOpciones.add(opcion2);
        panel.add(panelOpciones);

        JPanel panelEdad = new JPanel(new GridLayout());
        panelEdad.add(new JLabel("Ingrese la edad: "));
        panelEdad.add(textField1);
        panel.add(panelEdad);



        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelBotones.add(procesarButton);
        panelBotones.add(limpiarButton);
        panelBotones.add(salirButton);
        panel.add(panelBotones);

        add(panel, BorderLayout.CENTER);
        add(new JScrollPane(textArea1), BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == procesarButton && (opcion1.isSelected() || opcion2.isSelected())) {
            procesar();
        } else if (e.getSource() == procesarButton) {
            JOptionPane.showMessageDialog(null, "Seleccione masculino o femenino.");
        } else if (e.getSource() == limpiarButton) {
            limpiar();
        } else if (e.getSource() == salirButton) {
            salir();
        }
    }

    private void procesar() {
        boolean sexo;
        if (opcion1.isSelected()) sexo = true;
        else sexo = false;

        int edad = Integer.parseInt(textField1.getText());
        persona = new Postulante(sexo, edad);

        textArea1.append(persona.Categoria());
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
