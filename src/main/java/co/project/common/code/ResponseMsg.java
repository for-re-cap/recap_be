package co.project.common.code;

public class ResponseMsg {

    /**
     * (공통) 성공
     * */
    public static final String RESULT_SUCCESS = "정상";

    /**
     * (공통) SKT 이용자가 아닌 경우
     * */
    public static final int NO_SKT_USER_ERR = 60007;

    /**
     * (공통) 부가서비스 가입 목록이 없는 경우
     * */
    public static final int NO_DATA_ERR = 60003;

    /**
     * (부가서비스 다운로드) 성공
     * */
    public static final String DOWNLOAD_SUCCESS = "정상";

     /**
     * (부가서비스 다운로드) Internal 오류
     * */
    public static final String DOWNLOAD_INTERNAL_ERR = "내부 오류 - Internal 오류";

    /**
     * (부가서비스 다운로드) Internal SQL 오류
     * */
    public static final String DOWNLOAD_INTERNAL_SQL_ERR = "내부 오류 - DB 오류";

    /**
     * (부가서비스 다운로드) 파라미터 정의 오류
     * */
    public static final String DOWNLOAD_PARAMETER_ERR = "파라미터 정의 오류가 발생하였습니다.";

    /**
     * (부가서비스 다운로드) 기타 오류
     * */
    public static final String DOWNLOAD_ETC_ERR = "기타";

    /**
     * (부가서비스 다운로드) 존재하지 않는 부가서비스 상품ID로 요청하는 경우
     * */
    public static final String DOWNLOAD_NO_PROD_ID_ERR = "데이터 오류 - 존재하지 않는 정보";

    /**
     * (부가서비스 다운로드) 존재하지 않는 핸드폰 번호로 요청하는 경우
     * */
    public static final String DOWNLOAD_NO_STORE_USER_ERR = "데이터 오류 - 가입되지 않는 정보";

    /**
     * (부가서비스 다운로드) 존재하지 않는 서비스 업무 코드로 요청하는 경우
     * */
    public static final String DOWNLOAD_NO_SVC_FLAG_ERR = "전문 오류 - 업무코드 에러";

    /**
     * (부가서비스 다운로드) 중복 데이터로 요청하는 경우
     * */
    public static final String DOWNLOAD_DUPLICATE_DATA_ERR = "데이터 오류 - 중복 데이터";

    /**
     * 만료된 영수증(안드로이드) 검증 오류
     * */
    public static final int EXPIRED_RECEIPT_ERR = 410;

}
