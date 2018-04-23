package com.max.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class CadastroClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Integer> itens = new ArrayList<>();

	public CadastroClienteBean() {
		this.itens = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			this.itens.add(i);
		}
	}

	public List<Integer> getItens() {
		return itens;
	}

}
