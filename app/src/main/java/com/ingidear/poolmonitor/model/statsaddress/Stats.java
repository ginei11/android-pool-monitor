package com.ingidear.poolmonitor.model.statsaddress;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("hashes")
    @Expose
    private String hashes;

    @SerializedName("lastShare")
    @Expose
    private String lastShare;

    @SerializedName("balance")
    @Expose
    private String balance;

    @SerializedName("paid")
    @Expose
    private String paid;
    @SerializedName("hashrate")
    @Expose
    private String hashrate;

    public String getHashes() {
        return hashes;
    }

    public void setHashes(String hashes) {
        this.hashes = hashes;
    }

    public String getLastShare() {
        return lastShare;
    }

    public void setLastShare(String lastShare) {
        this.lastShare = lastShare;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }
    public String getHashrate() {
        return hashrate;
    }

    public void setHashrate(String hashrate) {
        this.hashrate = hashrate;
    }

}
