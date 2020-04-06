package id.nyaa.exercise0406;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityRumus extends AppCompatActivity {

    private ImageView imageView;
    private MenuItem item;
    private TextView judul;
    private TextView tipe;
    private TextView tipeB;

    private String judulS;
    private String tipeS;
    private String tipeBS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus);

        buildActivity();
    }

    public void buildActivity() {

        int id = getIntent().getIntExtra("id", 0);

        imageView = (ImageView) findViewById(R.id.pRumus);
        judul = (TextView) findViewById(R.id.inputJudul);
        tipe = (TextView) findViewById(R.id.tipe);
        tipeB = (TextView) findViewById(R.id.tipeB);

        switch (id) {
            case 0:
                imageView.setBackgroundResource(R.drawable.persegi);
                judulS = "Luas Persegi";
                tipeS = "Sisi";
                tipeBS = "Hitung Luas";
                break;
            case 1:
                imageView.setBackgroundResource(R.drawable.persegi);
                judulS = "Keliling Persegi";
                tipeS = "Sisi";
                tipeBS = "Hitung Keliling";
                break;
            case 2:
                imageView.setBackgroundResource(R.drawable.lingkaran);
                judulS = "Luas Lingkaran";
                tipeS = "Jari - Jari";
                tipeBS = "Hitung Luas";
                break;
            case 3:
                imageView.setBackgroundResource(R.drawable.lingkaran);
                judulS = "Keliling Lingkaran";
                tipeS = "Jari - Jari";
                tipeBS = "Hitung Keliling";
                break;

        }
        build();
    }

    public void build() {
        judul.setText(judulS);
        tipe.setText(tipeS);
        tipeB.setText(tipeBS);
    }

    public void buildLingkaran() {
        imageView.setBackgroundResource(R.drawable.lingkaran);
        judulS = "Luas Persegi";
        tipeS = "Sisi";
        tipeBS = "Hitung Luas";
        judul.setText(judulS);
        tipe.setText(tipeS);
        tipeB.setText(tipeBS);
    }

    public void hitungB(View view) {
    }
}
