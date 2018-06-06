package com.ayto.proyecto.dao;

import java.util.List;

import com.ayto.proyecto.modelo.DepartamentosAyto;
import com.ayto.proyecto.modelo.Usuarios;

public interface UsuariosDAO {
	
	public void insertarUsuarios(Usuarios u);
	public void borrarUsuarios(Usuarios u);
	public void modificarUsuarios(Usuarios u);
	public Usuarios detalleUsuarios(int idUsuario);
	public List<Usuarios> listarUsuarios();
	public List<Usuarios> listarUsuarioslibres();


	// Manejo DEPARTAMENTOS_AYTO
	public void insertarDepartamentosAyto(DepartamentosAyto da);
	public void borrarDepartamentosAyto(DepartamentosAyto da);
	public void modificarDepartamentosAyto(DepartamentosAyto da);
	public DepartamentosAyto detalleDepartamentosAyto(int idDepAyto);
	public List<DepartamentosAyto> listarDepartamentosAyto();



}
