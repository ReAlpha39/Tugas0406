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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bangun_datar);
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

    @Override
    public boolean onMenuItemClick(MenuItem item) {

        startActivity(new Intent(this, MainActivity.class));
        return true;
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
