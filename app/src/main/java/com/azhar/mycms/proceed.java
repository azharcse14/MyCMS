package com.azhar.mycms;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;


public class proceed extends AppCompatActivity {
    ToggleButton wifitoggle;
    CheckBox brcheckbox;
    Button b;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.proceed_main);


        brcheckbox = (CheckBox) findViewById(R.id.brcheckbox);
        b = (Button) findViewById(R.id.button4);


        brcheckbox.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (brcheckbox.isChecked()) {
                    // Switch On Broadcast Receiver
                    PackageManager pm = proceed.this.getPackageManager();
                    ComponentName componentName = new ComponentName(
                            proceed.this, BroadcastManager.class);
                    pm.setComponentEnabledSetting(componentName,
                            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                            PackageManager.DONT_KILL_APP);




                } else {
                    // Switch Off Broadcast Receiver
                    PackageManager pm = proceed.this.getPackageManager();
                    ComponentName componentName = new ComponentName(
                            proceed.this, BroadcastManager.class);
                    pm.setComponentEnabledSetting(componentName,
                            PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                            PackageManager.DONT_KILL_APP);


                }
            }
        });
// Capture CheckBox clicks
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(proceed.this, MainActivity.class);
                //String message = .getText().toString();
                startActivity(intent);

            }
        });


    }

}


