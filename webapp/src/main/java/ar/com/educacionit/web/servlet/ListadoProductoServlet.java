package ar.com.educacionit.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.collections.ComparadorProductoXDescripcion;
import ar.com.educacionit.services.exceptions.ServiceException;

/**
 * READ -> GET 
 * @author iturriaga
 *
 */

@WebServlet(urlPatterns = "/listado")

public class ListadoProductoServlet extends HttpServlet{

	private ProductoServices ps = new ProductoServicesImpl();
	
	
	
	//fitlrar los repetidos por descripcion
	
	TreeSet<Producto> pdsFiltrado = new TreeSet<Producto>(new ComparadorProductoXDescripcion());
			
	//CTRL+SPACE
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		try {
			Collection<Producto> pds = ps.findProductos();
			
			resp.getWriter().print("<h1> Hola soy un saludo</h1>");

			resp.getWriter().print(pds);
			
		}catch(ServiceException e) {
			resp.getWriter().print(e.getMessage());
		}
		*/
		//guardar informacion en el request
		//para mostrarlo en una jsp
		
		/*
		//crea mapa
		Map<String,String> map = new HashMap<String, String>();
		
		//carga
		map.compute("nom", "itu");
		
		//obtener
		String nombre = map.get("nombre");
		
		//recorrer un map
		Set<Map.Entry<String, String>> entry = map.entrySet();
		Iterator<Map.Entry<String, String>> it = entry.iterator();
		
		for(Map.Entry<String, String> entryAux : entry) {
			String clave = entryAux.getKey();
			String valor = entryAux.getValue();
		}
		*/
		
		List<String> nombres = new ArrayList<String>();
		nombres.add("Alejandro");
		nombres.add("Ana");
		nombres.add("Ariel");
		
		req.setAttribute("nombres", nombres);
		
		
		req.setAttribute("nombre", "itu");
		req.setAttribute("edad", "46");
		
		req.getRequestDispatcher("listado.jsp").forward(req, resp);
	}
	
}
