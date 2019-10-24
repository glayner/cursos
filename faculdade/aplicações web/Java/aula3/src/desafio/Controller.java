/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

/**
 *
 * @author thiag
 */
public class Controller {
    private String op;
    private double num1;
    private double num2;

    /**
     * @return the op
     */
    public String getOp() {
        return op;
    }

    /**
     * @param op the op to set
     */
    public void setOp(String op) {
        this.op = op;
    }

    /**
     * @return the num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public String Calcular(String op, double num1, double num2){
        double resultado = 0;
        String validacao = "O resultado é: 0";
        switch(op){
            case "+":
                resultado = num1+num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1/num2;
                break; 
            default:
                validacao = "operador invalido";
                break;
        }
        if(resultado == 0.0){
        return validacao;} else{
            return "O resultado é: " + resultado;
        }
    }
}
