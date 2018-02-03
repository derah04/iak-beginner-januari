package id.igrwijaya.iakbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class JadwalActivity extends AppCompatActivity {

    // ini variable
    ListView listJadwal;

    //array list --> sebuah variable yang dimana valuenya bisa lebih dari 1
    List<String> arrayJadwal = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal);
        // connection to ui / xml
        listJadwal = (ListView) findViewById(R.id.listJadwal);
        //variable array;

        // mengambil variable pada saat intent
        String pilihanHari = getIntent().getStringExtra("pilihan_jadwal");
        String[] staticJadwalList;

        switch (pilihanHari) {
            case "SENIN":
                staticJadwalList = new String[]{
                        "Jadwal SENIN 1", //0
                        "Jadwal SENIN 2", //1
                        "Jadwal SENIN 3", //2
                        "Jadwal SENIN 4", //3
                        "Jadwal SENIN 5" //4
                };
                break;
            case "SELASA":
                staticJadwalList = new String[]{
                        "Jadwal SELASA 1", //0
                        "Jadwal SELASA 2", //1
                        "Jadwal SELASA 3", //2
                        "Jadwal SELASA 4", //3
                        "Jadwal SELASA 5" //4
                };
                break;
            default:
                staticJadwalList = new String[]{
                        "Jadwal Tidak Ditemukan", //0
                };
                break;
        }

        //looping / perulangan
        // index dimulai dari 0
        for (int i = 0; i < staticJadwalList.length; i++)
        {
            // staticBookTitle[i] --> mengambil nilai sesuai dengan no urut valuenya
            arrayJadwal.add(staticJadwalList[i]);
        }

        ArrayAdapter<String> adapter  = new ArrayAdapter<String>
                (
                        this,android.R.layout.simple_list_item_1, arrayJadwal
                );

        listJadwal.setAdapter(adapter);

    }
}
