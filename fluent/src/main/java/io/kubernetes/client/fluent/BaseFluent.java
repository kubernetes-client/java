package io.kubernetes.client.fluent;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Objects;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Arrays;
public class BaseFluent<F>{
  
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
          return (VisitableBuilder<T, ?>) Class
              .forName(item.getClass().getName() + "Builder", true, item.getClass().getClassLoader())
              .getConstructor(item.getClass())
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
  
  public Optional<VisitableMap> getVisitableMap() {
    return Optional.of(_visitables);
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