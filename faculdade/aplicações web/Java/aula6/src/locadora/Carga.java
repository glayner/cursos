/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author thiag
 */
public class Carga extends Veiculo {

    private double capacidadeMax;
    private double altura;
    private double largura;
    private double profundidade;

    /**
     * @return the capacidadeMax
     */
    public double getCapacidadeMax() {
        return capacidadeMax;
    }

    /**
     * @param capacidadeMax the capacidadeMax to set
     */
    public void setCapacidadeMax(double capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the largura
     */
    public double getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }

    /**
     * @return the profundidade
     */
    public double getProfundidade() {
        return profundidade;
    }

    /**
     * @param profundidade the profundidade to set
     */
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
}
