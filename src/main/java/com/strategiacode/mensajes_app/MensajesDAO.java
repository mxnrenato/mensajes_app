package com.strategiacode.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensajes){
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_connection()) {

            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?) ";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensajes.getMensaje());
                ps.setString(2, mensajes.getAutor_mensajes());
                ps.executeUpdate();

                System.out.println("Mensaje creado con éxito");
            } catch (SQLException e ){
                System.out.println(e);
            }

        } catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void leerMensajesDB(){

        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            ResultSet rs = null;

            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println(("Mensaje: "+rs.getString("mensaje")));
                System.out.println("Autor: "+rs.getString("autor_mensaje"));
                System.out.println(("Fecha: "+rs.getString("fecha_mensaje")));
                System.out.println("\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }


    }

    public static void borrarMensajeDB(int id_mensaje){
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {

                String query = "DELETE FROM mensajes WHERE id = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("El mensaje ha sido borrado ¡! ");

            } catch (SQLException e){
                System.out.println(e);
            }
        } catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void actualizarMensajeDB(Mensajes mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps = null;

            try{
                String query = "UPDATE mensajes SET mensaje = ? WHERE id = ? ";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setInt(2, mensaje.getId_mensajes());
                ps.executeUpdate();
                System.out.println("El mensaje que actualizo correctamente ¡!");


            } catch(SQLException e){
                System.out.println(e);
            }
        } catch (SQLException e){
            System.out.println(e);
        }

    }
}
