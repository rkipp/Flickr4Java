/**
 * @author acaplan
 */
package com.flickr4java.flickr.push;

import com.flickr4java.flickr.AbstractTransport;

/**
 * @author acaplan
 * 
 */
public class PushInterface {

    public static final String METHOD_GET_SUBSCRIPTIONS = "flickr.push.getSubscriptions";

    public static final String METHOD_GET_TOPICS = "flickr.push.getTopics";

    public static final String METHOD_SUBSCRIBE = "flickr.push.subscribe";

    public static final String METHOD_UNSUBSCRIBE = "flickr.push.unsubscribe";

    private String apiKey;

    private String sharedSecret;

    private AbstractTransport transportAPI;

    /**
     * 
     * @param apiKey
     * @param sharedSecret
     * @param transportAPI
     */
    public PushInterface(String apiKey, String sharedSecret, AbstractTransport transportAPI) {
        this.apiKey = apiKey;
        this.sharedSecret = sharedSecret;
        this.transportAPI = transportAPI;
    }

}
