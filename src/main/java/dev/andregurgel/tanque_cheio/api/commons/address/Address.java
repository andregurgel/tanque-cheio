package dev.andregurgel.tanque_cheio.api.commons.address;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Embeddable
public class Address {
    @NotNull
    @Size(max = 16)
    @Column(name = "postal_code")
    private String postalCode;

    @NotNull
    @Size(max = 2)
    @Enumerated(EnumType.STRING)
    private StateEnum state;

    @NotNull
    @Size(max = 128)
    private String city;

    @NotNull
    @Size(max = 128)
    private String neighborhood;

    @NotNull
    @Size(max = 128)
    private String street;

    @NotNull
    @Size(max = 8)
    private String number;

    @Size(max = 64)
    private String complement;
}
