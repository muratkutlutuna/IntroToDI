package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
import com.tpe.repository.Repo;

public class WhatsappService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        System.out.println("I am a whatsapp service. I am sending you this message: "+message.getMessage());

    }

    @Override
    public void saveMessage(Message message) {
        Repo repo = new DBRepository();
        repo.saveMessage(message);
    }
}
