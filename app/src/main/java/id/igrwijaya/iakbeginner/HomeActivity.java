package id.igrwijaya.iakbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView txtUsername;
    Button btnSenin;
    Button btnSelasa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnSenin = (Button) findViewById(R.id.btnSenin);
        btnSelasa = (Button) findViewById(R.id.btnSelasa);
        btnSenin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jadwalActivity = new Intent(HomeActivity.this, JadwalActivity.class);
                jadwalActivity.putExtra("pilihan_jadwal", btnSenin.getText().toString());
                startActivity(jadwalActivity);
            }
        });

        btnSelasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jadwalActivity = new Intent(HomeActivity.this, JadwalActivity.class);
                jadwalActivity.putExtra("pilihan_jadwal", btnSenin.getText().toString());
                startActivity(jadwalActivity);
            }
        });

        txtUsername = (TextView) findViewById(R.id.txtUsername);

        String username = getIntent().getStringExtra("username");
        txtUsername.setText(username);
    }

    private String statusSaya(){
        String status = "abcd";

        return status; // membalikkan nilai atau memberikan output
    }

    private int umurSaya(int tahunLahir,
                         int tahunSekarang){ // parameter method
        int umur = tahunSekarang - tahunLahir;

        return umur;
    }

    private void namaMethod(){

        //jika void tidak punya output
    }
}
