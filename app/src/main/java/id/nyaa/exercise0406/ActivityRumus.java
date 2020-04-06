package id.nyaa.exercise0406;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityRumus extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus);

        imageView = (ImageView) findViewById(R.id.pRumus);
        imageView.setBackgroundResource(R.drawable.persegi);
    }

    public void hitungB(View view) {
    }
}
