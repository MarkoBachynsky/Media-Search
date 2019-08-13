package System.UI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

/**
 * The controller class for GUI.FXML.
 * 
 * @author Marko S. Bachynsky
 * @since 1.0
 */

public class GUIController
{
	@FXML
	public BorderPane Root;
	@FXML
	public ListView<String> ListViewMedia;
	@FXML
	public Button ButtonAddMedia;


	public void OnActionButtonAddMedia(ActionEvent event)
	{
		ObservableList<String> names = FXCollections.observableArrayList( "Julia", "Ian", "Sue", "Matthew", "Hannah", "Stephan", "Denise");
		ListViewMedia.setItems(names);
	}


}
