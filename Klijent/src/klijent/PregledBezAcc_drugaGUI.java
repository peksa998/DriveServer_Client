package klijent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JTree;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PregledBezAcc_drugaGUI {

	public static JFrame frmDiskfon;
	private JPanel panel_top;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JPanel panel_left;
	private JPanel panel_bottom;
	private JLabel lblOwner;
	private JLabel lblOwnerNull;
	private JButton btnDownload;
	private JLabel lblView;
	private JPanel panel_right;
	private JScrollPane scrollPane_1;
	private JLabel lblPath_s;
	private JLabel lblPath_sNull;
	private JList list;
	private JButton btnBack;
	private JButton btnClearView;
	
	public static String selectedItem1_bezAcc = "";
	public static String selectedItem2_bezAcc = "";
	public static String selectedItem3_bezAcc = "";
	public static String selectedItem4_bezAcc = "";
	
	public static String selectedItem = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PregledBezAcc_drugaGUI window = new PregledBezAcc_drugaGUI();
					window.frmDiskfon.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PregledBezAcc_drugaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDiskfon = new JFrame();
		frmDiskfon.setIconImage(Toolkit.getDefaultToolkit().getImage(PregledBezAcc_drugaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		frmDiskfon.setTitle("DISKFON/without-account");
		frmDiskfon.setBounds(100, 100, 900, 550);
		frmDiskfon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDiskfon.getContentPane().setLayout(new BorderLayout(0, 0));
		frmDiskfon.getContentPane().add(getPanel_top(), BorderLayout.NORTH);
		frmDiskfon.getContentPane().add(getScrollPane(), BorderLayout.CENTER);
		frmDiskfon.getContentPane().add(getPanel_left(), BorderLayout.WEST);
		frmDiskfon.getContentPane().add(getPanel_bottom(), BorderLayout.SOUTH);
		frmDiskfon.getContentPane().add(getPanel_right(), BorderLayout.EAST);
	}

	private JPanel getPanel_top() {
		if (panel_top == null) {
			panel_top = new JPanel();
			GroupLayout gl_panel_top = new GroupLayout(panel_top);
			gl_panel_top.setHorizontalGroup(
				gl_panel_top.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_top.createSequentialGroup()
						.addGap(46)
						.addComponent(getLblOwner())
						.addGroup(gl_panel_top.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_top.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(getLblOwnerNull()))
							.addGroup(gl_panel_top.createSequentialGroup()
								.addGap(361)
								.addComponent(getLblView())
								.addGap(115)
								.addComponent(getBtnClearView())))
						.addContainerGap(176, Short.MAX_VALUE))
			);
			gl_panel_top.setVerticalGroup(
				gl_panel_top.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_panel_top.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel_top.createParallelGroup(Alignment.BASELINE)
							.addComponent(getLblOwner())
							.addComponent(getLblOwnerNull()))
						.addContainerGap(17, Short.MAX_VALUE))
					.addGroup(gl_panel_top.createSequentialGroup()
						.addContainerGap(30, Short.MAX_VALUE)
						.addComponent(getLblView()))
					.addGroup(gl_panel_top.createSequentialGroup()
						.addContainerGap()
						.addComponent(getBtnClearView()))
			);
			panel_top.setLayout(gl_panel_top);
		}
		return panel_top;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		}
		return textArea;
	}
	private JPanel getPanel_left() {
		if (panel_left == null) {
			panel_left = new JPanel();
			GridBagLayout gbl_panel_left = new GridBagLayout();
			gbl_panel_left.columnWidths = new int[]{53, 34, 137, 120, 0, 0};
			gbl_panel_left.rowHeights = new int[]{25, 25, 25, 96, 25, 25, 0};
			gbl_panel_left.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_left.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			panel_left.setLayout(gbl_panel_left);
			GridBagConstraints gbc_lblPath_s = new GridBagConstraints();
			gbc_lblPath_s.insets = new Insets(0, 0, 5, 5);
			gbc_lblPath_s.gridx = 0;
			gbc_lblPath_s.gridy = 0;
			panel_left.add(getLblPath_s(), gbc_lblPath_s);
			GridBagConstraints gbc_lblPath_sNull = new GridBagConstraints();
			gbc_lblPath_sNull.gridwidth = 2;
			gbc_lblPath_sNull.insets = new Insets(0, 0, 5, 5);
			gbc_lblPath_sNull.gridx = 1;
			gbc_lblPath_sNull.gridy = 0;
			panel_left.add(getLblPath_sNull(), gbc_lblPath_sNull);
			GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
			gbc_scrollPane_1.gridwidth = 3;
			gbc_scrollPane_1.gridheight = 3;
			gbc_scrollPane_1.insets = new Insets(0, 8, 5, 5);
			gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
			gbc_scrollPane_1.gridx = 0;
			gbc_scrollPane_1.gridy = 1;
			panel_left.add(getScrollPane_1(), gbc_scrollPane_1);
			GridBagConstraints gbc_btnDownload = new GridBagConstraints();
			gbc_btnDownload.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnDownload.insets = new Insets(0, 0, 5, 5);
			gbc_btnDownload.gridx = 3;
			gbc_btnDownload.gridy = 1;
			panel_left.add(getBtnDownload(), gbc_btnDownload);
			GridBagConstraints gbc_btnBack = new GridBagConstraints();
			gbc_btnBack.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnBack.insets = new Insets(0, 0, 5, 5);
			gbc_btnBack.gridx = 2;
			gbc_btnBack.gridy = 4;
			panel_left.add(getBtnBack(), gbc_btnBack);
		}
		return panel_left;
	}
	private JPanel getPanel_bottom() {
		if (panel_bottom == null) {
			panel_bottom = new JPanel();
		}
		return panel_bottom;
	}
	private JLabel getLblOwner() {
		if (lblOwner == null) {
			lblOwner = new JLabel("Owner:");
			lblOwner.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblOwner;
	}
	private JLabel getLblOwnerNull() {
		if (lblOwnerNull == null) {
			lblOwnerNull = new JLabel(Klijent.vlasnik_linka);
			lblOwnerNull.setForeground(new Color(0, 128, 0));
			lblOwnerNull.setFont(new Font("Tahoma", Font.BOLD, 16));
		}
		return lblOwnerNull;
	}
	private JButton getBtnDownload() {
		if (btnDownload == null) {
			btnDownload = new JButton("Download");
			btnDownload.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//************************************************************************************************
					
					
					if(!Klijent.selekcija_d.equals("")) {
						Klijent.kod_za_slanje = 43;
						
					} else {
						JOptionPane.showMessageDialog(null, "First select file!");
					}
					
					
//************************************************************************************************
				}
			});
			btnDownload.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnDownload;
	}
	private JLabel getLblView() {
		if (lblView == null) {
			lblView = new JLabel("View");
			lblView.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblView;
	}
	private JPanel getPanel_right() {
		if (panel_right == null) {
			panel_right = new JPanel();
		}
		return panel_right;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getList());
		}
		return scrollPane_1;
	}
	private JLabel getLblPath_s() {
		if (lblPath_s == null) {
			lblPath_s = new JLabel("Path:");
			lblPath_s.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblPath_s;
	}
	private JLabel getLblPath_sNull() {
		if (lblPath_sNull == null) {
			lblPath_sNull = new JLabel("");
			lblPath_sNull.setFont(new Font("Tahoma", Font.PLAIN, 13));
		}
		return lblPath_sNull;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();
			list.setFont(new Font("Tahoma", Font.PLAIN, 16));
//			************************************************************************************************
				list.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						if(e.getClickCount() == 1) {
							Klijent.selekcija_d = (String) list.getSelectedValue();
						}
						
						
						if(e.getClickCount() == 2) {
							// kod 21 "Posalji izabrani folder ili prikazi izabrani fajl"
					
							
							String selectedItem = (String) list.getSelectedValue();
							
							if(!selectedItem.equals(null)) {
								Klijent.br_refers_bezAcc = Klijent.br_refers_bezAcc + 1;
								
								if(Klijent.br_refers_bezAcc == 1) {
									Klijent.selekcija_u_listi_bezAcc = selectedItem;
									selectedItem1_bezAcc = Klijent.selekcija_u_listi_bezAcc;
								}
								if(Klijent.br_refers_bezAcc == 2) {
									Klijent.selekcija_u_listi_bezAcc = selectedItem1_bezAcc + '\\' + selectedItem;
									selectedItem2_bezAcc = Klijent.selekcija_u_listi_bezAcc;
								}
								if(Klijent.br_refers_bezAcc == 3) {
									Klijent.selekcija_u_listi_bezAcc = selectedItem2_bezAcc + '\\' + selectedItem;
									selectedItem3_bezAcc = Klijent.selekcija_u_listi_bezAcc;
								}
								if(Klijent.br_refers_bezAcc == 4) {
									Klijent.selekcija_u_listi_bezAcc = selectedItem3_bezAcc + '\\' + selectedItem;
									selectedItem4_bezAcc = Klijent.selekcija_u_listi_bezAcc;
								}
								
								System.out.println(Klijent.selekcija_u_listi_bezAcc);
								Klijent.kod_za_slanje = 18;
								
								// vreme cekanja servera
								try {
									Thread.sleep(500);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								
								if(Klijent.kod_za_prijem == 3) {
									// to je dir
									// sve OK
									// brisi staru listu
									
									list.setModel(new AbstractListModel() {
										public int getSize() {
											return Klijent.duzina_liste_link;
										}
										public Object getElementAt(int index) {
											return Klijent.lista_link.get(index);
										}
									});
									
									Klijent.kod_za_prijem = 0;
								}
								if(Klijent.kod_za_prijem == 4) {
									// kad je fajl

										textArea.setText(null);
										textArea.setText(Klijent.tekst_BezAcc);
									
									Klijent.kod_za_prijem = 0;
								}
								lblPath_sNull.setText(Klijent.selekcija_u_listi_bezAcc);
							}
						}
						
					}
				});
//			************************************************************************************************
			list.setModel(new AbstractListModel() {
				public int getSize() {
					return Klijent.duzina_liste_link;
				}
				public Object getElementAt(int index) {
					return Klijent.lista_link.get(index);
				}
			});
		}
		return list;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
//					**********************************************************************************	
						if(Klijent.br_refers_bezAcc > 0) {

						
						
						if(Klijent.br_refers_bezAcc == 1) {
							Klijent.selekcija_u_listi_bezAcc = selectedItem;
							selectedItem1_bezAcc = Klijent.selekcija_u_listi_bezAcc;
						}
						if(Klijent.br_refers_bezAcc == 2) {
							Klijent.selekcija_u_listi_bezAcc = selectedItem1_bezAcc + '\\' + selectedItem;
							selectedItem2_bezAcc = Klijent.selekcija_u_listi_bezAcc;
						}
						if(Klijent.br_refers_bezAcc == 3) {
							Klijent.selekcija_u_listi_bezAcc = selectedItem2_bezAcc + '\\' + selectedItem;
							selectedItem3_bezAcc = Klijent.selekcija_u_listi_bezAcc;
						}
						if(Klijent.br_refers_bezAcc == 4) {
							Klijent.selekcija_u_listi_bezAcc = selectedItem3_bezAcc + '\\' + selectedItem;
							selectedItem4_bezAcc = Klijent.selekcija_u_listi_bezAcc;
						}
						
						Klijent.br_refers_bezAcc--;
						
						System.out.println(Klijent.selekcija_u_listi_bezAcc);
						Klijent.kod_za_slanje = 18;
						
						// vreme cekanja servera
						try {
							Thread.sleep(500);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						
						if(Klijent.kod_za_prijem == 3) {
							// to je dir
							// sve OK
							// brisi staru listu
							
							list.setModel(new AbstractListModel() {
								public int getSize() {
									return Klijent.duzina_liste_link;
								}
								public Object getElementAt(int index) {
									return Klijent.lista_link.get(index);
								}
							});
							Klijent.kod_za_prijem = 0;
						}
							lblPath_sNull.setText(Klijent.selekcija_u_listi_bezAcc);
						}
					
						
//					**********************************************************************************			
				}
			});
			btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnBack;
	}
	private JButton getBtnClearView() {
		if (btnClearView == null) {
			btnClearView = new JButton("Clear view");
			btnClearView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//	******************************************************************************************************					
				
					textArea.setText(null);
					Klijent.tekst_BezAcc = "";
					
					if(Klijent.br_refers_bezAcc > 0) {

						if(!selectedItem.equals(null)) {
							if(Klijent.br_refers_bezAcc == 1) {
								Klijent.selekcija_u_listi_bezAcc = selectedItem;
								selectedItem1_bezAcc = Klijent.selekcija_u_listi_bezAcc;
							}
							if(Klijent.br_refers_bezAcc == 2) {
								Klijent.selekcija_u_listi_bezAcc = selectedItem1_bezAcc + '\\' + selectedItem;
								selectedItem2_bezAcc = Klijent.selekcija_u_listi_bezAcc;
							}
							if(Klijent.br_refers_bezAcc == 3) {
								Klijent.selekcija_u_listi_bezAcc = selectedItem2_bezAcc + '\\' + selectedItem;
								selectedItem3_bezAcc = Klijent.selekcija_u_listi_bezAcc;
							}
							if(Klijent.br_refers_bezAcc == 4) {
								Klijent.selekcija_u_listi_bezAcc = selectedItem3_bezAcc + '\\' + selectedItem;
								selectedItem4_bezAcc = Klijent.selekcija_u_listi_bezAcc;
							}
						
						Klijent.br_refers_bezAcc--;
					}
					
						lblPath_sNull.setText(Klijent.selekcija_u_listi_bezAcc);
					
					}
				}
//	******************************************************************************************************
				
			});
			btnClearView.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnClearView;
	}
}
