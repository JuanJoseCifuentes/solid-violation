package objetos;

public class EnvioMunicipal implements IEnvio {

    int id;
    int precio;
    int tiempoEntrega = 12;

    public EnvioMunicipal(int id, int precio) {
        this.id = id;
        this.precio = precio;
    }

    @Override
    public void cargarMercancia() {

    }

    @Override
    public void rastrearPaquete() {

    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public int getTiempoEntrega() {
        return this.tiempoEntrega;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
