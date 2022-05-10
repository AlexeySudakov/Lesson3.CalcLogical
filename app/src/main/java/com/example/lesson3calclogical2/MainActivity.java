package com.example.lesson3calclogical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    private  CalcPresenter presenter;
    private TextView resultText;
    private EditText argOne;
    private TextView operationText;
    Double operand = null;
    String lastOperation = "=";
    final int MENU_RESET_ID = 1;
    final int MENU_QUIT_ID = 2;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString( "Operation", lastOperation );
        if (operand!=null)
            outState.putDouble( "OPERAND",operand );
        super.onSaveInstanceState( outState );
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState( savedInstanceState );
        lastOperation = savedInstanceState.getString( "Operation" );
        operand = savedInstanceState.getDouble( "OPERAND" );
        resultText.setText( operand.toString() );

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

//        presenter = new CalcPresenter( this, new CalcImplements() );

        resultText = findViewById( R.id.Result );
        argOne = findViewById( R.id.EnterNumber );
        operationText = findViewById( R.id.myTextView );

        initButton();


    }

    private void initButton() {




        initButton1ClickListener();
        initButton2ClickListener();
        initButton3ClickListener();
        initButton4ClickListener();
        initButton5ClickListener();
        initButton6ClickListener();
        initButton7ClickListener();
        initButton8ClickListener();
        initButton9ClickListener();
        initButton0ClickListener();
        initButtonPntClickListener();
        initButtonAddClickListener();
        initButtonSbstClickListener();
        initButtonMplnClickListener();
        initButtonDvdClickListener();
        initButtonEqlClickListener();
        initButtonDelClickListener();


    }

    private void initButton1ClickListener() {
        Button button1 = findViewById( R.id.btn1 );
        button1.setOnClickListener( view -> {

            argOne.append( button1.getText() );

            if (lastOperation.equals( "=" ) && operand != null) {
                operand = null;
            }
        } );
    }

    private void initButton2ClickListener() {
        Button button2 = findViewById( R.id.btn2 );
        button2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                argOne.append( button2.getText() );

                if (lastOperation.equals( "=" ) && operand != null) {
                    operand = null;
                }
            }


        } );
    }

    private void initButton3ClickListener() {
        Button button3 = findViewById( R.id.btn3 );
        button3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                argOne.append( button3.getText() );

                if (lastOperation.equals( "=" ) && operand != null) {
                    operand = null;
                }
            }


        } );
    }
    private void initButton4ClickListener() {
        Button button4 = findViewById( R.id.btn4 );
        button4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                argOne.append( button4.getText() );

                if (lastOperation.equals( "=" ) && operand != null) {
                    operand = null;
                }
            }


        } );
    }
    private void initButton5ClickListener() {
        Button button5 = findViewById( R.id.btn5 );
        button5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                argOne.append( button5.getText() );

                if (lastOperation.equals( "=" ) && operand != null) {
                    operand = null;
                }
            }


        } );
    }
    private void initButton6ClickListener() {
        Button button6 = findViewById( R.id.btn6 );
        button6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                argOne.append( button6.getText() );

                if (lastOperation.equals( "=" ) && operand != null) {
                    operand = null;
                }
            }


        } );
    }
    private void initButton7ClickListener() {
        Button button7 = findViewById( R.id.btn7 );
        button7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                argOne.append( button7.getText() );

                if (lastOperation.equals( "=" ) && operand != null) {
                    operand = null;
                }
            }


        } );
    }
    private void initButton8ClickListener() {
        Button button8 = findViewById( R.id.btn8 );
        button8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                argOne.append( button8.getText() );

                if (lastOperation.equals( "=" ) && operand != null) {
                    operand = null;
                }
            }


        } );
    }
    private void initButton9ClickListener() {
        Button button9 = findViewById( R.id.btn9 );
        button9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                argOne.append( button9.getText() );

                if (lastOperation.equals( "=" ) && operand != null) {
                    operand = null;
                }
            }


        } );
    }
    private void initButton0ClickListener() {
        Button button0 = findViewById( R.id.btn0 );
        button0.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                argOne.append( button0.getText() );

                if (lastOperation.equals( "=" ) && operand != null) {
                    operand = null;
                }
            }


        } );
    }
    private void initButtonPntClickListener() {
        Button button_pnt = findViewById( R.id.btn_pnt );
        button_pnt.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                argOne.append( button_pnt.getText() );

                if (lastOperation.equals( "=" ) && operand != null) {
                    operand = null;
                }
            }


        } );
    }

    private void initButtonAddClickListener() {
        Button button_Add = findViewById( R.id.btn_add );
        button_Add.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op = button_Add.getText().toString();
                String number = argOne.getText().toString();

                if (number.length() > 0) {
                    number = number.replace( ',', '.' );
                    try {
                        mathOperation( Double.valueOf( number ), op );
                    } catch (NumberFormatException ex) {
                        argOne.setText( "" );
                    }

                }
                lastOperation = op;
                operationText.setText( lastOperation );
            }
        } );
    }
    private void initButtonSbstClickListener() {
        Button button_Sbst = findViewById( R.id.btn_sbst );
        button_Sbst.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op = button_Sbst.getText().toString();
                String number = argOne.getText().toString();

                if (number.length() > 0) {
                    number = number.replace( ',', '.' );
                    try {
                        mathOperation( Double.valueOf( number ), op );
                    } catch (NumberFormatException ex) {
                        argOne.setText( "" );
                    }

                }
                lastOperation = op;
                operationText.setText( lastOperation );
            }
        } );
    }
    private void initButtonMplnClickListener() {
        Button button_Mpln = findViewById( R.id.btn_mpln );
        button_Mpln.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op = button_Mpln.getText().toString();
                String number = argOne.getText().toString();

                if (number.length() > 0) {
                    number = number.replace( ',', '.' );
                    try {
                        mathOperation( Double.valueOf( number ), op );
                    } catch (NumberFormatException ex) {
                        argOne.setText( "" );
                    }

                }
                lastOperation = op;
                operationText.setText( lastOperation );
            }
        } );
    }
    private void initButtonDvdClickListener() {
        Button button_Dvd = findViewById( R.id.btn_dvd );
        button_Dvd.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op = button_Dvd.getText().toString();
                String number = argOne.getText().toString();

                if (number.length() > 0) {
                    number = number.replace( ',', '.' );
                    try {
                        mathOperation( Double.valueOf( number ), op );
                    } catch (NumberFormatException ex) {
                        argOne.setText( "" );
                    }

                }
                lastOperation = op;
                operationText.setText( lastOperation );
            }
        } );
    }

    private void initButtonEqlClickListener() {
        Button button_Eql = findViewById( R.id.btn_eql );
        button_Eql.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op = button_Eql.getText().toString();
                String number = argOne.getText().toString();

                if (number.length() > 0) {
                    number = number.replace( ',', '.' );
                    try {
                        mathOperation( Double.valueOf( number ), op );
                    } catch (NumberFormatException ex) {
                        argOne.setText( "" );
                    }

                }
                lastOperation = op;
                operationText.setText( lastOperation );
            }
        } );
    }
    private void initButtonDelClickListener() {
        Button button_Del = findViewById( R.id.btn_AC );
        button_Del.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op = button_Del.getText().toString();
                String number = argOne.getText().toString();

                lastOperation = "0";
                operationText.setText( "" );
                if (number.length() > 0) {
                    number = number.replace( ',', '.' );
                    try {
                        mathOperation( Double.valueOf( number ), op );
                    } catch (NumberFormatException ex) {
                        argOne.setText( "" );
                    }
                }
                argOne.setText("");
                resultText.setText("0");
                operationText.setText("");

            }
        } );
    }
//
//    @Override
//    public boolean onCreateOptionsMenu (Menu menu) {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add( 0, MENU_RESET_ID, 0, "Reset" );
        return super.onCreateOptionsMenu( menu );
    }

    // обработка нажатий на пункты меню
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case MENU_RESET_ID:
                // очищаем поля
                argOne.setText( "" );
                resultText.setText( "" );
                break;
            case MENU_QUIT_ID:
//                        // выход из приложения
                finish();
                break;
        }
        return super.onOptionsItemSelected( item );
    }


    public void mathOperation (Double number, String operation) {
        if (operand == null) {
            operand = number;
        } else {
            if (lastOperation.equals( "=" )) {
                lastOperation = operation;
            }
            switch (lastOperation) {
                case "=":
                    operand = number;
                    break;

                case "+":
                    operand += number;
                    break;
                case "-":
                    operand -= number;
                    break;
                case "*":
                    operand *= number;
                    break;
                case "/":
                    if(number==0){
                        operand =0.0;
                    }
                    operand /= number;
                    break;

            }
        }
        resultText.setText( operand.toString().replace( '.', ',' ) );
        argOne.setText( "" );
    }

}