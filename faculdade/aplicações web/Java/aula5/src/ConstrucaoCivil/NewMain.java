
package ConstrucaoCivil;

import javax.swing.JOptionPane;

public class NewMain {

    public static void main(String[] args) {
        VolumeVigas v1 = new VolumeVigas();
        v1.setBase(Integer.parseInt(JOptionPane.showInputDialog("Digite a base")));
        v1.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Digite a altura")));
        v1.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento")));
        v1.calc();
        JOptionPane.showMessageDialog(null, "o volume da viga é: "+v1.getVolume());
    }
    
}
