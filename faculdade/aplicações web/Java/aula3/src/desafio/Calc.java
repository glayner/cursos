/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package desafio;

import javax.swing.JOptionPane;
import java.util.InputMismatchException;

/**
 *
 * @author thiag
 */
public class Calc {
    public static void main(String[] args) {
        String aux;
        Controller c1 = new Controller();
        try{
        aux = JOptionPane.showInputDialog("Digite o primeiro numero");
        c1.setNum1(Double.parseDouble(aux));
        aux = JOptionPane.showInputDialog("Digite o operador desejado exp:(+, -, * ou / ");
        c1.setOp(aux);
        aux = JOptionPane.showInputDialog("Digite o segundo numero");
        c1.setNum2(Double.parseDouble(aux));
        JOptionPane.showMessageDialog(null,c1.Calcular(c1.getOp(), c1.getNum1(), c1.getNum2()),"RESPOSTA",JOptionPane.INFORMATION_MESSAGE);
        }catch(InputMismatchException erroparam){
            JOptionPane.showMessageDialog(null,"Parametro invalido","ERRO",JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException formnum){
                JOptionPane.showMessageDialog(null,"formato do numero invalido","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
}
