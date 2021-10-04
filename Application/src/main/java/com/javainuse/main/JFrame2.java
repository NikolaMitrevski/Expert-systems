package com.javainuse.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.javainuse.model.Bicikla;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class JFrame2 extends JFrame {
	private JPanel contentPane;
	private JComboBox comboBox;
	
	private String deo = "";
	private String odgovor1 = "", odgovor2 = "", odgovor3 = "", odgovor4 = "", odgovor5 = "";
	private String resenje = "";

	private int i = 1;
	//////////////////////////////////////////////////////////////////////////////////////
	private final String[] pitanje1 = {"Da li je guma mekana?", "mekana", "napumpana"};
	private final String[] pitanje2 = {"Da li je ventil los?", "los", "dobar"};
	
	private final String[] pitanje3 = {"Da li je kriv bandas?", "kriv", "centriran"};
	private final String[] pitanje4 = {"Da li je zica pokidana?", "pokidana", "cela"};
	
	final String[] pitanje5 = {"Da li je amortizer neispravan?", "neispravan", "ispravan"};
	final String[] pitanje6 = {"Da li je amortizer vazdusan?", "vazdusan", "oprugast"};
	final String[] pitanje7 = {"Da li je suspenzija premekana?", "premekana", "prepumpana", "umereno napumpana"};
	final String[] pitanje8 = {"Da li su opruge mekane?", "mekane", "jake", "umerena cvrstina"};
	
	final String[] pitanje9 = {"Da li lanac preskace(los)?", "los", "dobar"};
	final String[] pitanje10 = {"Da li je lanac istegnut?", "istegnut", "neistegnut"};
	final String[] pitanje11 = {"Da li su prednji zupcanici potroseni?", "potroseni", "nepotroseni"};
	final String[] pitanje12 = {"Da li su zadnji zupcanici potroseni?", "potroseni", "nepotroseni"};
	final String[] pitanje13 = {"Da li je freewheel ili freehub los?", "los", "dobar"};

	final String[] pitanje14 = {"Da li srednji pogon ima lufta?", "luft", "nema luft"};
	final String[] pitanje15 = {"Da li su soljice odvijene?", "odvijene", "zavijene"};
	final String[] pitanje16 = {"Da li su lezajevi losi?", "losi", "dobri"};

	final String[] pitanje17 = {"Da li kurbla labava?", "labava", "zategnuta"};
	final String[] pitanje18 = {"Da li je odvijen sraf koji ide u osovinu?", "odvijen", "zavijen"};
	final String[] pitanje19 = {"Da li je navoj osovine los?", "los", "dobar"};
	
	final String[] pitanje20 = {"Da li pedala ima luft?", "luft", "krcka", "nema luft"};

	final String[] pitanje21 = {"Da li kocnica ne koci?", "ne koci", "koci"};
	final String[] pitanje22 = {"Da li je kociona povrs obruc?", "obruc", "disk"};
	final String[] pitanje23 = {"Da li su potroseni paknovi?", "potroseni", "dobri"};
	final String[] pitanje24 = {"Da li su plocice potrosene?", "potrosene", "dobre"};
	final String[] pitanje25 = {"Da li je u pitanju mehanicki disk?", "mehanicki", "hidraulicni"};

	final String[] pitanje26 = {"Da li prednji menjac ne prebacuje?", "ne prebacuje", "prebacuje"};
	final String[] pitanje27 = {"Da li je prednji menjac previse podignut?", "previse podignut", "previse spusten", "taman"};
	final String[] pitanje28 = {"Da li prednji menjac nije u paraleli sa prednjim lancanicima?", "nije", "jeste"};
	final String[] pitanje29 = {"Da li je sajla prednjeg menjaca losa?", "nije", "jeste"};
	final String[] pitanje30 = {"Da li je propao index rucice prednjeg menjaca?", "propao", "dobar"};

	final String[] pitanje31 = {"Da li zadnji menjac ne prebacuje?", "ne prebacuje", "prebacuje"};
	final String[] pitanje32 = {"Da li je kriva kuka zadnjeg menjaca?", "kriva", "prava"};
	final String[] pitanje33 = {"Da li je propao index rucice zadnjeg menjaca?", "propao", "dobar"};
	final String[] pitanje34 = {"Da li su potrosene rolnice zadnjeg menjaca?", "potrosene", "dobre"};
	final String[] pitanje35 = {"Da li je sajla zadnjeg menjaca losa?", "losa", "dobra"};

	final String[] pitanje36 = {"Da li kaseta vrti u prazno?", "vrti u prazno", "radi"};

	final String[] pitanje37 = {"Da li sticna propada u ram?", "propada", "ne propada"};

	final String[] pitanje38 = {"Da li je sediste tvrdo?", "tvrdo", "meko"};

	final String[] pitanje39 = {"Da li je olabavljena lula volana?", "olabavljena", "zategnuta"};

	final String[] pitanje40 = {"Da li je olabavljen volan?", "olabavljen", "zategnut"};

	final String[] pitanje41 = {"Da li u tocku ima lufta?", "luft", "nema luft"};

	final String[] pitanje42 = {"Da li viljuska ima lufta?", "luft", "nema luft"};
	////////////////////////////////////////////////////////////////////////
	KieServices ks = KieServices.Factory.get();
	KieContainer kContainer = ks.getKieClasspathContainer();
	KieSession kSession = kContainer.newKieSession("ksession-rule");

	Bicikla bicikl = new Bicikla();
	
	FactHandle fact1;
	////////////////////////////////////////////////////////////////////////

	/**
	 * Launch the application.
	 */
	/*public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame2 frame = new JFrame2(args[0]);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public JFrame2(String primljenDeo) {	// preko ovog konstruktora dobijamo podatak iz frame1 u frame2
		if(!(primljenDeo == "Problem" || primljenDeo == null)) {
			this.deo = primljenDeo;
		}
		
		//izvaditi sve deklaracije iz konstruktora da budu polja klase(npr. JLabel, JComboBox,..)
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		final JLabel lblProblem = new JLabel("Problem: " + this.deo);
		contentPane.add(lblProblem);
		
		if(deo == "") {
			JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali deo.");
			System.exit(0);
		}
		if(deo.equals("Guma")) {
			//final JComboBox comboBox = new JComboBox(pitanje1);
			comboBox = new JComboBox(pitanje1);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	// cuva se selektovan odgovor
						//System.out.println(i + " "+odgovor1);
					}
					if(i == 2 && odgovor1.equals(pitanje1[1])) {	
						odgovor2 = (String)comboBox.getSelectedItem();	// cuva se selektovan odgovor
						//System.out.println(i + " "+odgovor2);
					}
				}
			});

			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(odgovor1.equals(pitanje1[1])) {
						if(i == 2) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje2.length; j++) {
								comboBox.addItem(pitanje2[j]);
							}
							/*System.out.println(i);
							System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);*/
						}
						if(i == 3) {
							if(odgovor1.equals(pitanje1[0]) || odgovor2.equals(pitanje2[0])) {
								JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
							}
							else {
								bicikl.setGuma_stanje(odgovor1);
								bicikl.setVentil_stanje(odgovor2);

								fact1 = kSession.insert(bicikl);
								kSession.fireAllRules();
								
								if(bicikl.getGuma_akcija1() != null) resenje += bicikl.getGuma_akcija1()+"\n";
								if(bicikl.getGuma_akcija2() != null) resenje += bicikl.getGuma_akcija2();
								if(resenje != "") JOptionPane.showMessageDialog(null, resenje);
							}
							System.exit(0);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Ipak nemas problem sa gumom. Guma je napumpana.");
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Bandas")) {
			comboBox = new JComboBox(pitanje3);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
					if(i == 2 && odgovor1.equals(pitanje3[1])) {
						odgovor2 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor2);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(odgovor1.equals(pitanje3[1])) {
						if(i == 2) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje4.length; j++) {
								comboBox.addItem(pitanje4[j]);
							}
							/*System.out.println(i);
							System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);*/
						}
						if(i == 3) {
							if(odgovor1.equals(pitanje3[0]) || odgovor2.equals(pitanje4[0])) {
								JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
							}
							else {
								bicikl.setBandas_stanje(odgovor1);
								bicikl.setZica_stanje(odgovor2);

								fact1 = kSession.insert(bicikl);
								kSession.fireAllRules();
								
								if(bicikl.getBandas_akcija1() != null) resenje += bicikl.getBandas_akcija1()+"\n";
								if(bicikl.getBandas_akcija2() != null) resenje += bicikl.getBandas_akcija2();
								if(resenje != "") JOptionPane.showMessageDialog(null, resenje);
							}
							System.exit(0);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Ipak nemas problem sa bandasom. Bandas ne krivi.");
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Amortizer")) {
			comboBox = new JComboBox(pitanje5);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
					if(i == 2 && odgovor1.equals(pitanje5[1])) {
						odgovor2 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor2);
					}
					if(i == 3 && odgovor2.equals(pitanje6[1])) {
						odgovor3 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor3); 
					}
					if(i == 4 && odgovor2.equals(pitanje6[2])) {
						odgovor4 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor4);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(odgovor1.equals(pitanje5[1])) {
						if(i == 2) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje6.length; j++) {
								comboBox.addItem(pitanje6[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);*/
						}
						if(i == 3 && odgovor2.equals(pitanje6[1])) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje7.length; j++) {
								comboBox.addItem(pitanje7[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);*/
						}
						if(i == 4 && odgovor2.equals(pitanje6[2])) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje8.length; j++) {
								comboBox.addItem(pitanje8[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);
							System.out.println(i+ "d "+odgovor4);*/
						}
						if(i == 5) {
							if(odgovor1.equals(pitanje5[0]) || odgovor2.equals(pitanje6[0]) || odgovor3.equals(pitanje7[0]) || odgovor4.equals(pitanje8[0])) {
								JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
							}
							else {
								bicikl.setAmortizer_stanje(odgovor1);
								bicikl.setAmortizer_tip(odgovor2);
								bicikl.setSuspenzija_stanje(odgovor3);
								bicikl.setOpruge_stanje(odgovor4);

								fact1 = kSession.insert(bicikl);
								kSession.fireAllRules();
								
								if(bicikl.getAmortizer_akcija1() != null) resenje += bicikl.getAmortizer_akcija1()+"\n";
								if(bicikl.getAmortizer_akcija2() != null) resenje += bicikl.getAmortizer_akcija2()+"\n";
								if(bicikl.getAmortizer_akcija3() != null) resenje += bicikl.getAmortizer_akcija3()+"\n";
								if(bicikl.getAmortizer_akcija4() != null) resenje += bicikl.getAmortizer_akcija4();
								if(resenje != "") JOptionPane.showMessageDialog(null, resenje);
							}
							System.exit(0);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Ipak nemas problem sa amortizerom. Amortizer je ispravan.");
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Lanac")) {
			comboBox = new JComboBox(pitanje9);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
					if(i == 2 && odgovor1.equals(pitanje9[1])) {
						odgovor2 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor2);
					}
					if(i == 3) {
						odgovor3 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor3);
					}
					if(i == 4) {
						odgovor4 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor4);
					}
					if(i == 5) {
						odgovor5 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor5);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(odgovor1.equals(pitanje9[1])) {
						if(i == 2) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje10.length; j++) {
								comboBox.addItem(pitanje10[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);*/
						}
						if(i == 3) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje11.length; j++) {
								comboBox.addItem(pitanje11[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);*/
						}
						if(i == 4) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje12.length; j++) {
								comboBox.addItem(pitanje12[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);
							System.out.println(i+ "d "+odgovor4);*/
						}
						if(i == 5) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje13.length; j++) {
								comboBox.addItem(pitanje13[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);
							System.out.println(i+ "d "+odgovor4);
							System.out.println(i+ "e "+odgovor5);*/
						}
						if(i == 6) {
							if(odgovor1.equals(pitanje9[0]) || odgovor2.equals(pitanje10[0]) || odgovor3.equals(pitanje11[0]) || odgovor4.equals(pitanje12[0]) || odgovor5.equals(pitanje13[0])) {
								JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
							}
							else {
								bicikl.setLanac_stanje(odgovor1);
								bicikl.setDuzina_lanca_stanje(odgovor2);
								bicikl.setPrednji_zupcanici_stanje(odgovor3);
								bicikl.setZadnji_zupcanici_stanje(odgovor4);
								bicikl.setFreewheel_stanje(odgovor5);
								bicikl.setFreehub_stanje(odgovor5);

								fact1 = kSession.insert(bicikl);
								kSession.fireAllRules();
								
								if(bicikl.getLanac_akcija1() != null) resenje += bicikl.getLanac_akcija1()+"\n";
								if(bicikl.getLanac_akcija2() != null) resenje += bicikl.getLanac_akcija2()+"\n";
								if(bicikl.getLanac_akcija3() != null) resenje += bicikl.getLanac_akcija3()+"\n";
								if(bicikl.getLanac_akcija4() != null) resenje += bicikl.getLanac_akcija4()+"\n";
								if(bicikl.getLanac_akcija5() != null) resenje += bicikl.getLanac_akcija5();
								if(resenje != "") JOptionPane.showMessageDialog(null, resenje);
							}
							System.exit(0);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Ipak nemas problem sa preskakanjem lanca. Lanac je ispravan.");
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Srednji pogon")) {
			comboBox = new JComboBox(pitanje14);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
					if(i == 2 && odgovor1.equals(pitanje14[1])) {
						odgovor2 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor2);
					}
					if(i == 3) {
						odgovor3 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor3);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(odgovor1.equals(pitanje14[1])) {
						if(i == 2) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje15.length; j++) {
								comboBox.addItem(pitanje15[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);*/
						}
						if(i == 3) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje16.length; j++) {
								comboBox.addItem(pitanje16[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);*/
						}
						if(i == 4) {
							if(odgovor1.equals(pitanje14[0]) || odgovor2.equals(pitanje15[0]) || odgovor3.equals(pitanje16[0])) {
								JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
							}
							else {
								bicikl.setSrednji_pogon_stanje(odgovor1);
								bicikl.setSolje_sr_pog_stanje(odgovor2);
								bicikl.setLezajevi_sr_pog_stanje(odgovor3);

								fact1 = kSession.insert(bicikl);
								kSession.fireAllRules();
								
								if(bicikl.getSrednji_pogon_akcija1() != null) resenje += bicikl.getSrednji_pogon_akcija1()+"\n";
								if(bicikl.getSrednji_pogon_akcija2() != null) resenje += bicikl.getSrednji_pogon_akcija2();
								if(resenje != "") JOptionPane.showMessageDialog(null, resenje);
							}
							System.exit(0);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Ipak nemas problem sa srednjim pogonom. Srednji pogon nema luft.");
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Kurbla")) {
			comboBox = new JComboBox(pitanje17);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
					if(i == 2 && odgovor1.equals(pitanje17[1])) {
						odgovor2 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor2);
					}
					if(i == 3) {
						odgovor3 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor3);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(odgovor1.equals(pitanje17[1])) {
						if(i == 2) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje18.length; j++) {
								comboBox.addItem(pitanje18[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);*/
						}
						if(i == 3) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje19.length; j++) {
								comboBox.addItem(pitanje19[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);*/
						}
						if(i == 4) {
							if(odgovor1.equals(pitanje17[0]) || odgovor2.equals(pitanje18[0]) || odgovor3.equals(pitanje19[0])) {
								JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
							}
							else {
								bicikl.setKurbla_stanje(odgovor1);
								bicikl.setSraf_osovine_stanje(odgovor2);
								bicikl.setNavoj_osovine_stanje(odgovor3);

								fact1 = kSession.insert(bicikl);
								kSession.fireAllRules();
								
								if(bicikl.getKurbla_akcija1() != null) resenje += bicikl.getKurbla_akcija1()+"\n";
								if(bicikl.getKurbla_akcija2() != null) resenje += bicikl.getKurbla_akcija2();
								if(resenje != "") JOptionPane.showMessageDialog(null, resenje);
							}
							System.exit(0);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Ipak nemas problem sa kurblom. Kurbla je zategunta.");
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Pedala")) {
			comboBox = new JComboBox(pitanje20);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(i == 2) {
						if(odgovor1.equals(pitanje20[0])) {
							JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
						}
						else if(odgovor1.equals(pitanje20[3])) {
							JOptionPane.showMessageDialog(null, "Ipak nemas problem sa pedalom. Pedala nema luft.");
						}
						else {
							bicikl.setPedala_stanje(odgovor1);
							
							fact1 = kSession.insert(bicikl);
							kSession.fireAllRules();
							
							if(bicikl.getPedala_akcija() != null)
								JOptionPane.showMessageDialog(null, bicikl.getPedala_akcija());
						}
						System.exit(0);
					}
				}
			});
		}
		

		if(deo.equals("Kocnica")) {
			comboBox = new JComboBox(pitanje21);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
					if(i == 2 && odgovor1.equals(pitanje21[1])) {
						odgovor2 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor2);
					}
					if(i == 3 && odgovor2.equals(pitanje22[1])) {
						odgovor3 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor3);
					}
					if(i == 4 && odgovor2.equals(pitanje22[2])) {
						odgovor4 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor4);
					}
					if(i == 5 && odgovor2.equals(pitanje22[2])) {
						odgovor5 = (String)comboBox.getSelectedItem();
						//System.out.println(i + " "+odgovor5);
					}
				}
			});

			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(odgovor1.equals(pitanje21[1])) {
						if(i == 2) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje22.length; j++) {
								comboBox.addItem(pitanje22[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);*/
						}
						if(i == 3  && odgovor2.equals(pitanje22[1])) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje23.length; j++) {
								comboBox.addItem(pitanje23[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);*/
						}
						if(i == 4 && odgovor2.equals(pitanje22[2])) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje24.length; j++) {
								comboBox.addItem(pitanje24[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);
							System.out.println(i+ "d "+odgovor4);*/
						}
						if(i == 5 && odgovor2.equals(pitanje22[2])) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje25.length; j++) {
								comboBox.addItem(pitanje25[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);
							System.out.println(i+ "d "+odgovor4);
							System.out.println(i+ "e "+odgovor5);*/
						}
						if(i == 6) {
							if(odgovor1.equals(pitanje21[0]) || odgovor2.equals(pitanje22[0]) || odgovor3.equals(pitanje23[0]) || odgovor4.equals(pitanje24[0]) || odgovor5.equals(pitanje25[0])) {
								JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
							}
							else {
								bicikl.setKocnica_stanje(odgovor1);
								bicikl.setKociona_povrs_tip(odgovor2);
								bicikl.setPaknovi_stanje(odgovor3);
								bicikl.setPlocice_stanje(odgovor4);
								bicikl.setDisk_tip(odgovor5);	
							
								fact1 = kSession.insert(bicikl);
								kSession.fireAllRules();
								
								if(bicikl.getKocnica_akcija1() != null) resenje += bicikl.getKocnica_akcija1()+"\n";
								if(bicikl.getKocnica_akcija2() != null) resenje += bicikl.getKocnica_akcija2()+"\n";
								if(bicikl.getKocnica_akcija3() != null) resenje += bicikl.getKocnica_akcija3()+"\n";
								if(bicikl.getKocnica_akcija5() != null) resenje += bicikl.getKocnica_akcija5()+"\n";
								if(bicikl.getKocnica_akcija6() != null) resenje += bicikl.getKocnica_akcija6()+"\n";
								if(bicikl.getKocnica_akcija7() != null) resenje += bicikl.getKocnica_akcija7();
								if(resenje != "") JOptionPane.showMessageDialog(null, resenje);
							}
							System.exit(0);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Ipak nemas problem sa kocnicom. Kocnica koci.");
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Prednji menjac")) {
			comboBox = new JComboBox(pitanje26);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
					if(i == 2 && odgovor1.equals(pitanje26[1])) {
						odgovor2 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor2);
					}
					if(i == 3) {
						odgovor3 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor3);
					}
					if(i == 4) {
						odgovor4 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor4);
					}
					if(i == 5) {
						odgovor5 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor5);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(odgovor1.equals(pitanje26[1])) {
						if(i == 2) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje27.length; j++) {
								comboBox.addItem(pitanje27[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);*/
						}
						if(i == 3) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje28.length; j++) {
								comboBox.addItem(pitanje28[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);*/
						}
						if(i == 4) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje29.length; j++) {
								comboBox.addItem(pitanje29[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);
							System.out.println(i+ "d "+odgovor4);*/
						}
						if(i == 5) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje30.length; j++) {
								comboBox.addItem(pitanje30[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);
							System.out.println(i+ "d "+odgovor4);
							System.out.println(i+ "e "+odgovor5);*/
						}
						if(i == 6) {
							if(odgovor1.equals(pitanje26[0]) || odgovor2.equals(pitanje27[0]) || odgovor3.equals(pitanje28[0]) || odgovor4.equals(pitanje29[0]) || odgovor5.equals(pitanje30[0])) {
								JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
							}
							else {
								bicikl.setPrednji_menjac_stanje(odgovor1);
								bicikl.setVisina_prednjeg_menjaca_stanje(odgovor2);
								bicikl.setParalela_sa_lancanicima_stanje(odgovor3);
								bicikl.setSajla_prednjeg_menjaca_stanje(odgovor4);
								bicikl.setIndex_rucice_prednjeg_menjaca_stanje(odgovor5);

								fact1 = kSession.insert(bicikl);
								kSession.fireAllRules();
								
								if(bicikl.getPrednji_menjac_akcija1() != null) resenje += bicikl.getPrednji_menjac_akcija1()+"\n";
								if(bicikl.getPrednji_menjac_akcija2() != null) resenje += bicikl.getPrednji_menjac_akcija2()+"\n";
								if(bicikl.getPrednji_menjac_akcija3() != null) resenje += bicikl.getPrednji_menjac_akcija3()+"\n";
								if(bicikl.getPrednji_menjac_akcija4() != null) resenje += bicikl.getPrednji_menjac_akcija4()+"\n";
								if(bicikl.getPrednji_menjac_akcija5() != null) resenje += bicikl.getPrednji_menjac_akcija5();
								if(resenje != "") JOptionPane.showMessageDialog(null, resenje);
							}
							System.exit(0);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Ipak nemas problem sa prednjim menjacem. Prednji menjac prebacuje.");
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Zadnji menjac")) {
			comboBox = new JComboBox(pitanje31);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
					if(i == 2 && odgovor1.equals(pitanje31[1])) {
						odgovor2 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor2);
					}
					if(i == 3) {
						odgovor3 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor3);
					}
					if(i == 4) {
						odgovor4 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor4);
					}
					if(i == 5) {
						odgovor5 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor5);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(odgovor1.equals(pitanje31[1])) {
						if(i == 2) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje32.length; j++) {
								comboBox.addItem(pitanje32[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);*/
						}
						if(i == 3) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje33.length; j++) {
								comboBox.addItem(pitanje33[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);*/
						}
						if(i == 4) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje34.length; j++) {
								comboBox.addItem(pitanje34[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);
							System.out.println(i+ "d "+odgovor4);*/
						}
						if(i == 5) {
							comboBox.removeAllItems();
							for(int j = 0; j < pitanje35.length; j++) {
								comboBox.addItem(pitanje35[j]);
							}
							/*System.out.println(i+ "a "+odgovor1);
							System.out.println(i+ "b "+odgovor2);
							System.out.println(i+ "c "+odgovor3);
							System.out.println(i+ "d "+odgovor4);
							System.out.println(i+ "e "+odgovor5);*/
						}
						if(i == 6) {
							if(odgovor1.equals(pitanje31[0]) || odgovor2.equals(pitanje32[0]) || odgovor3.equals(pitanje33[0]) || odgovor4.equals(pitanje34[0]) || odgovor5.equals(pitanje35[0])) {
								JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
							}
							else {
								bicikl.setZadnji_menjac_stanje(odgovor1);
								bicikl.setKuka_zadnjeg_menjaca_stanje(odgovor2);
								bicikl.setIndex_rucice_zadnjeg_menjaca_stanje(odgovor3);
								bicikl.setRolnice_zadnjeg_menjaca_stanje(odgovor4);
								bicikl.setSajla_zadnjeg_menjaca_stanje(odgovor5);

								fact1 = kSession.insert(bicikl);
								kSession.fireAllRules();
								
								if(bicikl.getZadnji_menjac_akcija1() != null) resenje += bicikl.getZadnji_menjac_akcija1()+"\n";
								if(bicikl.getZadnji_menjac_akcija2() != null) resenje += bicikl.getZadnji_menjac_akcija2()+"\n";
								if(bicikl.getZadnji_menjac_akcija3() != null) resenje += bicikl.getZadnji_menjac_akcija3()+"\n";
								if(bicikl.getZadnji_menjac_akcija4() != null) resenje += bicikl.getZadnji_menjac_akcija4()+"\n";
								if(bicikl.getZadnji_menjac_akcija5() != null) resenje += bicikl.getZadnji_menjac_akcija5();
								if(resenje != "") JOptionPane.showMessageDialog(null, resenje);
							}
							System.exit(0);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Ipak nemas problem sa zadnjim menjacem. Zadnji menjac prebacuje.");
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Kaseta")) {
			comboBox = new JComboBox(pitanje36);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(i == 2) {
						if(odgovor1.equals(pitanje36[0])) {
							JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
						}
						else if(odgovor1.equals(pitanje36[2])) {
							JOptionPane.showMessageDialog(null, "Ipak nemas problem sa kasetom. Kaseta ne vrti u prazno.");
						}
						else {
							bicikl.setKaseta_stanje(odgovor1);
							
							fact1 = kSession.insert(bicikl);
							kSession.fireAllRules();
							
							if(bicikl.getKaseta_akcija() != null)
								JOptionPane.showMessageDialog(null, bicikl.getKaseta_akcija());
						}
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Sticna")) {
			comboBox = new JComboBox(pitanje37);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(i == 2) {
						if(odgovor1.equals(pitanje37[0])) {
							JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
						}
						else if(odgovor1.equals(pitanje37[2])) {
							JOptionPane.showMessageDialog(null, "Ipak nemas problem sa sticnom. Sticna ne propada u ram.");
						}
						else {
							bicikl.setSticna_stanje(odgovor1);
							
							fact1 = kSession.insert(bicikl);
							kSession.fireAllRules();
							
							if(bicikl.getSticna_akcija() != null)
								JOptionPane.showMessageDialog(null, bicikl.getSticna_akcija());
						}
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Sediste")) {
			comboBox = new JComboBox(pitanje38);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(i == 2) {
						if(odgovor1.equals(pitanje38[0])) {
							JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
						}
						else if(odgovor1.equals(pitanje38[2])) {
							JOptionPane.showMessageDialog(null, "Zameni sediste tvrdjim.");
						}
						else {
							bicikl.setSediste_stanje(odgovor1);
							
							fact1 = kSession.insert(bicikl);
							kSession.fireAllRules();
							
							if(bicikl.getSediste_akcija() != null)
								JOptionPane.showMessageDialog(null, bicikl.getSediste_akcija());
						}
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Lula Volana")) {
			comboBox = new JComboBox(pitanje39);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(i == 2) {
						if(odgovor1.equals(pitanje39[0])) {
							JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
						}
						else if(odgovor1.equals(pitanje39[2])) {
							JOptionPane.showMessageDialog(null, "Ipak nemas problem sa lulom volana. Lula volana je zategnuta.");
						}
						else {
							bicikl.setLula_volana_stanje(odgovor1);
							
							fact1 = kSession.insert(bicikl);
							kSession.fireAllRules();
							
							if(bicikl.getLula_volana_akcija() != null)
								JOptionPane.showMessageDialog(null, bicikl.getLula_volana_akcija());
						}
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Volan")) {
			comboBox = new JComboBox(pitanje40);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(i == 2) {
						if(odgovor1.equals(pitanje40[0])) {
							JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
						}
						else if(odgovor1.equals(pitanje40[2])) {
							JOptionPane.showMessageDialog(null, "Ipak nemas problem sa volom. Volan je zategnut.");
						}
						else {
							bicikl.setVolan_stanje(odgovor1);
							
							fact1 = kSession.insert(bicikl);
							kSession.fireAllRules();
							
							if(bicikl.getVolan_akcija() != null)
								JOptionPane.showMessageDialog(null, bicikl.getVolan_akcija());
						}
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Tocak")) {
			comboBox = new JComboBox(pitanje41);
			contentPane.add(comboBox);
			
			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(i == 2) {
						if(odgovor1.equals(pitanje41[0])) {
							JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
						}
						else if(odgovor1.equals(pitanje41[2])) {
							JOptionPane.showMessageDialog(null, "Ipak nemas problem sa tockom. Tocak nema luft.");
						}
						else {
							bicikl.setTocak_stanje(odgovor1);
							
							fact1 = kSession.insert(bicikl);
							kSession.fireAllRules();
							
							if(bicikl.getTocak_akcija() != null)
								JOptionPane.showMessageDialog(null, bicikl.getTocak_akcija());
						}
						System.exit(0);
					}
				}
			});
		}
		
		if(deo.equals("Viljuska")) {
			comboBox = new JComboBox(pitanje42);
			contentPane.add(comboBox);

			comboBox.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent arg0) {
					if(i == 1) {
						odgovor1 = (String)comboBox.getSelectedItem();	
						//System.out.println(i + " "+odgovor1);
					}
				}
			});
			
			JButton btnDalje = new JButton("Dalje");
			contentPane.add(btnDalje);
			btnDalje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					i++;
					if(i == 2) {
						if(odgovor1.equals(pitanje42[0])) {
							JOptionPane.showMessageDialog(null, "Greska! Niste pravilno selektovali ponudjene odgovore.");
						}
						else if(odgovor1.equals(pitanje42[2])) {
							JOptionPane.showMessageDialog(null, "Ipak nemas problem sa viljuskom. Viljuska nema luft.");
						}
						else {
							bicikl.setViljuska_stanje(odgovor1);
							
							fact1 = kSession.insert(bicikl);
							kSession.fireAllRules();
							
							if(bicikl.getViljuska_akcija() != null)
								JOptionPane.showMessageDialog(null, bicikl.getViljuska_akcija());
						}
						System.exit(0);
					}
				}
			});
		}
	
		
	}
}
