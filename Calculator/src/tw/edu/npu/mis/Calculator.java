/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import java.util.Observable;

/**
 * The model class of the calculator application.
 */
public class Calculator extends Observable {

    String mNumber = "";
    Boolean mDot = false;
    String mSecNumber = "";
    String mOperator = "";

    /**
     * The available operators of the calculator.
     */
    public enum Operator {

        EQUAL, // =
        PLUS, // +
        MINUS, // -
        TIMES, // ×
        OVER, // ⁄
        PLUS_MINUS, // ±
        RECIPROCAL, // 1/x
        PERCENT, // %
        SQRT, // √
        BACKSPACE, // ⌫
        CLEAR, // C
        CLEAR_ENTRY, // CE
        MEM_SET, // MS
        MEM_PLUS, // M+
        MEM_MINUS, // M-
        MEM_RECALL, // MR
        MEM_CLEAR    // MC
    }

    public void appendDigit(int digit) {
        mNumber += String.valueOf(digit);
        setChanged();
        notifyObservers();
    }

    public void appendDot() {
        if (!mDot) {
            mNumber += ".";
        }
        mDot = true;
        setChanged();
        notifyObservers();
    }

    public void performOperation(Operator operator) {
        switch (operator) {

            case EQUAL: //=

                break;
            case PLUS: //+

                break;
            case MINUS: //-

                break;
            case TIMES: //*

                break;
            case OVER: // ⁄

                break;
            case PLUS_MINUS: // ±

                break;
            case RECIPROCAL: // 1/x

                break;
            case PERCENT: // %

                break;
            case SQRT: // √

                break;
            case BACKSPACE: // ⌫

                break;
            case CLEAR: // C
                mNumber = "0";
                mSecNumber = "0";
                mOperator = "";
                setChanged();
                notifyObservers();
                break;
            case CLEAR_ENTRY: // CE

                break;

        }

    }

    public String getDisplay() {

        return mNumber;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new View().setVisible(true);
    }

}
