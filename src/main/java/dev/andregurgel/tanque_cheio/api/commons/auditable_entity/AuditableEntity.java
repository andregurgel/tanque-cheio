package dev.andregurgel.tanque_cheio.api.commons.auditable_entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class AuditableEntity implements Serializable {
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "cannot_delete")
    private Boolean cannotDelete;

    @Column(name = "user_id")
    private Long userId;

    @PrePersist
    private void prePersist() {
        createdAt = LocalDateTime.now();
    }
}
