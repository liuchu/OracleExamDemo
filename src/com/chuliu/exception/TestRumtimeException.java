package com.chuliu.exception;

/**
 * Created by chuliu on 2017/6/2.
 */
public class TestRumtimeException extends RuntimeException {

    public TestRumtimeException(String message) {
        super(message);
    }

    public TestRumtimeException() {
        super();
    }


}
