package gr.iserveu.eshoplicence.data.domain.base;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "uid")
    private UUID uid;
    @Column(name = "enabled")
    private Boolean enabled;
    @Column(name = "created")
    @CreationTimestamp
    private Timestamp created;
}
