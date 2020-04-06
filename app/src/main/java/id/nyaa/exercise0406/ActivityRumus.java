package id.nyaa.exercise0406;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
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

    private EditText data1;
    private TextView result;

    private String data;
    private double nilai;

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

        data1 = (EditText) findViewById(R.id.inputA);
        result = (TextView) findViewById(R.id.hRumus);

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

    public void hitungB(View view) {
        int id = getIntent().getIntExtra("id", 0);
        data = data1.getText().toString();
        nilai = Double.parseDouble(data);
        switch (id) {
            case 0:
                lPersegi();
                break;
            case 1:
                kPersegi();
                break;
            case 2:
                lLingkaran();
                break;
            case 3:
                kLingkaran();
                break;
        }
    }

    public void kPersegi() {
        double kP = nilai * 4;
        String text = "Keliling Persegi dengan sisi: ";
        String aText = ", adalah: ";
        String output = text + nilai + aText + kP;
        result.setText(output);
    }

    public  void lPersegi() {
        double lP = nilai * nilai;
        String text = "Luas Persegi dengan sisi: ";
        String aText = ", adalah: ";
        String output = text + nilai + aText + lP;
        result.setText(output);
    }

    public  void kLingkaran() {
        double kL = 2 * 3.14 * nilai;
        String text = "Keliling lingkaran dengan jari - jari: ";
        String aText = ", adalah: ";
        String output = text + nilai + aText + kL;
        result.setText(output);
    }

    public void lLingkaran() {
        double kL = 3.14 * nilai * nilai;
        String text = "Luas lingkaran dengan jari - jari: ";
        String aText = ", adalah: ";
        String output = text + nilai + aText + kL;
        result.setText(output);
    }
}
