package org.indymon.common.statuses;

import org.indymon.common.model.CheckStatus;

import java.util.ArrayList;

public class GetStatusesResponse {

    private ArrayList<CheckStatus> checksStatuses = new ArrayList<>();

    public ArrayList<CheckStatus> getChecksStatuses() {
        return checksStatuses;
    }
}
