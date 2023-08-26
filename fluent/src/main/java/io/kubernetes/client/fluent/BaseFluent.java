package io.kubernetes.client.fluent;

import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.ArrayList;
import java.lang.String;
import java.util.AbstractMap;
import java.util.Objects;
import java.lang.Class;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class BaseFluent<F extends Fluent<F>> implements Fluent<F>,Visitable<F>{
  public static final String VISIT = "visit";
  public final VisitableMap _visitables = new VisitableMap();
  public static <T>VisitableBuilder<T,?> builderOf(T item) {
    if (item instanceof Editable) {
      Object editor = ((Editable) item).edit();
      if (editor instanceof VisitableBuilder) {
        return (VisitableBuilder<T, ?>) editor;
      }
    }

    try {
      return (VisitableBuilder<T, ?>) Class.forName(item.getClass().getName() + "Builder", true, item.getClass().getClassLoader()).getConstructor(item.getClass())
          .newInstance(item);
    } catch (Exception e) {
      try {
        return (VisitableBuilder<T, ?>) Class.forName(item.getClass().getName() + "Builder").getConstructor(item.getClass())
            .newInstance(item);
      } catch (Exception e1) {
        throw new IllegalStateException("Failed to create builder for: " + item.getClass(), e1);
      }
    }
  }
  public static <T>List<T> build(List<? extends io.kubernetes.client.fluent.Builder<? extends T>> list) {
    return list == null ? null : list.stream().map(Builder::build).collect(Collectors.toList());
  }
  public static <T>Set<T> build(Set<? extends io.kubernetes.client.fluent.Builder<? extends T>> set) {
    return set == null ? null : new LinkedHashSet<T>(set.stream().map(Builder::build).collect(Collectors.toSet()));
  }
  public static <T>List<T> aggregate(List<? extends T>... lists) {
    return new ArrayList(Arrays.stream(lists).filter(Objects::nonNull).collect(Collectors.toList()));
  }
  public static <T>Set<T> aggregate(Set<? extends T>... sets) {
    return new LinkedHashSet(Arrays.stream(sets).filter(Objects::nonNull).collect(Collectors.toSet()));
  }
  public F accept(io.kubernetes.client.fluent.Visitor... visitors) {
    return accept(Collections.emptyList(), visitors);
  }
  public <V>F accept(Class<V> type,Visitor<V> visitor) {
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
  public F accept(List<Entry<String,Object>> path,io.kubernetes.client.fluent.Visitor... visitors) {
    return accept(path, "", visitors);
  }
  public F accept(List<Entry<String,Object>> path,String currentKey,io.kubernetes.client.fluent.Visitor... visitors) {
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

    for (Entry<String, ?> entry : _visitables.entrySet()) {
      List<Entry<String, Object>> newPath = Collections.unmodifiableList(copyOfPath);

      // Copy visitables to avoid ConcurrentModificationException when Visitors add/remove Visitables
      for (Visitable<F> visitable : new ArrayList<>((List<Visitable<F>>) entry.getValue())) {
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
    return (F) this;
  }
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + 0;
    return result;
  }
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    return true;
  }
  
}