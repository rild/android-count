package rimp.rild.com.android.android_count;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        button = (Button)findViewById(R.id.buutton);

        textView.setText(String.valueOf(count));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus();
            }
        });

        int color = Color.rgb(128, 128, 128);
        button.setTextColor(color);
    }

    public void plus() {
        count++;
        textView.setText(String.valueOf(count));
    }
}
