package com.neno0o.ubersdk.endpoints.models.useractivity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserActivity {

    /**
     * Position in pagination.
     */
    @Expose
    @SerializedName("offset")
    private int offset;

    /**
     * Number of items to retrieve (50 max).
     */
    @Expose
    @SerializedName("limit")
    private int limit;

    /**
     * Total number of items available.
     */
    @Expose
    @SerializedName("count")
    private int count;

    /**
     * User history.
     */
    @Expose
    @SerializedName("history")
    private List<UserHistory> history;


    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<UserHistory> getHistory() {
        return history;
    }

    public void setHistory(List<UserHistory> history) {
        this.history = history;
    }
}
