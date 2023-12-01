package io.kubernetes.client.fluent;

import java.util.Map.Entry;
import java.util.Collection;
import java.lang.Class;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.Collections;
import java.util.function.Predicate;
public final class VisitorWiretap<T> implements Visitor<T>{
  private VisitorWiretap(Visitor<T> delegate,Collection<VisitorListener> listeners) {
    this.delegate = delegate;
        this.listeners = listeners;
  }
  private final Collection<VisitorListener> listeners;
  private final Visitor<T> delegate;
  
  public static <T>VisitorWiretap<T> create(Visitor<T> visitor,Collection<VisitorListener> listeners) {
    if (visitor instanceof VisitorWiretap) {
          return (VisitorWiretap<T>) visitor;
        }
        return new VisitorWiretap<T>(visitor, listeners);
  }
  
  public Class<T> getType() {
    return delegate.getType();
  }
  
  public void visit(T target) {
    for (VisitorListener l : listeners) {
          l.beforeVisit(delegate, Collections.emptyList(), target);
        }
        delegate.visit(target);
        for (VisitorListener l : listeners) {
          l.afterVisit(delegate, Collections.emptyList(), target);
        }
  }
  
  public int order() {
    return delegate.order();
  }
  
  public void visit(List<Entry<String,Object>> path,T target) {
    for (VisitorListener l : listeners) {
          l.beforeVisit(delegate, path, target);
        }
        delegate.visit(path, target);
        for (VisitorListener l : listeners) {
          l.afterVisit(delegate, path, target);
        }
  }
  
  public <F>Boolean canVisit(List<Entry<String,Object>> path,F target) {
    boolean canVisit = delegate.canVisit(path, target);
        for (VisitorListener l : listeners) {
          l.onCheck(delegate, canVisit, target);
        }
    
        return canVisit;
  }
  

}