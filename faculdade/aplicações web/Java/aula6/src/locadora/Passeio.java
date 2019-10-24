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
public class Passeio extends Veiculo {

    private String corExterna;
    private String corInterna;
    private int numeroDePortas;
    private int numeroDePassageiros;
    private String opcionais;

    /**
     * @return the corExterna
     */
    public String getCorExterna() {
        return corExterna;
    }

    /**
     * @param corExterna the corExterna to set
     */
    public void setCorExterna(String corExterna) {
        this.corExterna = corExterna;
    }

    /**
     * @return the corInterna
     */
    public String getCorInterna() {
        return corInterna;
    }

    /**
     * @param corInterna the corInterna to set
     */
    public void setCorInterna(String corInterna) {
        this.corInterna = corInterna;
    }

    /**
     * @return the numeroDePortas
     */
    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    /**
     * @param numeroDePortas the numeroDePortas to set
     */
    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    /**
     * @return the numeroDePassageiros
     */
    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    /**
     * @param numeroDePassageiros the numeroDePassageiros to set
     */
    public void setNumeroDePassageiros(int numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }

    /**
     * @return the opcionais
     */
    public String getOpcionais() {
        return opcionais;
    }

    /**
     * @param opcionais the opcionais to set
     */
    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }
}
