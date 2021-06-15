package io.kubernetes.client.fluent;

import java.lang.FunctionalInterface;

  
  @java.lang.FunctionalInterface
  public interface Visitor<T> {


    void visit(T element);
}
