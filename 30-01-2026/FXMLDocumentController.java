/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Administrator
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField dspl;
    double firstNum = 0;
    String operator = "";
    boolean startNew = true;
    
    
    @FXML
    private Button o1;
    @FXML
    private Button t2;
    @FXML
    private Button th3;
    @FXML
    private Button f5;
    @FXML
    private Button s6;
    @FXML
    private Button s7;
    @FXML
    private Button n9;
    @FXML
    private Button z0;
    @FXML
    private Button cl;
    @FXML
    private Button eql;
    @FXML
    private Button F4;
    @FXML
    private Button mi;
    @FXML
    private Button mul;
    @FXML
    private Button div;
    @FXML
    private Button e8;
    @FXML
    private Button pl;
    
   /* private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }*/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void display(ActionEvent event) 
    {
        
    }
    
    private void appendNumber(String num) {
    if (startNew) {
        dspl.setText("");
        startNew = false;
    }
    dspl.setText(dspl.getText() + num);
}

    
    

    @FXML
    private void one(ActionEvent event) 
    {
        appendNumber("1");
    }

    @FXML
    private void two(ActionEvent event)
    {
        appendNumber("2");
    }

    @FXML
    private void three(ActionEvent event)
    {
        appendNumber("3");
    }

    @FXML
    private void five(ActionEvent event) 
    {
        appendNumber("5");
    }

    @FXML
    private void six(ActionEvent event) 
    {
        appendNumber("6");
    }

    @FXML
    private void seven(ActionEvent event)
    {
        appendNumber("7");
    }

    @FXML
    private void nine(ActionEvent event)
    {
        appendNumber("9");
    }

    @FXML
    private void zero(ActionEvent event) 
    {
        appendNumber("0");
    }

    @FXML
    private void clear(ActionEvent event) 
    {
        dspl.setText("");
        firstNum = 0;
        operator = "";
        startNew = true;

    }

    @FXML
    private void equals(ActionEvent event) 
    {
        double secondNum = Double.parseDouble(dspl.getText());
        double result = 0;
            try {
            switch (operator) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
        
               result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    if (secondNum == 0) {
                        dspl.setText("Error");
                        return;
                    }
                    result = firstNum / secondNum;
                    break;
            }
            dspl.setText(String.valueOf(result));
            startNew = true;
        }
           catch (Exception e) {
            dspl.setText("Error");
        } 
            
    }

    @FXML
    private void four(ActionEvent event) 
    {
        appendNumber("4");
    }

    @FXML
    private void minus(ActionEvent event) 
    {
        firstNum = Double.parseDouble(dspl.getText());
        operator = "-";
        startNew = true;
    }

    @FXML
    private void multi(ActionEvent event)
    {
        firstNum = Double.parseDouble(dspl.getText());
        operator = "*";
        startNew = true;
    }

    @FXML
    private void eight(ActionEvent event)
    {
        appendNumber("4");
    }

    @FXML
    private void plus(ActionEvent event)
    {
        firstNum = Double.parseDouble(dspl.getText());
        operator = "+";
        startNew = true;
    }

    @FXML
    private void divide(ActionEvent event) 
    {
        firstNum = Double.parseDouble(dspl.getText());
        operator = "/";
        startNew = true;
    }
    
}
