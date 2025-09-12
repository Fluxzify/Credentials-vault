package com.josevdev.credentials_vault.service;


import com.josevdev.credentials_vault.model.Credential;

public interface CredentialService {

Credential createCredential(Credential credential);

String generateRandomPassword(Integer passwordLength);


}
