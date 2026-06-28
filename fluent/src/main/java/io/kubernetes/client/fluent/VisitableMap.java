/*
Copyright 2026 The Kubernetes Authors.
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