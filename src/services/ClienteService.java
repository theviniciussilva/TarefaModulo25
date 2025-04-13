package services;

import dao.ClienteDAO;
import dao.IClienteDAO;
import dao.generics.GenericDAO;
import domain.Cliente;
import domain.Persistente;
import exception.TipoChaveNaoEncontradaException;
import services.generics.GenericService;
import services.generics.IGenericService;

import java.io.Serializable;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    IClienteDAO cliente;

    public ClienteService(IClienteDAO cliente){
        this.cliente = cliente;
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return null;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setEstado(entity.getEstado());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setTel(entity.getTel());
    }
}
