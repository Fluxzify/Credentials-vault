package com.josevdev.credentials_vault.service.impl;

import com.josevdev.credentials_vault.repository.CredentialRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class CredentialServiceImplTest {

    private final CredentialRepository credentialRepository = mock(CredentialRepository.class);
    private final CredentialServiceImpl service = new CredentialServiceImpl(credentialRepository);

    @Test
    void testPasswordLength() {
        int length = 16;
        String password = service.generateRandomPassword(length);
        assertEquals(length, password.length(), "Password must have the requested length");
    }

    @Test
    void testPasswordContainsUppercase() {
        String password = service.generateRandomPassword(20);
        assertTrue(password.chars().anyMatch(Character::isUpperCase), "Password must contain at least one uppercase letter");
    }

    @Test
    void testPasswordContainsLowercase() {
        String password = service.generateRandomPassword(20);
        assertTrue(password.chars().anyMatch(Character::isLowerCase), "Password must contain at least one lowercase letter");
    }

    @Test
    void testPasswordContainsDigit() {
        String password = service.generateRandomPassword(20);
        assertTrue(password.chars().anyMatch(Character::isDigit), "Password must contain at least one digit");
    }

    @Test
    void testPasswordContainsSpecialChar() {
        String specialChars = "!@#$%^&*()-_+=";
        String password = service.generateRandomPassword(20);
        assertTrue(password.chars().anyMatch(c -> specialChars.indexOf(c) >= 0), "Password must contain at least one special character");
    }

    @Test
    void testRandomness() {
        String pw1 = service.generateRandomPassword(16);
        String pw2 = service.generateRandomPassword(16);
        assertNotEquals(pw1, pw2, "Two consecutively generated passwords should be different");
    }

    @Test
    void testZeroLengthPassword() {
        String password = service.generateRandomPassword(0);
        assertEquals(0, password.length(), "If length 0 is requested, the password should be empty");
    }
}
