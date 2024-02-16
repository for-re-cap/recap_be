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
     * 유효성 체크 오류
     * */
    public static final int VERIFY_ERROR = 1002;

    /**
     * 잘못된 유저 정보
     * */
    public static final int USER_ERROR = 1004;


}
