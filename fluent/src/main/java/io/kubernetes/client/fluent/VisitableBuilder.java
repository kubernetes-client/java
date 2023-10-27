package io.kubernetes.client.fluent;

public interface VisitableBuilder<T,V extends VisitableBuilder<T,V>> extends Builder<T>,Visitable<V>{
  
  

}