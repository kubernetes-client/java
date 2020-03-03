package io.kubernetes.client.extended.event.legacy;

import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Event;

public interface EventSink {

  V1Event create(V1Event event) throws ApiException;

  V1Event update(V1Event event) throws ApiException;

  V1Event patch(V1Event event, V1Patch patch) throws ApiException;
}
