package com.josevdev.credentials_vault.controller;

import com.josevdev.credentials_vault.model.Credential;
import com.josevdev.credentials_vault.model.User;
import com.josevdev.credentials_vault.service.CredentialService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/credentials")
public class CredentialController {

    private final CredentialService credentialService;

    @PostMapping("/createCredential")
    @ResponseStatus(HttpStatus.CREATED)
    public Credential createCredential(@Valid @RequestBody Credential credential){

        return credentialService.createCredential(credential);

    }

}



