package id.nyaa.exercise0406;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityRumus3 extends AppCompatActivity {

    private ImageView imageView;
    private MenuItem item;
    private TextView judul;
    private TextView tipeA;
    private TextView tipeB;
    private TextView tipeC;
    private TextView tipeBT;

    private String judulS;
    private String tipeAS;
    private String tipeBS;
    private String tipeCS;
    private String tipeBTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus3);

        buildActivity();
    }

    public void buildActivity() {

        int id = getIntent().getIntExtra("id", 0);

        imageView = (ImageView) findViewById(R.id.pRumus);
        judul = (TextView) findViewById(R.id.inputJudul);
        tipeA = (TextView) findViewById(R.id.tipeA);
        tipeB = (TextView) findViewById(R.id.tipeB);
        tipeC = (TextView) findViewById(R.id.tipeC);
        tipeBT = (TextView) findViewById(R.id.tipeBT);

        switch (id) {
            case 7:
                imageView.setBackgroundResource(R.drawable.segitiga);
                judulS = "Keliling Segitiga";
                tipeAS = "alas";
                tipeBS = "tinggi";
                tipeCS = "miring";
                tipeBTS = "Hitung Keliling";
                break;
            case 8:
                imageView.setBackgroundResource(R.drawable.trapesium);
                imageView.getLayoutParams().height = 500;
                judulS = "Luas Trapesium";
                tipeAS = "panjang AB";
                tipeBS = "panjang EF";
                tipeCS = "panjang t";
                tipeBTS = "Hitung Luas";
                break;
            case 9:
                imageView.setBackgroundResource(R.drawable.trapesium);
                imageView.getLayoutParams().height = 500;
                judulS = "Keliling Trapesium";
                tipeAS = "panjang AB";
                tipeBS = "panjang EF";
                tipeCS = "panjang AE";
                tipeBTS = "Hitung Keliling";
                break;

        }
        build();
    }

    public void build() {
        judul.setText(judulS);
        tipeA.setText(tipeAS);
        tipeB.setText(tipeBS);
        tipeC.setText(tipeCS);
        tipeBT.setText(tipeBTS);
    }
}
