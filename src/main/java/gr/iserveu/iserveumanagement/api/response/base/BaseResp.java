package gr.iserveu.eshoplicence.api.response.base;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Setter
@Getter
public class BaseResp {
    private UUID uid;
    private Timestamp created;
    private Boolean enabled;
}
