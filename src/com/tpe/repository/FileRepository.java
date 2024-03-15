package com.tpe.repository;

import com.tpe.domain.Message;

public class FileRepository implements Repo{
    @Override
    public void saveMessage(Message message) {
        System.out.println("Your message is saved to FILE: "+message.getMessage());

    }
}
