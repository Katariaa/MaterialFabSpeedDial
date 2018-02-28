package io.github.kobakei.materialfabspeeddialexample;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.widget.TextView;
import android.widget.Toast;

import io.github.kobakei.materialfabspeeddial.FabSpeedDial;

public class VectorActivity extends AppCompatActivity {

    // You need this snippet for selector of vector drawables on Android 4.x
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector);

        final FabSpeedDial fab = findViewById(R.id.fab);
        fab.addOnMenuItemClickListener(new FabSpeedDial.OnMenuItemClickListener() {
            @Override
            public void onMenuItemClick(FloatingActionButton fab, TextView label, int itemId) {
                Toast.makeText(VectorActivity.this, "Click: " + itemId, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
