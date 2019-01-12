package connectDB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import controller.Sotrudnik;

import java.sql.SQLException;;

public class ConnectionDB_H2{

	public Connection connDB() throws ClassNotFoundException,SQLException
	{
		Class.forName("org.h2.Driver");
		Connection connect = DriverManager.getConnection("jdbc:h2:"
				+ "/Users/dmitrij/git/ZP/ZurnalProdavtsov/lib/db","sa","");
		return connect;
	}
    
	public void seeAllTabSmena() 
	{
		String query= "SELECT * FROM SOTRUDNIK";
		try 
		{
			Statement st= connDB().createStatement();
			ResultSet result= st.executeQuery(query);
			
			// TODO: Доработать (добавить поля)
			String id="";
			
			while (result.next()) {
				id = result.getString("ID");
				
				System.out.printf("%3s |\n",id); 
			//______________________________________	
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		
	public void seeAllTabSotrudnik()
	{
		String query= "SELECT * FROM SOTRUDNIK";			
		try 
		{
			Statement st = connDB().createStatement();
			ResultSet result= st.executeQuery(query);
			     
			String  id="",
					lname="",
					fname="",
					sname="",
					post="",
					data_on="",
					data_off="",
					sub=""; 
	      
			while (result.next()) 
			{
				id = result.getString("ID");
				lname = result.getString("LAST_NAME");
				fname = result.getString("FIRST_NAME");
				sname = result.getString("SECOND_NAME");
				post= result.getString("POST");
				data_on =result.getString("DATE_ON");
				data_off =result.getString("DATE_OFF");
				sub= result.getString("SUBDIVISION");
	         
				System.out.printf("%3s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s \n",
		        		                id, lname,fname,sname,post,data_on,data_off,sub); 
			} 
				
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}       
	}			

	public void getNewSotrudnik(Sotrudnik sotrudnik)
	{
		String insert = "INSERT INTO SOTRUDNIK"
				+ "(LAST_NAME,"
				+ "FIRST_NAME,"
				+ "SECOND_NAME,"
				+ "POST"
				+ ",DATE_ON,"
				+ "SUBDIVISION)VALUES(?,?,?,?,?,?)";
		
		try {
			PreparedStatement prSt= connDB().prepareStatement(insert);
			prSt.setString(1, sotrudnik.getSurname());
			prSt.setString(2, sotrudnik.getName());
			prSt.setString(3, sotrudnik.getMiddleName());			
			prSt.setString(4, sotrudnik.getDolgnost());
			prSt.setObject(5, sotrudnik.getDataOn());
			
			//TODO Наименование организации доработать
			prSt.setString(6, "Кормилец");
			
			prSt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}