package objetos;

public interface IEnvio {

  int id = 0;

  void cargarMercancia();

  void rastrearPaquete();

  int getPrecio();

  int getTiempoEntrega();

  void setPrecio(int precio);
}
