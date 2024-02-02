package co.project.common.code;

public class ResponseCode {
    /**
     * (공통) 성공
     * */
    public static final int RESULT_SUCCESS = 1;

    /**
     * (공통) 실패
     * */
    public static final int RESULT_ERR = 0;
    public static final int COMMON_ERR_PARAM = 10004;
    public static final int COMMON_ERR_LOGIN = 10005;

    /**
     * 로그인 / 로그아웃 관련 에러 코드
     * */
    public static final int LOGIN_ERR = 20000;

    /**
     * 기본 파라미터 에러 오류
     * */
    public static final int PARAMETER_ERR = 10004;
    /**
     * (부가서비스 다운로드) 성공
     * */
    public static final String DOWNLOAD_SUCCESS = "N00000";

    /**
     * (부가서비스 다운로드) Internal 오류
     * */
    public static final String DOWNLOAD_INTERNAL_ERR = "EE4600";

    /**
     * (부가서비스 다운로드) Internal SQL 오류
     * */
    public static final String DOWNLOAD_INTERNAL_SQL_ERR = "EE4601";

    /**
     * (부가서비스 다운로드) 파라미터 정의 오류
     * */
    public static final String DOWNLOAD_PARAMETER_ERR = "";

    /**
     * (부가서비스 다운로드) 기타 오류
     * */
    public static final String DOWNLOAD_ETC_ERR = "EE4900";

    /**
     * (부가서비스 다운로드) 존재 하지 않는 부가서비스 상품ID 정보
     * */
    public static final String DOWNLOAD_NO_PROD_ID_ERR = "EE4501";

    /**
     * (부가서비스 다운로드) 존재 하지 않는 유저 정보
     * */
    public static final String DOWNLOAD_NO_STORE_USER_ERR = "EE4502";

    /**
     * (부가서비스 다운로드) 존재 하지 않는 서비스 업무 코드
     * */
    public static final String DOWNLOAD_NO_SVC_FLAG_ERR = "EE4402";

    /**
     * (부가서비스 다운로드) 중복 데이터
     * */
    public static final String DOWNLOAD_DUPLICATE_DATA_ERR = "EE4503";

    /**
     * (중국향) 상품정보 불일치
     * */
    public static final int CHINA_PRODUCT_ERROR = 1000;

    /**
     * (중국향) checksum 오류
     * */
    public static final int CHINA_CHECKSUM_ERROR = 1001;

    /**
     * (중국향) 유효성 체크 오류
     * */
    public static final int CHINA_VERIFY_ERROR = 1002;

    /**
     * (중국향) 필수 파라미터 누락
     * */
    public static final int CHINA_PARAM_MISSING_ERROR = 1003;

    /**
     * (중국향) 잘못된 유저 정보
     * */
    public static final int CHINA_USER_ERROR = 1004;

    /**
     * (중국향) 이미 구매 완료된 이용권
     * */
    public static final int CHINA_DUPLICATED_ERROR = 1005;

    /**
     * (중국향) 구매 내역 조회 에러
     * */
    public static final int CHINA_PURCHASE_HISTORY_LIST_ERROR = 1006;

    /**
     * (중국향) 환불 불가
     * */
    public static final int CHINA_NON_REFUNDABLE = 1007;

    /**
     * (중국향) ETC ERROR
     * */
    public static final int CHINA_ETC_ERROR = 9999;

    /**
     *  externalID 누락
     * */
    public static final String BUBBLE_EXTERNALID_MISSING = "10001";

    /**
     *  userToken 누락
     * */
    public static final String BUBBLE_USERTOKEN_MISSING = "10002";

    /**
     *  appVersion 누락
     * */
    public static final String BUBBLE_APPVERSION_MISSING = "10003";

    /**
     *  osType 누락
     * */
    public static final String BUBBLE_OSTYPE_MISSING = "10004";

    /**
     *  productID 누락
     * */
    public static final String BUBBLE_PRODUCTID_MISSING = "10005";

    /**
     *  dStoreOrderID 누락
     * */
    public static final String BUBBLE_DSTOREORDERID_MISSING = "10006";

    /**
     *  유저 정보 없음
     * */
    public static final String BUBBLE_USERDATA_EMPTY = "10007";

    /**
     *  예기치 않은 오류
     * */
    public static final String BUBBLE_UNEXPECTED_ERROR = "100010";

    /**
     * (일본향) 상품정보 불일치
     * */
    public static final int PLUS_PRODUCT_ERROR = 1000;

    /**
     * (일본향) checksum 오류
     * */
    public static final int PLUS_CHECKSUM_ERROR = 1001;

    /**
     * (일본향) 유효성 체크 오류
     * */
    public static final int PLUS_VERIFY_ERROR = 1002;

    /**
     * (일본향) 필수 파라미터 누락
     * */
    public static final int PLUS_PARAM_MISSING_ERROR = 1003;

    /**
     * (일본향) 잘못된 유저 정보
     * */
    public static final int PLUS_USER_ERROR = 1004;

    /**
     * (일본향) 이미 구매 완료된 이용권
     * */
    public static final int PLUS_DUPLICATED_ERROR = 1005;

    /**
     * (일본향) 구매 내역 조회 에러
     * */
    public static final int PLUS_PURCHASE_HISTORY_LIST_ERROR = 1006;

    /**
     * (일본향) 환불 불가
     * */
    public static final int PLUS_NON_REFUNDABLE = 1007;

    /**
     * (일본향) 구매 불가
     * */
    public static final int PLUS_NON_ORDERABLE = 1008;

    /**
     * (일본향) ETC ERROR
     * */
    public static final int PLUS_ETC_ERROR = 9999;



}
