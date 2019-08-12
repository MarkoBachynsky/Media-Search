package System.UI;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

/**
 * The main class, where the application starts.
 * 
 * @author Marko S. Bachynsky
 * @since 1.0
 */
public class Main extends Application
{

	/**
	 * 
	 * Creates the splash screen, and main program with a untitled window
	 * 
	 * @since 1.0
	 * @author Marko S. Bachynsky
	 */
	@Override
	public void start(Stage primaryStage)
	{
		try
		{
			// Main Program
			primaryStage.setTitle("Untitled");
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("/System/UI/Resources/GUI.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/System/UI/Resources/Application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception error)
		{
			error.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
