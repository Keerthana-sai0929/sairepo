package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movieticket {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb;
	private JLabel tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieticket window = new movieticket();
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
	public movieticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 42, 444, 0);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(88, 21, 295, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel tb1 = new JLabel("NAME");
		tb1.setFont(new Font("Tahoma", Font.BOLD, 13));
		tb1.setBounds(66, 80, 46, 25);
		frame.getContentPane().add(tb1);
		
		tb2 = new JLabel("MOVIE NAME");
		tb2.setFont(new Font("Tahoma", Font.BOLD, 13));
		tb2.setBounds(53, 116, 86, 14);
		frame.getContentPane().add(tb2);
		
		JLabel tb3 = new JLabel("NO.OF TICKETS");
		tb3.setFont(new Font("Tahoma", Font.BOLD, 13));
		tb3.setBounds(53, 165, 103, 14);
		frame.getContentPane().add(tb3);
		
		tb = new JTextField();
		tb.setFont(new Font("Tahoma", Font.BOLD, 12));
		tb.setBounds(149, 82, 120, 20);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb.getText();
				String movie=(String)b1.getSelectedItem();
				String tickets=(String)cb2.getSelectedItem();
				int nt = Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("RRR"))
					bill = bill+nt*150;
				if(movie.equals("SALAAR"))
					bill = bill+nt*200;
				if(movie.equals("Z-STOP"))
					bill = bill+nt*100;
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton,  "NAME :"+name+"\n MOVIE"+movie+"\n TICKETS"+nt);
				if(res==YES_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CONFIRMED");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING Cancelled");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(124, 208, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
	    JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Tahoma", Font.BOLD, 12));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SAALAR", "RRR", "Z-STOP"}));
		cb1.setBounds(149, 112, 120, 23);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Tahoma", Font.BOLD, 12));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb2.setBounds(149, 161, 120, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\istockphoto-1217163811-612x612.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
