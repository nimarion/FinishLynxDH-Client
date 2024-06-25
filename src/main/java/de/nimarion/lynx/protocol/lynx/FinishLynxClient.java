package de.nimarion.lynx.protocol.lynx;

import de.nimarion.lynx.TCPClient;
import de.nimarion.lynx.protocol.Event;
import de.nimarion.lynx.protocol.Packet;
import de.nimarion.lynx.protocol.ProtocolConfiguration;

public class FinishLynxClient extends TCPClient {

    public FinishLynxClient(String host, int port) {
        super(host, port);
    }

    public FinishLynxClient(ProtocolConfiguration protocolConfiguration) {
        super(protocolConfiguration);
    }

    @Override
    public void handleData(Packet packet, byte[] data) {
        Event event = packet.handleData(new String(data));
        if (event != null) {
            handleEvent(event);
        }
    }

}
