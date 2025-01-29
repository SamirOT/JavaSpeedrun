package Lehioak;

import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Objektuak.Denboraldia;

import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TaldeakLehioa extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtTaldearenIzenaIdatzi;
    private JTextField txtTaldearenHerrialdeaIdatzi;
	private DefaultTableModel dtm;
    private JTable tabla;
    private Denboraldia denboraldia; // Instancia para almacenar el año del denboraldia


//    /**
//     * Launch the application.
//     */
//    public static void main(String[] args) {
//        EventQueue.invokeLater(() -> {
//            try {
//                TaldeakLehioa frame = new TaldeakLehioa(denboraldia);
//                frame.setVisible(true);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//    }

    /**
     * Create the frame.
     */
    public TaldeakLehioa(Denboraldia denboraldia) {
        this.denboraldia = denboraldia; // Guardar la instancia recibida

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 723, 585);
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Muestra el año del denboraldia en la interfaz gráfica
        JLabel lblDenboraldia = new JLabel("Denboraldia: " + denboraldia.getUrtea());
        lblDenboraldia.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblDenboraldia.setBounds(10, 10, 200, 30);
        contentPane.add(lblDenboraldia);

        // Crear panel NAV con BorderLayout
        JPanel NAV = new JPanel();
        NAV.setBackground(new Color(255, 255, 255));
        NAV.setBounds(10, 10, 689, 64);
        contentPane.add(NAV);
        NAV.setLayout(new BorderLayout());

        // JLabel a la izquierda
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(TaldeakLehioa.class.getResource("/IMG/Logo txikito.png")));
        NAV.add(lblNewLabel, BorderLayout.WEST);

        // Panel para los botones alineados a la derecha
        JPanel botonesPanel = new JPanel();
        botonesPanel.setBackground(new Color(255, 255, 255));
        botonesPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5)); // Alinear botones a la derecha
        NAV.add(botonesPanel, BorderLayout.EAST);

        // Añadir botones al panel de botones
        JButton btnTaldeak = new JButton("Taldeak");
        btnTaldeak.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        botonesPanel.add(btnTaldeak);

        JButton btnJaurdunaldia = new JButton("Jaurdunaldia");
        botonesPanel.add(btnJaurdunaldia);

        JButton btnSailkapena = new JButton("Sailkapena");
        botonesPanel.add(btnSailkapena);
        
        JPanel panelDatuak = new JPanel();
        panelDatuak.setBackground(new Color(255, 255, 255));
        panelDatuak.setBounds(10, 84, 689, 135);
        contentPane.add(panelDatuak);
        panelDatuak.setLayout(null);
        
        JLabel lblIzena = new JLabel("Izena:");
        lblIzena.setHorizontalAlignment(SwingConstants.RIGHT);
        lblIzena.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblIzena.setBounds(10, 5, 90, 30);
        panelDatuak.add(lblIzena);
        
        JLabel lblHerrialdea = new JLabel("Herrialdea:");
        lblHerrialdea.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblHerrialdea.setBounds(10, 68, 90, 30);
        panelDatuak.add(lblHerrialdea);
        
        txtTaldearenIzenaIdatzi = new JTextField();
        txtTaldearenIzenaIdatzi.setBackground(Color.WHITE);
        txtTaldearenIzenaIdatzi.setText("Taldearen izena idatzi");
        txtTaldearenIzenaIdatzi.setBounds(158, 10, 148, 25);
        panelDatuak.add(txtTaldearenIzenaIdatzi);
        txtTaldearenIzenaIdatzi.setColumns(10);
        
        txtTaldearenHerrialdeaIdatzi = new JTextField();
        txtTaldearenHerrialdeaIdatzi.setBackground(Color.WHITE);
        txtTaldearenHerrialdeaIdatzi.setText("Taldearen herrialdea idatzi");
        txtTaldearenHerrialdeaIdatzi.setColumns(10);
        txtTaldearenHerrialdeaIdatzi.setBounds(158, 68, 148, 25);
        panelDatuak.add(txtTaldearenHerrialdeaIdatzi);
        
        JButton btnGorde = new JButton("Gorde");
        btnGorde.setBounds(493, 12, 102, 35);
        panelDatuak.add(btnGorde);
        
        JButton btnEditatu = new JButton("Editatu");
        btnEditatu.setBounds(493, 50, 102, 35);
        panelDatuak.add(btnEditatu);
        
        JButton btnEzabatu = new JButton("Ezabatu");
        btnEzabatu.setBounds(493, 90, 102, 35);
        panelDatuak.add(btnEzabatu);
        
        JPanel panelTaula = new JPanel();
        panelTaula.setBackground(new Color(255, 255, 255));
        panelTaula.setBounds(10, 231, 689, 276);
        contentPane.add(panelTaula);
        panelTaula.setLayout(null);
        

        
      //Tabla sortu, sartutako datuak erakuzteko
        dtm = new DefaultTableModel(new Object[] {"Talde Kodea", "Izena", "Herrialdea"},0);
        tabla = new JTable(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Talde Kodea", "Izena", "Herrialdea"
        	}
        ));
        JScrollPane scrollPanea = new JScrollPane(tabla);
        scrollPanea.setBounds(10, 10, 669, 256);
        panelTaula.add(scrollPanea);
        
        JButton btnEtxera = new JButton("Etxera");
        btnEtxera.setBounds(614, 517, 85, 21);
        contentPane.add(btnEtxera);
    }
}
