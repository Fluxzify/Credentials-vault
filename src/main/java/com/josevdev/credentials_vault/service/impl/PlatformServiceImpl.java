package com.josevdev.credentials_vault.service.impl;

import com.josevdev.credentials_vault.model.Platform;
import com.josevdev.credentials_vault.repository.PlatformRepository;
import com.josevdev.credentials_vault.service.PlatformService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlatformServiceImpl implements PlatformService {

    private final PlatformRepository platformRepository;
    @Override
    public Platform createPlatform(Platform platform) {

        return platformRepository.save(platform);
    }
}
