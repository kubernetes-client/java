package io.kubernetes.client.informer;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Watchable;

public interface ListerWatcher<ApiType, ApiListType> {

  ApiListType list(CallGeneratorParams params) throws ApiException;

  Watchable<ApiType> watch(CallGeneratorParams params) throws ApiException;
}
