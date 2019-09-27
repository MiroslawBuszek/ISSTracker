package com.buszek.ISSApp.models;

public class IssPosition {
    //    {"timestamp": 1569620088, "message": "success", "iss_position": {"latitude": "36.2992", "longitude": "-82.6124"}}
    private double latitude;
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "IssPosition{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
