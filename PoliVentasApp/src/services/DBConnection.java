package services;

import java.sql.*;


public class DBConnection {
//    private static Connection connection = null;
//    private static final String USER = "poliventas";
//    private static final String PASS = "1controlXYZW#";
//    private static final String DATABASE_PATH = "jdbc:mysql://den1.mysql4.gear.host/poliventas?useSSL=false";
//    
    private static Connection connection = null;
    private static final String USER = "neythan";
    private static final String PASS = "root";
    private static final String DATABASE_PATH = "jdbc:mysql://localhost:3306/poliventas?serverTimezone=UTC";
    static void createConnection(){

        if(connection != null){
            System.out.println("Ya existe una conección a la base de datos");
        }
        else {
            try {
                connection = DriverManager.getConnection(DATABASE_PATH ,USER ,PASS );
            } catch (SQLException e){
                System.out.println("Problema al crear la conexión con la base de datos");
                e.printStackTrace();
            } catch (Exception e){
                System.out.printf("Error: %s  causa: %s", e.getMessage() ,e.getCause() );
            }
        }
    }

    public static Connection getInstance() {

        if(connection == null)
            createConnection();

        return connection;
    }

    public static void shutdownConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.printf("Error al cerrar la coneccion (%s): %s ", e.getMessage(), e.getCause());
            }
        }
    }
}
