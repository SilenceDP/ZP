package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerSotrudnik {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField tfDolgnost;

    @FXML
    private TextField tfDateOn;

    @FXML
    private TextField tfDateOff;

    @FXML
    private TextField tfMiddleName;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfSurname;

    @FXML
    private Button recSotrudnik;

    @FXML
    void initialize() {
    	recSotrudnik.setOnAction(event->{
    		System.out.println("проверка записи");
    		//String name = tfName.getText().trim();
    		//String middleName = tfMiddleName.getText().trim();
    		//String surname = tfSurname.getText().trim();
    		//String dolgnost = tfDolgnost.getText().trim();
    		//String dateOn = tfDateOn.getText().trim();
    		//String dateOff = tfDateOff.getText().trim();
    		
    		 Sotrudnik sotrudnik=new Sotrudnik();
    		 sotrudnik.setName(tfName.getText().trim());
    		 sotrudnik.setMiddleName(tfMiddleName.getText().trim());
    		 sotrudnik.setSurname(tfSurname.getText().trim());
    		 sotrudnik.setDolgnost(tfDolgnost.getText().trim());
    		 sotrudnik.setDataOn(tfDateOn.getText().trim());
    		 sotrudnik.setDataOff(tfDateOff.getText().trim());
    
    		 System.out.println(sotrudnik.getName());
    		 System.out.println(sotrudnik.getMiddleName());
    		 System.out.println(sotrudnik.getSurname());
    		 System.out.println(sotrudnik.getDolgnost());
    		 System.out.println(sotrudnik.getDataOn());
    		 System.out.println(sotrudnik.getDataOff());
    		 recSotrudnik.getScene().getWindow().hide();
    		 
    	});
    }
}
