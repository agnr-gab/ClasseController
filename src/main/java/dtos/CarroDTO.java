package dtos;

public class CarroDTO {
private String modelo;
private String cor;
private int ano;
private String motor;

    public CarroDTO(String modelo, String cor, int ano, String motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
    }

    public CarroDTO() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
