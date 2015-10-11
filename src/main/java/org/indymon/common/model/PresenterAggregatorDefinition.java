package org.indymon.common.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PresenterAggregatorDefinition extends PresenterDefinition {

    Set<String> subPresenters = new HashSet<>();
    private List<String> subPresentersMessages = new ArrayList<>();

    public Set<String> getSubPresenters() {
        return subPresenters;
    }

    public void setSubPresenters(Set<String> subPresenters) {
        this.subPresenters = subPresenters;
    }

    public List<String> getSubPresentersMessages() {
        return subPresentersMessages;
    }

    public void setSubPresentersMessages(List<String> subPresentersMessages) {
        this.subPresentersMessages = subPresentersMessages;
    }

}
