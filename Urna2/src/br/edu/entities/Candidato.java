/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.entities;

/**
 *
 * @author joaog
 */
public class Candidato {
    
    private String nPresidente;
    private String nVice;
    private String partido;

    public Candidato(String nPresidente, String nVice, String partido) {
        this.nPresidente = nPresidente;
        this.nVice = nVice;
        this.partido = partido;
    }

    public String getNPresidente() {
        return nPresidente;
    }

    public String getNVice() {
        return nVice;
    }

    public String getPartido() {
        return partido;
    }

}
