package org.indymon.common.statuses;

import org.indymon.common.model.CheckStatus;

public class PutStatusRequest {

    private CheckStatus checksStatuses[];

    public CheckStatus[] getChecksStatuses() {
        return checksStatuses;
    }

    public void setChecksStatuses(CheckStatus[] checksStatuses) {
        this.checksStatuses = checksStatuses;
    }
}
