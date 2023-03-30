package gr.iserveu.eshoplicence.data.domain.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class OrderEntity extends DeletedEntity {
    @Column(name = "ord")
    private Long ord;
}
