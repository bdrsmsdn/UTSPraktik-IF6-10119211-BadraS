package com.programmer.utspraktik_if6_10119211_badras;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

//nim : 10119211
//nama : Badra Samsudin Ramdan Nugraha
//Kelas : IF6
public class MainActivity extends AppCompatActivity {
    public static final String Extra_NAMA = "com.programmer.utspraktik_if6_10119211_badras.NAMA";
    public static final String Extra_nik = "com.programmer.utspraktik_if6_10119211_badras.nik";
    public static final String Extra_tgl = "com.programmer.utspraktik_if6_10119211_badras.tgl";
    public static final String Extra_tgl2 = "com.programmer.utspraktik_if6_10119211_badras.tgl2";
    public static final String Extra_jk = "com.programmer.utspraktik_if6_10119211_badras.jk";
    public static final String Extra_hub = "com.programmer.utspraktik_if6_10119211_badras.hub";
    public static final String Extra_status = "com.programmer.utspraktik_if6_10119211_badras.status";
    public static final String ExtraTes = "com.programmer.utspraktik_if6_10119211_badras.opsiTes";

    EditText date, date2;
    DatePickerDialog datePickerDialog;
    String status = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent2=getIntent();
        status = intent2.getStringExtra(Extra_status);

        RadioGroup rdTes = (RadioGroup) findViewById(R.id.opsiTes);
        RadioGroup radioSexGroup = (RadioGroup) findViewById(R.id.opsiJK);
        RadioGroup radioHub = (RadioGroup) findViewById(R.id.opsi);
        EditText edtNik = findViewById(R.id.edt_nik);
        EditText  edtNama = findViewById(R.id.edt_nama);
        Button btn_lanjut = findViewById(R.id.btn_lanjut);


        date = (EditText) findViewById(R.id.edt_tgl);
        date2 = (EditText) findViewById(R.id.edt_tgl2);

        if (status != ""){
            String nik = intent2.getStringExtra(MainActivity.Extra_nik);
            String nama = intent2.getStringExtra(MainActivity.Extra_NAMA);
            String tgl = intent2.getStringExtra(MainActivity.Extra_tgl);
            String tgl2 = intent2.getStringExtra(MainActivity.Extra_tgl2);
            String jk = intent2.getStringExtra(MainActivity.Extra_jk);
            String hub = intent2.getStringExtra(MainActivity.Extra_hub);
            String tes = intent2.getStringExtra(MainActivity.ExtraTes);

            edtNik.setText(nik);
            edtNama.setText(nama);
            date.setText(tgl);
            date2.setText(tgl2);

            if (jk == "Perempuan"){
                radioSexGroup.check(R.id.jk_p);
            }else if(jk == "Laki - laki"){
                radioSexGroup.check(R.id.jk_l);
            }

            if (tes == "Rapid Antigen"){
                rdTes.check(R.id.j_t);
            }else if(tes == "PCR"){
                rdTes.check(R.id.j_t2);
            }

            if (hub == "Orang Tua"){
                radioHub.check(R.id.hbg_ort);
            }else if (hub == "Suami / Istri"){
                radioHub.check(R.id.hbg_coup);
            }else if (hub == "Anak"){
                radioHub.check(R.id.hbg_ank);
            }else if(hub == "Kerabat Lainnya"){
                radioHub.check(R.id.hbg_krbt);
            }
        }


        // perform click event on edit text
        date2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calender class's instance and get current date , month and year from calender
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                String bulan = "";
                                if ((monthOfYear+1) == 1){
                                    bulan= "January";
                                }if ((monthOfYear+1) == 2){
                                    bulan= "February";
                                }if ((monthOfYear+1) == 3){
                                    bulan= "Maret";
                                }if ((monthOfYear+1) == 4){
                                    bulan= "April";
                                }if ((monthOfYear+1) == 5){
                                    bulan= "Mei";
                                }if ((monthOfYear+1) == 6){
                                    bulan= "Juni";
                                }if ((monthOfYear+1) == 7){
                                    bulan= "July";
                                }if ((monthOfYear+1) == 8){
                                    bulan= "Agustus";
                                }if ((monthOfYear+1) == 9){
                                    bulan= "September";
                                }if ((monthOfYear+1) == 10){
                                    bulan= "Oktober";
                                }if ((monthOfYear+1) == 11){
                                    bulan= "November";
                                }if ((monthOfYear+1) == 12){
                                    bulan= "Desember";
                                }
                                date2.setText(dayOfMonth + "  "
                                        + bulan + "  " + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        // perform click event on edit text
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calender class's instance and get current date , month and year from calender
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                String bulan = "";
                                if ((monthOfYear+1) == 1){
                                    bulan= "January";
                                }if ((monthOfYear+1) == 2){
                                    bulan= "February";
                                }if ((monthOfYear+1) == 3){
                                    bulan= "Maret";
                                }if ((monthOfYear+1) == 4){
                                    bulan= "April";
                                }if ((monthOfYear+1) == 5){
                                    bulan= "Mei";
                                }if ((monthOfYear+1) == 6){
                                    bulan= "Juni";
                                }if ((monthOfYear+1) == 7){
                                    bulan= "July";
                                }if ((monthOfYear+1) == 8){
                                    bulan= "Agustus";
                                }if ((monthOfYear+1) == 9){
                                    bulan= "September";
                                }if ((monthOfYear+1) == 10){
                                    bulan= "Oktober";
                                }if ((monthOfYear+1) == 11){
                                    bulan= "November";
                                }if ((monthOfYear+1) == 12){
                                    bulan= "Desember";
                                }
                                date.setText(dayOfMonth + "  "
                                        + bulan + "  " + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        Intent intent = new Intent(this, com.programmer.utspraktik_if6_10119211_badras.Konfirmasi.class);
        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nik = edtNik.getText().toString();
                String nama = edtNama.getText().toString();
                String tgl = date.getText().toString();
                int selectedId = radioSexGroup.getCheckedRadioButtonId();
                RadioButton radioSexButton = (RadioButton) findViewById(selectedId);

                int selectedId2 = radioHub.getCheckedRadioButtonId();
                RadioButton radiohubButton = (RadioButton) findViewById(selectedId2);
                intent.putExtra(Extra_nik,nik);
                intent.putExtra(Extra_NAMA,nama);
                intent.putExtra(Extra_tgl,tgl);
                intent.putExtra(Extra_jk,radioSexButton.getText());
                intent.putExtra(Extra_hub,radiohubButton.getText());
                startActivity(intent);
            }
        });

    }
}