/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rangobravo.web.model;

public class ItemVenda {
    private int id;
    private int idVenda;
    private int idProduto;
    private float valorUnitario;
    private int qtdVendida;
    private String nomeProduto;

    public ItemVenda() {
    }

    public ItemVenda(int id, int idVenda, int idProduto, float valorUnitario) {
        this.id = id;
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.valorUnitario = valorUnitario;
    }

    public ItemVenda(int idVenda, int idProduto, float valorUnitario) {
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    

}
