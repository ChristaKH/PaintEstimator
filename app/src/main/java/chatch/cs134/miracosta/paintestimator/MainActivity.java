package chatch.cs134.miracosta.paintestimator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import chatch.cs134.miracosta.paintestimator.Model.InteriorRoom;

public class MainActivity extends AppCompatActivity
{
    EditText lengthEditText;
    EditText widthEditText;
    EditText heightEditText;
    EditText doorsEditText;
    EditText windowsEditText;

    Button computeButton;
    Button helpButton;

    TextView interiorSurfaceAreaTextView;
    InteriorRoom room;
    //DecimalFormat myFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect and set everything up
        lengthEditText = findViewById(R.id.lengthEditText);
        widthEditText = findViewById(R.id.widthEditText);
        heightEditText = findViewById(R.id.heightEditText);
        doorsEditText = findViewById(R.id.doorsEditText);
        windowsEditText = findViewById(R.id.windowsEditText);

        computeButton = findViewById(R.id.computeButton);
        helpButton = findViewById(R.id.helpButton);
        interiorSurfaceAreaTextView = findViewById(R.id.interiorSurfaceAreaTextView);

        interiorSurfaceAreaTextView.setText("");

        room = new InteriorRoom(0,0,0,0,0);
        //myFormat = new DecimalFormat("#.#0");
    }

    public void computeOnClick(View v)
    {
        int length = Integer.parseInt(lengthEditText.getText().toString());
        int width = Integer.parseInt(widthEditText.getText().toString());
        int height = Integer.parseInt(heightEditText.getText().toString());
        int doors = Integer.parseInt(doorsEditText.getText().toString());
        int windows = Integer.parseInt(windowsEditText.getText().toString());

        room.setLength(length);
        room.setWidth(width);
        room.setHeight(height);
        room.setDoors(doors);
        room.setWindows(windows);


        // Display interior surface area
        String textView = "Interior surface area: " + room.wallSurfaceArea();
        textView += "\nGallons needed: " + room.gallonsOfPaintRequired();
        interiorSurfaceAreaTextView.setText(textView);
    }

    public void helpOnClick(View v)
    {
        Intent helpIntent = new Intent(this, HelpActivity.class);
        helpIntent.putExtra("gallons", room.gallonsOfPaintRequired());
        startActivity(helpIntent);
    }
}
