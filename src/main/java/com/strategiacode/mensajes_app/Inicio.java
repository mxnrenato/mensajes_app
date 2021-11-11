package com.strategiacode.mensajes_app;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conexion conexion = new Conexion();

        int opcion = 0;

        do{
            System.out.println("===========================");
            System.out.println("SC SERVICIO DE MENSAJERIA:");
            System.out.println("1.- CREAR MENSAJE: ");
            System.out.println("2.- LISTAR MENSAJES");
            System.out.println("3.- ELIMINAR MENSAJE: ");
            System.out.println("4.- EDITAR MENSAJE: ");
            System.out.println("5.- SALIR \n");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensaje();
                    break;
                case 3:
                    MensajesService.borrarMensaje();
                    break;
                case 4:
                    MensajesService.editarMensaje();
                    break;
                default:
                    break;
            }

        } while (opcion !=5);

        try (Connection con = conexion.get_connection()){

        } catch (SQLException e){
            System.out.println(e);
        }

    }

}
