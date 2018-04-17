package com.sda.builder;

import java.util.Arrays;

public class UserTest {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Anna")
                .lastName("Kaja")
                .phoneNumber("965864321")
                .birthDate("25-4-9876")
                .build();


        Arrays.asList(User.builder()
                        .firstName("Jakub")
                        .lastName("Kowalski")
                        .phoneNumber("222333444")
                        .birthDate("13-01-3656")
                        .build(),
                         User.builder()
                                 .firstName("asfdeagaja").build());
        UserWithLombok userWithLombok = new UserWithLombok.UserWithLombokBuilder()
                .firstName("Anna")
                .lastName("Kaja")
                .phoneNumber("123456789")
                .birthDate("31-10-6565")
                .build();



    }
}