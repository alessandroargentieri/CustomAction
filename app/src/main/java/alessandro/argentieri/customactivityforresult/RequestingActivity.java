package alessandro.argentieri.customactivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class RequestingActivity extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requesting);
        txtResult = (TextView) findViewById(R.id.TxtResult);
    }

    //bottone che inoltra la richiesta
    public void StartForResult(View v){
        //VEDERE IL RISULTATO IN ON_ACTIVITY_RESULT
        startActivityForResult(new Intent("alessandro.argentieri.customactivityforresult.MYTASK"), 5555);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == 5555 && resultCode == RESULT_OK){
            String street = data.getStringExtra("streetkey");
            String city = data.getStringExtra("citykey");
            String result = data.getStringExtra("result");
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
            txtResult.setText(street + ", " + city + ", " + result);
        }
    }

}
