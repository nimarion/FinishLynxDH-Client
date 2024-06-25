package de.nimarion.lynx;

import de.nimarion.lynx.protocol.Event;

public abstract class EventHandler {

    public abstract void handleEvent(Event event);    
}
