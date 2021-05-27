package com.hrapovick.behavioral.mediator;

public interface Chat {
    public void sendMessage(String message, User user);

    public void setAdmin(User admin);

    public void addUserToChat(User user);
}
