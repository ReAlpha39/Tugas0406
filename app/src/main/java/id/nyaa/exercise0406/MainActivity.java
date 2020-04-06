package id.nyaa.exercise0406;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String pass = "123";
    private String un = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signIn(View view) {

        EditText username = (EditText) findViewById(R.id.editUN);
        EditText passC = (EditText) findViewById(R.id.editPass);

        if (username.getText() != null && passC.getText() != null) {

            if (un.equals(username.getText().toString()) && pass.equals(passC.getText().toString())) {

                startActivity(new Intent(this, ListBangunDatar.class));
            } else {

                Toast.makeText(getApplicationContext(), "Password atau Username salah", Toast.LENGTH_LONG).show();
            }
        }
    }
}
