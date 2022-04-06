package com.example.lesson3calclogical.AllView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lesson3calclogical.R;
import com.example.lesson3calclogical.calculator.CalcImplements;

public class CalculatorActivity extends AppCompatActivity implements CalculatorView {

    private  CalcPresenter presenter;

    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        presenter = new CalcPresenter( this,new CalcImplements() );

        EditText ArgOne = findViewById(  R.id.ArgOne);
        EditText ArgTwo = findViewById(  R.id.ArgTwo);

        resultText =findViewById( R.id.Result );


        findViewById( R.id.btn0 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.OnButtonBtn1Clicked ();

            }
        } );
        findViewById( R.id.btn1 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.OnButtonBtn2Clicked ();

            }
        } );
        findViewById( R.id.btn2 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.OnButtonBtn3Clicked ();

            }
        } );
        findViewById( R.id.btn3 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn4 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn5 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn6 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn7 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn8 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn9 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn0 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn_add ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn_sbst ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn_mpln ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn_dvd ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn_comma ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn_pnt ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
        findViewById( R.id.btn_eql ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
    }

    @Override
    public void showResult(String result) {
        resultText.setText( result );

    }
}