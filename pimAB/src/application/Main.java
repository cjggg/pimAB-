package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.RootViewController;
import view.MemberViewController;

public class Main extends Application {
	
    private Stage rootStage; //
    private BorderPane rootBorderPane;
    private AnchorPane memberAnchorPane;

    @Override
	public void start(Stage primaryStage) {
		try {
			this.rootStage = primaryStage;
	        this.rootStage.setTitle("PASSION is Responsibility");
	        
			loadMainBoderPane();
			loadMemberAnchorPane();			
					
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void loadMainBoderPane() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/view/RootView.fxml")); // view controls					
			rootBorderPane = (BorderPane) loader.load();
			
			Scene scene = new Scene(rootBorderPane, 900, 600);
			scene.getStylesheets().add(Main.class.getResource("/view/member.css").toExternalForm());
			rootStage.setScene(scene);	
			rootStage.show();
			
			RootViewController controller = loader.getController();
            controller.setMainApp(this);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void loadMemberAnchorPane() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/view/MemberView.fxml")); // view controls
			memberAnchorPane = (AnchorPane) loader.load();

			rootBorderPane.setCenter(memberAnchorPane);
			
			MemberViewController controller = loader.getController();
            controller.setMainApp(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Stage getRootStage() {
        return rootStage;
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
