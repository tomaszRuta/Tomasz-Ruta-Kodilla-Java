package com.kodilla.stream.immutable;

public final class ForumUser {

    private final String username;
    private final String realName;

    public ForumUser(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public static void main(String[] args) {
        ForumUser forumUser = new ForumUser("tomasz.ruta", "Tomasz");
        System.out.println("username: " + forumUser.getUsername());
    }
}
