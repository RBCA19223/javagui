package rbca19223;

/**
 * practice
 */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Test implements ActionListener{

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField result;
	private JButton mult;
	private JButton div;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 728, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(278, 21, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(278, 87, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton add = new JButton("ADD");
		add.setBounds(98, 149, 89, 23);
		frame.getContentPane().add(add);
		add.addActionListener(this);
		
		JButton sub = new JButton("SUB");
		sub.setBounds(221, 149, 89, 23);
		frame.getContentPane().add(sub);
		sub.addActionListener(this);
		
		mult = new JButton("MULT");
		mult.setBounds(356, 149, 89, 23);
		frame.getContentPane().add(mult);
		mult.addActionListener(this);
		
		result = new JTextField();
		result.setBounds(221, 270, 86, 20);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		div = new JButton("DIV");
		div.setBounds(474, 149, 89, 23);
		frame.getContentPane().add(div);
		
		JLabel lblNewLabel = new JLabel("Num 1");
		lblNewLabel.setBounds(98, 24, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Num 2");
		lblNewLabel_1.setBounds(98, 90, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setBounds(98, 273, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
	             if (arg0.getStateChange()==ItemEvent.SELECTED) {
	            	 if(!comboBox.getSelectedItem().toString().equals("Choose")){
	            		 JOptionPane.showMessageDialog(frame, comboBox.getSelectedItem().toString()+" is selected");
	            	 }
	             }
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose", "BCA", "BBA", "BBA T&T", "BCOM", "BA"}));
		comboBox.setBounds(437, 284, 76, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("stream");
		lblNewLabel_3.setBounds(356, 287, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox readchkbx = new JCheckBox("reading");
		readchkbx.setBounds(596, 111, 97, 23);
		frame.getContentPane().add(readchkbx);
		
		JCheckBox paintchkbx = new JCheckBox("painting");
		paintchkbx.setBounds(596, 185, 97, 23);
		frame.getContentPane().add(paintchkbx);
		
		JCheckBox singchkbx = new JCheckBox("singing");
		singchkbx.setBounds(596, 249, 97, 23);
		frame.getContentPane().add(singchkbx);
		
		JButton btnNewButton = new JButton("click");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String msg="\n";
				if(readchkbx.isSelected())
				{
					msg="reading";
				}
				if(paintchkbx.isSelected())
				{
					msg+=" painting";
				}
				if(singchkbx.isSelected())
				{
					msg+=" singing";
				}
				JOptionPane.showMessageDialog(frame,msg);
			}
		});
		btnNewButton.setBounds(596, 333, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(98, 301, 156, 82);
		frame.getContentPane().add(lblNewLabel_4);
		div.addActionListener(this);
		
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\prince\\git\\javagui\\pics\\img.jpg"));
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String s1 = t1.getText();
		String s2 = t2.getText();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c=0;
		if(ae.getActionCommand().equals("ADD"))
		{
			c=a+b;
		}
		else if(ae.getActionCommand().equals("SUB"))
		{
			c=a-b;
		}
		else if(ae.getActionCommand().equals("MULT"))
		{
			c=a*b;
		}
		else if(ae.getActionCommand().equals("DIV"))
		{
			c=a/b;
		}
		result.setText(String.valueOf(c)); 
	}
}