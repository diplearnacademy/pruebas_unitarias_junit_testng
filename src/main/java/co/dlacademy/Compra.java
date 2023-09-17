package co.dlacademy;

import java.util.Date;

public class Compra {
    private Date fecha;
    private Carrito carrito;

    public Compra(Carrito carrito) {
        this.fecha = new Date();
        this.carrito = carrito;
    }

    public Date getFecha() {
        return fecha;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public double getTotal() {
        return carrito.calcularTotal();
    }
}

