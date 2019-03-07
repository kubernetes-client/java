package io.kubernetes.client.util.exception;

public class ObjectMetaReflectException extends ReflectiveOperationException {

  public ObjectMetaReflectException(ReflectiveOperationException e) {
    super(e);
  }
}
