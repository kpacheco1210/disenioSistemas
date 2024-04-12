package Prenda;

import static java.util.Objects.requireNonNull;

public interface Prenda {
    Tipo obtenerTipo();
    Categoria obtenerCategoria();
    String obtenerMaterial();
    Color obtenerColorPrimario();
    Color obtenerColorSecundario();
}
