package com.tsystems.javaschool.tasks;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

/**
 * Created by max on 16.08.16.
 * ScriptEngine contains in Java since 1.6 version, so i decided to use this one.
 */
public class CalculatorImpl implements Calculator {
    @Override
    public  String evaluate(String statement) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String result = null;
        Integer resultInt = 0 ;
        Double resultDouble = Double.valueOf(0);
        try {
            result = engine.eval(statement).toString();
            resultDouble= Double.valueOf(result );
            resultDouble = Math.rint(10000 * resultDouble) / 10000;
            if ( resultDouble % 1 != 0 ){
                result  = resultDouble.toString();
            }
            else {
                resultInt =  resultDouble.intValue();
                result = String.format("%.0f", resultDouble).toString();
            }
        } catch (ScriptException e) {
            result = null;
        }
        return result;
    }
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        System.out.println(calculator.evaluate("-12)1//("));
        System.out.println(calculator.evaluate("(1+38.33333)*4-5"));
        System.out.println(calculator.evaluate("(1+38)*4-5"));
        System.out.println(calculator.evaluate("7*6/2+8"));
    }
}
