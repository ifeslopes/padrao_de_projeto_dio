package com.example.padraodeprojeto.service.impl;

import java.util.Optional;

import com.example.padraodeprojeto.model.Cliente;
import com.example.padraodeprojeto.model.ClienteRepository;
import com.example.padraodeprojeto.model.Endereco;
import com.example.padraodeprojeto.model.EnderecoRepository;
import com.example.padraodeprojeto.service.ClienteService;
import com.example.padraodeprojeto.service.ViaCepService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;

	@Override
	public Iterable<Cliente> buscarTodos() {
		// Buscar todos os Clientes.
		
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// Buscar Cliente por ID.
	Optional<Cliente> cliente = clienteRepository.findById(id);
		
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvaClienteComCep(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
// Buscar Cliente por ID, caso exista:
Optional<Cliente> clientedb = clienteRepository.findById(id);
if(clientedb.isPresent()){

	salvaClienteComCep(cliente);
}

	
	}



	@Override
	public void deletar(Long id) {
		// Deletar Cliente por ID.
		clienteRepository.deleteById(id);
		
	
	}

private void salvaClienteComCep(Cliente cliente){


String cep = cliente.getEndereco().getCep();                                                                Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{                        
  Endereco novoEndereco = viaCepService.consultaCep(cep);
 enderecoRepository.save(novoEndereco);
  return novoEndereco;   
    });
cliente.setEndereco(endereco);
clienteRepository.save(cliente);

}




}
