package co.project.recap.model;

import co.project.common.code.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author :
 * @package : com.ba.subscribe.api.vo.china
 * @name : PlusCommonResponseDTO.java
 * @date : 2023-11-24 15:21
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PlusCommonResponseDTO {

    private boolean status = false;

    private int statusCode = ResponseCode.PLUS_ETC_ERROR;
}
