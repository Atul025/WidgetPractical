package lucifer.com.widgetpractical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button bt;
    ToggleButton tb1,tb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick() {
        tb1=(ToggleButton)findViewById(R.id.tb1);
        tb2=(ToggleButton)findViewById(R.id.tb2);
        bt=(Button)findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("ToggleButton1 : ").append(tb1.getText());
                result.append("\nToggleButton2 : ").append(tb2.getText());
                Toast.makeText(getApplicationContext(), result.toString(),Toast.LENGTH_LONG).show();

            }
        });
    }
}
