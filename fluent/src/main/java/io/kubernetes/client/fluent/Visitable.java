package io.kubernetes.client.fluent;

import java.util.AbstractMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Collections;
public interface Visitable<T>{
  
  
  default <V>T accept(Class<V> type,Visitor<V> visitor) {
    return accept(Collections.emptyList(), new Visitor<V>() {
          @Override
          public Class<V> getType() {
            return type;
          }
    
          @Override
          public void visit(List<Entry<String, Object>> path, V element) {
            visitor.visit(path, element);
          }
    
          @Override
          public void visit(V element) {
            visitor.visit(element);
          }
        });
  }
  
  default T accept(io.kubernetes.client.fluent.Visitor... visitors) {
    return accept(Collections.emptyList(), visitors);
  }
  
  default T accept(List<Entry<String,Object>> path,io.kubernetes.client.fluent.Visitor... visitors) {
    return accept(path, "", visitors);
  }
  
  default T accept(List<Entry<String,Object>> path,String currentKey,io.kubernetes.client.fluent.Visitor... visitors) {
    List<Visitor> sortedVisitor = new ArrayList<>();
        for (Visitor visitor : visitors) {
          visitor = VisitorListener.wrap(visitor);
          if (!visitor.canVisit(path, this)) {
            continue;
          }
          sortedVisitor.add(visitor);
        }
        sortedVisitor.sort((l, r) -> ((Visitor) r).order() - ((Visitor) l).order());
        for (Visitor visitor : sortedVisitor) {
          visitor.visit(path, this);
        }
    
        List<Entry<String, Object>> copyOfPath = path != null ? new ArrayList(path) : new ArrayList<>();
        copyOfPath.add(new AbstractMap.SimpleEntry<>(currentKey, this));
    
        getVisitableMap().ifPresent(vm -> {
          for (Entry<String, ?> entry : vm.entrySet()) {
            List<Entry<String, Object>> newPath = Collections.unmodifiableList(copyOfPath);
    
            // Copy visitables to avoid ConcurrentModificationException when Visitors add/remove Visitables
            for (Visitable<T> visitable : new ArrayList<>((List<Visitable<T>>) entry.getValue())) {
              for (Visitor visitor : visitors) {
                if (visitor.getType() != null && visitor.getType().isAssignableFrom(visitable.getClass())) {
                  visitable.accept(newPath, entry.getKey(), visitor);
                }
              }
    
              for (Visitor visitor : visitors) {
                if (visitor.getType() == null || !visitor.getType().isAssignableFrom(visitable.getClass())) {
                  visitable.accept(newPath, entry.getKey(), visitor);
                }
              }
            }
          }
        });
    
        return (T) this;
  }
  
  default T getTarget(Visitable<T> visitable) {
    return (T) visitable;
  }
  
  default Optional<VisitableMap> getVisitableMap() {
    return Optional.empty();
  }
  

}