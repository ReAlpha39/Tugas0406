package id.nyaa.exercise0406;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
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

    private EditText data1;
    private EditText data2;
    private TextView result;

    private String sDataA;
    private String sDataB;
    private double nilaiA;
    private double nilaiB;

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

        data1 = (EditText) findViewById(R.id.inputA);
        data2 = (EditText) findViewById(R.id.inputB);
        result = (TextView) findViewById(R.id.hRumus);

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

    public void hitungB(View view) {
        int id = getIntent().getIntExtra("id", 0);
        sDataA = data1.getText().toString();
        sDataB = data2.getText().toString();
        nilaiA = Double.parseDouble(sDataA);
        nilaiB = Double.parseDouble(sDataB);
        switch (id) {
            case 4:
                lPersegiP();
                break;
            case 5:
                kPersegiP();
                break;
            case 6:
                lSegitiga();
                break;
        }
    }

    public void lPersegiP() {
        double lPP = nilaiA * nilaiB;
        String text = "Luas persegi panjang dengan panjang: ";
        String aText = " dan lebar: ";
        String bText = ", adalah: ";
        String output = text + nilaiA + aText + nilaiB + bText + lPP;
        result.setText(output);
    }

    public void kPersegiP() {
        double kPP = (2 * nilaiA) + (2 * nilaiB);
        String text = "Keliling persegi panjang dengan panjang: ";
        String aText = " dan lebar: ";
        String bText = ", adalah: ";
        String output = text + nilaiA + aText + nilaiB + bText + kPP;
        result.setText(output);
    }

    public void lSegitiga() {
        double lS = nilaiA * nilaiB / 2;
        String text = "Luas segitiga dengan alas: ";
        String aText = " dan tinggi: ";
        String bText = ", adalah: ";
        String output = text + nilaiA + aText + nilaiB + bText + lS;
        result.setText(output);
    }
}
