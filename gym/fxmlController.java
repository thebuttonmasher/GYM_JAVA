package gym;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
//controller class, handles the elements from the fxml file. has to implement each element with an fx:id !!!!!
public class fxmlController {
	//implement id's 
	public Gym gymi = new Gym(new ArrayList<Training_Device>() , new ArrayList<Trainee>());
	public ComboBox<Exercise> tempEx = new ComboBox<Exercise>();
	public ArrayList<Exercise> logTmpEx = new ArrayList<Exercise>();
	public ArrayList<Exercise> tmpReg = new ArrayList<Exercise>();
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
	public TextField EName = new TextField();
	public TextField EId = new TextField();
	public TextField Ettw = new TextField();
	public TextField EPulse = new TextField();
	public TextField EReps = new TextField();
	public TextField ESets = new TextField();
	public TextArea exTst = new TextArea();
	



	public ComboBox<Training_Device> MachChoice = new ComboBox<Training_Device>();
	// Event Listener on Button.onAction
	@FXML
	public void func(ActionEvent event) {
		//bound to the Add button, adds trainees to the list

		Trainee nTr = new Trainee(TrName.getText(),Integer.parseInt(TrID.getText()),TrAddr.getText(),Integer.parseInt(TrLevel.getText()),new Training_Regiment("today",tmpReg));
		gymi.addTrainee(nTr);
	}
	public void trReg(ActionEvent event)
	{
		tmpReg.add(tempEx.getValue());
	}
	public void addPwr(ActionEvent event)
	{
		gymi.addMachine(new Training_Device(MName1.getText(),"Power",MMuscle.getText()));
		
	}
	public void addAir(ActionEvent event)
	{
		gymi.addMachine(new Training_Device(MName2.getText(), "Aerobic", 30, 160));
	}
	public void updMch(ActionEvent event)
	{
		//updates the text area
		String s =  "";
		for(int i = 0; i < gymi.getMachines().size(); i++)
		{
			if(gymi.getMachines().get(i).getType() == "Aerobic") {
			s = s + gymi.getMachines().get(i).getName() + "  " + gymi.getMachines().get(i).getType() + " Time to work: " + gymi.getMachines().get(i).getTimeToWork() + " Pulse :" + gymi.getMachines().get(i).getPulse();
			s = s + "\n";}
			else
			{
				s = s + gymi.getMachines().get(i).getName() + "  " + gymi.getMachines().get(i).getType() + " Muscle :" + gymi.getMachines().get(i).getMuscle();
				s = s + "\n";
			}
			
		}
		MachChoice.setItems(FXCollections.observableArrayList(gymi.getMachines()));
		MList.setText(s);
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
	public void addEx(ActionEvent event)
	{
		if(MachChoice.getValue().getType() == "Power")
		{
		logTmpEx.add(new Exercise(EName.getText(), Integer.parseInt(EId.getText()), Integer.parseInt(ESets.getText()), Integer.parseInt(EReps.getText())));
		MachChoice.getValue().getExList().add(new Exercise(EName.getText(), Integer.parseInt(EId.getText()), Integer.parseInt(ESets.getText()), Integer.parseInt(EReps.getText())));
		}
		else
		{
		logTmpEx.add(new Exercise(EName.getText(),"Aerobic",Integer.parseInt(Ettw.getText()),Integer.parseInt(EPulse.getText()),Integer.parseInt(EId.getText())));
		MachChoice.getValue().getExList().add(new Exercise(EName.getText(),"Aerobic",Integer.parseInt(Ettw.getText()),Integer.parseInt(EPulse.getText()),Integer.parseInt(EId.getText())));
		}
	}
	public void updtEx(ActionEvent event)
	{
		String s = " ";
		for(int i = 0; i < logTmpEx.size(); i++){
		s = s + logTmpEx.get(i).toString() + "\n";
		}
		tempEx.setItems(FXCollections.observableArrayList(logTmpEx));
		exTst.setText(s);
		
		
	}
}
