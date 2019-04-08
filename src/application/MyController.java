package application;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class MyController {
 @FXML
 private Button resta;
 @FXML
 private TextField n1;
 @FXML
 private Button suma;
 @FXML
 private TextField n2;
 @FXML
 private Button producto;
 @FXML
 private Button division;
 @FXML
 private Label info;

 @FXML
 public void initialize() {
 // TODO (don't really need to do anything here).
 }
 // When user click on myButton this method will be called.
 public void suma(ActionEvent event) {
	 if(n1.getText().isEmpty() || n2.getText().isEmpty()) {
		 info.setText("valor nulo");
	 }else {
		 Float num1 = Float.parseFloat(n1.getText());
		 Float num2 = Float.parseFloat(n2.getText());
		 String res =Float.toString(num1+num2) ;
		 info.setText(res);
	 }
 
 }
 public void resta(ActionEvent event) {
	 if(n1.getText().isEmpty() || n2.getText().isEmpty()) {
		 info.setText("valor nulo");
	 }else {
		 Float num1 = Float.parseFloat(n1.getText());
		 Float num2 = Float.parseFloat(n2.getText());
		 String res =Float.toString(num1-num2) ;
		 info.setText(res);
	 }
 
 }
 public void producto(ActionEvent event) {
	 if(n1.getText().isEmpty() || n2.getText().isEmpty()){
		 info.setText("valor nulo");
	 }else {
		 Float num1 = Float.parseFloat(n1.getText());
		 Float num2 = Float.parseFloat(n2.getText());
		 String res =Float.toString(num1*num2) ;
		 info.setText(res);
	 }
 
 }
 @SuppressWarnings("unlikely-arg-type")
public void division(ActionEvent event) {
	 if(n1.getText().isEmpty() || n2.getText().isEmpty()) {
		 info.setText("valor nulo");
	 }else if (n2.getText().equals("0")){
		 info.setText("no se puede dividir entre 0");
	 }else {
		 Float num1 = Float.parseFloat(n1.getText());
		 Float num2 = Float.parseFloat(n2.getText());
		 String res =Float.toString(num1/num2) ;
		 info.setText(res);
	 }
 
 }
 
}

