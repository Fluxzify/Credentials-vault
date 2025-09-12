package com.josevdev.credentials_vault.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
@Entity

public class Credential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @NotEmpty
    @Size(min = 5, max = 100, message = "Email must be between 5 and 100 characters long")
    private String email;

    @NotEmpty
    @Size(max=100)
    private String encryptedPassword;

    @ManyToOne
    private User user;

    @OneToOne
    private Credential credential;




}
