package org.indymon.common.definitions;

import org.indymon.common.model.CheckDefinition;
import org.indymon.common.model.PresenterAggregatorDefinition;
import org.indymon.common.model.PresenterCheckDefinition;

public class PutDefinitionsRequest {

    private CheckDefinition checks[];
    private PresenterCheckDefinition presentersChecks[];
    private PresenterAggregatorDefinition presentersAggregators[];

    public CheckDefinition[] getChecks() {
        return checks;
    }

    public void setChecks(CheckDefinition[] checks) {
        this.checks = checks;
    }

    public PresenterCheckDefinition[] getPresentersChecks() {
        return presentersChecks;
    }

    public void setPresentersChecks(PresenterCheckDefinition[] presentersChecks) {
        this.presentersChecks = presentersChecks;
    }

    public PresenterAggregatorDefinition[] getPresentersAggregators() {
        return presentersAggregators;
    }

    public void setPresentersAggregators(PresenterAggregatorDefinition[] presentersAggregators) {
        this.presentersAggregators = presentersAggregators;
    }
}
