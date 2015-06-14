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
                //Double字串轉數字  要清空 mSecNumber = "";mOperator = "";

                break;
            case PLUS: //+
                if (mNumber.length() != 0) {
                    mSecNumber = mNumber;
                    mNumber = "";
                    mOperator = "+";
                    setChanged();
                    notifyObservers();
                }
                break;
            case MINUS: //-
                if (mNumber.length() != 0) {
                    mSecNumber = mNumber;
                    mNumber = "";
                    mOperator = "-";
                    setChanged();
                    notifyObservers();
                }

                break;
            case TIMES: //*
                if (mNumber.length() != 0) {
                    mSecNumber = mNumber;
                    mNumber = "";
                    mOperator = "*";
                    setChanged();
                    notifyObservers();
                }
                break;
            case OVER: // ⁄
                if (mNumber.length() != 0) {
                    mSecNumber = mNumber;
                    mNumber = "";
                    mOperator = " /";
                    setChanged();
                    notifyObservers();
                }
                break;
            case PLUS_MINUS: // ±
                //正數直接加負號，負號轉正數用0.0去減

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
                mNumber = "0";
                setChanged();
                notifyObservers();
                break;

        }

    }

    public String getDisplay() {
        String ans = mSecNumber + mOperator + mNumber;
        return ans;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new View().setVisible(true);
    }

}
