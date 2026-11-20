package javax.wireless.messaging;

public interface TextMessage {
    String getPayloadText();
    void setPayloadText(String addr);
    void setAddress(String addr);
    String getAddress();
}
