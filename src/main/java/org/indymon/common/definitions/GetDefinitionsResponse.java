package org.indymon.common.definitions;

import org.indymon.common.model.CheckDefinition;
import org.indymon.common.model.PresenterAggregatorDefinition;
import org.indymon.common.model.PresenterCheckDefinition;

import java.util.ArrayList;

public class GetDefinitionsResponse {

    private ArrayList<CheckDefinition> checks = new ArrayList<>();
    private ArrayList<PresenterAggregatorDefinition> presentersAggregators = new ArrayList<>();
    private ArrayList<PresenterCheckDefinition> presentersChecks = new ArrayList<>();

    public ArrayList<CheckDefinition> getChecks() {
        return checks;
    }

    public ArrayList<PresenterAggregatorDefinition> getPresentersAggregators() {
        return presentersAggregators;
    }

    public ArrayList<PresenterCheckDefinition> getPresentersChecks() {
        return presentersChecks;
    }
}
