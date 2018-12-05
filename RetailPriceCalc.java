// RetailPriceCalc.java
// ----------------------------------------------------------------------
// Program: Retail Price Calculator
// Programmer: Rebeka Henry
// Date: December 5, 2018
// ----------------------------------------------------------------------
// The RetailPriceCalc class extends Application. It includes the two
// methods called start and main. The start method throws an exception
// and it loads the FXML file RetailPriceCalc. The main method on the
// other hand, launches the FXML file.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RetailPriceCalc extends Application
{
	final static String RetailPriceCalc = "RetailPriceCalc"; // internal name
	final static String RetailPriceCalculator = "RetailPriceCalc"; 

   /** 
   The public method start of type void throws and Exception and
   it passes the parameter stage. The purpose of this method
   is to set the stage for the FXML file by loading it.

   @param stage of type Stage is passed as an argument into the
   method start.
   */

   public void start(Stage stage) throws Exception
   {
      Parent parent = FXMLLoader.load( 
                  getClass().getResource(RetailPriceCalc + ".fxml") );
      
      Scene scene = new Scene(parent);
      
      stage.setTitle( RetailPriceCalculator );
      stage.setScene(scene);
      stage.show();
   }

   public static void main(String[] args)
   {
      launch(RetailPriceCalc);
   }
   
   
}