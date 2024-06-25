package de.nimarion.lynx.protocol.lynx;

import de.nimarion.lynx.protocol.Event;
import de.nimarion.lynx.protocol.Packet;

public class FinishLynxPacket implements Packet {

    @Override
    public boolean isPacket(byte[] data) {
        return false;
    }

    @Override
    public Event handleData(String data) {
        throw new UnsupportedOperationException("Unimplemented method 'handleData'");
    }

}
