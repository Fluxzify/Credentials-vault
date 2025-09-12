package com.josevdev.credentials_vault.controller;

import com.josevdev.credentials_vault.model.Platform;
import com.josevdev.credentials_vault.service.PlatformService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/platforms")
@RequiredArgsConstructor

public class PlatformController {

    private final PlatformService platformService;


    @PostMapping("/createPlatform")
    @ResponseStatus(HttpStatus.CREATED)
    public Platform createPlatform(@Valid @RequestBody Platform platform) {
        return platformService.createPlatform(platform);
    }
}