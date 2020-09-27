package com.hackathon.rosatom.atombabr.controller;

/**
 * Класс "Сообщение" пока что без наворотов.
 * TODO: конструктор класса с проверкой параметров
 */

public class Message {
    private String sender;      //отправитель
    private String recipient;   //получатель
    private String message;     //текст сообщения


    public Message(String sender, String recipient, String message) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }
}
