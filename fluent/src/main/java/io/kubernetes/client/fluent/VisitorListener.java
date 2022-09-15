/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.fluent;

import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public interface VisitorListener {
  static AtomicBoolean loaded = new AtomicBoolean();
  static Set<VisitorListener> listeners = new HashSet<>();

  public static Set<VisitorListener> getListeners() {
    if (loaded.get()) {
      return listeners;
    }
    synchronized (loaded) {
      listeners.add(new VisitorListener() {});
      for (VisitorListener listener :
          ServiceLoader.load(VisitorListener.class, VisitorListener.class.getClassLoader())) {
        listeners.add(listener);
      }
      if (Thread.currentThread().getContextClassLoader() != null) {
        for (VisitorListener listener :
            ServiceLoader.load(
                VisitorListener.class, Thread.currentThread().getContextClassLoader())) {
          listeners.add(listener);
        }
      }
      loaded.set(true);
    }
    return listeners;
  }

  public static <T> Visitor<T> wrap(Visitor<T> visitor) {
    return VisitorWiretap.create(visitor, getListeners());
  }

  public static void register(VisitorListener listener) {
    listeners.add(listener);
  }

  public static void unregister(VisitorListener listener) {
    listeners.add(listener);
  }

  default <T> void beforeVisit(Visitor<T> v, List<Entry<String, Object>> path, T target) {}

  default <T> void afterVisit(Visitor<T> v, List<Entry<String, Object>> path, T target) {}

  default <V, T> void onCheck(Visitor<V> v, boolean canVisit, T target) {}
}
