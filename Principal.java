package Encapsulamento;

public class Carro {
    private int Velocidade;
    private double gasolina = 5.29;
    private int estado;
    private boolean motor;
    private String marca;
    private int ano;
    private double motor1;

    public Carro (String marca, int ano, double motor1) {
        this.marca = marca;
        this.ano = ano;
        this.motor1 = motor1;
    }

    public boolean Verificar() {
        return this.motor;
    }

    public void Acelerar(int velocidade) {
        if (this.motor) {
            if (velocidade > 0 && velocidade < 180) {
                this.Velocidade += velocidade;
            } else {
                System.out.println("Menor que zero, ou maior que 180");
            }
        }
    }

    public void abastecer(double litros) {
        this.gasolina += litros;
    }

    public void Freiar() {
        this.Velocidade = 0;
    }

    public static void main(String[] args) {

    }
}
