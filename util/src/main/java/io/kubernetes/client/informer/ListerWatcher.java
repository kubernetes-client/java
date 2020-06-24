package io.kubernetes.client.informer;

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Watchable;

public interface ListerWatcher<
    ApiType extends KubernetesObject, ApiListType extends KubernetesListObject> {

  ApiListType list(CallGeneratorParams params) throws ApiException;

  Watchable<ApiType> watch(CallGeneratorParams params) throws ApiException;
}
