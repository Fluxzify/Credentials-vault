package com.josevdev.credentials_vault.service.impl;


import com.josevdev.credentials_vault.model.Credential;
import com.josevdev.credentials_vault.repository.CredentialRepository;
import com.josevdev.credentials_vault.service.CredentialService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
@RequiredArgsConstructor
public class CredentialServiceImpl implements CredentialService {
    private final CredentialRepository credentialRepository;

    @Override
    public Credential createCredential(Credential credential) {

        return credentialRepository.save(credential);

    }

    @Override
    public String generateRandomPassword(Integer passwordLength) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789"
                + "!@#$%^&*()-_+=";


        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();


        for (int i = 0; i < passwordLength; i++) {

            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));

        }

        String finalPassword = password.toString();


return finalPassword;
    }


}
