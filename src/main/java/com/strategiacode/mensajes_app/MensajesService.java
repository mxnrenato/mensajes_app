package com.strategiacode.mensajes_app;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MensajesService {

    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Nombre: ");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensajes(nombre);

        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMensaje(){
        MensajesDAO.leerMensajesDB();
    }

    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el ID correspondiente al mesaje que deseas borar ¿?: ");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);

    }

    public static void editarMensaje(){
        Scanner sc = new Scanner((System.in));
        System.out.println("Escribe el nuevo mensaje: ");
        String mensaje = sc.nextLine();

        System.out.println("Cual es el ID correspondiente al mensaje a editar: ");
        int id_mensaje = sc.nextInt();
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setId_mensajes(id_mensaje);

        MensajesDAO.actualizarMensajeDB(registro);
    }

}
