package io.kubernetes.client.fluent;

import java.util.Map.Entry;
import java.lang.Class;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.function.Predicate;
public class DelegatingVisitor<T> implements Visitor<T>{
  DelegatingVisitor(Class<T> type,Visitor<T> delegate) {
    this.type = type;
        this.delegate = delegate;
  }
  private final Class<T> type;
  private final Visitor<T> delegate;
  
  public Class<T> getType() {
    return type;
  }
  
  public void visit(T target) {
    delegate.visit(target);
  }
  
  public int order() {
    return delegate.order();
  }
  
  public void visit(List<Entry<String,Object>> path,T target) {
    delegate.visit(path, target);
  }
  
  public <F>Predicate<List<Entry<String,Object>>> getRequirement() {
    return delegate.getRequirement();
  }
  

}