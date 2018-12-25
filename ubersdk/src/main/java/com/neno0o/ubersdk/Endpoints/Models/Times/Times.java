package com.neno0o.ubersdk.Endpoints.Models.Times;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Times {

    @Expose
    @SerializedName("times")
    private List<Time> timesList;

    public List<Time> getTimes() {
        return timesList;
    }

    public void setTimes(List<Time> times) {
        this.timesList = times;
    }
}
