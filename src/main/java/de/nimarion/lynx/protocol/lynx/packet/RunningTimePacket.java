package de.nimarion.lynx.protocol.lynx.packet;

import de.nimarion.lynx.protocol.Event;
import de.nimarion.lynx.protocol.lynx.FinishLynxPacket;
import de.nimarion.lynx.protocol.lynx.event.RunningTimeEvent;

public class RunningTimePacket extends FinishLynxPacket {

    private static final byte[] PACKET_IDENTIFIER = new byte[] { 1, 84, 82, 2 };

    @Override
    public boolean isPacket(byte[] data) {
        if (data.length < PACKET_IDENTIFIER.length) {
            return false;
        }
        for (int i = 0; i < PACKET_IDENTIFIER.length; i++) {
            if (data[i] != PACKET_IDENTIFIER[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Event handleData(String data) {
        int startIndex = data.indexOf('\u0002');
        int lastIndex = data.lastIndexOf('\u0004');
        String time = data.substring(startIndex, lastIndex).trim();
        return new RunningTimeEvent(time);
    }
}