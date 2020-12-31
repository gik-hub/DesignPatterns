package com.actitover.abstraction;

public class MailService {

    public void sendEmail() {
        connect();
        authenticate();
        // send email

        disconnect();
    }

    // Abstraction - hide these complexity from the consumer and only expose the send email
    private void authenticate() {
        System.out.println("Authenticate...");
    }

    private void connect() {
        System.out.println("Connect...");
    }

    private void disconnect() {
        System.out.println("Disconnect...");
    }
}
