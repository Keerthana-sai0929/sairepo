package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registrationform {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JComboBox cb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationform window = new registrationform();
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
	public registrationform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =new JFrame();
		frame.getContentPane().setBackground(new Color(215, 255, 215));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Student Registration Form");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		
		tb1 = new JTextField();
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL NUMBER");
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		
		cb1 = new JComboBox();
		cb1.setToolTipText("");
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "CS", "IT", "ECE"}));
		
		JRadioButton rb1 = new JRadioButton("MALE");
		rb1.setBackground(new Color(187, 255, 255));
		
		JRadioButton rb2 = new JRadioButton("FEMALE");
		rb2.setBackground(new Color(244, 210, 249));
		
		JLabel lblNewLabel_5 = new JLabel("PRGM LANG");
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBackground(new Color(255, 136, 136));
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setBackground(new Color(215, 215, 255));
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setBackground(new Color(255, 255, 168));
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(new Color(0, 0, 64));
		btnNewButton.setBackground(new Color(213, 255, 170));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=tb1.getText();
				String name=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender=" ";
				String langs=" ";
				
				if(rb1.isSelected()) {
					gender="MALE";
				}
				if(rb2.isSelected()) {
					gender="FEMALE";
				}
				if(c1.isSelected()) {
					langs=langs+"C";
				}
				if(c2.isSelected()) {
					langs=langs+"JAVA";
				}
				if(c3.isSelected()) {
					langs=langs+"PYTHON";
				}
				ButtonGroup bg = new ButtonGroup();
				bg.add(rb1);
				bg.add(rb2);
				JOptionPane.showMessageDialog(btnNewButton, "ROLL NO :"+roll+
						"\n NAME :"+name+"\n BRANCH :"+branch+
						"\n GENDER :"+gender+ "\n PROG LANGS :"+langs);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(42)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_5))
							.addGap(40)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(tb2)
									.addComponent(tb1)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(rb1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(rb2))
									.addComponent(cb1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnNewButton)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(c1)
									.addGap(34)
									.addComponent(c2)
									.addGap(28)
									.addComponent(c3)))))
					.addGap(72))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(13)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(tb1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tb2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(cb1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(rb1)
						.addComponent(rb2))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(c1)
						.addComponent(c3)
						.addComponent(c2))
					.addGap(18)
					.addComponent(btnNewButton)
					.addGap(21))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
