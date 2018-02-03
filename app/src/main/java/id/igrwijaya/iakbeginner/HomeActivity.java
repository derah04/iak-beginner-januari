package id.igrwijaya.iakbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView txtUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtUsername = (TextView) findViewById(R.id.txtUsername);

        String username = getIntent().getStringExtra("username");
        txtUsername.setText(username);

        namaMethod(); // no return (void)
        String saya = statusSaya(); // return String
        int umur = umurSaya(2000, 2018);
        int umur2 = umurSaya(1998, 2018);
        Log.e("MAIN_ACTIVITY",
                saya);

        Log.e("MAIN_ACTIVITY",
                String.valueOf(umur));

        Log.e("MAIN_ACTIVITY",
                String.valueOf(umur2));

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
