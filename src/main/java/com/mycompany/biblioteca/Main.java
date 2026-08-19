package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void createClient() {

        System.out.print("Enter client ID: ");
        int clientId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter identification: ");
        String identification = scanner.nextLine();

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Client client = new Client(
                clientId,
                name,
                identification,
                phone,
                email
        );

        clients.add(client);

        System.out.println("Client created successfully.");
    }
}
