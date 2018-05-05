package com.max.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.max.pedidovenda.model.Categoria;
import com.max.pedidovenda.model.Produto;
import com.max.pedidovenda.repository.CategoriaRepository;
import com.max.pedidovenda.service.CadastroProdutoService;
import com.max.pedidovenda.util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Produto produto = new Produto();
	private Categoria categoria = new Categoria();
	private List<Categoria> categorias = new ArrayList<>();
	private List<Categoria> subCategorias = new ArrayList<>();

	@Inject
	private CategoriaRepository categoriasRepository;
	@Inject
	private CadastroProdutoService cadastroProdutoService;

	public CadastroProdutoBean() {
		this.limpar();
	}

	public void inicializar() {
		if (FacesUtil.isNotPostback()) {
			this.categorias = this.categoriasRepository.buscar();
		}
	}

	public void salvar() {
		this.produto = this.cadastroProdutoService.salvar(this.produto);
		this.limpar();
		FacesUtil.addInfoMessage("Produto salvo com sucesso!");
	}

	public void carregarSubcategoria() {
		this.subCategorias = this.categoriasRepository.buscarSubcategoria(this.categoria);
	}

	private void limpar() {
		this.produto = new Produto();
		this.categoria = new Categoria();
		this.subCategorias = new ArrayList<>();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getSubCategorias() {
		return subCategorias;
	}

}
