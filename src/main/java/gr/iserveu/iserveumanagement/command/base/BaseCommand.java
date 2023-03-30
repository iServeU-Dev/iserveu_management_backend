package gr.iserveu.eshoplicence.command.base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BaseCommand {
    @EqualsAndHashCode.Include
    private Long id;
    private UUID uid;
    private Timestamp created;
    private Boolean enabled;
}
