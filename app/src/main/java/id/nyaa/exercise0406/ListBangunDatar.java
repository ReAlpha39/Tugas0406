package id.nyaa.exercise0406;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;

public class ListBangunDatar extends AppCompatActivity implements OnMenuItemClickListener {

    private Button persegi;
    public int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bangun_datar);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.persegiLuas:
                id = 0;
                ac1();
                break;
            case R.id.persegiKeliling:
                id = 1;
                ac1();
                break;
            case R.id.lingkaranLuas:
                id = 2;
                ac1();
                break;
            case R.id.lingkaranKeliling:
                id = 3;
                ac1();
                break;
            case R.id.persegiPLuas:
                id = 4;
                ac2();
                break;
            case R.id.persegiPKeliling:
                id = 5;
                ac2();
                break;
            case R.id.segitigaLuas:
                id = 6;
                ac2();
                break;
            case R.id.segitigaKeliling:
                id = 7;
                ac3();
                break;
            case R.id.trapesiumLuas:
                id = 8;
                ac3();
                break;
            case R.id.trapesiumKeliling:
                id = 9;
                ac3();
                break;
        }
        return true;
    }

    public void ac1() {
        Intent intent = new Intent(this, ActivityRumus.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }

    public void ac2() {
        Intent intent = new Intent(this, ActivityRumus2.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }

    public void ac3() {
        Intent intent = new Intent(this, ActivityRumus3.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }

    public void logOut(View view) {

        startActivity(new Intent(this, MainActivity.class));
    }

    public void persegiC(View view) {

        PopupMenu ppMenuP = new PopupMenu(ListBangunDatar.this, view);
        ppMenuP.setOnMenuItemClickListener(ListBangunDatar.this);
        ppMenuP.inflate(R.menu.popup_persegi);
        ppMenuP.show();
    }

    public void lingkaranC(View view) {
        PopupMenu ppMenuP = new PopupMenu(ListBangunDatar.this, view);
        ppMenuP.setOnMenuItemClickListener(ListBangunDatar.this);
        ppMenuP.inflate(R.menu.popup_lingkaran);
        ppMenuP.show();
    }

    public void persegiPC(View view) {
        PopupMenu ppMenuP = new PopupMenu(ListBangunDatar.this, view);
        ppMenuP.setOnMenuItemClickListener(ListBangunDatar.this);
        ppMenuP.inflate(R.menu.popup_persegi_panjang);
        ppMenuP.show();
    }

    public void segitigaC(View view) {
        PopupMenu ppMenuP = new PopupMenu(ListBangunDatar.this, view);
        ppMenuP.setOnMenuItemClickListener(ListBangunDatar.this);
        ppMenuP.inflate(R.menu.popup_segitiga);
        ppMenuP.show();
    }

    public void trapesiumC(View view) {
        PopupMenu ppMenuP = new PopupMenu(ListBangunDatar.this, view);
        ppMenuP.setOnMenuItemClickListener(ListBangunDatar.this);
        ppMenuP.inflate(R.menu.popup_trapesium);
        ppMenuP.show();
    }
}
