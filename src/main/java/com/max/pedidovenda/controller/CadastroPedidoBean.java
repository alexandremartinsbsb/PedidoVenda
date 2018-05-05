package com.max.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.max.pedidovenda.model.EnderecoEntrega;
import com.max.pedidovenda.model.Pedido;

@Named
@ViewScoped
public class CadastroPedidoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Pedido pedido = new Pedido();
	private List<Integer> itens = new ArrayList<>();

	public CadastroPedidoBean() {
		this.pedido.setEnderecoEntrega(new EnderecoEntrega());
		this.itens.add(1);
	}

	public void salvar() {

	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Integer> getItens() {
		return itens;
	}

	public void setItens(List<Integer> itens) {
		this.itens = itens;
	}

}
