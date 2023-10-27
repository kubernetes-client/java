package io.kubernetes.client.fluent;

import java.util.stream.Collectors;
import java.lang.Iterable;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Spliterator;
public class VisitableMap extends HashMap<String,List<Visitable<?>>> implements Iterable<Visitable<?>>{
  
  
  
  public List<Visitable<?>> get(Object key) {
    if (!containsKey(key)) {
          put(String.valueOf(key), new ArrayList());
        }
        return super.get(key);
  }
  
  public List<Visitable<?>> aggregate() {
    return values().stream().flatMap(l -> l.stream()).collect(Collectors.toList());
  }
  
  public Iterator<Visitable<?>> iterator() {
    return aggregate().iterator();
  }
  
  public void forEach(Consumer<? super Visitable<?>> action) {
    aggregate().forEach(action);
  }
  
  public Spliterator spliterator() {
    return aggregate().spliterator();
  }
  

}