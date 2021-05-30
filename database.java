import java.sql.*;

class database {
        public static void main(String[] args){
            try {
            String dbUrl="jdbc:mysql://localhost:3306/student";

            String username =  "root";
            String password = "Pranjal$2001";
            //get a connection- step 1
            Connection myConnection = DriverManager.getConnection(dbUrl, username , password);
            //create a statement object - step 2

            Statement myStatement = myConnection.createStatement();
            //execute Query - step 3
            ResultSet myResultSet = myStatement.executeQuery("select * from students");

            //Procecss the result set
            while (myResultSet.next()){
                System.out.println("Student Full Name: " + myResultSet.getString("firstname")+" "+myResultSet.getString("lastname"));}

            }
            catch (Exception e) {
            System.out.println(e.getMessage());}
        }
}

///////////////////////////////////////////////////OUTPUT////////////////////////////////////////////////////////////////////////////////////////////////
//Student Full Name: Pranjal Parmar
