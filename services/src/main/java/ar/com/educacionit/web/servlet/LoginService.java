package ar.com.educacionit.web.servlet;

import ar.com.educacionit.domain.dto.LoginDTO;
import ar.com.educacionit.services.exceptions.ServiceException;

public interface LoginService {

	boolean login(LoginDTO loginDto) throws ServiceException;
}