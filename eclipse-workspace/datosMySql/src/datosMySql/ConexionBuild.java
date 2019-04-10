package datosMySql;


import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConexionBuild {

	private static final String controlador = "com.mysql.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/searchinfo";
	private static final String user="root";
	private static final String password="";
	
	static {
		try {
			Class.forName(controlador);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
		public Connection conectar() {
			Connection conexion =null;
			try {
				conexion = (Connection) DriverManager.getConnection(url, user, password);
				System.out.println("Conexión OK");
			}catch(SQLException e) {
				System.out.println("Error en la conexión");
				e.printStackTrace();
			}
			return conexion;
		}


}
