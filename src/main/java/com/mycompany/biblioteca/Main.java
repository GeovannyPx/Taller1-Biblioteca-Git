package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;

        do {
            System.out.println("\n===== LIBRARY SYSTEM =====");
            System.out.println("1. Create client");
            System.out.println("2. List clients");
            System.out.println("3. Find client");
            System.out.println("4. Update client");
            System.out.println("5. Delete client");
            System.out.println("6. Create book");
            System.out.println("7. List books");
            System.out.println("8. Find book");
            System.out.println("9. Update book");
            System.out.println("10. Delete book");
            System.out.println("0. Exit");
            System.out.print("Enter an option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    createClient();
                    break;

                case 2:
                    listClients();
                    break;

                case 3:
                    findClient();
                    break;

                case 4:
                    updateClient();
                    break;

                case 5:
                    deleteClient();
                    break;

                case 6:
                    createBook();
                    break;

                case 7:
                    listBooks();
                    break;

                case 8:
                    findBook();
                    break;

                case 9:
                    updateBook();
                    break;

                case 10:
                    deleteBook();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 0);
    }1
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

        if (Main.clients.isEmpty()) {
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

        Book book = new Book(
                bookId,
                title,
                author,
                true
        );

        books.add(book);

        System.out.println("Book created successfully.");
    }
    public static void listBooks() {

        if (books.isEmpty()) {
            System.out.println("No books registered.");
            return;
        }

        for (Book book : books) {
            System.out.println("----------------------------");
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Available: " + book.isAvailable());
        }

        System.out.println("----------------------------");
    }
    public static void findBook() {

        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        for (Book book : books) {

            if (book.getBookId() == bookId) {
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
        int bookId = scanner.nextInt();
        scanner.nextLine();

        for (Book book : books) {

            if (book.getBookId() == bookId) {

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
    public static void deleteBook() {

        System.out.print("Enter book ID to delete: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        for (Book book : books) {

            if (book.getBookId() == bookId) {
                books.remove(book);
                System.out.println("Book deleted successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }
}
