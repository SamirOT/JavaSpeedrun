package Lehioak;

import Objektuak.Denboraldia;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class DenboraldiLehioa extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtUrteaIdatzi;
    private Denboraldia denboraldia; // Instancia de Denboraldia

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                DenboraldiLehioa frame = new DenboraldiLehioa();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public DenboraldiLehioa() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblLogo = new JLabel("");
        lblLogo.setBounds(165, 10, 80, 55);
        lblLogo.setIcon(new ImageIcon(DenboraldiLehioa.class.getResource("/IMG/Logo txikito.png")));
        contentPane.add(lblLogo);

        JPanel panel = new JPanel();
        panel.setBounds(10, 75, 416, 151);
        contentPane.add(panel);
        panel.setLayout(null);

        txtUrteaIdatzi = new JTextField();
        txtUrteaIdatzi.setText("");
        txtUrteaIdatzi.setBounds(149, 33, 96, 19);
        panel.add(txtUrteaIdatzi);
        txtUrteaIdatzi.setColumns(10);

        JLabel lblDenboraldia = new JLabel("Denboraldia");
        lblDenboraldia.setBounds(149, 10, 86, 20);
        panel.add(lblDenboraldia);
        lblDenboraldia.setFont(new Font("Tahoma", Font.PLAIN, 16));

        JButton btnAurrera = new JButton("Aurrera");
        btnAurrera.setBounds(341, 232, 85, 21);
        contentPane.add(btnAurrera);

        // Acción del botón
        btnAurrera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int urtea = Integer.parseInt(txtUrteaIdatzi.getText());
                    if (urtea >= 2024 && urtea <= 2999){
                        JOptionPane.showMessageDialog(null, "Denboraldia " + urtea + " gordeta!");
                    }
                    else if (urtea < 2024 || urtea > 2999){
                        throw new NumberFormatException("Integer is out of range.");
                    }
                    denboraldia = new Denboraldia(urtea); // Crear objeto con el año introducido
                    abrirTaldeakLehioa(); // Ir a la siguiente ventana
                } catch (InputMismatchException ex) {
                    JOptionPane.showMessageDialog(null, "Urtea zenbaki bat izan behar da!", "Errorea", JOptionPane.ERROR_MESSAGE);
                }
                catch (NumberFormatException e1) { // Range check
                    JOptionPane.showMessageDialog(null, "Urtea 2024 eta 2999 artean egon behar da!", "Errorea", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    /**
     * Método para abrir la ventana de equipos y pasar la instancia de Denboraldia
     */
    private void abrirTaldeakLehioa() {
        TaldeakLehioa taldeakLehioa = new TaldeakLehioa(denboraldia);
        taldeakLehioa.setVisible(true);
        this.dispose();
    }
}
