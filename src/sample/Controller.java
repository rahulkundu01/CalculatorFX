package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public int a,b,c;

    public TextField txtVal1, txtVal2;
    public Button btnAdd,btnSub,btnMul,btnDiv;
    public Label lblResult;





      public void addition(){

          a =Integer.parseInt(txtVal1.getText());
          b = Integer.parseInt(txtVal2.getText());
          c = a + b;
          lblResult.setText("Add: " +c);

      }

      public void substraction(){

          a =Integer.parseInt(txtVal1.getText());
          b = Integer.parseInt(txtVal2.getText());
          c = a - b;
          lblResult.setText("Sub: "+c);

      }

      public void multiplication(){
          a =Integer.parseInt(txtVal1.getText());
          b = Integer.parseInt(txtVal2.getText());
          c = a * b;
          lblResult.setText("Mul: " +c);

      }

      public void division(){
          a =Integer.parseInt(txtVal1.getText());
          b = Integer.parseInt(txtVal2.getText());
          c = a / b;
          lblResult.setText("Div: " +c);

      }




}
