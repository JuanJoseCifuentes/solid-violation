package objetos;

public class EnvioInternacional implements IEnvio {

    int id;
    int precio;
    int tiempoEntrega = 190;

    public EnvioInternacional(int id, int precio) {
        this.id = id;
        this.precio = precio;
    }

    @Override
    public void cargarMercancia() {

    }

    @Override
    public void rastrearPaquete() {

    }

    public boolean permitidoEnAvion() {
        return (100 > this.precio);
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
