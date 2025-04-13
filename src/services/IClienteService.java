package services;

import domain.Cliente;
import exception.TipoChaveNaoEncontradaException;
import services.generics.IGenericService;

public interface IClienteService {

    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
