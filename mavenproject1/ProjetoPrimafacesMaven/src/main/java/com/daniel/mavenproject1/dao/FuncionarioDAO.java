package com.daniel.mavenproject1.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.daniel.mavenproject1.modelo.Funcionario;
import com.daniel.mavenproject1.service.NegocioException;
import com.daniel.mavenproject1.util.jpa.Transactional;

public class FuncionarioDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Funcionario buscarPeloCodigo(Long codigo) {
		return manager.find(Funcionario.class, codigo);
	}
	
	public void salvar(Funcionario funcionario) {
		manager.merge(funcionario);
	}

	public List<Funcionario> buscarTodos() {
		return manager.createQuery("from Funcionario", Funcionario.class).getResultList();
	}
	
	@Transactional
	public void excluir(Funcionario funcionario) throws NegocioException {
		funcionario = buscarPeloCodigo(funcionario.getCodigo());
		
		try {
			manager.remove(funcionario);
			manager.flush();
		} catch (PersistenceException e) {
			throw new NegocioException("Funcionario não pode ser excluído.");
		}
	}
}
