package com.example.thilanka1.basiccalculatorexample;
// Thilanka Munasinghe.
// thilankawillbe@gmail.com
// 11th April 2017.
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Now create two reference variables with the EditText type.
    EditText FirstNumber; // reference variable for the first number.
    EditText SecondNumber; // reference vairable for the second number.

    // Now create a variable for the Total, that has the type of EditText
    EditText TotalNumber;  // reference vairable for the total.


    // Now create a button variable for the
    Button buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Now add the "findViewByID methods inside the "onCreate" method.

        FirstNumber = (EditText) findViewById(R.id.FirstNumbereditText);
        SecondNumber = (EditText) findViewById(R.id.SecondNumbereditText2);
        buttonAdd = (Button) findViewById(R.id.AddNumbersbutton);
        TotalNumber = (EditText) findViewById(R.id.TotalNumbereditText5);
    }

    public void onAddMethod(View view) {
        // Now declare two integer variables inside the "onAddMethod"
        double num1;
        double num2;

        num1 = Double.parseDouble(FirstNumber.getText().toString());
        num2 = Double.parseDouble(SecondNumber.getText().toString());
        // now declare a refernced variable called "sum" and add the first and second number;
        double customTipValue = (num1*(num2/100));
        TotalNumber.setText(String.format("%.2f",customTipValue)); // format "%.2f"  is for 2 decimal points.


    }



    public void onClickFivePercentMethod(View view) {
        double num1;
        double fivePercentTipValue;
        num1 = Double.parseDouble(FirstNumber.getText().toString());

        fivePercentTipValue = (num1*(0.05));
        TotalNumber.setText(String.format("%.2f",fivePercentTipValue));
    }

    public void onClickTenPercentMethod(View view) {

        double num1;
        double tenPercentTipValue;
        num1 = Double.parseDouble(FirstNumber.getText().toString());

        tenPercentTipValue = (num1*(0.10));
        TotalNumber.setText(String.format("%.2f",tenPercentTipValue));



    }

    public void onClickFifteenPercentMethod(View view) {

        double num1;
        double fifteenPercentTipValue;
        num1 = Double.parseDouble(FirstNumber.getText().toString());

        fifteenPercentTipValue = (num1*(0.15));
        TotalNumber.setText(String.format("%.2f",fifteenPercentTipValue));
    }
}
