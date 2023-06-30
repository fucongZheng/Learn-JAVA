package com.fucongzheng.communication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        // Create a DatagramSocket
        DatagramSocket socket = new DatagramSocket();

        byte[] buffer;

        // Prepare the message to send
        String message = "Hello, Server!";
        buffer = message.getBytes();

        InetAddress serverAddress = InetAddress.getLocalHost(); // Change to the actual server IP if necessary
        int serverPort = 12345; // Change to the actual server port if necessary

        // Create a DatagramPacket for sending data to the server
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverAddress, serverPort);

        // Send the message to the server
        socket.send(packet);

        // Clear the buffer for receiving server response
        buffer = new byte[1024];

        // Create a DatagramPacket for receiving data from the server
        DatagramPacket responsePacket = new DatagramPacket(buffer, buffer.length);

        // Receive the response from the server
        socket.receive(responsePacket);

        // Extract the received data
        String response = new String(responsePacket.getData(), 0, responsePacket.getLength());
        System.out.println("Received from server: " + response);

        // Close the socket
        socket.close();
    }
}
