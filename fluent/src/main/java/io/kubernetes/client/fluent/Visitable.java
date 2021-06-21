package io.kubernetes.client.fluent;

import java.lang.Class;
import java.lang.FunctionalInterface;

  
  @java.lang.FunctionalInterface
  public interface Visitable<T> {


    T accept(io.kubernetes.client.fluent.Visitor... visitor);
    default <V>T accept(java.lang.Class<V> type,io.kubernetes.client.fluent.Visitor<V> visitor) {
        return accept(new TypedVisitor<V>() {@Override public Class<V> getType() {return type;} @Override public void visit(V element) {visitor.visit(element);}});
    }

}
