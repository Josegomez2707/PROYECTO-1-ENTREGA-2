package com.licocastillo.ecommerce.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/maintest")
public class maintest {

    @GetMapping
    public String ejecutar() {
        usuario usuario = new usuario(1, "Carlos Castillo", "carlos@licocastillo.com", "password123", "Av. Principal 123", "Cliente");

        producto producto1 = new producto(101, "Ron Añejo", "Ron añejado de alta calidad", 25.0f, 50, "Bebidas alcohólicas");
        producto producto2 = new producto(102, "Tequila Blanco", "Tequila artesanal", 40.0f, 30, "Bebidas alcohólicas");

        StringBuilder resultado = new StringBuilder();
        resultado.append("Detalles de productos:\n");
        resultado.append(producto1.obtenerDetalles()).append("\n");
        resultado.append(producto2.obtenerDetalles()).append("\n");

        descuento descuento1 = new descuento(103, "Whisky", "Whisky escocés premium", 50.0f, 20, "Bebidas alcohólicas", 10.0f, "2024-01-01", "2024-12-31");
        resultado.append("Información de descuento:\n");
        resultado.append(descuento1.mostrarDescuento()).append("\n");

        pedido pedido = new pedido(1001, "2024-10-28", "En proceso", usuario);
        pedido.calcularTotal(producto1.getPrecio());
        pedido.calcularTotal(producto2.getPrecio());
        resultado.append("Total del pedido antes de descuento: $").append(pedido.getTotal()).append("\n");

        List<producto> productosRecomendados = new ArrayList<>();
        productosRecomendados.add(producto1);
        productosRecomendados.add(producto2);

        recomendadoria recomendador = new recomendadoria(1, usuario, productosRecomendados);
        resultado.append("\nRecomendaciones de productos para ").append(usuario.getNombre()).append(":\n");
        recomendador.mostrarRecomendaciones().forEach(recom -> resultado.append(recom).append("\n"));

        pedido.actualizarEstado("Enviado");
        resultado.append("\nEstado actualizado del pedido: ").append(pedido.getEstado());

        return resultado.toString();
    }
}
