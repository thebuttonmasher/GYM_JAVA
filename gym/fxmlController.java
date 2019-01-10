package gym;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

import javafx.event.ActionEvent;
//controller class, handles the elements from the fxml file. has to implement each element with an fx:id !!!!!
public class fxmlController {
	//implement id's 
	public Gym gymi = new Gym(new ArrayList<Training_Device>() , new ArrayList<Trainee>());
	public ComboBox<Exercise> tempEx = new ComboBox<Exercise>();
	public ArrayList<Exercise> logTmpEx = new ArrayList<Exercise>();
	public Trainee tempTr = new Trainee(null, 0, null, 0, null);
	public TextField TrName = new TextField();
	public TextField TrID = new TextField();
	public TextField TrLevel = new TextField();
	public TextField TrAddr = new TextField();
	public TextArea TrLst = new TextArea();
	public TextField MName1 = new TextField();
	public TextField MName2 = new TextField();
	public TextField MMuscle = new TextField();
	public TextField MPulse = new TextField();
	public TextField MTime = new TextField();
	public TextArea MList= new TextArea();
	// Event Listener on Button.onAction
	@FXML
	public void func(ActionEvent event) {
		//bound to the Add button, adds trainees to the list

		Trainee nTr = new Trainee(TrName.getText(),Integer.parseInt(TrID.getText()),TrAddr.getText(),Integer.parseInt(TrLevel.getText()),new Training_Regiment("today",logTmpEx));
		gymi.addTrainee(nTr);
	}
	public void addPwr(ActionEvent event)
	{
		gymi.addMachine(new Training_Device(MName1.getText(),"Power",MMuscle.getText()));
	}
	public void addAir(ActionEvent event)
	{
		
	}
	public void updtTr(ActionEvent event)
	{
		//updates the text area
		String s =  "";
		for(int i = 0; i < gymi.getCostumers().size(); i++)
		{
			s = s + gymi.getCostumers().get(i).getName() + "  " + gymi.getCostumers().get(i).getAddress();
			s = s + "\n";
		}
		TrLst.setText(s);
	}
}
