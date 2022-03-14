package br.com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Categoria;

public class CategoriaController {
private  CategoriaDAO categoriaDAO;
public CategoriaController() {
	Connection con=null;
		con = new ConnectionFactory().recuperarConexao();
	this.categoriaDAO= new CategoriaDAO(con);
}
	public List<Categoria> listar() {
		return this.categoriaDAO.listar();
		
	}
}
