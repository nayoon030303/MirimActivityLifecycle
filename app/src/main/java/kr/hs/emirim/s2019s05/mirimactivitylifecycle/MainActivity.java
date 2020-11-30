package kr.hs.emirim.s2019s05.mirimactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCall = findViewById(R.id.btn_call);
        Button btnFinish = findViewById(R.id.btn_exit);
        btnCall.setOnClickListener(btnListener);
        btnFinish.setOnClickListener(btnListener);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("액티비티 생명주기:","onDestroy(:");
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_call:
                    Uri uri = Uri.parse("tel:010-1234-5678");
                    Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                    startActivity(intent);
                    break;
                case R.id.btn_exit:
                    finish();
                    break;
            }
        }


    };
}