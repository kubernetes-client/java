package io.kubernetes.client.util.informer.cache;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Watch;

public class MockListerWatcher<ApiType, ApiListType>
    implements ListerWatcher<ApiType, ApiListType> {

  private ApiListType list;

  public MockListerWatcher(ApiListType list) {
    this.list = list;
  }

  @Override
  public ApiListType list(CallGeneratorParams params) throws ApiException {
    return this.list;
  }

  @Override
  public Watch<ApiType> watch(CallGeneratorParams params) throws ApiException {
    return null;
  }
}
