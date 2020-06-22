package ar.com.educacionit.services.main;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.exceptions.ServiceException;

public class InsertProducto {

	public static void main(String[] args) {
		
		ProductoServices service = new ProductoServicesImpl();

		Producto p = new Producto("Auriculares", 1050f,"COMP876", 16L);
		
		try {
			//ctrl + T
			service.nuevoProducto(p);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

}