package co.project.common.exception;

import co.project.common.code.ResponseCode;
import co.project.recap.model.CommonResponseDTO;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice(annotations = RestController.class)
public class ExceptionAdvice extends Throwable{

    /**
     * 기본 오류 (서버측)
     * @param ex
     * @return
     */
    @ExceptionHandler(value = co.project.common.exception.CommonException.DefaultServerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CommonResponseDTO DefaultServerException(Exception ex){
        return new CommonResponseDTO(false,ResponseCode.RESULT_ERR );// HttpStatus.INTERNAL_SERVER_ERROR.value()

    }
    /**
     * 기본 오류 (클라이언트측)
     * @param ex
     * @return
     */
    @ExceptionHandler(value = co.project.common.exception.CommonException.DefaultClientException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResponseDTO DefaultClientException(Exception ex){
        ex.printStackTrace();
        return new CommonResponseDTO(false,ResponseCode.RESULT_ERR); // HttpStatus.BAD_REQUEST.value()

    }

    /**
     * 기본 파라미터 오류(certikey, devicekey)
     * @param ex
     * @return
     */
    @ExceptionHandler(value = co.project.common.exception.CommonException.DefaultParameterException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public CommonResponseDTO DefaultParameterException(Exception ex){
        return new CommonResponseDTO(false,ResponseCode.COMMON_ERR_PARAM); // HttpStatus.UNAUTHORIZED.value()
    }

    /**
     * 중복 로그인 오류
     * @param ex
     * @return
     */
    @ExceptionHandler(value = co.project.common.exception.CommonException.DuplicateLoginException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public CommonResponseDTO DuplicateLoginException(Exception ex){
        return new CommonResponseDTO(false,ResponseCode.COMMON_ERR_LOGIN); // HttpStatus.UNAUTHORIZED.value()
    }


    /**
     * INTERNAL_SERVER_ERROR
     * @param ex
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CommonResponseDTO exceptionHandler(Exception ex){
        ex.printStackTrace();
        return new CommonResponseDTO(false, ResponseCode.RESULT_ERR); // HttpStatus.INTERNAL_SERVER_ERROR.value());
    }
}
