package com.ayto.proyecto.service;

import java.util.List;

import com.ayto.proyecto.modelo.DepartamentosAyto;
import com.ayto.proyecto.modelo.Usuarios;

public interface ServiceUsuarios {
	public boolean insertarUsuarios(Usuarios u);
	public boolean borrarUsuarios(Usuarios u);
	public boolean modificarUsuarios(Usuarios u);
	public Usuarios detalleUsuarios(int idUsuario);
	public List<Usuarios> listarUsuarios();
	public List<Usuarios> listarUsuarioslibres();


	// Manejo DEPARTAMENTOS_AYTO
	public boolean insertarDepartamentosAyto(DepartamentosAyto da);
	public boolean borrarDepartamentosAyto(DepartamentosAyto da);
	public boolean modificarDepartamentosAyto(DepartamentosAyto da);
	public DepartamentosAyto detalleDepartamentosAyto(int idDepAyto);
	public List<DepartamentosAyto> listarDepartamentosAyto();



}
