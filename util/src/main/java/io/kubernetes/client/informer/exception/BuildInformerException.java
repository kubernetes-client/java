package io.kubernetes.client.informer.exception;

public class BuildInformerException extends RuntimeException {

  public BuildInformerException(String message) {
    super(message);
  }

  public BuildInformerException(Class resourceClass, String message) {
    super(
        String.format(
            "failed to construct informer for resource %s: %s", resourceClass.getName(), message));
  }
}
