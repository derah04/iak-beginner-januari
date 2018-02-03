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
        final String[] staticJadwalList = new String[]{
                "Jadwal 1", //0
                "Jadwal 2", //1
                "Jadwal 3", //2
                "Jadwal 4", //3
                "Jadwal 5" //4
        };

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
