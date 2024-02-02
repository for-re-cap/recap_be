package co.project.recap.model;

import co.project.common.code.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author
 * @Project lysn-sktcsp-api
 * @Package com.lysn.skt.api.vo
 * @Date 2020-01-10 오후 5:22
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private int ret = ResponseCode.RESULT_SUCCESS;
    private int errorCode;
//    private String message = ResponseMsg.RESULT_SUCCESS;
}
