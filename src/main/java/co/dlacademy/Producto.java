package co.dlacademy;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        // el codigo a mostrar no incluye los throw
        // realizar las prubas unitarias haciendo TDD y al fallar preguntar como lo solucionamos

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("El precio del producto no puede ser negativo");
        }
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
