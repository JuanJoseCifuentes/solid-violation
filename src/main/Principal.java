package main;

import bd.AwsBD;
import bd.SqlBD;
import bd.PostgressBD;

import logica.BdManager;

import objetos.EnvioInternacional;
import objetos.EnvioMunicipal;
import objetos.IEnvio;

public class Principal {

    public static void main(String[] args) {
        //BdManager manager = new BdManager(new AwsBD());
        //BdManager manager = new BdManager(new SqlBD());
        BdManager manager = new BdManager(new PostgressBD());

        IEnvio[] envios = {
                new EnvioMunicipal(1, 5000),
                new EnvioInternacional(2, 25000)
        };

        //Por cada envio en main, imprima el tiempo de envio
        imprimirTiempoDeEnvio(envios);

        //Por cada envio en main, carguelo a la base de datos
        subirEnviosBd(envios, manager);

        //Actualice el precio del envio, luego printee el precio actualizado
        manager.actualizarPrecio(envios[1], 26000);
        System.out.println(envios[1].getPrecio());
    }

    private static void subirEnviosBd(IEnvio[] envios, BdManager manager) {
        for (IEnvio envio : envios) {
            manager.cargarEnvio(envio);
        }
    }

    public static void imprimirTiempoDeEnvio(IEnvio[] envios) {
        for (IEnvio envio : envios) {
            System.out.println("Tiempo de envío: " + envio.getTiempoEntrega() + " horas");
        }
    }
}
