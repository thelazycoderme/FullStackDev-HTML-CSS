package com.Mission.surgical_strike;


import jdk.nashorn.internal.objects.annotations.Getter;


public class Camp_Locations
{
    private double latitude;
    private double longitude;
    private float camp_radius;

    public Camp_Locations() {
    }

    public Camp_Locations(double latitude, double longitude, float camp_radius) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.camp_radius = camp_radius;
    }

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

    public float getCamp_radius() {
        return camp_radius;
    }

    public void setCamp_radius(float camp_radius) {
        this.camp_radius = camp_radius;
    }

    @Override
    public String toString() {
        return "Camp_Locations{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", camp_radius=" + camp_radius +
                '}';
    }
}
