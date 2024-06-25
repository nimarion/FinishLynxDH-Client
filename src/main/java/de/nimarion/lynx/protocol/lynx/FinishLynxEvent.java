package de.nimarion.lynx.protocol.lynx;

import de.nimarion.lynx.protocol.Event;

public class FinishLynxEvent extends Event {

    public FinishLynxEvent(String type) {
        super("LYNX_" + type);
    }
    
}
