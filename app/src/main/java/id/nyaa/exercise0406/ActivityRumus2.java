package id.nyaa.exercise0406;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityRumus2 extends AppCompatActivity {

    private ImageView imageView;
    private MenuItem item;
    private TextView judul;
    private TextView tipeA;
    private TextView tipeB;
    private TextView tipeBT;

    private String judulS;
    private String tipeAS;
    private String tipeBS;
    private String tipeBTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus2);

        buildActivity();
    }

    public void buildActivity() {

        int id = getIntent().getIntExtra("id", 0);

        imageView = (ImageView) findViewById(R.id.pRumus);
        judul = (TextView) findViewById(R.id.inputJudul);
        tipeA = (TextView) findViewById(R.id.tipeA);
        tipeB = (TextView) findViewById(R.id.tipeB);
        tipeBT = (TextView) findViewById(R.id.tipeBT);

        switch (id) {
            case 4:
                imageView.setBackgroundResource(R.drawable.persegi_panjang);
                judulS = "Luas Persegi Panjang";
                tipeAS = "panjang";
                tipeBS = "lebar";
                tipeBTS = "Hitung Luas";
                break;
            case 5:
                imageView.setBackgroundResource(R.drawable.persegi_panjang);
                judulS = "Keliling Persegi Panjang";
                tipeAS = "panjang";
                tipeBS = "lebar";
                tipeBTS = "Hitung Keliling";
                break;
            case 6:
                imageView.setBackgroundResource(R.drawable.segitiga);
                judulS = "Luas Segitiga";
                tipeAS = "alas";
                tipeBS = "tinggi";
                tipeBTS = "Hitung Luas";
                break;

        }
        build();
    }

    public void build() {
        judul.setText(judulS);
        tipeA.setText(tipeAS);
        tipeB.setText(tipeBS);
        tipeBT.setText(tipeBTS);
    }
}
