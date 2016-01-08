package sidespell.tech.solarsystem.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import sidespell.tech.solarsystem.R;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView imageView;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        spinner = (Spinner) findViewById(R.id.spinner);
        imageView = (ImageView) findViewById(R.id.imageView);
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> planets = new ArrayList<String>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Pluto");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, planets);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

        if(item.equals("Mercury")){
            Drawable myDrawable = getResources().getDrawable(R.mipmap.mercury);
            imageView.setImageDrawable(myDrawable);
        }
        else if(item.equals("Venus")){
            Drawable myDrawable = getResources().getDrawable(R.mipmap.venus);
            imageView.setImageDrawable(myDrawable);
        }
        else if(item.equals("Earth")){
            Drawable myDrawable = getResources().getDrawable(R.mipmap.earth);
            imageView.setImageDrawable(myDrawable);
        }
        else if(item.equals("Mars")){
            Drawable myDrawable = getResources().getDrawable(R.mipmap.mars);
            imageView.setImageDrawable(myDrawable);
        }
        else if(item.equals("Jupiter")){
            Drawable myDrawable = getResources().getDrawable(R.mipmap.jupiter);
            imageView.setImageDrawable(myDrawable);
        }
        else if(item.equals("Saturn")){
            Drawable myDrawable = getResources().getDrawable(R.mipmap.saturn);
            imageView.setImageDrawable(myDrawable);
        }

        else if(item.equals("Uranus")){
            Drawable myDrawable = getResources().getDrawable(R.mipmap.uranus);
            imageView.setImageDrawable(myDrawable);
        }
        else if(item.equals("Neptune")){
            Drawable myDrawable = getResources().getDrawable(R.mipmap.neptune);
            imageView.setImageDrawable(myDrawable);
        }
        else {
            Drawable myDrawable = getResources().getDrawable(R.mipmap.pluto);
            imageView.setImageDrawable(myDrawable);
        }
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
