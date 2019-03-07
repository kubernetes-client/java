package io.kubernetes.client.util;

public class CallGeneratorParams {

  public Boolean watch;
  public String resourceVersion;
  public Integer timeoutSeconds;

  public CallGeneratorParams(Boolean watch, String resourceVersion, Integer timeoutSeconds) {
    this.watch = watch;
    this.resourceVersion = resourceVersion;
    this.timeoutSeconds = timeoutSeconds;
  }
}
