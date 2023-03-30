package gr.iserveu.eshoplicence.api.response.base;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
public class TimestampResp extends BaseResp {
    private Timestamp lastUpdated;
}
