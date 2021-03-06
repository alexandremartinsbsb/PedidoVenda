package com.max.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PesquisaClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Integer> clientesFiltrados = new ArrayList<>();

	public PesquisaClienteBean() {
		this.clientesFiltrados = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			this.clientesFiltrados.add(i);
		}
	}

	public List<Integer> getClientesFiltrados() {
		return this.clientesFiltrados;
	}

}
