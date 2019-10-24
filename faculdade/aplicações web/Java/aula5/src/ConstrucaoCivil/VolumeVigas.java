
package ConstrucaoCivil;

import javax.swing.JOptionPane;

public class VolumeVigas {
    private int base;
    private int altura;
    private int comprimento;
    private int volume;

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the comprimento
     */
    public int getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }
    public void calc(){
        this.volume = this.base * this.altura * this.comprimento;
    }
    

}
