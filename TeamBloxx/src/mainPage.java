import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;

import java.awt.Button;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSlider;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;


public class mainPage {

	private JFrame frmTeamBlox;
	private JTextField txtMemberName;
	private JTextField txtDeadline;
	private int count= 1;
	private int height= 240;
	private  String nameTarea= "txtArea";
	private String nameCBox= "checkbox";
	private String nameTfield= "txtField";
	
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage window = new mainPage();
					window.frmTeamBlox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmTeamBlox = new JFrame();
		frmTeamBlox.setTitle("Team Blox");
		frmTeamBlox.setBounds(1000, 0, 380, 630);
		frmTeamBlox.setMinimumSize(new Dimension(380, 600));
		frmTeamBlox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JLabel lblProjectName = new JLabel("PROJECT NAME");
		
		
		JComboBox cboStage = new JComboBox();
		cboStage.setModel(new DefaultComboBoxModel(new String[] {"Stage 1", "Stage 2"}));
		
		JTextArea textArea = new JTextArea();
		
		txtMemberName = new JTextField();
		txtMemberName.setText("Member Name");
		txtMemberName.setColumns(10);
		
		txtDeadline = new JTextField();
		txtDeadline.setText("Deadline");
		txtDeadline.setColumns(10);
		
		JLabel lblSetDeadline = new JLabel("Set Deadline:");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setVisible(false);
		
		final JButton btnText = new JButton("Text");
		final JButton btnTodo = new JButton("To-do");
		final JButton btnFile = new JButton("File");
		
		
		btnTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnText.setVisible(false);
				btnTodo.setVisible(false);
				btnFile.setVisible(false);
				  JCheckBox checkbox = new JCheckBox();
	               
				  checkbox.setName(nameCBox + count);
				  
				  checkbox.setBounds(5, height, 60, 30);
				  
		
				  
				  JTextField tfieldCB= new JTextField();
				  tfieldCB.setName(nameTfield + count);
				  tfieldCB.setBounds(50, height, 160, 30);
				  
				  		  height+= 50;
				  
				  JTextField tfieldMember= new JTextField();
					 tfieldMember.setName(nameTfield + count);
					 tfieldMember.setBounds(10, height, 100, 30);
					// tfieldMember.setVisible(true);

					 JLabel tLabel= new JLabel();
					 tLabel.setText("Set Deadline:");
					 tLabel.setBounds(120, height, 100, 30);
					 
					 JTextField tfieldDate= new JTextField();
					 tfieldDate.setName(nameTfield + "Deadline" + count);
					 tfieldDate.setBounds(220, height, 100, 30);
					 
				  
					//tfield.setVisible(true);
					
	                count++;
	                height+= 50;
	                frmTeamBlox.getContentPane().add(checkbox);
	                frmTeamBlox.getContentPane().add(tfieldCB);
	                frmTeamBlox.getContentPane().add(tfieldMember);
	                frmTeamBlox.getContentPane().add(tLabel);
	                frmTeamBlox.getContentPane().add(tfieldDate);
	                frmTeamBlox.revalidate();  // For JDK 1.7 or above.
	                //frame.getContentPane().revalidate(); // For JDK 1.6 or below.
	                frmTeamBlox.repaint();
				
			}
		});
		
		
		btnText.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				btnText.setVisible(false);
				btnTodo.setVisible(false);
				btnFile.setVisible(false);
				  JTextArea tarea = new JTextArea();
	               
				  tarea.setName(nameTarea + count);
				  tarea.setBounds(5, height, 370, 140);
					//
					
					height= height + 140;
					  
					 JTextField tfieldMember= new JTextField();
					 tfieldMember.setName(nameTfield + count);
					 tfieldMember.setBounds(10, height, 100, 30);
					// tfieldMember.setVisible(true);

					 JLabel tLabel= new JLabel();
					 tLabel.setText("Set Deadline:");
					 tLabel.setBounds(120, height, 100, 30);
					 
					 JTextField tfieldDate= new JTextField();
					 tfieldDate.setName(nameTfield + "Deadline" + count);
					 tfieldDate.setBounds(220, height, 100, 30);
					 
					 
	                count++;
	                height+= 40;
	                frmTeamBlox.getContentPane().add(tarea);
	                frmTeamBlox.getContentPane().add(tfieldMember);
	                frmTeamBlox.getContentPane().add(tLabel);
	                frmTeamBlox.getContentPane().add(tfieldDate);
	                frmTeamBlox.revalidate();  // For JDK 1.7 or above.
	                //frame.getContentPane().revalidate(); // For JDK 1.6 or below.
	                frmTeamBlox.repaint();
	                
			}
		});
	
		btnText.setVisible(false);
		
		
		btnTodo.setVisible(false);
		
		btnFile.setVisible(false);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnText.setVisible(true);
				btnTodo.setVisible(true);
				btnFile.setVisible(true);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmTeamBlox.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAdd)
							.addGap(11)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnText)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnTodo, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnFile))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblProjectName)
									.addGap(8)
									.addComponent(cboStage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxNewCheckBox)
							.addContainerGap(246, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtMemberName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(lblSetDeadline)
							.addGap(6)
							.addComponent(txtDeadline, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblProjectName))
						.addComponent(cboStage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnText)
						.addComponent(btnAdd)
						.addComponent(btnTodo)
						.addComponent(btnFile))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtMemberName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(lblSetDeadline))
						.addComponent(txtDeadline, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(90)
					.addComponent(chckbxNewCheckBox)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		frmTeamBlox.getContentPane().setLayout(groupLayout);
		
	
	}
}
