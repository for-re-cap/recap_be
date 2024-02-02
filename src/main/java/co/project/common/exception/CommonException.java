package co.project.common.exception;

/**
 * 인증 관련 오류
 */
public class CommonException extends Exception{

    public static class DefaultServerException extends Exception{
        public DefaultServerException(String message){
            super(message);
        }
    }

    public static class DefaultClientException extends Exception{
        public DefaultClientException(String message){
            super(message);
        }
    }

    public static class DefaultParameterException extends Exception{
        public DefaultParameterException(String message){
            super(message);
        }
    }

    public static class DuplicateLoginException extends Exception{
        public DuplicateLoginException(String message){
            super(message);
        }
    }

    public static class InvalidHashException extends Exception{
        public InvalidHashException(String message){ super(message); }
    }
}
