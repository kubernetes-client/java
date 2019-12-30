package io.kubernetes.client.extended.event.v1beta1;

import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Event;
import io.kubernetes.client.openapi.models.V1beta1Event;

// placeholder interface for event v1beta1 api
public interface EventSink {

  V1Event create(V1beta1Event event) throws ApiException;

  V1Event update(V1beta1Event event) throws ApiException;

  V1Event patch(V1beta1Event event, V1Patch patch) throws ApiException;
}
