package bd;

import logica.BD;
import objetos.IEnvio;

public class PostgressBD implements BD {
    @Override
    public void crearEnvio(IEnvio envio) {
        System.out.println("Cargando el envio con ID " + envio.id + " a Postgress");
    }

    @Override
    public void eliminarEnvio(IEnvio envio) {
        System.out.println("Eliminando el envio con ID " + envio.id + " de Postgress");
    }

    @Override
    public void actualizarEnvio(IEnvio envio,  int precio) {
        envio.setPrecio(precio);
        System.out.println("Modificando el envio con ID " + envio.id + " en Postgress");
    }
}
