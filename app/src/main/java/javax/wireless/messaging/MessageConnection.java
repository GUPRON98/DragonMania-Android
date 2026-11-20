package javax.wireless.messaging;

import java.io.IOException;

public interface MessageConnection {
    TextMessage newMessage(String type);
    void send(TextMessage msg) throws IOException;
    void close() throws IOException;
}
