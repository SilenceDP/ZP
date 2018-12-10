package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerWin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button addSmena;

    @FXML
    private Button editSmena;
    
    @FXML
    private Button addSotrudnik;

    @FXML
    private Button editSotrudnik;

    @FXML
    void initialize() {
    	addSotrudnik.setOnAction(event->{
    		System.out.println("нажата кнопка Добавить сотрудника");
    		
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(getClass().getResource("/view/Sotrudnik.fxml"));
    		try {
				loader.load();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		Parent root = loader.getRoot();
    		Stage stage = new Stage();
    		stage.setMinHeight(380);
    		stage.setMinWidth(300);
    		stage.setScene(new Scene(root));
    		stage.showAndWait();
    		
    	});
        
    	editSotrudnik.setOnAction(event->{
    		System.out.println("Вызвать окно Sotrudnik с заполненными полями.");
    		//Данные, для полей окна, взять из выделенной строки для редактирования.
    	});
    	
    	addSmena.setOnAction(event->{
    		System.out.println("Вызвать окно Smena.");
    	
    		FXMLLoader loader=new FXMLLoader();
    		loader.setLocation(getClass().getResource("/view/Smena.fxml"));
    		try {
				loader.load();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		Parent root = loader.getRoot();
    		Stage stage = new Stage();
    		stage.setMinHeight(370);
    		stage.setMinWidth(520);
    		stage.setScene(new Scene(root));
    		stage.showAndWait();
    	});
    	
    	editSmena.setOnAction(event->{
    		System.out.println("Вызвать окно Smena с заполненными полями.");
    		//Данные, для полей окна, взять из выделенной строки для редактирования.
    	});
    	
    	
    }
}
