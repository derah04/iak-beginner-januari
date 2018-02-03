package id.igrwijaya.iakbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// CLASS
public class MainActivity extends AppCompatActivity {

    // initial variable
    EditText editUsername;
    EditText editPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // connecting variable to element view in xml
        editUsername = (EditText) findViewById(R.id.editUsername);
        editPassword = (EditText) findViewById(R.id.editPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        // action ketika tombol di klik
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = editUsername.getText().toString();
                String password = editPassword.getText().toString();

                if(username.isEmpty()){
                    Toast.makeText(
                            MainActivity.this,
                            "Username harus diisi!",
                            Toast.LENGTH_LONG).show();
                }else if(password.isEmpty()){
                    Toast.makeText(
                            MainActivity.this,
                            "Password harus diisi!",
                            Toast.LENGTH_LONG).show();
                }else if(username.equals("stikom") && password.equals("jimbaran")){
                    Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                    homeIntent.putExtra("username", editUsername.getText().toString());
                    startActivity(homeIntent);
                }else{
                    // memunculkan popup di bagian bawah
                    Toast.makeText(
                            MainActivity.this,
                            "Password dan Username tidak sesuai, coba lagi",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    private void belajarStatement(){

        String status = "jomblo";
        int umur = 20;

        if(status.equals("jomblo")){ // perbandingan string menggunakan .equals
            Log.e("BASIC_IF", "Kasian");
        }else{
            Log.e("BASIC_IF", "Kapan nikah?");
        }

        if(umur == 20){ // menggunakan == != > < >= <=
            Log.e("TEST", "Muda");
        }else if(umur > 20){
            Log.e("test", "Tua");
        }

        switch(status){
            case "jomblo":
                Log.e("BASIC_IF", "Kasian");
                break;
            case "pacaran":
                Log.e("BASIC_IF", "Kapan Nikah?");
                break;
            case "Ga Jelas":
                Log.e("BASIC_IF", "Ga Jelas juga nasibmu");
                break;
            default:
                Log.e("BASIC_IF", "Status Tidak Ditemukan");
                break;
        }
    }









}








