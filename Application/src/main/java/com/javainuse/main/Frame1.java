package com.javainuse.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Frame1 {

    private JFrame frame;
	private String deo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[] delovi = {"Problem", "Guma", "Bandas", "Amortizer", "Lanac", "Srednji pogon", "Kurbla", "Pedala", "Kocnica", "Prednji menjac", "Zadnji menjac", "Kaseta", "Sticna", "Sediste", "Lula Volana", "Volan", "Tocak", "Viljuska"};
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		final JComboBox comboBox = new JComboBox(delovi);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(comboBox);
		// koristi se osluskivac kako bi se sacuvala selektovana stavka iz comboBox
		comboBox.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {
				deo = comboBox.getSelectedItem().toString();
			}
		});
						
		JButton btnNewButton = new JButton("Dalje");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// preko konstruktora("JFrame2") se prosledjuje podatak("deo") iz frame1(tipa Frame1) u frame2(tipa JFrame2)
				JFrame2 frame2 = new JFrame2(deo);	
								
				frame2.show();	// prikazuje se nova formu(tipa JFrame2)
				
				frame.dispose();// zatvara se trenutna forma nakon otvaranja nove
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton);
	}
}