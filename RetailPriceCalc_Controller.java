// RetailPriceCalc_Controller.java
// ----------------------------------------------------------------------
// Program: Retail Price Controller
// Programmer: Rebeka Henry
// Date: December 5, 2018
// ----------------------------------------------------------------------
// The class RetailPriceCalc_Controller links the FXML file. Each of the
// fields that exit within the FXML file in Scene Builder are linked 
// here. This controller adds functionality to the main program
// RetailPriceCalc. It is the connector that actually makes the FXML
// file work. It has three methods called btnCalc_Click, btnClear_Click,
// and error_alert. The first method gets input from the user and 
// calculates the retail price. The second method clears the buttons so
// that when the user wants to input new information they can click on
// the button. And the third method checks if there are errors running
// the program. It provides a warning in this regard.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class RetailPriceCalc_Controller
{
   @FXML private TextField txtWholeSaleAmt;
   @FXML private TextField txtMarkupPercent;
   @FXML private TextField txtRetailPrice;
   @FXML private Button btnCalc, btnClear;
   
   /** 
   The public method btnCalc_Click of type void gets 
   input from the user and then it calculates the
   retail price. It does not return anything but it
   does print out the result using setText of the
   calculation of the retail price. The input that
   it gets from the user is the wholeSale and 
   markUpPercent and since it is originally a string,
   it is parsed to return a value to be used in the
   calculation of type Double. This method also
   is linked to the calculate button in the FXML file.
   */

   public void btnCalc_Click()
   {
      double wholeSale, markUpPercent, retailPrice;

      wholeSale = Double.parseDouble(txtWholeSaleAmt.getText());

      markUpPercent = Double.parseDouble(txtMarkupPercent.getText());

      retailPrice = (1 + markUpPercent / 100) * wholeSale;

      txtRetailPrice.setText(String.format("$%,.2f", retailPrice));

   }

   /** 
   The public method btnCalc_Click of type void clears
   the txtWholeSaleAmt, txtMarkupPercent, and txtRetailPrice. It
   is going to get linked to the clear button in the FXML file.
   */

   public void btnClear_Click()
   {
      txtWholeSaleAmt.clear();
      txtMarkupPercent.clear();
      txtRetailPrice.clear();
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