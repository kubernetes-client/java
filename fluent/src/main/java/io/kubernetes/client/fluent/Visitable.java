package io.kubernetes.client.fluent;

import java.util.Map.Entry;
import java.lang.Class;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Collections;
public interface Visitable<T>{
  default <V>T accept(Class<V> type,Visitor<V> visitor) {
    return accept(new Visitor<V>() {
      @Override
      public Class<V> getType() {
        return type;
      }

      @Override
      public void visit(V element) {
        visitor.visit(element);
      }
    });
  }
  default T accept(io.kubernetes.client.fluent.Visitor... visitors) {
    for (Visitor visitor : visitors) {
      if (visitor.canVisit(Collections.emptyList(), this)) {
        visitor.visit(this);
      }
    }
    return getTarget(this);
  }
  default T accept(List<Entry<String,Object>> path,io.kubernetes.client.fluent.Visitor... visitors) {
    return accept(path, "", visitors);
  }
  default T accept(List<Entry<String,Object>> path,String currentKey,io.kubernetes.client.fluent.Visitor... visitors) {
    for (Visitor visitor : visitors) {
      if (visitor.canVisit(path, this)) {
        visitor.visit(path, this);
      }
    }
    return getTarget(this);
  }
  default T getTarget(Visitable<T> visitable) {
    return (T) visitable;
  }
  
}