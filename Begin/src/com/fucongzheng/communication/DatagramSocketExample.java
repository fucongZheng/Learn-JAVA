package com.fucongzheng.communication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/*
在这个例子中，我们创建了一个DatagramSocket，
并向指定的IP地址和端口发送一个包含消息“Hello，DatagramSSocket！”的数据报。然后，我们收到一个响应数据报，并打印收到的消息。最后，我们合上插座。

请注意，您可能需要根据您的特定场景更改IP地址和端口来调整代码。
 */
public class DatagramSocketExample {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket for sending and receiving datagrams
            DatagramSocket socket = new DatagramSocket();

            String message = "Hello, DatagramSocket!";
            byte[] sendData = message.getBytes();
            InetAddress ipAddress = InetAddress.getByName("localhost");
            int port = 12345;

            // Create a DatagramPacket to send the data
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, port);

            // Send the packet
            socket.send(sendPacket);
            System.out.println("Sent: " + message);

            // Create a buffer to receive incoming datagrams
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            // Receive a packet
            socket.receive(receivePacket);

            // Process the received data
            String receivedMessage = new String(receivePacket.getData());
            System.out.println("Received: " + receivedMessage);

            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
