package com.josevdev.credentials_vault.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @NotEmpty(message = "The email is required")
    @Column(unique = true)
    @Size(min = 5, max = 100, message = "Email must be between 5 and 100 characters long")
    private String email;

    @NotEmpty(message = "The name is required")
    @Size(max=50)
    private String name;

    @NotEmpty(message = "The password is required")
    @Size(min=8, max=100)
    private String password;

}
