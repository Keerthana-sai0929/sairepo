package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class studentregistration {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentregistration window = new studentregistration();
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
	public studentregistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(100, 11, 280, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(61, 43, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ROLL NO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(61, 81, 94, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(61, 127, 86, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(61, 172, 86, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PROG LANGS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(61, 220, 109, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setBounds(255, 42, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(255, 80, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setFont(new Font("Tahoma", Font.BOLD, 14));
		c1.setBounds(186, 216, 68, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setFont(new Font("Tahoma", Font.BOLD, 14));
		c2.setBounds(275, 216, 66, 23);
		frame.getContentPane().add(c2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "ECE", "EEE", "CSE", "MECH"}));
		cb1.setBounds(255, 125, 86, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setFont(new Font("Tahoma", Font.BOLD, 13));
		r1.setBounds(186, 170, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setFont(new Font("Tahoma", Font.BOLD, 14));
		r2.setBounds(314, 170, 109, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setFont(new Font("Tahoma", Font.BOLD, 14));
		c3.setBounds(358, 216, 94, 23);
		frame.getContentPane().add(c3);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String name=tb1.getText();
				String rollno=tb2.getText();
				String branch=(String)cb1.getSelectedItem();
				String gender="";
				String langs="";
				
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{
					gender="female";
				}
				if(c1.isSelected())
				{
					langs=langs+"C ,";
				}
				if(c2.isSelected())
				{
					langs=langs+"JAVA ,";
				}
				if(c3.isSelected())
				{
					langs=langs+"PYTHON ";
				}
				JOptionPane.showMessageDialog(btnNewButton,"NAME:"+name+"\nROLLNO:"+rollno+"\nBRANCH:"+branch+
						"\nGENDER:"+gender+"\nPROG LANGS:"+langs);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(206, 272, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\istockphoto-1217163811-612x612.jpg"));
		lblNewLabel_6.setBounds(0, 0, 488, 316);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
