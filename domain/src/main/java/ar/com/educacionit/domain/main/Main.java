package ar.com.educacionit.domain.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.jse.jdbc.AdministradorDeConexiones;

public class Main {
	
	public static void main(String[] args) {
		
		//Obtener una conexion desde la calse
		try {
 			Connection conection = AdministradorDeConexiones.obtenerConexion();
 			
 			Statement st = conection.createStatement();
 			
 			ResultSet rs = st.executeQuery("SELECT * FROM producto");
 			
 			if (rs.next()) {
 				
 				Long id1 = rs.getLong(1);
 				String descripcion = rs.getString(2);
 				Float precio = rs.getFloat(3);
 				String codigo = rs.getString(4);
 				
 				Producto prd = new Producto(id1, descripcion, precio, codigo);
 				System.out.println(prd);
 				
 			}
 			
 			 			
 			//System.out.println("Valor obtenido = "+id);
 			
			boolean alive = !conection.isClosed();
			System.out.println(alive);
			conection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
