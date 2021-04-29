package com.river.zaloapp;

public class TinNhan {
    private int avatar;
    private String name;
    private String lastMessage;

    public TinNhan(int avatar, String name, String lastMessage) {
        this.avatar = avatar;
        this.name = name;
        this.lastMessage = lastMessage;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
