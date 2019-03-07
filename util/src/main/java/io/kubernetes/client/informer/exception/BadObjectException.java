package io.kubernetes.client.informer.exception;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class BadObjectException extends RuntimeException {

  public BadObjectException(Object obj) {
    super(ReflectionToStringBuilder.toString(obj));
  }
}
