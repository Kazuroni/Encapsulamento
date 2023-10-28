package Encapsulamento;

import java.util.Scanner;

public class Carro {
    private String marca;
    private int ano;
    private double motor;
    private boolean ligarMotor;
    private int velocidade;
    private int estado;
    private int gasolina;

    public Carro(String marca, int ano, double motor) {
    
        this.ligarMotor = false;
        this.velocidade = 0;
        this.estado = 0;
        this.gasolina = 0;
    }

    public void ligarMotor(int motorzinn) {
        if (motorzinn == 1) {
            ligarMotor = true;
        } else {
            ligarMotor = false;
        }
    }

    public void acelerar(int velocidade) {
        if (ligarMotor) {
            this.velocidade += velocidade;
        }
    }

    public void frear() {
        if (ligarMotor) {
            this.estado = 1;
        }
    }

    public void adicionarGasolina(int quantidade) {
        gasolina += quantidade;
    }

    public double calcularPrecoGasolina() {
        return gasolina * 2.5; // Preço fictício da gasolina
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.println("Digite o ano do carro: ");
        int ano = scanner.nextInt();

        System.out.println("Digite o motor do carro: ");
        double motor = scanner.nextDouble();

        Carro x = new Carro(marca, ano, motor);

        System.out.println("Digite 1 para ligar o motor: ");
        int motorzinn = scanner.nextInt();
        x.ligarMotor(motorzinn);

        System.out.println("Acelere o carro: ");
        int velocidade1 = scanner.nextInt();
        x.acelerar(velocidade1);
        System.out.println("Sua velocidade: " + x.velocidade);

        System.out.println("Digite a velocidade do carro: ");
        int velocidade2 = scanner.nextInt();
        x.acelerar(velocidade2);
        System.out.println("Sua velocidade: " + x.velocidade);

        System.out.println("Digite 1 para frear o carro: ");
        int freiou = scanner.nextInt();
        if (freiou == 1) {
            x.frear();
            System.out.println("Velocidade do carro: " + x.estado);
        }

        System.out.println("Quantos litros de gasolina você quer?");
        int gasosinha = scanner.nextInt();
        x.adicionarGasolina(gasosinha);

        double precoGasolina = x.calcularPrecoGasolina();
        System.out.println("O preço ficou: " + precoGasolina);

        scanner.close();
    }
}
