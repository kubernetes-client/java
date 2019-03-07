package io.kubernetes.client.informer.exception;

public class BadNotificationException extends RuntimeException {

  public BadNotificationException(String message) {
    super(message);
  }
}
