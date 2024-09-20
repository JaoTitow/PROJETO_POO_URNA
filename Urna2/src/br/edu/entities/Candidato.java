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
    private String partido;
    private String nVice;
    private String numero;
    private String caminhoImagem;
    private String caminhoImagemVice;

    
    public Candidato(String nPresidente,String partido, String nVice, String numero, String caminhoImagem, String caminhoImagemVice) {
        this.nPresidente = nPresidente;
        this.partido = partido;
        this.nVice = nVice;
        this.numero = numero;
        this.caminhoImagem = caminhoImagem;
        this.caminhoImagemVice = caminhoImagemVice;
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
    
    public String getNumero(){
        return numero;
    }
    
    public String getCaminhoImagem(){
        return caminhoImagem;
    }
    
    public String getCaminhoImagemVice(){
        return caminhoImagemVice;
    }

}
