package org.indymon.common.definitions;

import org.indymon.common.model.CheckDefinition;
import org.indymon.common.model.PresenterAggregatorDefinition;
import org.indymon.common.model.PresenterCheckDefinition;

import java.util.ArrayList;

public class PutDefinitionsRequest {

    private ArrayList<CheckDefinition> checks;
    private ArrayList<PresenterCheckDefinition> presentersChecks;
    private ArrayList<PresenterAggregatorDefinition> presentersAggregators;

    public ArrayList<CheckDefinition> getChecks() {
        return checks;
    }

    public void setChecks(ArrayList<CheckDefinition> checks) {
        this.checks = checks;
    }

    public ArrayList<PresenterCheckDefinition> getPresentersChecks() {
        return presentersChecks;
    }

    public void setPresentersChecks(ArrayList<PresenterCheckDefinition> presentersChecks) {
        this.presentersChecks = presentersChecks;
    }

    public ArrayList<PresenterAggregatorDefinition> getPresentersAggregators() {
        return presentersAggregators;
    }

    public void setPresentersAggregators(ArrayList<PresenterAggregatorDefinition> presentersAggregators) {
        this.presentersAggregators = presentersAggregators;
    }

}
