package Lehioak;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SailkapenaLehioa extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tablaClasificacion;
    private DefaultTableModel modeloTabla;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SailkapenaLehioa frame = new SailkapenaLehioa();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public SailkapenaLehioa() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 723, 585);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Panel NAV
        JPanel NAV = new JPanel();
        NAV.setBackground(Color.WHITE);
        NAV.setBounds(10, 10, 689, 64);
        contentPane.add(NAV);
        NAV.setLayout(new BorderLayout());

        // Logo en NAV
        JLabel lblLogo = new JLabel("");
        lblLogo.setIcon(new ImageIcon(SailkapenaLehioa.class.getResource("/IMG/Logo txikito.png")));
        NAV.add(lblLogo, BorderLayout.WEST);

        // Botones NAV
        JPanel botonesPanel = new JPanel();
        botonesPanel.setBackground(Color.WHITE);
        botonesPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));
        NAV.add(botonesPanel, BorderLayout.EAST);

        JButton btnTaldeak = new JButton("Taldeak");
        botonesPanel.add(btnTaldeak);

        JButton btnJaurdunaldia = new JButton("Jaurdunaldia");
        botonesPanel.add(btnJaurdunaldia);

        JButton btnSailkapena = new JButton("Sailkapena");
        botonesPanel.add(btnSailkapena);

        // Panel para la tabla
        JPanel panelTabla = new JPanel();
        panelTabla.setBackground(Color.WHITE);
        panelTabla.setBounds(10, 84, 689, 452);
        contentPane.add(panelTabla);
        panelTabla.setLayout(null);

        modeloTabla = new DefaultTableModel(
                new Object[][] {},
                new String[] {"Taldea", "Posizioa", "Markatutako golak", "Jasotako golak", "Puntuak"}
        );
        tablaClasificacion = new JTable(modeloTabla);

        JScrollPane scrollPane = new JScrollPane(tablaClasificacion);
        scrollPane.setBounds(10, 10, 669, 432);
        panelTabla.add(scrollPane);

        // Botón para volver al menú principal
        JButton btnEtxera = new JButton("Etxera");
        btnEtxera.setBounds(614, 546, 85, 21);
        contentPane.add(btnEtxera);
    }
}
