package com.ifpb.visao;

import com.ifpb.dao.ClienteDAO;
import com.ifpb.modelo.Cliente;

public class App {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        //cliente.setId(3);
        //cliente.setNome("Maria");
        //cliente.setValorConsumo("900");

        ClienteDAO cli = new ClienteDAO();

        //cliente = cli.Inserir(cliente);
        //cliente = cli.Buscar(1);
        //cliente = cli.Atualizar(2, "Gabriel");
        //cliente = cli.Deletar(3);
    }
}
