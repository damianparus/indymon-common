package org.indymon.common.statuses;

public class PutStatusResponse {

    private final long checksStatusesSavedCount;

    public PutStatusResponse(long checksStatusesSavedCount) {
        this.checksStatusesSavedCount = checksStatusesSavedCount;
    }

    public long getChecksStatusesSavedCount() {
        return checksStatusesSavedCount;
    }
}
