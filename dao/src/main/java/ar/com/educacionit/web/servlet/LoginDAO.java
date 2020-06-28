package ar.com.educacionit.web.servlet;

import ar.com.educacionit.dao.exceptions.GenericException;
import ar.com.educacionit.domain.dto.LoginDTO;

public interface LoginDAO {

	boolean loguear(LoginDTO loginDto) throws GenericException;;
}