package Lehioak;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JaurdunaldiaLehioa extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tablaPartidos;
    private DefaultTableModel modeloTabla;
    private List<String> equipos;
    private JTextField txtGolak1;
    private JTextField txtGolak2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	JaurdunaldiaLehioa frame = new JaurdunaldiaLehioa();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public JaurdunaldiaLehioa() {
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
        lblLogo.setIcon(new ImageIcon(JaurdunaldiaLehioa.class.getResource("/IMG/Logo txikito.png")));
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
        panelTabla.setBounds(10, 84, 689, 300);
        contentPane.add(panelTabla);
        panelTabla.setLayout(null);

        modeloTabla = new DefaultTableModel(new Object[][] {}, new String[] {"Talde 1", "Talde 2", "Golak 1", "Golak 2"});
        tablaPartidos = new JTable(modeloTabla);

        JScrollPane scrollPane = new JScrollPane(tablaPartidos);
        scrollPane.setBounds(10, 10, 669, 280);
        panelTabla.add(scrollPane);

        // Botón para generar jornadas
        JButton btnSortuJardunaldiak = new JButton("Sortu Jardunaldiak");
        btnSortuJardunaldiak.setBounds(10, 400, 180, 30);
        contentPane.add(btnSortuJardunaldiak);

        btnSortuJardunaldiak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarJornadas();
            }
        });

        // Panel para los resultados
        JPanel panelResultados = new JPanel();
        panelResultados.setBackground(Color.WHITE);
        panelResultados.setBounds(10, 440, 689, 60);
        contentPane.add(panelResultados);
        panelResultados.setLayout(null);

        JLabel lblTalde1 = new JLabel("Golak Talde 1:");
        lblTalde1.setBounds(10, 10, 120, 25);
        panelResultados.add(lblTalde1);

        txtGolak1 = new JTextField();
        txtGolak1.setBounds(140, 10, 50, 25);
        panelResultados.add(txtGolak1);

        JLabel lblTalde2 = new JLabel("Golak Talde 2:");
        lblTalde2.setBounds(220, 10, 120, 25);
        panelResultados.add(lblTalde2);

        txtGolak2 = new JTextField();
        txtGolak2.setBounds(350, 10, 50, 25);
        panelResultados.add(txtGolak2);

        JButton btnGorde = new JButton("Gorde");
        btnGorde.setBounds(500, 10, 85, 30);
        panelResultados.add(btnGorde);

        btnGorde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarResultados();
            }
        });

        JButton btnGarbitu = new JButton("Garbitu");
        btnGarbitu.setBounds(590, 10, 85, 30);
        panelResultados.add(btnGarbitu);

        btnGarbitu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarGoles();
            }
        });

        // Botón para volver al menú principal
        JButton btnEtxera = new JButton("Etxera");
        btnEtxera.setBounds(614, 517, 85, 21);
        contentPane.add(btnEtxera);

        // Inicializar equipos
        equipos = new ArrayList<>();
        equipos.add("Talde 1");
        equipos.add("Talde 2");
        equipos.add("Talde 3");
        equipos.add("Talde 4");
        equipos.add("Talde 5");
        equipos.add("Talde 6");
    }

    private void generarJornadas() {
        modeloTabla.setRowCount(0); // Limpiar tabla
        List<String> copiaEquipos = new ArrayList<>(equipos);
        Collections.shuffle(copiaEquipos); // Mezclar equipos

        for (int i = 0; i < copiaEquipos.size(); i += 2) {
            String talde1 = copiaEquipos.get(i);
            String talde2 = copiaEquipos.get(i + 1);
            modeloTabla.addRow(new Object[] { talde1, talde2, "", "" });
        }
    }

    private void guardarResultados() {
        int filaSeleccionada = tablaPartidos.getSelectedRow();
        if (filaSeleccionada != -1) {
            try {
                int golak1 = Integer.parseInt(txtGolak1.getText());
                int golak2 = Integer.parseInt(txtGolak2.getText());

                modeloTabla.setValueAt(golak1, filaSeleccionada, 2);
                modeloTabla.setValueAt(golak2, filaSeleccionada, 3);

                JOptionPane.showMessageDialog(this, "Emaitzak gordeta!", "Informazioa", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Sartu balio egokiak golekin!", "Errorea", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Aukeratu partida bat!", "Errorea", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void limpiarGoles() {
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            modeloTabla.setValueAt("", i, 2);
            modeloTabla.setValueAt("", i, 3);
        }
        JOptionPane.showMessageDialog(this, "Golak garbitu dira!", "Informazioa", JOptionPane.INFORMATION_MESSAGE);
    }
}
