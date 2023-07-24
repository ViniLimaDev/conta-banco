/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contaterminal;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, insira o saldo: ");
        saldo = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("\"Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco"
                + ", sua agência é " + agencia + ""
                + ", conta "+ numero +" e seu saldo"
                + " " + saldo + " já está disponível para saque\".");
    }
}
