// TempConv.java
// ----------------------------------------------------------------------
// Program: Temperature Converter
// Programmer: Rebeka Henry
// Date: December 5, 2018
// ----------------------------------------------------------------------
// The TempConv class extends Application. It has two methods caled 
// start and main respectively. The method start throws an exception
// and it loads the FXML file TempConv. Thew main method, launches the
// FXML file TempConv. 
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TempConv extends Application
{
	final static String TempConv = "TempConv"; // internal name
	final static String TemperatureConverter = "TempConv"; 

   /** 
   The public method start of type void throws and Exception and
   it passes the parameter stage. The purpose of this method
   is to set the stage for the FXML TempConv file by loading it.

   @param stage of type Stage is passed as an argument into the
   method start.
   */

   public void start(Stage stage) throws Exception
   {
      Parent parent = FXMLLoader.load( 
                  getClass().getResource(TempConv + ".fxml") );
      
      Scene scene = new Scene(parent);
      
      stage.setTitle( TemperatureConverter );
      stage.setScene(scene);
      stage.show();
   }

   public static void main(String[] args)
   {
      launch(TempConv);
   }
   
   
}