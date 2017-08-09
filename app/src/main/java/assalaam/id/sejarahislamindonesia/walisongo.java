package assalaam.id.sejarahislamindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class walisongo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walisongo);

        Button call = (Button) findViewById(R.id.pengertian);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), pengertianwali.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }
}
