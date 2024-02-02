package co.project.common;


import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * API 처리 성공시 사용할 Response 객체
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> {

    public Response(T data){
        this.data = data;
    }

    /**
     * 클라이언트에서 필요한 응답 데이터
     * API에 맞게 필요한 객체를 생성하여 넣는다.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    /**
     * API 호출 고유값
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String traceId;
}