package com.example.market;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        findViewById(R.id.CU).setOnClickListener(onClickListener);
        findViewById(R.id.GS25).setOnClickListener(onClickListener);
    }

    final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.CU:
                    Log.e("cu", "cu");
                    startCuActivity();
                    break;
                case R.id.GS25:
                    Log.e("GS", "GS");
                    startGsActivity();
                    break;
            }
        }

        private void startCuActivity() {
            Intent intent = new Intent(intro. this, CuActivity.class);
            startActivity(intent);
        }

        private void startGsActivity() {
            Intent intent = new Intent(intro. this, GsActivity.class);
            startActivity(intent);
        }
    };

}
