package de.nimarion.lynx.protocol.lynx.event;

import java.util.List;

import de.nimarion.lynx.protocol.lynx.FinishLynxEvent;

public class FullResultsEvent extends FinishLynxEvent{

    private final String raceId;
    private final List<ResultLineEvent> results;

    public FullResultsEvent(String raceId, List<ResultLineEvent> results) {
        super("FULL_RESULT");
        this.raceId = raceId;
        this.results = results;
    }

    public String getRaceId() {
        return raceId;
    }

    public List<ResultLineEvent> getResults() {
        return results;
    }
      
    
}
