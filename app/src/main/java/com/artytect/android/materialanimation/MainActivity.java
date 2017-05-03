package com.artytect.android.materialanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindControl();
        setupToolbar();
    }

    private void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void bindControl() {
        TextView txvRippleWithBorder = (TextView) findViewById(R.id.txvRippleWithBorder);
        TextView txvRippleWithoutBorder = (TextView) findViewById(R.id.txvRippleWithoutBorder);
        TextView txvCustomRippleWithBorder = (TextView) findViewById(R.id.txvCustomRippleWithBorder);
        TextView txvCustomRippleWithoutBorder = (TextView) findViewById(R.id.txvCustomRippleWithoutBorder);

        txvRippleWithBorder.setOnClickListener(this);
        txvRippleWithoutBorder.setOnClickListener(this);
        txvCustomRippleWithBorder.setOnClickListener(this);
        txvCustomRippleWithoutBorder.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.explodeJava: {

                break;
            }

            case R.id.explodeXML: {

                break;
            }

            case R.id.slideJava: {

                break;
            }

            case R.id.slideXML: {

                break;
            }

            case R.id.fadeJava: {

                break;
            }

            case R.id.fadeXML: {

                break;
            }

            case R.id.shared_element: {

                break;
            }
        }
    }
}