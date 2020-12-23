package com.example.market;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gs_main);

        findViewById(R.id.Carbohydrate).setOnClickListener(onClickListener);
        findViewById(R.id.Protein).setOnClickListener(onClickListener);
        findViewById(R.id.Diet).setOnClickListener(onClickListener);
    }

    final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.Carbohydrate:
                    Log.e("Carbohydrate", "Carbohydrate");
                    startCarbohydrateActivity();
                    break;
                case R.id.Protein:
                    Log.e("Protein", "Protein");
                    startproteinActivity();
                    break;
                case R.id.Diet:
                    Log.e("Diet","Diet");
                    startDietActivity();
            }
        }

        private void startCarbohydrateActivity() {
            Intent intent = new Intent(GsActivity. this, Gs_Carbohydrate.class);
            startActivity(intent);
        }

        private void startproteinActivity() {
            Intent intent = new Intent(GsActivity. this, Gs_Protein.class);
            startActivity(intent);
        }

        private void startDietActivity() {
            Intent intent = new Intent(GsActivity. this, Gs_Diet.class);
            startActivity(intent);
        }

    };
}
