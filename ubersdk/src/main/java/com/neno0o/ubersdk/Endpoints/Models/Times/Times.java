package com.neno0o.ubersdk.Endpoints.Models.Times;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Times {

    @Expose
    @SerializedName("times")
    private List<Time> times;

    public List<Time> getTimes() {
        return times;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }
}
