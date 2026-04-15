package e10_Estacionamento;

import java.util.Objects;

public class Carro {
    private String placa;
    private String modelo;

    public Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    // O equals foca na placa, que é única para cada veículo
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(placa, carro.placa);
    }

    @Override
    public String toString() {
        return modelo + " (Placa: " + placa + ")";
    }
}
