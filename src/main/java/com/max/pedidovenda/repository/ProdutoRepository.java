package com.max.pedidovenda.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

import com.max.pedidovenda.model.Produto;

public class ProdutoRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager entityManager;

	public Produto guardar(Produto produto) {
		EntityTransaction trx = this.entityManager.getTransaction();
		trx.begin();

		produto = this.entityManager.merge(produto);

		trx.commit();

		return produto;
	}

	public Produto porSku(String sku) {
		try {
			return this.entityManager.createQuery("from Produto where upper(sku) = :sku", Produto.class)
					.setParameter("sku", sku.toUpperCase()).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
