package com.max.pedidovenda.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;

import com.max.pedidovenda.model.Categoria;
import com.max.pedidovenda.repository.CategoriaRepository;

@FacesConverter(forClass = Categoria.class)
public class CategoriaConverter implements Converter<Categoria> {

	@Inject
	private CategoriaRepository categoriaRepository;

	@Override
	public Categoria getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Categoria retorno = null;

		if (StringUtils.isNotEmpty(value)) {
			Long id = Long.parseLong(value);
			retorno = this.categoriaRepository.porId(id);
		}

		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Categoria categoria) {
		if (categoria != null && categoria.getId() != null) {
			return ((Categoria) categoria).getId().toString();
		}

		return new String();
	}

}