package co.project.recap.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * /api/v1/bubble/room/message
 * 답장 발송에 대한 response
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecapRespDTO {

    /**
     * 답장 시간
     */
    private String time;
}
