package org.indymon.common.definitions;

public class PutDefinitionsResponse {

    private final long checksSavedCount;
    private final long presentersChecksSavedCount;
    private final long presentersAggregatorsSavedCount;

    public PutDefinitionsResponse(long checksSavedCount, long presentersChecksSavedCount, long presentersAggregatorsSavedCount) {
        this.checksSavedCount = checksSavedCount;
        this.presentersChecksSavedCount = presentersChecksSavedCount;
        this.presentersAggregatorsSavedCount = presentersAggregatorsSavedCount;
    }

    public long getChecksSavedCount() {
        return checksSavedCount;
    }

    public long getPresentersChecksSavedCount() {
        return presentersChecksSavedCount;
    }

    public long getPresentersAggregatorsSavedCount() {
        return presentersAggregatorsSavedCount;
    }
}
