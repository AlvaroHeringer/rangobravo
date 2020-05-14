/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rangobravo.web.controller;

import com.rangobravo.web.dao.ItemVendaDAO;
import com.rangobravo.web.model.ItemVenda;
import java.util.List;

public class ItemVendaController {
    
    public static void salvar(int idVenda, int idProduto, float valorUnitario){
        ItemVenda v = new ItemVenda(idVenda, idProduto, valorUnitario);
        ItemVendaDAO itemVenda = new ItemVendaDAO();
        itemVenda.salvar(v);
    }
    
    public static List<ItemVenda> consultar(){
        ItemVendaDAO itemVenda = new ItemVendaDAO();
        return itemVenda.consultar();
    }
    
    public static int consultId() {
        return ItemVendaDAO.consultId();
    }
}
