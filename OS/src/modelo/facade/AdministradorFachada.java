package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class AdministradorFachada {
	Administrador administrador;
	AdministradorDAO administradorDAO = new AdministradorDAO();
	List<Administrador> administradores;


	public List<Administrador> getListarAdministrador() {

		administradores = administradorDAO.getListarAdministrador();

		return administradores;

	}

	public Administrador getAdministrador(int idAdministrador) {

		administrador = administradorDAO.getAdministrador(idAdministrador);

		return administrador;
	}
}
