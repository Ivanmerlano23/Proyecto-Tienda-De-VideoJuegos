/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author ivanf
 */
public class VideoJuego {
    private String nonmbre;
    private int año;
    private int edadPermitida;
    private String empresa;
    private String calidad;
    private String tipoGenero;
    private String plataforma;

    @Override
    public String toString() {
        return "VideoJuego[" + " nombre = " + nonmbre + ", a\u00f1o = " + año + ", edadPermitida = " + edadPermitida + ", empresa = " + empresa + ", calidad = " + calidad + ", tipoGenero = " + tipoGenero + ", plataforma = " + plataforma + ']';
    }

    public VideoJuego(String nonmbre, int año, int edadPermitida, String empresa, String calidad, String tipoGenero, String plataforma) {
        this.nonmbre = nonmbre;
        this.año = año;
        this.edadPermitida = edadPermitida;
        this.empresa = empresa;
        this.calidad = calidad;
        this.tipoGenero = tipoGenero;
        this.plataforma = plataforma;
    }
    

    /**
     * @return the nonmbre
     */
    public String getNonmbre() {
        return nonmbre;
    }

    /**
     * @param nonmbre the nonmbre to set
     */
    public void setNonmbre(String nonmbre) {
        this.nonmbre = nonmbre;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the edadPermitida
     */
    public int getEdadPermitida() {
        return edadPermitida;
    }

    /**
     * @param edadPermitida the edadPermitida to set
     */
    public void setEdadPermitida(int edadPermitida) {
        this.edadPermitida = edadPermitida;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the calidad
     */
    public String getCalidad() {
        return calidad;
    }

    /**
     * @param calidad the calidad to set
     */
    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    /**
     * @return the tipoGenero
     */
    public String getTipoGenero() {
        return tipoGenero;
    }

    /**
     * @param tipoGenero the tipoGenero to set
     */
    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    /**
     * @return the plataforma
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * @param plataforma the plataforma to set
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
}
   
