package com.max.pedidovenda.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.max.pedidovenda.model.Produto;
import com.max.pedidovenda.repository.ProdutoRepository;

public class CadastroProdutoService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ProdutoRepository produtoRepository;

	public Produto salvar(Produto produto) {
		Produto produtoExistente = this.produtoRepository.porSku(produto.getSku());

		if (produtoExistente != null) {
			throw new NegocioException("Já existe um produto com o SKU informado.");
		}

		return this.produtoRepository.guardar(produto);
	}
}
