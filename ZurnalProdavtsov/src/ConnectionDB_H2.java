

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;;

public class ConnectionDB_H2{

		public void connDB() throws ClassNotFoundException,SQLException{
	    Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:"
				+ "/Users/dmitrij/eclipse-workspace/ZurnalProdavtsov/lib/db",
				"sa","");
//		Statement st_0 = conn.createStatement();    
//    	st_0.execute("DROP TABLE STUDENTS IF EXISTS");
//    	st_0.execute("CREATE TABLE STUDENTS(ID INT PRIMARY KEY, NAME VARCHAR(255),  HOBBY VARCHAR(255));");
//    	st_0.execute("INSERT INTO STUDENTS VALUES(1, 'Ivanov', '');");
//    	st_0.execute("INSERT INTO STUDENTS VALUES(2, 'Petrov', 'Swim');");
//    	st_0.execute("INSERT INTO STUDENTS VALUES(3, 'Sidorov', '');");
//    	st_0.execute("INSERT INTO STUDENTS VALUES(4, 'Andreev', 'Wrestling');");
//    	st_0.execute("INSERT INTO STUDENTS VALUES(5, 'Dimitrij', 'vdv');");
//    	ResultSet result = st_0.executeQuery("SELECT * FROM STUDENTS");
      
      //Statement st_1 = conn.createStatement(); 
      //st_1.execute("DROP TABLE SHTRAF IF EXISTS");
      //st_1.execute("CREATE TABLE SHTRAF(ID_PK INT PRIMARY KEY,"
      //    	    + "DATE_SHTRAFA DATE(255),"
      //    	    + "SUMA_SHTRAFA INT,"
      //    	    + "OSNOVANIE VARCHAR(255));");
      //
      //     	ResultSet result_1 = st_1.executeQuery("SELECT * FROM SHTRAF");
      //     	if(result_1 !=null) {result_1.close();}
      //        if(st_1 !=null) {st_1.close();}
      //        if (conn != null) {conn.close();}
		
		
		Statement st = conn.createStatement();       
		String query= "SELECT * FROM SOTRUDNIK";
		ResultSet result= st.executeQuery(query);
         
		String id="",
			   lname="",
			   fname="",
			   sname="",
			   post="",
		       data_on="",
		    	   data_off="",
		    	   sub=""; 
          
		while (result.next()) {
			id = result.getString("ID");
            lname = result.getString("LAST_NAME");
            fname = result.getString("FIRST_NAME");
            sname = result.getString("SECOND_NAME");
            post= result.getString("POST");
            data_on =result.getString("DATE_ON");
            data_off =result.getString("DATE_OFF");
            sub= result.getString("SUBDIVISION");
            
//          hobby = result.getString("DATE_ON");
//             
//          		if (hobby.equals("")) {
//               	hobby = "Нет хобби";
//            	}
//          System.out.println(id +"| "+ name+"| "+ email+"| "+ data_on);
//          System.out.printf("%3s | %-10s | %-10s \n", id, name, hobby);  
    	        System.out.printf("%3s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s \n",
    	        		                id, lname,fname,sname,post,data_on,data_off,sub); 
    	       
        }       
        if(result !=null) {result.close();}
        if(st !=null) {st.close();}
        if (conn != null) {conn.close();}

   }
}