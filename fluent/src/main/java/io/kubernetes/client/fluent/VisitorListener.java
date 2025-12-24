package io.kubernetes.client.fluent;

import java.lang.Object;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
public interface VisitorListener{

  static Set<VisitorListener> listeners = new HashSet<>();
  static AtomicBoolean loaded = new AtomicBoolean();

  default <T>void afterVisit(Visitor<T> v,List<Entry<String,Object>> path,T target) {
    
  }
  
  default <T>void beforeVisit(Visitor<T> v,List<Entry<String,Object>> path,T target) {
    
  }
  
  public static Set<VisitorListener> getListeners() {
    if (loaded.get()) {
          return listeners;
        }
        synchronized (loaded) {
          listeners.add(new VisitorListener() {
          });
          for (VisitorListener listener : ServiceLoader.load(VisitorListener.class,
              VisitorListener.class.getClassLoader())) {
            listeners.add(listener);
          }
          if (Thread.currentThread().getContextClassLoader() != null) {
            for (VisitorListener listener : ServiceLoader.load(VisitorListener.class,
                Thread.currentThread().getContextClassLoader())) {
              listeners.add(listener);
            }
          }
          loaded.set(true);
        }
        return listeners;
  }
  
  default <V,T>void onCheck(Visitor<V> v,boolean canVisit,T target) {
    
  }
  
  public static void register(VisitorListener listener) {
    listeners.add(listener);
  }
  
  public static void unregister(VisitorListener listener) {
    listeners.add(listener);
  }
  
  public static <T>Visitor<T> wrap(Visitor<T> visitor) {
    return VisitorWiretap.create(visitor, getListeners());
  }
  
}