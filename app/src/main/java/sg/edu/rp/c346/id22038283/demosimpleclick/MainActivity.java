package sg.edu.rp.c346.id22038283.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        rgGender = findViewById(R.id.Gender);
        tbtn = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String said = ""
                        ;                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale) {
                    said = "He said ";
                } else {
                    said = "She said ";
                }




                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(said + stringResponse);
                Toast.makeText(MainActivity.this, "The button has been clicked", Toast.LENGTH_SHORT).show();
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbtn.isChecked()) {
                    etInput.setEnabled(false);
                }
                else {
                    etInput.setEnabled(true);
                }
            }
        });






    }
}