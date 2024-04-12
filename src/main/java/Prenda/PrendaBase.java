package Prenda;

import Prenda.Prenda;
import Prenda.Categoria;
import Prenda.Tipo;

public abstract class PrendaBase implements Prenda {
    private Tipo tipo;
    private Categoria categoria;
    private String material;
    private Color colorPrimario;
    private Color colorSecundario;

    public PrendaBase(Tipo tipo, Categoria categoria, String material, Color colorPrimario, Color colorSecundario) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

    @Override
    public Tipo obtenerTipo() {return tipo; }

    @Override
    public Categoria obtenerCategoria() {
        return categoria;
    }

    @Override
    public String obtenerMaterial() {
        return material;
    }

    @Override
    public Color obtenerColorPrimario() {
        return colorPrimario;
    }

    @Override
    public Color obtenerColorSecundario() {
        return colorSecundario;
    }
}