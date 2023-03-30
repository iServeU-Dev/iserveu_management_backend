package gr.iserveu.eshoplicence.api.response.base;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DeletedResp extends TimestampResp {
    private Boolean deleted;
}
