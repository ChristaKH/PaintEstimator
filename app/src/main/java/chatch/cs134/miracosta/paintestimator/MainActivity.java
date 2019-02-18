package chatch.cs134.miracosta.paintestimator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText lengthEditText;
    EditText widthEditText;
    EditText heightEditText;
    EditText doorsEditText;
    EditText windowsEditText;

    Button computeButton;
    Button helpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lengthEditText = findViewById(R.id.lengthEditText);
        widthEditText = findViewById(R.id.widthEditText);
        heightEditText = findViewById(R.id.heightEditText);
        doorsEditText = findViewById(R.id.doorsEditText);
        windowsEditText = findViewById(R.id.windowsEditText);

        computeButton = findViewById(R.id.computeButton);
        helpButton = findViewById(R.id.helpButton);
    }
}
