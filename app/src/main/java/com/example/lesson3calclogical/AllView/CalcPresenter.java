package com.example.lesson3calclogical.AllView;

import com.example.lesson3calclogical.calculator.CalculatorLogical;
import com.example.lesson3calclogical.calculator.MathOperation;

public class CalcPresenter {

    private CalculatorView view;

    private CalculatorLogical logical;

    private double argOne = 0;
    private double argTwo = 0;

    public CalcPresenter(CalculatorView view, CalculatorLogical logical) {
        this.view = view;
        this.logical = logical;
    }

    public void OnButtonBtn1Clicked() {

    }

    public void OnButtonBtn2Clicked() {
    }

    public void OnButtonBtn3Clicked() {
    }

    public void OnButtonBtn4Clicked() {
    }

    public void OnButtonBtn5Clicked() {
    }
    public void OnButtonBtn6Clicked() {
    }
    public void OnButtonBtn7Clicked() {
    }
    public void OnButtonBtn8Clicked() {
    }
    public void OnButtonBtn9Clicked() {
    }
    public void OnButtonBtn0Clicked() {
    }
    public void OnButtonBtnPntClicked() {
    }
    public void OnButtonCommaClicked() {
    }
    public void OnButtonBtnAddClicked() {
       double res = logical.simpleOperation( argOne, argTwo, MathOperation.add );

       view.showResult( String.valueOf( res ) );
    }
    public void OnButtonBtnSubtractionClicked() {
    }
    public void OnButtonBtnDivideClicked() {
    }
    public void OnButtonBtnMultiplicationClicked() {
    }
    public void OnButtonEquallyClicked() {
    }
}
