package io.kubernetes.client.fluent;

import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
public class VisitableMap extends HashMap<String,List<Visitable<?>>> implements Iterable<Visitable<?>>{

  
  
  public List<Visitable<?>> aggregate() {
    return values().stream().flatMap(l -> l.stream()).collect(Collectors.toList());
  }
  
  public void forEach(Consumer<? super Visitable<?>> action) {
    aggregate().forEach(action);
  }
  
  public List<Visitable<?>> get(Object key) {
    if (!containsKey(key)) {
          put(String.valueOf(key), new ArrayList());
        }
        return super.get(key);
  }
  
  public Iterator<Visitable<?>> iterator() {
    return aggregate().iterator();
  }
  
  public Spliterator spliterator() {
    return aggregate().spliterator();
  }
  
}