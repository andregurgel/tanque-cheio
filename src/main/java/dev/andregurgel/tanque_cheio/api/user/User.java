package dev.andregurgel.tanque_cheio.api.user;

import dev.andregurgel.tanque_cheio.api.commons.address.Address;
import dev.andregurgel.tanque_cheio.api.commons.auditable_entity.AuditableEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Table(schema = "public", name = "user")
public class User extends AuditableEntity implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String surname;

    private String email;

    private String phone;

    private String password;

    @Embedded
    private Address address;
}
