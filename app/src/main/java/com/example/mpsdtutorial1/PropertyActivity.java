package com.example.mpsdtutorial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PropertyActivity extends AppCompatActivity {

    TextView propertyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);

        propertyTextView = findViewById(R.id.property_details);

        String[] detail = Property.getPropertyDetails();

        for(String details : detail){
            propertyTextView.append(details + "\n\n\n");
        }
    }
}
