package gym;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

import javafx.event.ActionEvent;

public class fxmlController {

	public Gym gymi = new Gym(new ArrayList<Training_Device>() , new ArrayList<Trainee>());
	public ComboBox<Exercise> tempEx = new ComboBox<Exercise>();
	public ArrayList<Exercise> logTmpEx = new ArrayList<Exercise>();
	public Trainee tempTr = new Trainee(null, 0, null, 0, null);
	public TextField TrName = new TextField();
	public TextField TrID = new TextField();
	public TextField TrLevel = new TextField();
	public TextField TrAddr = new TextField();
	public TextArea TrLst = new TextArea();
	// Event Listener on Button.onAction
	@FXML
	public void func(ActionEvent event) {

		Trainee nTr = new Trainee(TrName.getText(),Integer.parseInt(TrID.getText()),TrAddr.getText(),Integer.parseInt(TrLevel.getText()),new Training_Regiment("today",logTmpEx));
		gymi.addTrainee(nTr);
	}
	public void updtTr(ActionEvent event)
	{
		
		String s =  "";
		for(int i = 0; i < gymi.getCostumers().size(); i++)
		{
			s = s + gymi.getCostumers().get(i).getName() + "  " + gymi.getCostumers().get(i).getAddress();
			s = s + "\n";
		}
		TrLst.setText(s);
	}
}
