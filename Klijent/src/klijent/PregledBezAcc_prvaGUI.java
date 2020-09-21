package klijent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PregledBezAcc_prvaGUI {

	public JFrame frmDiskfon_bez_acc_prva;
	private JLabel lblInsertLink;
	private JTextField textFieldLink;
	private JButton btnConfirm;
	private JLabel lblAlertBezAccPrva;
	
	public static String link = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PregledBezAcc_prvaGUI window = new PregledBezAcc_prvaGUI();
					window.frmDiskfon_bez_acc_prva.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PregledBezAcc_prvaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDiskfon_bez_acc_prva = new JFrame();
		frmDiskfon_bez_acc_prva.setIconImage(Toolkit.getDefaultToolkit().getImage(PregledBezAcc_prvaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		frmDiskfon_bez_acc_prva.setTitle("DISKFON/without-account");
		frmDiskfon_bez_acc_prva.setResizable(false);
		frmDiskfon_bez_acc_prva.setBounds(100, 100, 560, 215);
		frmDiskfon_bez_acc_prva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GroupLayout groupLayout = new GroupLayout(frmDiskfon_bez_acc_prva.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(85, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(getTextFieldLink(), GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(142)
							.addComponent(getBtnConfirm())))
					.addGap(83))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(167)
					.addComponent(getLblInsertLink())
					.addContainerGap(181, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(251)
					.addComponent(getLblAlertBezAccPrva())
					.addContainerGap(262, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addComponent(getLblInsertLink())
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(getTextFieldLink(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(getBtnConfirm())
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getLblAlertBezAccPrva())
					.addContainerGap(18, Short.MAX_VALUE))
		);
		frmDiskfon_bez_acc_prva.getContentPane().setLayout(groupLayout);
	}
	private JLabel getLblInsertLink() {
		if (lblInsertLink == null) {
			lblInsertLink = new JLabel("Insert link for view directory:");
			lblInsertLink.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblInsertLink;
	}
	private JTextField getTextFieldLink() {
		if (textFieldLink == null) {
			textFieldLink = new JTextField();
			textFieldLink.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textFieldLink.setColumns(10);
		}
		return textFieldLink;
	}
	private JButton getBtnConfirm() {
		if (btnConfirm == null) {
			btnConfirm = new JButton("Confirm");
			btnConfirm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//			****************************************************************************
				String l = textFieldLink.getText();
				
				if(!l.equals("")) {
					link = l;
					
					Klijent.kod_za_slanje = 31; // kod za link
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(Klijent.kod_za_prijem == 55) {
						
						frmDiskfon_bez_acc_prva.setVisible(false);
						PregledBezAcc_drugaGUI prozor = new PregledBezAcc_drugaGUI();
						prozor.frmDiskfon.setVisible(true);
							
				}
					
					
					Klijent.kod_za_prijem = 0;
				}
					
					
//			****************************************************************************
				}
			});
			btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnConfirm;
	}
	private JLabel getLblAlertBezAccPrva() {
		if (lblAlertBezAccPrva == null) {
			lblAlertBezAccPrva = new JLabel("");
			lblAlertBezAccPrva.setForeground(Color.RED);
			lblAlertBezAccPrva.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblAlertBezAccPrva;
	}
}
