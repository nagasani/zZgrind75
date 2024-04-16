package com.grind.misc;
class Message {
    private String content;
    private boolean isMessageSent = false;

    public synchronized void sendMessage(String message) {
        while (isMessageSent) {
            try {
                wait(); // Wait until the message is consumed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        content = message;
        isMessageSent = true;
        System.out.println("Sent message: " + message);
        notify(); // Notify the receiver thread that a message is available
    }

    public synchronized String receiveMessage() {
        while (!isMessageSent) {
            try {
                wait(); // Wait until a message is sent
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        isMessageSent = false;
        System.out.println("Received message: " + content);
        notify(); // Notify the sender thread that the message is consumed

        return content;
    }
}

class SenderThread extends Thread {
    private Message message;

    public SenderThread(Message message) {
        this.message = message;
    }

    public void run() {
        String[] messages = {"Hello", "World", "Goodbye"};

        for (String msg : messages) {
            message.sendMessage(msg);
        }
    }
}

class ReceiverThread extends Thread {
    private Message message;

    public ReceiverThread(Message message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            message.receiveMessage();
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Message message = new Message();

        SenderThread senderThread = new SenderThread(message);
        ReceiverThread receiverThread = new ReceiverThread(message);

        senderThread.start();
        receiverThread.start();

        try {
            senderThread.join();
            receiverThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
