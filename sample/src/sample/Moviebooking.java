package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Moviebooking {

	protected static final int OPTION = 0;
	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Moviebooking window = new Moviebooking();
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
	public Moviebooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 497, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(126, 11, 224, 24);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setBounds(285, 53, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(66, 56, 77, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(66, 102, 77, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "SALAAR", "DEVARA"}));
		cb1.setBounds(285, 98, 86, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(66, 159, 189, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4"}));
		cb2.setBounds(285, 165, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String numberoftickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(numberoftickets);
				int bill=0;
				if(movie.equals("RRR"))
				{
					bill=bill+nt*150;
				}
				if(movie.equals("SALAAR"))
				{
					bill=bill+nt*250;
				}
				if(movie.equals("DEVARA"))
				{
					bill=bill+nt*450;
				}
				
				int res=0;
					res=JOptionPane.showConfirmDialog(btnNewButton,"NAME:"+name+"\nMOVIE:"+movie+
							"\nNUMBER OF TICKETS:"+numberoftickets+"\nAMOUNT:"+bill);
					if(res==YES_OPTION)
					{
						JOptionPane.showMessageDialog(btnNewButton,"TICKETS CONFIRMED");
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton,"TICKETS CANCELLED");
					}	
						
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(177, 247, 121, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\istockphoto-1217163811-612x612.jpg"));
		lblNewLabel_4.setBounds(0, 0, 481, 320);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
