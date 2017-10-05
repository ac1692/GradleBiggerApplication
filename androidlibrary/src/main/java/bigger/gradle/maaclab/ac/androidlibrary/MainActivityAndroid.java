package bigger.gradle.maaclab.ac.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityAndroid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_android);
        TextView textView = (TextView) findViewById(R.id.txt);

        if(getIntent().hasExtra("extra joke")){
            textView.setText(getIntent().getExtras().getString("extra joke"));
        } else {
            textView.setText(getResources().getString(R.string.no_joke));
        }
    }
}
