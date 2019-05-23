package com.fundatec.lp3.ex_mock;

public class ServicePessoa {
	private PessoaDAO pessoaDAO;

	public ServicePessoa(PessoaDAO pessoaDAO) {
	 this.pessoaDAO = pessoaDAO;
	 }

	public Pessoa buscaPessoa(int id) {
	 return pessoaDAO.get(id);
	 } 
	
}
