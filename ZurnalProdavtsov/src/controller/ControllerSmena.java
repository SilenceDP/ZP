package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ControllerSmena {

    ObservableList<String> listProdavets= FXCollections.observableArrayList("a","b","c","d");
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField tfNalichnie;

    @FXML
    private ComboBox<String> cbProdavets;

    @FXML
    private TextField tfViruchka;

    @FXML
    private TextField tfRashod;
    
    @FXML
    private TextField tfKassa;

    @FXML
    private ComboBox<String> cbSmenshik;

    @FXML
    private ComboBox<String> cbTovaroved;

    @FXML
    private TextField tfTimeSmena;

    @FXML
    private TextField tfSmena;

    @FXML
    private Button btZapisat;

    @FXML
    private TextField tfBeznalich;

    @FXML
    private TextField tfDate;

    @FXML
    void initialize() {
    	cbProdavets.setItems(listProdavets);
    	cbSmenshik.setItems(listProdavets);
    	
    	btZapisat.setOnAction(event->{
    		SmenaKKM smena = new SmenaKKM();
    		smena.setDate(tfDate.getText().trim());
    		smena.setNamberSmena(tfSmena.getText().trim());
    		smena.setNamberKassa(tfKassa.getText().trim());
    		smena.setProdavets(cbProdavets.getValue());
    		
    		//выручка по Z-отчету (текстовое поле не может быть пустым:обрабатываем)
    		if(!tfViruchka.getText().equals("")) 
    		{
    			smena.setZet(Double.parseDouble(tfViruchka.getText()));
    		}
    		//нужно всплывающее окно с ошибкой
    		else {System.out.print("EROR: Не заполнено поле \"Выручка\".");}
    		
    		//наличные (текстовое поле не может быть пустым:обрабатываем)
    		if(!tfNalichnie.getText().equals("")) 
    		{
    			smena.setNal(Double.parseDouble(tfNalichnie.getText()));
    		}
    		//нужно всплывающее окно с ошибкой
    		else {System.out.print("EROR: Не заполнено поле \"Наличные\".");}
    		
    		//безналичные (текстовое поле может быть пустым:обрабатываем)
    		if (!tfBeznalich.getText().equals("")) 
    		{
    			smena.setBezNal(Double.parseDouble(tfBeznalich.getText()));
    		}
    		
    		//расход (текстовое поле может быть пустым:обрабатываем)
    		if (!tfRashod.getText().equals("")) 
    		{
    			smena.setRashod(Double.parseDouble(tfRashod.getText()));
    		}
    		
    		smena.setProdavetsSmenshhik(cbSmenshik.getValue());
    		smena.setTimeBeforeWork(tfTimeSmena.getText().trim());
    		smena.setTovaroved(cbTovaroved.getValue());
    		
    		System.out.println(smena.getDate());
    		System.out.println(smena.getNamberSmena());
    		System.out.println(smena.getNamberKassa());
    		System.out.println(smena.getProdavets());
    		System.out.println(smena.getZet());
    		System.out.println(smena.getNal());
    		System.out.println(smena.getBezNal());
    		System.out.println(smena.getRashod());
    		System.out.println(smena.otclonenieRaschet());
    		System.out.println(smena.getProdavetsSmenshhik());
    		System.out.println(smena.getTimeBeforeWork());
    		System.out.println(smena.getTovaroved());
    		
    	});
      
    }
}