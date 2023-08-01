package logica;

import objetos.IEnvio;

public interface BD {

    void crearEnvio(IEnvio envio);

    void eliminarEnvio(IEnvio envio);

    void actualizarEnvio(IEnvio envio, int precio);
}
