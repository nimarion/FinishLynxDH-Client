package de.nimarion.lynx;

import de.nimarion.lynx.protocol.Event;
import de.nimarion.lynx.protocol.Packet;

public interface Client {

    public void handleEvent(Event event);

    public void handleData(Packet packet, byte[] data);

    public void addEventHandler(EventHandler eventHandler);

    public void removeEventHandler(EventHandler eventHandler);
    
}
