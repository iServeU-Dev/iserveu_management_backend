package gr.iserveu.eshoplicence.data.domain.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Setter
@Getter
@MappedSuperclass
public class TimestampEntity extends BaseEntity {
    @Column(name = "last_updated")
    @UpdateTimestamp
    private Timestamp lastUpdated;
}