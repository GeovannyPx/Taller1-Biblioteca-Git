package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createClient();
        listClients();
    }
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
    public static void listClients() {

        if (clients.isEmpty()) {
            System.out.println("No clients registered.");
            return;
        }

        for (Client client : clients) {
            System.out.println("----------------------------");
            System.out.println("Client ID: " + client.getClientId());
            System.out.println("Name: " + client.getName());
            System.out.println("Identification: " + client.getIdentification());
            System.out.println("Phone: " + client.getPhone());
            System.out.println("Email: " + client.getEmail());
        }

        System.out.println("----------------------------");
    }
    public static void findClient() {

        System.out.print("Enter client ID: ");
        int clientId = scanner.nextInt();
        scanner.nextLine();

        for (Client client : clients) {

            if (client.getClientId() == clientId) {
                System.out.println("Client found:");
                System.out.println("ID: " + client.getClientId());
                System.out.println("Name: " + client.getName());
                System.out.println("Identification: " + client.getIdentification());
                System.out.println("Phone: " + client.getPhone());
                System.out.println("Email: " + client.getEmail());
                return;
            }
        }

        System.out.println("Client not found.");
    }
    public static void updateClient() {
        System.out.print("Enter client ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Client client : clients) {
            if (client.getClientId() == id) {

                System.out.print("Enter new name: ");
                client.setName(scanner.nextLine());

                System.out.print("Enter new identification: ");
                client.setIdentification(scanner.nextLine());

                System.out.print("Enter new phone: ");
                client.setPhone(scanner.nextLine());

                System.out.print("Enter new email: ");
                client.setEmail(scanner.nextLine());

                System.out.println("Client updated successfully.");
                return;
            }
        }

        System.out.println("Client not found.");
    }
    public static void deleteClient() {
        System.out.print("Enter client ID to delete: ");
        int id = scanner.nextInt();

        for (Client client : clients) {
            if (client.getClientId() == id) {
                clients.remove(client);
                System.out.println("Client deleted successfully.");
                return;
            }
        }

        System.out.println("Client not found.");
    }
    public static void createBook() {
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        Book book = new Book(bookId, title, author, true);

        books.add(book);

        System.out.println("Book created successfully.");
    }
    public static void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books registered.");
            return;
        }

        for (Book book : books) {
            System.out.println("ID: " + book.getBookId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Available: " + book.isAvailable());
            System.out.println("--------------------");
        }
    }
    public static void findBook() {
        System.out.print("Enter book ID to search: ");
        int id = scanner.nextInt();

        for (Book book : books) {
            if (book.getBookId() == id) {
                System.out.println("Book found:");
                System.out.println("ID: " + book.getBookId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Available: " + book.isAvailable());
                return;
            }
        }

        System.out.println("Book not found.");
    }
    public static void updateBook() {
        System.out.print("Enter book ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Book book : books) {
            if (book.getBookId() == id) {

                System.out.print("Enter new title: ");
                book.setTitle(scanner.nextLine());

                System.out.print("Enter new author: ");
                book.setAuthor(scanner.nextLine());

                System.out.println("Book updated successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }
}
