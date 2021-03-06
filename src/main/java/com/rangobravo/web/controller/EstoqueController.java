package com.rangobravo.web.controller;

import com.rangobravo.web.dao.EstoqueDAO;
import com.rangobravo.web.model.Estoque;
import java.util.List;

public class EstoqueController {
    
    public static void Salvar(String descricao, String filial){
        Estoque c = new Estoque(descricao, filial);
        EstoqueDAO estoque = new EstoqueDAO();
        estoque.salvar(c);
    }
    public static void Atualizar(int id, String descricao, String filial){
        Estoque e = new Estoque(id, descricao, filial);
        EstoqueDAO estoque = new EstoqueDAO();
        estoque.atualizar(e);
    }
    
    public static void Excluir (int id){
        EstoqueDAO estoque = new EstoqueDAO();
        estoque.deletar(id);
    }
    public static List<Estoque> consultarPorDescricao(String descricao){
        EstoqueDAO estoque = new EstoqueDAO();
        return estoque.consultarPorDescricao(descricao);
    }

    public static List<Estoque> consultarPorId(int id){
        EstoqueDAO estoque = new EstoqueDAO();
        return estoque.consultarPorId(id);
    }    
    
    public static List<Estoque> consultar(){
        EstoqueDAO estoque = new EstoqueDAO();
        return estoque.consultar();
    }
    
        public static List<Estoque> pesquisar(int id){
        EstoqueDAO estoque = new EstoqueDAO();
        return estoque.pesquisar(id);
    }
}
