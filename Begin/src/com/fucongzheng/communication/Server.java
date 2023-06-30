package com.fucongzheng.communication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        // Create a DatagramSocket and bind it to a specific port
        DatagramSocket socket = new DatagramSocket(12345);

        byte[] buffer = new byte[1024];

        while (true) {
            // Create a DatagramPacket for receiving data
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            // Receive data from the client
            socket.receive(packet);

            // Extract the received data
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received from client: " + message);

            // Prepare the response message
            String response = "Server response: " + message.toUpperCase();
            byte[] responseData = response.getBytes();

            // Create a DatagramPacket for sending the response back to the client
            DatagramPacket responsePacket = new DatagramPacket(responseData, responseData.length, packet.getAddress(), packet.getPort());

            // Send the response to the client
            socket.send(responsePacket);
        }
    }
}
