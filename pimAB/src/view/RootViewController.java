package view;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import controller.RootService;
import controller.RootServiceImpl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;

public class RootViewController implements Initializable {
	

	private Main mainApp;
	
	private RootServiceImpl rootService;

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
    public void setRootService(RootServiceImpl service) {
    	rootService = service;
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		//rootService = new RootServiceImpl();
	}
	
	@FXML
    private void handleOpen() {
        FileChooser fileChooser = new FileChooser();

        // Set extension filter
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
                "XML files (*.xml)", "*.xml");
        fileChooser.getExtensionFilters().add(extFilter);

        // Show save file dialog
        File file = fileChooser.showOpenDialog(mainApp.getRootStage());

        if (file != null) {
        	rootService.openFile(file);
        }
	}
}
