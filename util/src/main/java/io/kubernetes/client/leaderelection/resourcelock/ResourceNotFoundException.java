package io.kubernetes.client.leaderelection.resourcelock;

import io.kubernetes.client.ApiException;

/**
 * Created by IDEA on 2019-03-26 20:12
 *
 * @author yu
 */
public class ResourceNotFoundException extends ApiException {
    public ResourceNotFoundException() {

    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
