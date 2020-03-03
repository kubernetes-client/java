package io.kubernetes.client.util.exception;

public class TypeMetaReflectException extends Exception {
  public TypeMetaReflectException(ReflectiveOperationException e) {
    super(e);
  }
}
