package io.kubernetes.client.util.informer.cache;

import io.kubernetes.client.informer.cache.Store;
import java.util.List;

public class MockStore<ApiType> implements Store<ApiType> {

  @Override
  public void add(ApiType obj) {}

  @Override
  public void update(ApiType obj) {}

  @Override
  public void delete(ApiType obj) {}

  @Override
  public void replace(List<ApiType> list, String resourceVersion) {}

  @Override
  public void resync() {}

  @Override
  public List<String> listKeys() {
    return null;
  }

  @Override
  public Object get(ApiType obj) {
    return null;
  }

  @Override
  public ApiType getByKey(String key) {
    return null;
  }

  @Override
  public List<ApiType> list() {
    return null;
  }
}
