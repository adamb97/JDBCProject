package com.adam;




import java.sql.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String url = "jdbc:mysql://localhost:3306/ecommercedatatbase";
        String user = "root";
        String pw = "whateverpassword";

        try {
            // 1. Get a connection to the database
            Connection myConn = DriverManager.getConnection(url, user, pw);

            // 2. create a statement
            Statement myStatement = myConn.createStatement();

            // 3. Execute Statement

            String sql = "SELECT * FROM users;";

            ResultSet myResults = myStatement.executeQuery(sql);
            System.out.println("Execution complete");

            // 4. Process and print the result
            while(myResults.next()){
                System.out.println(myResults.getString("FirstName") + " , "  + myResults.getString("LastName") + " , " + myResults.getString("Email"));
            }
        } catch(Exception exc){
            exc.printStackTrace();
        }

    }
}
