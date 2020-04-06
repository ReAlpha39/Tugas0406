package id.nyaa.exercise0406;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
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

    private EditText data1;
    private EditText data2;
    private EditText data3;
    private TextView result;

    private String sDataA;
    private String sDataB;
    private String sDataC;
    private double nilaiA;
    private double nilaiB;
    private double nilaiC;

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

        data1 = (EditText) findViewById(R.id.inputA);
        data2 = (EditText) findViewById(R.id.inputB);
        data3 = (EditText) findViewById(R.id.inputC);
        result = (TextView) findViewById(R.id.hRumus);

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

    public void hitungB(View view) {
        int id = getIntent().getIntExtra("id", 0);
        sDataA = data1.getText().toString();
        sDataB = data2.getText().toString();
        sDataC = data3.getText().toString();
        nilaiA = Double.parseDouble(sDataA);
        nilaiB = Double.parseDouble(sDataB);
        nilaiC = Double.parseDouble(sDataC);
        switch (id) {
            case 7:
                kSegitiga();
                break;
            case 8:
                lTrapesium();
                break;
            case 9:
                kTrapesium();
                break;
        }
    }

    public void kSegitiga() {
        double kS = nilaiA + nilaiB + nilaiC;
        String text = "Keliling segitiga dengan alas: ";
        String aText = ", tinggi: ";
        String bText = ", dan miring: ";
        String cText = " adalah: ";
        String output = text + nilaiA + aText + nilaiB + bText + nilaiC + cText + kS;
        result.setText(output);
    }

    public void lTrapesium() {
        double lT = 0.5 * (nilaiA + nilaiB) * nilaiC;
        String text = "Luas trapesium dengan panjang AB: ";
        String aText = ", panjang EF: ";
        String bText = ", dan tinggi t: ";
        String cText = " adalah: ";
        String output = text + nilaiA + aText + nilaiB + bText + nilaiC + cText + lT;
        result.setText(output);
    }

    public void kTrapesium() {
        double kT = nilaiA + nilaiA + 2*(nilaiC);
        String text = "Keliling trapesium dengan panjang AB: ";
        String aText = ", panjang EF: ";
        String bText = ", dan panjang AE: ";
        String cText = " adalah: ";
        String output = text + nilaiA + aText + nilaiB + bText + nilaiC + cText + kT;
        result.setText(output);
    }
}
