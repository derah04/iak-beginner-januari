package id.igrwijaya.iakbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }
}
