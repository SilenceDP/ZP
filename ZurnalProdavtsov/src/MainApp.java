
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class MainApp extends Application {
    
   /* @Override
    public void init() throws Exception {         
         ConnectionDB_H2 conn= new ConnectionDB_H2();
         conn.getClass();
         super.init();
    }*/
	
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("view/Win.fxml"));
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("view/application.css").toExternalForm());
		
			primaryStage.setTitle("Журнал продавцов");
			primaryStage.setMinHeight(600);//ограничим размер окна по высоте
			primaryStage.setMinWidth(800); //ограничим размер окна по ширине
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		launch(args);	
	}
}
