package com.example.lesson3calclogical.calculator;

public class CalcImplements implements CalculatorLogical {


    @Override
    public double simpleOperation(double argOne, double argTwo, MathOperation mathOperation) {
      switch (mathOperation) {
          case add:
              return argOne + argTwo;
          case subtraction:
              return argOne - argTwo;
          case multiplication:
              return argOne * argTwo;
          case divide:
              return argOne / argTwo;


      }
      return 0;
    }
}
