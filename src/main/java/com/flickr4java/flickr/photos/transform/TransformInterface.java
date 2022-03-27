

package com.flickr4java.flickr.photos.transform;

import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.Response;
import com.flickr4java.flickr.AbstractTransport;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anthony Eden
 * @version $Id: TransformInterface.java,v 1.6 2008/01/28 23:01:44 x-mago Exp $
 */
public class TransformInterface {

    public static final String METHOD_ROTATE = "flickr.photos.transform.rotate";

    private String apiKey;

    private String sharedSecret;

    private AbstractTransport transportAPI;

    public TransformInterface(String apiKey, String sharedSecret, AbstractTransport transportAPI) {
        this.apiKey = apiKey;
        this.sharedSecret = sharedSecret;
        this.transportAPI = transportAPI;
    }

    /**
     * Rotate the specified photo. The only allowed values for degrees are 90, 180 and 270.
     * 
     * @param photoId
     *            The photo ID
     * @param degrees
     *            The degrees to rotate (90, 170 or 270)
     */
    public void rotate(String photoId, int degrees) throws FlickrException {
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("method", METHOD_ROTATE);

        parameters.put("photo_id", photoId);
        parameters.put("degrees", String.valueOf(degrees));

        Response response = transportAPI.post(transportAPI.getPath(), parameters, apiKey, sharedSecret);
        if (response.isError()) {
            throw new FlickrException(response.getErrorCode(), response.getErrorMessage());
        }
    }

}
