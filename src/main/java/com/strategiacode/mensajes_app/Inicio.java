package com.strategiacode.mensajes_app;
import java.sql.Connection;
import java.sql.SQLException;

public class Inicio {

    public static void main(String[] args) {

        Conexion conexion = new Conexion();

        try (Connection con = conexion.get_connection()){

        } catch (SQLException e){
            System.out.println(e);
        }

    }

}
