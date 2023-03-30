package gr.iserveu.eshoplicence.command.base;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class OrderCommand extends DeletedCommand {
    private Long ord;
}
