package com.codingdie.rwsdatabase.connection.model;

import java.io.File;

/**
 * Created by xupen on 2016/8/22.
 */
public class InitSQLiteConnectionPoolConfig {
    private int  maxCount;
    private String dbPath;

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public String getDbPath() {
        return dbPath;
    }

    public void setDbPath(String dbPath) {
        this.dbPath = dbPath;
    }

}
