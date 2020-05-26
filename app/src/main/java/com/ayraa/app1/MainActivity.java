package com.ayraa.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mesha(View view) {
        Toast.makeText(getApplicationContext(), "Mesha", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "mesha".toString());
        startActivity(intent);
    }

    public void vrishabha(View view) {
        Toast.makeText(getApplicationContext(), "Vrishabha", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "vrishabha".toString());
        startActivity(intent);
    }


    public void mithuna(View view) {
        Toast.makeText(getApplicationContext(), "Mithuna", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "mithuna".toString());
        startActivity(intent);
    }

    public void karka(View view) {
        Toast.makeText(getApplicationContext(), "Karka", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "karka".toString());
        startActivity(intent);
    }
    public void simha(View view) {
        Toast.makeText(getApplicationContext(), "Simha", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "simha".toString());
        startActivity(intent);
    }
    public void kanya(View view) {
        Toast.makeText(getApplicationContext(), "Kanya", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "kanya".toString());
        startActivity(intent);
    }
    public void tula(View view) {
        Toast.makeText(getApplicationContext(), "Tula", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "tula".toString());
        startActivity(intent);
    }
    public void vrishchik(View view) {
        Toast.makeText(getApplicationContext(), "Vrishchik", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "vrishchik".toString());
        startActivity(intent);
    }
    public void dhanu(View view) {
        Toast.makeText(getApplicationContext(), "Dhanu", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "dhanu".toString());
        startActivity(intent);
    }
    public void makara(View view) {
        Toast.makeText(getApplicationContext(), "Makara", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "makara".toString());
        startActivity(intent);
    }
    public void kumbha(View view) {
        Toast.makeText(getApplicationContext(), "Kumbha", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "kumbha".toString());
        startActivity(intent);
    }
    public void meena(View view) {
        Toast.makeText(getApplicationContext(), "Meena", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "meena".toString());
        startActivity(intent);
    }
}
//main file
