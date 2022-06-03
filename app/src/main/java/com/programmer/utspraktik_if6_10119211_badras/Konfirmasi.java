package com.programmer.utspraktik_if6_10119211_badras;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//nim : 10119211
//nama : Badra Samsudin Ramdan Nugraha
//Kelas : IF6
public class Konfirmasi extends AppCompatActivity {
    public static final String Extra_NAMA = "com.programmer.utspraktik_if6_10119211_badras.NAMA";
    public static final String Extra_nik = "com.programmer.utspraktik_if6_10119211_badras.nik";
    public static final String Extra_tgl = "com.programmer.utspraktik_if6_10119211_badras.tgl";
    public static final String Extra_tgl2 = "com.programmer.utspraktik_if6_10119211_badras.tgl2";
    public static final String Extra_jk = "com.programmer.utspraktik_if6_10119211_badras.jk";
    public static final String Extra_hub = "com.programmer.utspraktik_if6_10119211_badras.hub";
    public static final String Extra_status = "com.programmer.utspraktik_if6_10119211_badras.status";
    public static final String ExtraTes = "com.programmer.utspraktik_if6_10119211_badras.opsiTes";

    private Dialog customDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);

        Intent intent = getIntent();
        Intent intent2 = new Intent(this,MainActivity.class);

        String nik = intent2.getStringExtra(MainActivity.Extra_nik);
        String nama = intent2.getStringExtra(MainActivity.Extra_NAMA);
        String tgl = intent2.getStringExtra(MainActivity.Extra_tgl);
        String tgl2 = intent2.getStringExtra(MainActivity.Extra_tgl2);
        String jk = intent2.getStringExtra(MainActivity.Extra_jk);
        String hub = intent2.getStringExtra(MainActivity.Extra_hub);
        String tes = intent2.getStringExtra(MainActivity.ExtraTes);

        TextView tvNik = findViewById(R.id.j_nik);
        TextView tvNama = findViewById(R.id.j_nama);
        TextView tvTgl = findViewById(R.id.j_tgl);
        TextView tvHub = findViewById(R.id.j_hub);
        TextView tvJk = findViewById(R.id.j_jk);
        TextView tvTgl2 = findViewById(R.id.j_tgl2);
        TextView tvTes = findViewById(R.id.j_tes);
        Button btn_simpan= findViewById(R.id.btn_simpan);
        Button btn_ubah= findViewById(R.id.btn_ubah);



        tvNik.setText(nik);
        tvNama.setText(nama);
        tvTgl.setText(tgl);
        tvJk.setText(jk);
        tvTes.setText(tes);
        tvHub.setText(hub);
        initCustomDialog();
        tvTgl2.setText(tgl2);
        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog.show();
            }
        });

        btn_ubah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent2.putExtra(Extra_status,"ubah");
                intent2.putExtra(Extra_nik,nik);
                intent2.putExtra(Extra_NAMA,nama);
                intent2.putExtra(Extra_tgl,tgl);
                intent2.putExtra(Extra_jk,jk);
                intent2.putExtra(Extra_hub,hub);
                intent2.putExtra(Extra_tgl2,tgl2);
                intent2.putExtra(ExtraTes,tes);
//                if (hub == "Orang Tua"){
//                    intent2.putExtra(Extra_hub,"hbg_ort");
//                }

                startActivity(intent2);
            }
        });
    }

    private void initCustomDialog(){

        customDialog = new Dialog(Konfirmasi.this);
        customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        customDialog.setContentView(R.layout.dialog_simpan);
        customDialog.setCancelable(true);



        Button btnok = customDialog.findViewById(R.id.btn_ok);
         btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                customDialog.dismiss();
            }
        });
    }
}