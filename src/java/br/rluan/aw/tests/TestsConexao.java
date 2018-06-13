/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rluan.aw.tests;
import br.rluan.aw.modelo.Cliente;
import br.rluan.aw.modelo.ClienteDAO;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Trunks
 */
public class TestsConexao {
    public static void main(String[] args) {
        ClienteDAO.conectar();
        Cliente cl = new Cliente("modelo", "marca2", "2018-06-13", "red");
        ClienteDAO.inserirCliente(cl);
        System.out.println(ClienteDAO.todosClientes().get(5).getModelo());
        
    }
}
