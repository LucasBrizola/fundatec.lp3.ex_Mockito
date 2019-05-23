package com.fundatec.lp3.ex_mock;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ServicePessoaTest {
	
	@Mock
	private PessoaDAO pessoaDAO;
	
	@Test
	public void testarBuscarPessoa() {
		ServicePessoa servicePessoa = new ServicePessoa(pessoaDAO);
		
		when(pessoaDAO.get(anyInt())).thenReturn(new Pessoa(10, "lucas"));
		
		
		Pessoa pessoa = servicePessoa.buscaPessoa(10);
		servicePessoa.buscaPessoa(20);
		
		verify(pessoaDAO, times(2)).get(anyInt());
		assertEquals("lucas", pessoa.getNome());
	}

}
