package klijent;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Base64;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Klijent {
	
	static boolean kraj = false;
	
	public static ArrayList<String> lista = new ArrayList<>();
	public static ArrayList<String> lista_link = new ArrayList<>();
	public static ArrayList<String> lista_share = new ArrayList<>();
	public static ArrayList<String> lista_share_wm = new ArrayList<>();
	public static ArrayList<String> lista_swm_drive = new ArrayList<>();
	public static File fileUp;
	
	public static String vlasnik_linka = "";
	
	public static int broj_upload = 0;
	
	public static String tekst = "";
	public static String tekst_swm = "";
	public static String tekst_BezAcc = "";
	
	public static int duzina_liste = 0;
	public static String duzina_liste_string = "";
	
	public static int duzina_liste_link = 0;
	public static String duzina_liste_string_link = "";
	
	public static int duzina_liste_drive = 0;
	public static String duzina_liste_swm_drive = "";
	
	public static int duzina_liste_share = 0;
	public static String duzina_liste_string_share = "";
	
	public static int duzina_liste_share_wm = 0;
	public static String duzina_liste_string_share_wm = "";
	
	public static String selekcija_u_listi = "";
	public static int br_refers_home = 0;
	
	public static String selekcija_u_listi_swm = "";
	public static int br_refers_swm = 0;
	
	public static String selekcija_u_listi_bezAcc = "";
	public static int br_refers_bezAcc = 0;
	
	public static String owner = "";
	public static String selekcija_d = "";
	
//******************************************************
// dodatni
	
	public static String ime_dir = "";
	public static String novo_ime_dir = "";
	public static String selekcija_dodatna = "";
	public static String dir_roditelj = "";
	
	
//******************************************************	
	
	public static byte[] bafer = new byte[1024];
	
	static String adresa = "localhost";
	static int port = 9000;
	static Socket socketZaKomunikacijuKlijent;
	
	static PrintStream tokKaServeruTEKST;
	static BufferedReader tokOdServeraTEKST;
	static InputStream tokOdServeraBAJTOVI;
	static OutputStream tokKaServeruBAJTOVI;
	
	public static int kod_za_slanje = 0; // 0 OK
	public static int kod_za_prijem = 0;
	
	public static String username = "";
	public static String password = "";
	public static String type = "";
	
	public static String imeFajla = "";
	public static String file_up_path = "";
	
	
	
	static public void izvrsi_kod() {
		
		
		try {
			Thread.sleep(50); // sa spavanjem od 60 podrzava 10 klijenata
			try {
				socketZaKomunikacijuKlijent = new Socket(adresa, port);
			} catch (UnknownHostException e1) {
				JOptionPane.showMessageDialog(null, "Error\nServer no active!", "Warning",
				        JOptionPane.WARNING_MESSAGE);
				e1.printStackTrace();
				System.exit(0);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "Error\nServer overloaded!", "Warning",
				        JOptionPane.WARNING_MESSAGE);
				e1.printStackTrace();
				System.exit(0);
			}
			
			Klijent.tokKaServeruTEKST = new PrintStream(socketZaKomunikacijuKlijent.getOutputStream());
			Klijent.tokOdServeraTEKST = new BufferedReader(new InputStreamReader(socketZaKomunikacijuKlijent.getInputStream()));
			Klijent.tokOdServeraBAJTOVI = socketZaKomunikacijuKlijent.getInputStream();
			Klijent.tokKaServeruBAJTOVI = socketZaKomunikacijuKlijent.getOutputStream();
//			***********************************************************************************************************************
			
			if(Klijent.kod_za_slanje == 10) {
				createAcc();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 20) {
				login();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 21) {
				refresuj_listu();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 22) {
				share_new();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 23) {
				share_delete();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 24) {
				puni_listu_swm();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 25) {
				send_file();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 31) {
				salji_link_puni_listu();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 17) {
				refresuj_listu_swm();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 18) {
				refresuj_listu_BezAcc();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 14) {
				dodaj_dir();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 15) {
				preimenuj_dir();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 12) {
				pomeri_dir();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 33) {
				obrisi();
				Klijent.kod_za_slanje = 0;
			}
			if(Klijent.kod_za_slanje == 43) {
				download();
				Klijent.kod_za_slanje = 0;
			}
			
//			***********************************************************************************************************************			
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "An error has occurred!", "Warning",
			        JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "An error has occurred!", "Warning",
			        JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
	}
	
	public static void download() throws IOException, InterruptedException {
		
		tokKaServeruBAJTOVI.write(kod_za_slanje);
		tokKaServeruTEKST.println(selekcija_d);
		tokKaServeruTEKST.println(owner);
		
		Thread.sleep(100);
		
		RandomAccessFile file = new RandomAccessFile("C:\\Users\\Dejan Petrovic\\Downloads\\" + selekcija_d, "rw");
		
		int n;
		byte[] bafer = new byte[4096];
		
		while(true) {
			n = tokOdServeraBAJTOVI.read(bafer, 0, 4096);
			if(n == -1) {
				break;
			}
			file.write(bafer, 0, n);
		}
		file.close();
		
		
		
//		n = tokOdServeraBAJTOVI.read(bafer);
//		String s = new String(bafer, 0, n);
//		
//		file.write(bafer);
		
		JOptionPane.showMessageDialog(null, "File saved successfully!");
		
	}

	private static void obrisi() throws IOException, InterruptedException {
		
		if(selekcija_dodatna.equals("")) {
			JOptionPane.showMessageDialog(null, "Select a folder!");
		} else {
		
			tokKaServeruBAJTOVI.write(kod_za_slanje);
			tokKaServeruTEKST.println(selekcija_u_listi);
			tokKaServeruTEKST.println(selekcija_dodatna);
			
			Thread.sleep(80);
			
			kod_za_prijem = tokOdServeraBAJTOVI.read();
			
			if(kod_za_prijem == 35) {
				JOptionPane.showMessageDialog(null, "Change saved successfully!");
			} else {
				JOptionPane.showMessageDialog(null, "Change not saved!");
			}
			kod_za_prijem = 0;
		}
		
		
	}

	private static void pomeri_dir() throws IOException, InterruptedException {
		
		if(selekcija_dodatna.equals("")) {
			JOptionPane.showMessageDialog(null, "Select a folder!");
		} else {
		
			tokKaServeruBAJTOVI.write(kod_za_slanje);
			tokKaServeruTEKST.println(selekcija_u_listi);
			tokKaServeruTEKST.println(selekcija_dodatna);
			tokKaServeruTEKST.println(dir_roditelj);
			
			Thread.sleep(80);
			
			kod_za_prijem = tokOdServeraBAJTOVI.read();
			
			if(kod_za_prijem == 34) {
				JOptionPane.showMessageDialog(null, "Change saved successfully!");
			} else {
				JOptionPane.showMessageDialog(null, "Change not saved!");
			}
			kod_za_prijem = 0;
		}
		
	}

	private static void preimenuj_dir() throws IOException, InterruptedException {
		
		if(selekcija_dodatna.equals("")) {
			JOptionPane.showMessageDialog(null, "Select a folder!");
		} else {
		
			tokKaServeruBAJTOVI.write(kod_za_slanje);
			tokKaServeruTEKST.println(selekcija_u_listi);
			tokKaServeruTEKST.println(selekcija_dodatna);
			tokKaServeruTEKST.println(novo_ime_dir);
			
			Thread.sleep(80);
			
			kod_za_prijem = tokOdServeraBAJTOVI.read();
			
			if(kod_za_prijem == 34) {
				JOptionPane.showMessageDialog(null, "Change saved successfully!");
			} else {
				JOptionPane.showMessageDialog(null, "Change not saved!");
			}
			kod_za_prijem = 0;
		}
	}

	private static void dodaj_dir() throws IOException {
		
		tokKaServeruBAJTOVI.write(kod_za_slanje);
		tokKaServeruTEKST.println(selekcija_u_listi);
		tokKaServeruTEKST.println(ime_dir);
		
	}

	private static void refresuj_listu_BezAcc() throws IOException, InterruptedException {
		
//		selekcija_u_listi_bezAcc
//		lista_link
//		duzina_liste_link i;
//		duzina_liste_string s;
		
		tokKaServeruBAJTOVI.write(kod_za_slanje);
		
		tokKaServeruTEKST.println(selekcija_u_listi_bezAcc);
		tokKaServeruTEKST.println(PregledBezAcc_prvaGUI.link);
		
		Thread.sleep(150);
		
		kod_za_prijem = tokOdServeraBAJTOVI.read();		// 3 direktorijum, 4 fajl
		
		if(kod_za_prijem == 3) { 
			
			lista_link.clear();
			duzina_liste_string_link = tokOdServeraTEKST.readLine();
			duzina_liste_link = Integer.parseInt(duzina_liste_string_link);
			
			for(int i = 0; i < duzina_liste_link; i++) {
				
				String pom = tokOdServeraTEKST.readLine();
				lista_link.add(i, pom);
			}
		}
		if(kod_za_prijem == 4) {
			
			int n;
			byte[] bafer = new byte[4096];
			
			n = tokOdServeraBAJTOVI.read(bafer);
			String s = new String(bafer, 0, n);
			tekst_BezAcc = s;
			System.out.println(s);
			
		}
		
	}

	private static void refresuj_listu_swm() throws IOException, InterruptedException {
		
//		selekcija_u_listi_swm
//		lista_swm_drive
//		duzina_liste_drive i;
//		duzina_liste_swm_drive s;
		
		tokKaServeruBAJTOVI.write(kod_za_slanje);
		
		tokKaServeruTEKST.println(selekcija_u_listi_swm);
		tokKaServeruTEKST.println(owner);
		
		Thread.sleep(150);
		
		kod_za_prijem = tokOdServeraBAJTOVI.read();		// 3 direktorijum, 4 fajl
		
		if(kod_za_prijem == 3) { 
			
			lista_swm_drive.clear();
			duzina_liste_swm_drive = tokOdServeraTEKST.readLine();
			duzina_liste_drive = Integer.parseInt(duzina_liste_swm_drive);
			
			for(int i = 0; i < duzina_liste_drive; i++) {
				
				String pom = tokOdServeraTEKST.readLine();
				lista_swm_drive.add(i, pom);
			}
		}
		if(kod_za_prijem == 4) {
			
			int n;
			byte[] bafer = new byte[4096];
			
			n = tokOdServeraBAJTOVI.read(bafer);
			String s = new String(bafer, 0, n);
			tekst_swm = s;
			System.out.println(s);
			
		}
	}

	private static void salji_link_puni_listu() throws IOException, InterruptedException {
		
		tokKaServeruBAJTOVI.write(kod_za_slanje);
		
		tokKaServeruTEKST.println(PregledBezAcc_prvaGUI.link);
		System.out.println(PregledBezAcc_prvaGUI.link);
		
		Thread.sleep(50);
		kod_za_prijem = tokOdServeraBAJTOVI.read();
		if(kod_za_prijem == 55) {
			// 55 je dobro
			
			lista_link.clear();
			duzina_liste_string_link = tokOdServeraTEKST.readLine();
			duzina_liste_link = Integer.parseInt(duzina_liste_string_link);
			
			if (duzina_liste_link > 0) {
				for(int i = 0; i < duzina_liste_link; i++) {
					String pom = tokOdServeraTEKST.readLine();
					lista_link.add(i, pom);
					}
			}

			vlasnik_linka = PregledBezAcc_prvaGUI.link.substring(13);
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Link doesn't exist!", "Warning",
			        JOptionPane.WARNING_MESSAGE);
			
			kod_za_prijem = 0;
		}
	}

	public static void send_file() throws IOException, InterruptedException {
		
		tokKaServeruBAJTOVI.write(kod_za_slanje);
		
		int brojac = tokOdServeraBAJTOVI.read();
		
		if(type.equals("Standard") && brojac > 5) {
			kod_za_slanje = 0;
			JOptionPane.showMessageDialog(null, "Standard users can upload just 5 files!");
			return;
		}
		
		broj_upload = brojac;
		
		tokKaServeruTEKST.println(imeFajla);
		tokKaServeruTEKST.println(selekcija_u_listi); // utanja fajla gde zelim da se upload
		
		FileInputStream fis = new FileInputStream(fileUp); // objekat klase file
		byte[] bafer = new byte[(int)fileUp.length()];
		
		if(imeFajla.contains(".txt")) {
			tokKaServeruBAJTOVI.write(1); // 1 txt
			
			int n;
			n = fis.read(bafer);
			
			Thread.sleep(10);
			
			tokKaServeruBAJTOVI.write(bafer, 0, n);
			fis.close();
			
		} else {
			tokKaServeruBAJTOVI.write(2); // bin
			fis.read(bafer);
			
			Thread.sleep(10);
			
			String file = new String(Base64.getEncoder().encode(bafer), "UTF-8");
			
			tokKaServeruTEKST.println(file);
			fis.close();
		}
		
		kod_za_prijem = 0;
		
	}
	
	private static void puni_listu_swm() throws IOException {
		
		tokKaServeruBAJTOVI.write(kod_za_slanje);
		
		tokKaServeruTEKST.println(GlavnaStranaGUI.selekcija_share_wm);
		
		lista_swm_drive.clear();
		duzina_liste_swm_drive = tokOdServeraTEKST.readLine();
		duzina_liste_drive = Integer.parseInt(duzina_liste_swm_drive);
		
		if (duzina_liste_drive > 0) {
			for(int i = 0; i < duzina_liste_drive; i++) {
				String pom = tokOdServeraTEKST.readLine();
				lista_swm_drive.add(i, pom);
				}
		}
	}

	private static void share_delete() throws IOException, InterruptedException {
		
		tokKaServeruBAJTOVI.write(kod_za_slanje);
		
		Thread.sleep(15);
		
		tokKaServeruTEKST.println(GlavnaStranaGUI.selekcija_share);
		
		kod_za_prijem = tokOdServeraBAJTOVI.read();
		
		if(kod_za_prijem == 1) {
			JOptionPane.showMessageDialog(null, "Share with " + GlavnaStranaGUI.selekcija_share + "is stopped!");
		} else {
			JOptionPane.showMessageDialog(null, "Share with " + GlavnaStranaGUI.selekcija_share + " already stopped!");
		}
		
		kod_za_prijem = 0;
		
	}

	private static void share_new() throws IOException, InterruptedException {
		tokKaServeruBAJTOVI.write(kod_za_slanje);
		
		Thread.sleep(15);
		
		tokKaServeruTEKST.println(GlavnaStranaGUI.selekcija_share);
		
		kod_za_prijem = tokOdServeraBAJTOVI.read();
		
		if(kod_za_prijem == 1) {
			JOptionPane.showMessageDialog(null, "Share with " + GlavnaStranaGUI.selekcija_share + " is started!");
		} else {
			JOptionPane.showMessageDialog(null, "Share with " + GlavnaStranaGUI.selekcija_share + " already exists!");
		}
		
		kod_za_prijem = 0;
	
	}

	private static void refresuj_listu() throws IOException, InterruptedException {
		
		tokKaServeruBAJTOVI.write(kod_za_slanje);
		
		tokKaServeruTEKST.println(selekcija_u_listi);
		
		Thread.sleep(150);
		
		kod_za_prijem = tokOdServeraBAJTOVI.read();		// 3 direktorijum, 4 fajl
		
		if(kod_za_prijem == 3) { 
			
			lista.clear();
			duzina_liste_string = tokOdServeraTEKST.readLine();
			duzina_liste = Integer.parseInt(duzina_liste_string);
			
			for(int i = 0; i < duzina_liste; i++) {
				
				String pom = tokOdServeraTEKST.readLine();
				lista.add(i, pom);
			}
		}
		if(kod_za_prijem == 4) {
			
			int n;
			byte[] bafer = new byte[4096];
			
			n = tokOdServeraBAJTOVI.read(bafer);
			String s = new String(bafer, 0, n);
			tekst = s;
			
		}
	}

	private static void login() throws IOException, InterruptedException {
		
		tokKaServeruBAJTOVI.write(20);
		
		tokKaServeruTEKST.println(username);
		tokKaServeruTEKST.println(password);
		
		Thread.sleep(300); // vreme izvrsavanja na serveru
		
		kod_za_prijem = tokOdServeraBAJTOVI.read();
		
		if(kod_za_prijem == 1) {
			
			
			type = tokOdServeraTEKST.readLine();
			
			lista.clear();
			duzina_liste_string = tokOdServeraTEKST.readLine();
			duzina_liste = Integer.parseInt(duzina_liste_string);
			
			if (duzina_liste > 0) {
				for(int i = 0; i < duzina_liste; i++) {
					String pom = tokOdServeraTEKST.readLine();
					lista.add(i, pom);
					}
			}
			
			lista_share.clear();
			duzina_liste_string_share = tokOdServeraTEKST.readLine();
			duzina_liste_share = Integer.parseInt(duzina_liste_string_share);
			
			
			if (duzina_liste_share > 0) {
				for(int i = 0; i < duzina_liste_share; i++) {
					String pom = tokOdServeraTEKST.readLine();
					lista_share.add(i, pom);
					}
			}
			
			lista_share_wm.clear();
			duzina_liste_string_share_wm = tokOdServeraTEKST.readLine();
			duzina_liste_share_wm = Integer.parseInt(duzina_liste_string_share_wm);
			
			
			if (duzina_liste_share_wm > 0) {
				for(int i = 0; i < duzina_liste_share_wm; i++) {
					String pom = tokOdServeraTEKST.readLine();
					lista_share_wm.add(i, pom);
					}
			}
			

			
		}
		
	}

	private static void createAcc() throws IOException, InterruptedException {
		
		tokKaServeruBAJTOVI.write(10);
		
		tokKaServeruTEKST.println(username);
		tokKaServeruTEKST.println(password); 
		tokKaServeruTEKST.println(type);
	
		Thread.sleep(30);
	
		kod_za_prijem = tokOdServeraBAJTOVI.read();
	
	}
	

	public static void main(String[] args) {
		
		PrijavaGUI prijavaGui = new PrijavaGUI();
		prijavaGui.frmDiskfon.setVisible(true);
		
		while(kraj == false) {
			
				izvrsi_kod();
			
		}
		
		try {
			socketZaKomunikacijuKlijent.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Kraj2");
		System.exit(0);; // mozda ne treba
	}

}
