package com.max.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PesquisaProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Integer> pedidosFiltrados = new ArrayList<>();

	public PesquisaProdutoBean() {
		this.pedidosFiltrados = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			this.pedidosFiltrados.add(i);
		}
	}

	public List<Integer> getProdutosFiltrados() {
		return pedidosFiltrados;
	}

}
