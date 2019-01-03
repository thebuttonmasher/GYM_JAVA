import java.awt.*;
import java.awt.event.*; 
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class GYM_GUI extends JFrame implements ActionListener{
	
	 private JLabel lblInput;     // Declare input Label
	   private JLabel lblOutput;    // Declare output Label
	   private JLabel lblInput2;     // Declare input Label
	   private JLabel lblOutput2;    // Declare output Label
	   private JLabel lblInput3;     // Declare input Label
	   private JLabel lblOutput3;     // Declare input Label
	   private JLabel lblInput4;
	   private JLabel lblOutput4;    // Declare output Label
	   private JTextField tfInput;  // Declare input TextField
	   private JTextField tfOutput; // Declare output display TextField
	   private JTextField tfInput2;  // Declare input TextField
	   private JTextField tfOutput2; // Declare output display TextField
	   private JTextField tfInput3;  // Declare input TextField
	   private JTextField tfOutput3; // Declare output display TextField 
	   private JTextField tfOutput4;
	   private JTextField tfInput4;
	   private Trainee Trainee ;        
	   private Machine Machine;
	   private Program Program;
	     
	   // Constructor to setup the UI components and event handlers
	   public GYM_GUI() {
	      setLayout(new FlowLayout()); // "super" Frame sets to FlowLayout
	 
	      lblInput = new JLabel("Enter name"); // Construct component Label
	      add(lblInput);  // "super" Frame adds the Label
	 
	      tfInput = new JTextField(10);  // Construct component TextField
	      add(tfInput);   // "super" Frame adds the TextField
	 
	      tfInput.addActionListener(this);
	         // tfInput is a source that fires ActionEvent when entered.
	         // The source add "this" instance as a ActionEvent listener, which provides
	         //  an ActionEvent handler called actionPerformed().
	         // Hitting enter on tfInput invokes actionPerformed().
	 
	      lblOutput = new JLabel("name");  // Construct component Label
	      add(lblOutput);  // "super" Frame adds Label
	 
	      tfOutput = new JTextField(10); // Construct component TextField
	      tfOutput.setEditable(false);  // read-only
	      add(tfOutput);   // "super" Frame adds TextField
	      
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
	      
	      lblInput2 = new JLabel("Enter id"); // Construct component Label
	      add(lblInput2);  // "super" Frame adds the Label
	 
	      tfInput2 = new JTextField(10);  // Construct component TextField
	      add(tfInput2);   // "super" Frame adds the TextField
	 
	      tfInput2.addActionListener(this);
	         // tfInput is a source that fires ActionEvent when entered.
	         // The source add "this" instance as a ActionEvent listener, which provides
	         //  an ActionEvent handler called actionPerformed().
	         // Hitting enter on tfInput invokes actionPerformed().
	 
	      lblOutput2 = new JLabel("id");  // Construct component Label
	      add(lblOutput2);  // "super" Frame adds Label
	 
	      tfOutput2 = new JTextField(10); // Construct component TextField
	      tfOutput2.setEditable(false);  // read-only
	      add(tfOutput2);   // "super" Frame adds TextField
	      
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
	      lblInput3 = new JLabel("Enter address"); // Construct component Label
	      add(lblInput3);  // "super" Frame adds the Label
	 
	      tfInput3 = new JTextField(10);  // Construct component TextField
	      add(tfInput3);   // "super" Frame adds the TextField
	 
	      tfInput3.addActionListener(this);
	         // tfInput is a source that fires ActionEvent when entered.
	         // The source add "this" instance as a ActionEvent listener, which provides
	         //  an ActionEvent handler called actionPerformed().
	         // Hitting enter on tfInput invokes actionPerformed().
	 
	      lblOutput3 = new JLabel("address");  // Construct component Label
	      add(lblOutput3);  // "super" Frame adds Label
	 
	      tfOutput3 = new JTextField(10); // Construct component TextField
	      tfOutput3.setEditable(false);  // read-only
	      add(tfOutput3);
	      
	      
	      lblInput4 = new JLabel("Enter level"); // Construct component Label
	      add(lblInput4);  // "super" Frame adds the Label
	 
	      tfInput3 = new JTextField(10);  // Construct component TextField
	      add(tfInput4);   // "super" Frame adds the TextField
	 
	      tfInput4.addActionListener(this);
	         // tfInput is a source that fires ActionEvent when entered.
	         // The source add "this" instance as a ActionEvent listener, which provides
	         //  an ActionEvent handler called actionPerformed().
	         // Hitting enter on tfInput invokes actionPerformed().
	 
	      lblOutput4 = new JLabel("level");  // Construct component Label
	      add(lblOutput4);  // "super" Frame adds Label
	 
	      tfOutput4 = new JTextField(10); // Construct component TextField
	      tfOutput4.setEditable(false);  // read-only
	      add(tfOutput4);
	      
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	      setTitle("GYM"); // "super" Frame sets title
	      setSize(350, 120);    // "super" Frame sets initial size
	      setVisible(true);     // "super" Frame shows
	   }
	 
	   // The entry main() method
	   public static void main(String[] args) {
	      // Invoke the constructor by allocating an anonymous instance
	      new GYM_GUI();
	   }
	 
	   // ActionEvent handler - Called back when enter key was hit on TextField.
	   @Override
	   public void actionPerformed(ActionEvent evt) {
		   Trainee.name = (tfInput.getText());
		   Trainee.id = (tfInput2.getText());
		   Trainee.address = (tfInput3.getText());
	      tfInput.setText("");  // Clear input TextField
	      tfInput2.setText("");  // Clear input TextField
	      tfInput3.setText("");  // Clear input TextField
	      tfOutput.setText("" + Trainee.name); // Display sum on the output TextField, convert int to String
	      tfOutput2.setText("" + Trainee.id); // Display sum on the output TextField, convert int to String
	      tfOutput3.setText("" + Trainee.address); // Display sum on the output TextField, convert int to String
	      tfOutput4.setText("" + Trainee.level);
	   }
	}