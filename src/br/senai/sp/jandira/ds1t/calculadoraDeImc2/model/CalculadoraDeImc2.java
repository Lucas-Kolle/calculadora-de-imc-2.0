package br.senai.sp.jandira.ds1t.calculadoraDeImc2.model;

import java.util.Scanner;

public class CalculadoraDeImc2 {
    String nomePaciente;
    double pesoPaciente;
    double alturaPaciente;
    double imcDoPaciente;
    String situacaoDoPaciente;

    public void receberDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("-----------------------------------------------");
        System.out.println("***CALCULADORA DE IMC***");
        System.out.println("-----------------------------------------------");

        System.out.print("Digite o nome do paciente: ");
        nomePaciente = leitor.nextLine();

        System.out.print("Digite o peso do paciente: ");
        pesoPaciente = leitor.nextDouble();

        System.out.print("Digite a altura do paciente: ");
        alturaPaciente = leitor.nextDouble();

        calcularImc();
    }

    public void calcularImc(){

        double alturaAoQuadrado;
        alturaAoQuadrado = alturaPaciente * alturaPaciente;

        imcDoPaciente = pesoPaciente / alturaAoQuadrado;

        determinarSituacao();
    }

    public void determinarSituacao(){

        if (imcDoPaciente <= 18.5){
            situacaoDoPaciente = "Abaixo Do Peso";

        } else if ( imcDoPaciente <= 24.9  ) {
            situacaoDoPaciente = "peso ideal";

        } else if ( imcDoPaciente <= 29.9){
            situacaoDoPaciente = "Levemente acima do peso";

        } else if ( imcDoPaciente <= 34.9){
            situacaoDoPaciente = "obesidade grau 1";

        }else if (imcDoPaciente <= 39.9){
            situacaoDoPaciente = "obesidade grau 2 (severa)";

        }else {
            situacaoDoPaciente = "obesidade grau 3 (mórbida)";
        }

        exibirResultados();
    }

    public void exibirResultados(){
        String imcDoPacienteComDoisDecimais = String.format("%.2f", imcDoPaciente);
        System.out.println("***RESULTADO***");
        System.out.println("Paciente: " + nomePaciente);
        System.out.println("IMC Calculado: " + imcDoPacienteComDoisDecimais);
        System.out.println("Situacao do paciente: " + situacaoDoPaciente);
        System.out.println("-----------------------------------------------");
    }


}
