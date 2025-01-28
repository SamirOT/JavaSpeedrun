package Lehioak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DenboraldiLehioa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUrteaIdatzi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DenboraldiLehioa frame = new DenboraldiLehioa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
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
		txtUrteaIdatzi.setText("Urtea idatzi");
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
	}
}
