package Exception;

public class CalculoCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			boolean flag = false;
			if(flag) {
				//crear una nueva exception
				throw new Exception("Error");
				//throw new CalculoExcepcion();
			}else {
				throw new CalculoExcepcion("Ocurrio un error en....");
			}
			//atrapar la exception
			//throws es para indicar que se lanza
		}catch(CalculoExcepcion e) {
			System.out.println("Estoy en CalculoExcepcion");
		}catch(Exception e) {
			System.out.println("Estoy en Exception");
		}
		
	}

}
