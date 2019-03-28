package io.kubernetes.client.leaderelection.resourcelock;

import io.kubernetes.client.ApiClient;


public class ConfigMapLock extends ResourceLock {

  public ConfigMapLock(String name, String namespace, ApiClient client,
      ResourceLockConfig resourceLockConfig) {
    super(name, namespace, client, "v1", "ConfigMap", "configmaps", resourceLockConfig);
  }
}
