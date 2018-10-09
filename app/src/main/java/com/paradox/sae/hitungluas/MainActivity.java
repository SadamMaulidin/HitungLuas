package com.paradox.sae.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //membuat variable global
    TextView txtJdl;
    Button btnStart;
    EditText edtText;
    EditText edtPanjang;
    EditText edtLebar;
    TextView txtHasil;

    //memuat variable global untuk menghitung luas
    Integer panjang, lebar, hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisiasi widget ke dalam java agar dapat digunakan
        txtJdl = findViewById(R.id.txtJudul);
        btnStart = findViewById(R.id.btnStart);
        edtText = findViewById(R.id.edtText);

        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        txtHasil = findViewById(R.id.txtHasil);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung();

            }
        });
    }

    public void hitung(){
        //memasukkan input nama dari user ke dalam variable
        String isiEditText = edtText.getText().toString();

        //memasukka input panjang dan lebar dari user ke dalam variable
        panjang = Integer.valueOf(edtPanjang.getText().toString());
        lebar = Integer.valueOf(edtLebar.getText().toString());

        //menghitung luas persegi panjang
        hasil = panjang * lebar;

        //cetak hasil
        txtHasil.setText("Holla " + isiEditText + " Hasil luasnya adalah " + hasil);
    }
}
