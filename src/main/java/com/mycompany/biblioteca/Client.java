package com.mycompany.biblioteca;

public class Client extends Person {

    private int clientId;

    public Client(int clientId, String name, String identification,
                  String phone, String email) {

        super(name, identification, phone, email);

        this.clientId = clientId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}