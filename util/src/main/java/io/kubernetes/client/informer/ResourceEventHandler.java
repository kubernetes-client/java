package io.kubernetes.client.informer;

public interface ResourceEventHandler<ApiType> {

  void onAdd(ApiType obj);

  void onUpdate(ApiType oldObj, ApiType newObj);

  void onDelete(ApiType obj, boolean deletedFinalStateUnknown);
}
