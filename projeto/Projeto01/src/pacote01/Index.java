package pacote01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSpinner;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class Index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setTitle("EDITORA\r\n");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.MAGENTA);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("PEDIDOS");
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_3 = new JMenu("PR\u00D3XIMO PEDIDO");
		mnNewMenu_3.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("CADASTRAR PEDIDO");
		mnNewMenu.add(mnNewMenu_4);
		
		JMenu mnNewMenu_1 = new JMenu("CONSULTA");
		mnNewMenu_1.setForeground(Color.BLACK);
		mnNewMenu_1.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_5 = new JMenu("PEDIDO");
		mnNewMenu_1.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("ESTOQUE");
		mnNewMenu_1.add(mnNewMenu_6);
		
		JMenu mnNewMenu_2 = new JMenu("SAIR");
		mnNewMenu_2.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		mnNewMenu_2.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_2.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_2);
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("---  EDITORA ??????????   ---");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(44, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(66)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(92, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
