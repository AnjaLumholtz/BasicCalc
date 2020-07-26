package example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text, text2;
    int numOne, numTwo;
    int result;
    TextView returnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        returnResult = (TextView) findViewById(R.id.result);
        text = (EditText) findViewById(R.id.editTextNumber);
        text2 = (EditText) findViewById(R.id.editTextNumber2);

        Button button = (Button) findViewById(R.id.calcBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numOne = Integer.valueOf(text.getText().toString());
                numTwo = Integer.valueOf(text2.getText().toString());

                result = numOne + numTwo;

                returnResult.setText(String.valueOf(result));
            }
        });
    }
}