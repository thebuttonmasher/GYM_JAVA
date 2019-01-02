import java.awt.*;
import java.awt.event.*; 

public class GYM_GUI extends Frame implements ActionListener {
	 private Label lblInput;     // Declare input Label
	   private Label lblOutput;    // Declare output Label
	   private Label lblInput2;     // Declare input Label
	   private Label lblOutput2;    // Declare output Label
	   private Label lblInput3;     // Declare input Label
	   private Label lblOutput3;    // Declare output Label
	   private TextField tfInput;  // Declare input TextField
	   private TextField tfOutput; // Declare output display TextField
	   private TextField tfInput2;  // Declare input TextField
	   private TextField tfOutput2; // Declare output display TextField
	   private TextField tfInput3;  // Declare input TextField
	   private TextField tfOutput3; // Declare output display TextField
	   private String fname ;        
	   private String lname;
	   private String address;
	     
	   // Constructor to setup the UI components and event handlers
	   public GYM_GUI() {
	      setLayout(new FlowLayout()); // "super" Frame sets to FlowLayout
	 
	      lblInput = new Label("Enter first name"); // Construct component Label
	      add(lblInput);  // "super" Frame adds the Label
	 
	      tfInput = new TextField(10);  // Construct component TextField
	      add(tfInput);   // "super" Frame adds the TextField
	 
	      tfInput.addActionListener(this);
	         // tfInput is a source that fires ActionEvent when entered.
	         // The source add "this" instance as a ActionEvent listener, which provides
	         //  an ActionEvent handler called actionPerformed().
	         // Hitting enter on tfInput invokes actionPerformed().
	 
	      lblOutput = new Label("first name");  // Construct component Label
	      add(lblOutput);  // "super" Frame adds Label
	 
	      tfOutput = new TextField(10); // Construct component TextField
	      tfOutput.setEditable(false);  // read-only
	      add(tfOutput);   // "super" Frame adds TextField
	      
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
	      
	      lblInput2 = new Label("Enter last name"); // Construct component Label
	      add(lblInput2);  // "super" Frame adds the Label
	 
	      tfInput2 = new TextField(10);  // Construct component TextField
	      add(tfInput2);   // "super" Frame adds the TextField
	 
	      tfInput2.addActionListener(this);
	         // tfInput is a source that fires ActionEvent when entered.
	         // The source add "this" instance as a ActionEvent listener, which provides
	         //  an ActionEvent handler called actionPerformed().
	         // Hitting enter on tfInput invokes actionPerformed().
	 
	      lblOutput2 = new Label("last name");  // Construct component Label
	      add(lblOutput2);  // "super" Frame adds Label
	 
	      tfOutput2 = new TextField(10); // Construct component TextField
	      tfOutput2.setEditable(false);  // read-only
	      add(tfOutput2);   // "super" Frame adds TextField
	      
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
	      lblInput3 = new Label("Enter address"); // Construct component Label
	      add(lblInput3);  // "super" Frame adds the Label
	 
	      tfInput3 = new TextField(10);  // Construct component TextField
	      add(tfInput3);   // "super" Frame adds the TextField
	 
	      tfInput3.addActionListener(this);
	         // tfInput is a source that fires ActionEvent when entered.
	         // The source add "this" instance as a ActionEvent listener, which provides
	         //  an ActionEvent handler called actionPerformed().
	         // Hitting enter on tfInput invokes actionPerformed().
	 
	      lblOutput3 = new Label("address");  // Construct component Label
	      add(lblOutput3);  // "super" Frame adds Label
	 
	      tfOutput3 = new TextField(10); // Construct component TextField
	      tfOutput3.setEditable(false);  // read-only
	      add(tfOutput3);
	      
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	      setTitle("AWT Accumulator2"); // "super" Frame sets title
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
		   fname = (tfInput.getText());
		   lname = (tfInput2.getText());
		   address = (tfInput3.getText());
	      tfInput.setText("");  // Clear input TextField
	      tfInput2.setText("");  // Clear input TextField
	      tfInput3.setText("");  // Clear input TextField
	      tfOutput.setText("" + fname); // Display sum on the output TextField, convert int to String
	      tfOutput2.setText("" + lname); // Display sum on the output TextField, convert int to String
	      tfOutput3.setText("" + address); // Display sum on the output TextField, convert int to String
	   }
	}
