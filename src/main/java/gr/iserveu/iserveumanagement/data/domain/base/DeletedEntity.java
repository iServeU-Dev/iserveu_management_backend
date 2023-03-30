package gr.iserveu.eshoplicence.data.domain.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@MappedSuperclass
public class DeletedEntity extends TimestampEntity {
    @Column(name = "deleted")
    private boolean deleted;
}


