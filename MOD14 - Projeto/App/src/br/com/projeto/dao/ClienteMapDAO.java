package br.com.projeto.dao;

import br.com.projeto.domain.Cliente;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class ClienteMapDAO implements IClienteDAO {
    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        map = new TreeMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }
        map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastro = map.get(cpf);
        map.remove(clienteCadastro.getCpf(), clienteCadastro);
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastro = map.get(cliente.getCpf());
        clienteCadastro.setNome(cliente.getNome());
        clienteCadastro.setTel(cliente.getTel());
        clienteCadastro.setNumero(clienteCadastro.getNumero());
        clienteCadastro.setEnd(clienteCadastro.getEnd());
        clienteCadastro.setCidade(clienteCadastro.getCidade());
        clienteCadastro.setEstado(clienteCadastro.getEstado());
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}
