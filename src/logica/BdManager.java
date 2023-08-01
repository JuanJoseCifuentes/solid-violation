package logica;

import objetos.IEnvio;

public class BdManager {

    BD bd;

    public BdManager(BD bd) {
        this.bd = bd;
    }

    public void cargarEnvio(IEnvio envio) {
        bd.crearEnvio(envio);
    }

    public void eliminarEnvio(IEnvio envio){
        bd.eliminarEnvio(envio);
    }

    public void actualizarPrecio(IEnvio envio, int precio){
        bd.actualizarEnvio(envio, precio);
    }

}
