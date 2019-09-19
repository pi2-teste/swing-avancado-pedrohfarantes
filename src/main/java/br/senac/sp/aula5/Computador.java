/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula5;

/**
 *
 * @author seunome.sobrenome
 */
public class Computador {

    public static String fabricante = "seu nome";

    public String tipoComputador = new String();
    public String sistemaOperacional = new String();
    public String HD = new String();
    public String[] acessorios = new String[3];
    public String[] serviços = new String[4];

    public Computador() {

    }

    public static String getFabricante() {
        return fabricante;
    }

    public String getTipoComputador() {
        return tipoComputador;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String getHD() {
        return HD;
    }

    public String[] getAcessorios() {
        return acessorios;
    }

    public String[] getServiços() {
        return serviços;
    }

    public static void setFabricante(String fabricante) {
        Computador.fabricante = fabricante;
    }

    public void setTipoComputador(String tipoComputador) {
        this.tipoComputador = tipoComputador;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public void setAcessorios(String[] acessorios) {
        this.acessorios = acessorios;
    }

    public void setServiços(String[] serviços) {
        this.serviços = serviços;
    }

}
