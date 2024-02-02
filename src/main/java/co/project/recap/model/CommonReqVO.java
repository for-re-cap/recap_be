package co.project.recap.model;

import lombok.*;

/**
 * 사용자의 request에 대한 기본 param
 */
@Data
public class CommonReqVO {

    private String deviceKey;
    private String language;
    private String locale;
    private String version;
    private int osType;
    private String appGroup;
}
