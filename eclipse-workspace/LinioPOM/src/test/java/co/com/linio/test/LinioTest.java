package co.com.linio.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.com.linio.PaginaPrincipal;

public class LinioTest extends BaseTest 
{
	PaginaPrincipal OBJPaginaPrincipal;

	@Test
	public void Test_Pinbus_Search() throws Exception 
	{
		String strProduct="Zapatos";
		 
		 Thread.sleep(5000);
		 OBJPaginaPrincipal= new PaginaPrincipal(driver, wait);
		 OBJPaginaPrincipal.FtnSearch(strProduct);
		 OBJPaginaPrincipal.FtnClickSearch();
		 
		
	}
}
