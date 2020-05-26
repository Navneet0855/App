package com.ayraa.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.core.text.HtmlCompat;
import android.text.Spanned;

import java.util.Objects;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Back Arrow
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        // Get the Intent that started this activity
        Intent intent = getIntent();
        String sign = intent.getStringExtra("sign");

        if(Objects.equals(sign, "mesha")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.mesha_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.mesha);
        }
        else if(Objects.equals(sign, "vrishabha")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.vrishabha_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.vrishabha);
        }
        else if(Objects.equals(sign, "mithuna")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.mithuna_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.mithuna);
        }
        else if(Objects.equals(sign, "karka")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.karka_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.karka);
        }
        else if(Objects.equals(sign, "simha")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.simha_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.simha);
        }
        else if(Objects.equals(sign, "kanya")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.kanya_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.kanya);
        }
        else if(Objects.equals(sign, "tula")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.tula_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.tula);
        }


        else if(Objects.equals(sign, "vrishchik")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.vrishchik_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.vrishchik);
        }
        else if(Objects.equals(sign, "dhanu")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.dhanu_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.dhanu);
        }
        else if(Objects.equals(sign, "makara")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.makara_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.makara);
        }
        else if(Objects.equals(sign, "kumbha")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.kumbha_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.kumbha);
        }
        else if(Objects.equals(sign, "meena")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.meena_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.meena);
        }






    }

    // Back Arrow
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}
