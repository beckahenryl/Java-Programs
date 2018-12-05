// TempConv_Controller.java
// ----------------------------------------------------------------------
// Program: Temperature Converter Controller
// Programmer: Rebeka Henry
// Date: December 5, 2018
// ----------------------------------------------------------------------
// The class TempConv_Controller links the FXML file. Each of the
// fields that exist within the FXML file in Scene Builder are linked 
// here. This controller adds functionality to the main program
// TempConv. It is the connector that actually makes the FXML
// file work. It has three methods called btnFahrenheit_Click,
// btnCelsius_Click, and error_alert. The first method calculates the
// temperature and displays its value in Fahrenheit. It gets input from
// the user. The second method calculates the temperature and displays
// its value in Celsius. The third method checks if there are errors
// running the program. It provides a warning in this regard.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class TempConv_Controller
{
	@FXML private TextField txtTemperature;
	@FXML private TextField txtNewTemperature;
	@FXML private Button btnFahrenheit, btnCelsius;

	/** 
    The public method btnFahrenheit_Click of type void gets 
    input from the user it calculates the temperature
    and displays its value in Fahrenheit. Although it does
    not return anything, it does display the value of the
    temperature in Fahrenheit. It gets the txtTemperature input
    from the user. Since the input from the user is a string,
    it parses it and returns a value of type Double. This method
    is also linked to the Fahrenheit button in the FXML file.
    */
	
	public void btnFahrenheit_Click()
	{
		double fahrenheit, cel;

		cel = Double.parseDouble(txtTemperature.getText());

		fahrenheit = 1.8 * cel + 32;

		txtNewTemperature.setText(String.format("%.2f", fahrenheit));
	}
	
	/** 
    The public method btnCelsius_Click of type void gets 
    input from the user it calculates the temperature
    and displays its value in Celsius. Although it does
    not return anything, it does display the value of the
    temperature in Celsius. It gets the txtTemperature input
    from the user. Since the input from the user is a string,
    it parses it and returns a value of type Double. This method
    is also linked to the Celsius button in the FXML file.
    */

	public void btnCelsius_Click()
	{
		double celsius, fahren;

		fahren = Double.parseDouble(txtTemperature.getText());

		celsius = (5/9) * (fahren - 32);

		txtNewTemperature.setText(String.format("%.2f", celsius));
	}


// ----------------------------------------------------------------------

   private void error_alert(String prog, String title, String msg)
   {
      Alert alert = new Alert( Alert.AlertType.WARNING);
      alert.setTitle( prog );
      alert.setHeaderText( title );
      alert.setContentText( msg );
      alert.showAndWait();
   }
	
}