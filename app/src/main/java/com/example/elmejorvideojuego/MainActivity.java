package com.example.elmejorvideojuego;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, CheckBox.OnCheckedChangeListener {

    private TextView message;
    private CheckBox checkBox;
    private RadioButton radioFallout, radioLol, radioFortnite, radioTf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los elementos del layout
        message = findViewById(R.id.message);
        checkBox = findViewById(R.id.checkBox);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioFallout = findViewById(R.id.radioFallout);
        radioLol = findViewById(R.id.radioLol);
        radioFortnite = findViewById(R.id.radioFortnite);
        radioTf2 = findViewById(R.id.radioTf2);

        radioGroup.setOnCheckedChangeListener(this);
        checkBox.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        // Mostrar el mensaje "Veo que te gusta el..."
        message.setText(getString(R.string.veo_message));
    }

    @Override
    public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
        // Cambiar el mensaje basado en el estado del CheckBox
        if (isChecked) {
            message.setText(getString(R.string.checkbox_checked_message));
        } else {
            message.setText(getString(R.string.checkbox_unchecked_message));
        }
    }
}
