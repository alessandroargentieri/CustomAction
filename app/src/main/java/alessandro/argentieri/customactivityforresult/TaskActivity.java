package alessandro.argentieri.customactivityforresult;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
    }

    public void SendItBack(View v){
        EditText txt = (EditText)findViewById(R.id.myEdit);
        Intent data = new Intent();
        data.putExtra("streetkey","streetname");
        data.putExtra("citykey","cityname");
        data.putExtra("result",txt.getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }
}
