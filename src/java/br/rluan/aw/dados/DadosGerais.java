/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rluan.aw.dados;

/**
 *
 * @author trunks
 */
public class DadosGerais {
    private String nomeSite = "FinalNine";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/av1";
    private static final String USUARIO = "root";
    private static final String SENHA = "12345";    
    
    public static String getDRIVER() {
        return DRIVER;
    }

    public static String getURL() {
        return URL;
    }

    public static String getUSUARIO() {
        return USUARIO;
    }

    public static String getSENHA() {
        return SENHA;
    }
    
    public String getNomeSite() {
        return nomeSite;
    }
}
