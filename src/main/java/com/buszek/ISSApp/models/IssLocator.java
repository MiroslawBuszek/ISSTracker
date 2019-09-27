package com.buszek.ISSApp.models;

public class IssLocator {
//    {"timestamp": 1569620088, "message": "success", "iss_position": {"latitude": "36.2992", "longitude": "-82.6124"}}
    private long timestamp;
    private String message;
    private IssPosition iss_position;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public IssPosition getIss_position() {
        return iss_position;
    }

    public void setIss_position(IssPosition iss_position) {
        this.iss_position = iss_position;
    }

    @Override
    public String toString() {
        return "IssLocator{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", iss_position=" + iss_position +
                '}';
    }
}
