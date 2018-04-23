package com.max.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PesquisaPedidoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Integer> produtosFiltrados = new ArrayList<>();

	public PesquisaPedidoBean() {
		this.produtosFiltrados = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			this.produtosFiltrados.add(i);
		}
	}

	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}

}
