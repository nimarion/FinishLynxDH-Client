package de.nimarion.lynx.protocol.lynx.event;

import de.nimarion.lynx.protocol.lynx.FinishLynxEvent;

public class ResultEndEvent extends FinishLynxEvent {

    public ResultEndEvent() {
        super("RESULT_END");
       
    }
}
