package com.mdhasan.bmicalculator;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javax.swing.plaf.synth.SynthLookAndFeel;

public class FXMLController implements Initializable {
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML
    private ToggleGroup G;

    @FXML
    private Label label;

    @FXML
    private JFXTextField inch;

    @FXML
    private JFXTextField kg;

    @FXML
    private JFXTextField age;

    @FXML
    private JFXTextField foot;
    
     @FXML
    private RadioButton female;

    @FXML
    private RadioButton male;
    


    @FXML
    void calculate(ActionEvent event) {
        
            String Age=age.getText();
            String Foot=foot.getText();
            String Inch=inch.getText();
            String Weight=kg.getText();
            
            double myFoot=Double.parseDouble(Foot);
            double myInch = Double.parseDouble(Inch);
            double myWeight=Double.parseDouble(Weight);
            
            double myHeight=(myFoot*12)+myInch;
            myHeight=(myHeight*0.0254);

            myHeight=myHeight*myHeight;
 
            
            bmiResult result=new bmiResult();

            
            String myResult=result.mbiCalculate(myWeight,myHeight);
            
            
            if (male.isSelected()) {
            
              label.setText("You are "+Age+" years old Male\n You are "+myResult);
              label.setStyle("-fx-background-color: #36abff;");
              
            }
            if (female.isSelected()) {
            
                 label.setText("You are "+Age+" years old female\n"+myResult);
                 label.setStyle("-fx-background-color: #ff01d4;");
            
            }
    }
     @FXML
    void reset(ActionEvent event) {
        
        age.clear();
        foot.clear();
        inch.clear();
        kg.clear();
        label.setStyle("-fx-background-color: #ffffff;");
        label.setText("");

    }
}
