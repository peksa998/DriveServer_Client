package klijent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.awt.event.ActionEvent;

public class PrijavaGUI {

	public static JFrame frmDiskfon;
	private JLabel lblUser;
	private JLabel lblPassword;
	private JTextField textUsername;
	private JButton btnLogin;
	private JButton btnCreate_account;
	private JLabel lblUserPassAlert;
	private JButton btnContinueWithoutAcc;
	private JPasswordField passwordField;
	
	public static GlavnaStranaGUI prozorG = new GlavnaStranaGUI();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PrijavaGUI window = new PrijavaGUI();
//					window.frmDiskfon.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public PrijavaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDiskfon = new JFrame();
		frmDiskfon.setIconImage(Toolkit.getDefaultToolkit().getImage(PrijavaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		frmDiskfon.setTitle("DISKFON/login");
		frmDiskfon.setResizable(false);
		frmDiskfon.setBounds(700, 200, 450, 258);
		frmDiskfon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{42, 80, 212, 116, 0};
		gridBagLayout.rowHeights = new int[]{20, 25, 25, 25, 25, 25, 15, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frmDiskfon.getContentPane().setLayout(gridBagLayout);
		GridBagConstraints gbc_lblUser = new GridBagConstraints();
		gbc_lblUser.anchor = GridBagConstraints.EAST;
		gbc_lblUser.fill = GridBagConstraints.VERTICAL;
		gbc_lblUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblUser.gridx = 1;
		gbc_lblUser.gridy = 1;
		frmDiskfon.getContentPane().add(getLblUser(), gbc_lblUser);
		GridBagConstraints gbc_textUsername = new GridBagConstraints();
		gbc_textUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUsername.insets = new Insets(0, 0, 5, 5);
		gbc_textUsername.gridx = 2;
		gbc_textUsername.gridy = 1;
		frmDiskfon.getContentPane().add(getTextUsername(), gbc_textUsername);
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.fill = GridBagConstraints.VERTICAL;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 2;
		frmDiskfon.getContentPane().add(getLblPassword(), gbc_lblPassword);
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 2;
		frmDiskfon.getContentPane().add(getPasswordField(), gbc_passwordField);
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 2;
		gbc_btnLogin.gridy = 3;
		frmDiskfon.getContentPane().add(getBtnLogin(), gbc_btnLogin);
		GridBagConstraints gbc_lblUserPassAlert = new GridBagConstraints();
		gbc_lblUserPassAlert.insets = new Insets(0, 0, 5, 5);
		gbc_lblUserPassAlert.gridx = 2;
		gbc_lblUserPassAlert.gridy = 4;
		frmDiskfon.getContentPane().add(getLblUserPassAlert(), gbc_lblUserPassAlert);
		GridBagConstraints gbc_btnCreate_account = new GridBagConstraints();
		gbc_btnCreate_account.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCreate_account.insets = new Insets(0, 0, 5, 5);
		gbc_btnCreate_account.gridx = 2;
		gbc_btnCreate_account.gridy = 5;
		frmDiskfon.getContentPane().add(getBtnCreate_account(), gbc_btnCreate_account);
		GridBagConstraints gbc_btnContinueWithoutAcc = new GridBagConstraints();
		gbc_btnContinueWithoutAcc.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnContinueWithoutAcc.insets = new Insets(0, 0, 0, 5);
		gbc_btnContinueWithoutAcc.gridx = 2;
		gbc_btnContinueWithoutAcc.gridy = 6;
		frmDiskfon.getContentPane().add(getBtnContinueWithoutAcc(), gbc_btnContinueWithoutAcc);
	}
	private JLabel getLblUser() {
		if (lblUser == null) {
			lblUser = new JLabel("Username:");
			lblUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblUser;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password:");
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblPassword;
	}
	private JTextField getTextUsername() {
		if (textUsername == null) {
			textUsername = new JTextField();
			textUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textUsername.setColumns(10);
		}
		return textUsername;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//					***************************************************
					Klijent.username = textUsername.getText();
					Klijent.password = passwordField.getText();
					
					Klijent.kod_za_slanje = 20;
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					if(Klijent.kod_za_prijem == 2) {
						JOptionPane.showMessageDialog(null, "User dosen't exist!");
					}
					if(Klijent.kod_za_prijem == 3) {
						lblUserPassAlert.setText("Wrong password");
					}
					if(Klijent.kod_za_prijem == 1) {
						
						prozorG.lbluserNull.setText(Klijent.username);
						prozorG.lblTypeNull.setText(Klijent.type);
						prozorG.lblUploadsNull.setText("" + Klijent.broj_upload);
						frmDiskfon.setVisible(false);
						prozorG.frmDiskfon_glavni.setVisible(true);
					}
					
					
//					***************************************************					
				}
			});
			btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnLogin;
	}
	private JButton getBtnCreate_account() {
		if (btnCreate_account == null) {
			btnCreate_account = new JButton("Create account");
			btnCreate_account.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//****************************************
					
					RegistracijaGUI prozor = new RegistracijaGUI();
					frmDiskfon.setVisible(false);
					prozor.frmDiskfoncreateaccaunt.setVisible(true);
					
					//****************************************
				}
			});
			btnCreate_account.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnCreate_account;
	}
	private JLabel getLblUserPassAlert() {
		if (lblUserPassAlert == null) {
			lblUserPassAlert = new JLabel("");
			lblUserPassAlert.setForeground(Color.RED);
			lblUserPassAlert.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblUserPassAlert;
	}
	private JButton getBtnContinueWithoutAcc() {
		if (btnContinueWithoutAcc == null) {
			btnContinueWithoutAcc = new JButton("Continue without account");
			btnContinueWithoutAcc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//****************************************
					
					PregledBezAcc_prvaGUI prozor = new PregledBezAcc_prvaGUI();
					frmDiskfon.setVisible(false);
					prozor.frmDiskfon_bez_acc_prva.setVisible(true);
					
					//****************************************
				}
			});
			btnContinueWithoutAcc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return btnContinueWithoutAcc;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return passwordField;
	}

}
