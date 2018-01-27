package id.igrwijaya.iakbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

                // memunculkan popup di bagian bawah
                Toast.makeText(
                        MainActivity.this,
                        "Username: " + editUsername.getText() + "\n Password: " + editPassword.getText(),
                        Toast.LENGTH_LONG).show();

            }
        });
    }


}








