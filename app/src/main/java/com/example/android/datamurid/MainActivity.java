package com.example.android.datamurid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int ukuran = 35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayMessage("Sonny Susanto");
    }

    public void submitData(View view) {
        EditText inputNama = (EditText) findViewById(R.id.editTextNama);
        String nama = inputNama.getText().toString();

        EditText inputTelepon = (EditText) findViewById(R.id.editTextTelepon);
        String telepon = inputTelepon.getText().toString();

        RadioGroup jenisKelamin = (RadioGroup) findViewById(R.id.radioGroup_jenisKelamin);
        int pilihanJenisKelamin = jenisKelamin.getCheckedRadioButtonId();

        String radioButton_jenisKelamin = ((RadioButton) findViewById(pilihanJenisKelamin)).getText().toString();

        CheckBox membacaCheckBox = (CheckBox) findViewById(R.id.checkBox_membaca);
        boolean isMembaca = membacaCheckBox.isChecked();

        String dataAkhir = "Nama : " + nama + "\n";
        dataAkhir = dataAkhir + "No Telepon : " + telepon + "\n";
        dataAkhir = dataAkhir + "Jenis Kelamin : " + radioButton_jenisKelamin + "\n";
        dataAkhir = dataAkhir + "Ukuran Sepatu : " + ukuran + "\n";
        dataAkhir = dataAkhir + "Hobi Membaca : " + isMembaca;
        displayMessage(dataAkhir);
    }

    public void decrement(View view) {
        if (ukuran <= 20) {
            Toast.makeText(this, "Kekecilan oiyyy", Toast.LENGTH_SHORT).show();
            return;
        }
        ukuran = ukuran - 1;
        displaySepatu(ukuran);
    }

    public void increment(View view) {
        if (ukuran >= 46) {
            Toast.makeText(this, "Sepatunya jangan kegedean", Toast.LENGTH_SHORT).show();
            return;
        }
        ukuran = ukuran + 1;
        displaySepatu(ukuran);
    }

    private void displaySepatu(int ukuran) {
        TextView ukuranSepatuTextView = (TextView) findViewById(R.id.textView_sepatu);
        ukuranSepatuTextView.setText("" + ukuran);
    }

    private void displayMessage(String message) {
        TextView dataAkhirTextView = (TextView) findViewById(R.id.data_akhir_textview);
        dataAkhirTextView.setText(message);
    }

}
