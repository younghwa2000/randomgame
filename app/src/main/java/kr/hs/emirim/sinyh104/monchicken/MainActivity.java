package kr.hs.emirim.sinyh104.monchicken;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mName;
    Button mButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_show_me_the_chicks);
        mButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText(null);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        String name = mName.getText().toString();

//        if (name == null) {
//            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
//        } else {
//            Toast.makeText(this, name + "씨 배고파요!", Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(this, ResultActivity.class);
//            startActivity(intent);
//        }

        try{
            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);
        }catch(NullPointerException e){
            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
        }catch(Exception e){
            Toast.makeText(this, "뭔지 모르지만 안되네요", Toast.LENGTH_LONG).show();
        }
    }
}
