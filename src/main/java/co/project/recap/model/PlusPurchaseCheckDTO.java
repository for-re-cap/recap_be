package co.project.recap.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author :
 * @package : com.ba.subscribe.api.vo.china
 * @name : OrderDTO.java
 * @date : 2022-11-29 10:55
 **/
@Data
@Getter
@Setter
@ToString
public class PlusPurchaseCheckDTO {

    /**
     * 어플 그룹 (필수)
     */
    private String appGroup;

    /**
     * Fan Plus Member ID (Fanplus에서 관리하는 사용자 고유 정보) (필수)
     */
    private String pmid;

    /**
     * Fanplus에서 관리하는 상품 그룹의 고유 키 값 (필수)
     */
    private String productGroupLinkedKey;

    /**
     * 위변조 체크 값 (필수)
     */
    private String checksum;

    public boolean checkOrderValidParam() {
        if (this.appGroup == null || this.appGroup.equals("")){
            return false;
        }
        if (this.pmid == null || this.pmid.equals("")){
            return false;
        }
        if (this.productGroupLinkedKey == null || this.productGroupLinkedKey.equals("")){
            return false;
        }
        if (this.checksum == null || this.checksum.equals("")){
            return false;
        }
        return true;
    }
}
