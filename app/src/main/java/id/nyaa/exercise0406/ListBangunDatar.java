package id.nyaa.exercise0406;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListBangunDatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bangun_datar);
    }

    public void logOut(View view) {

        startActivity(new Intent(this, MainActivity.class));
    }

    public void persegiC(View view) {

        startActivity(new Intent(this, ActivityRumus.class));
    }
}
