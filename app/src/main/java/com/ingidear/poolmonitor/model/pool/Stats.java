package com.ingidear.poolmonitor.model.pool;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {
    @SerializedName("lastBlockFound")
    @Expose
    private String lastBlockFound;

    public String getLastBlockFound() {
        return lastBlockFound;
    }

    public void setLastBlockFound(String lastBlockFound) {
        this.lastBlockFound = lastBlockFound;
    }

}
