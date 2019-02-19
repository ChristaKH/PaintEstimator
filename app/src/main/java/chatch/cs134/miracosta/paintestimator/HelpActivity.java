package chatch.cs134.miracosta.paintestimator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity
{
    TextView estimatedPaintTextView;
    Button inputDimensionsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        inputDimensionsButton = findViewById(R.id.inputDimensionsButton);
        estimatedPaintTextView = findViewById(R.id.estimatedPaintTextView);

        // Retrieve intent
        Intent mainIntent = getIntent();
        String gallons = mainIntent.getStringExtra("gallons");

        if(gallons == null)
        {
            gallons = "0.0";
        }
        String newMessage = "Estimated Paint Required: " + gallons + " gallons";
        estimatedPaintTextView.setText(newMessage);
    }

    public void inputDimensionsOnClick(View v)
    {
        Intent mainIntent = new Intent(this, MainActivity.class);
        startActivity(mainIntent);
    }
}
