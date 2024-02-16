package co.project.recap.model;

import co.project.common.code.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author :
 * @package : co.project.recap.model
 * @name : CommonResponseDTO.java
 * @date :
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponseDTO {

    private boolean status = false;

    private int statusCode = ResponseCode.RESULT_ERR;
}
