package com.zctech88.oceanengine.support;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
public class OceanEngineRestException extends RuntimeException {

    private int responsecode;

    private Error details;

    public OceanEngineRestException(String message) {
        super(message);
    }

    public OceanEngineRestException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public OceanEngineRestException(Throwable throwable) {
        super(throwable);
    }

    public int getResponsecode() {
        return responsecode;
    }

    public void setResponsecode(int responsecode) {
        this.responsecode = responsecode;
    }

    public Error getDetails() {
        return details;
    }

    public void setDetails(Error details) {
        this.details = details;
    }
}
