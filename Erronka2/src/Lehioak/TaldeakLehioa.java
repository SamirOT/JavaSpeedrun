package Lehioak;

import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TaldeakLehioa extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtIzena;
    private JTextField txtHerrialdea;
	private DefaultTableModel dtm;
    private JTable tabla;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                TaldeakLehioa frame = new TaldeakLehioa();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public TaldeakLehioa() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 723, 585);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

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
        
        txtIzena = new JTextField();
        txtIzena.setBackground(Color.WHITE);
        txtIzena.setText("Taldearen izena idatzi");
        txtIzena.setBounds(158, 10, 148, 25);
        panelDatuak.add(txtIzena);
        txtIzena.setColumns(10);
        
        txtHerrialdea = new JTextField();
        txtHerrialdea.setBackground(Color.WHITE);
        txtHerrialdea.setText("Taldearen herrialdea idatzi");
        txtHerrialdea.setColumns(10);
        txtHerrialdea.setBounds(158, 68, 148, 25);
        panelDatuak.add(txtHerrialdea);
        
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
