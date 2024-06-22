package com.framepackage.demoframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;

public class DemoFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtValeur;
	/**
	 * @wbp.nonvisual location=-45,359
	 */
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				DemoFrame frame = new DemoFrame();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public DemoFrame() {
		
		final String POLICENAME = "Arial";
		
		setTitle("Demo Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entrer ton nom :");
		lblNewLabel.setFont(new Font(POLICENAME, Font.BOLD, 12));
		lblNewLabel.setBounds(48, 32, 96, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel1 = new JLabel("Entrer ton age :");
		lblNewLabel1.setFont(new Font(POLICENAME, Font.BOLD, 12));
		lblNewLabel1.setBounds(48, 78, 96, 14);
		contentPane.add(lblNewLabel1);
		
		txtName = new JTextField();
		txtName.setFont(new Font(POLICENAME, Font.BOLD, 12));
		txtName.setBounds(169, 30, 196, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font(POLICENAME, Font.BOLD, 12));
		txtAge.setBounds(169, 75, 196, 20);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(e -> {
		String n=txtName.getText();
		int age = Integer.parseInt(txtAge.getText());
	   if(age<18)
		   txtValeur.setText(n+" trop jeune DSL :'(");
	   else
		   txtValeur.setText(n+" tu peux entrer :p");
	   if(age>50) txtValeur.setText(n+" dsl tu sera bientot mort :'(");
		});
		btnOk.setBackground(Color.GREEN);
		btnOk.setFont(new Font(POLICENAME, Font.BOLD, 12));
		btnOk.setBounds(81, 130, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(Color.RED);
		btnReset.setFont(new Font(POLICENAME, Font.BOLD, 12));
		btnReset.addActionListener(e -> {
			txtName.setText("");
			txtAge.setText("");
			txtValeur.setText("");
		});
		btnReset.setBounds(235, 130, 89, 23);
		contentPane.add(btnReset);
		
		txtValeur = new JTextField();
		txtValeur.setFont(new Font(POLICENAME, Font.BOLD, 18));
		txtValeur.setBackground(new Color(240, 240, 240));
		txtValeur.setBorder(null);
		txtValeur.setBounds(48, 155, 317, 30);
		contentPane.add(txtValeur);
		txtValeur.setColumns(10);
	}
}
