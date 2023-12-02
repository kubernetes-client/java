package io.kubernetes.client.fluent;

import java.util.Map.Entry;
import java.lang.Class;
import java.lang.FunctionalInterface;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Boolean;
import java.util.function.Predicate;
@FunctionalInterface
public interface Visitor<T>{
  
  
  default Class<T> getType() {
    List<Class> args = Visitors.getTypeArguments(Visitor.class, getClass());
        if (args == null || args.isEmpty()) {
          return null;
        }
        return (Class<T>) args.get(0);
  }
  
  void visit(T element);
  default int order() {
    return 0;
  }
  
  default void visit(List<Entry<String,Object>> path,T element) {
    visit(element);
  }
  
  default <F>Boolean canVisit(List<Entry<String,Object>> path,F target) {
    if (target == null) {
          return false;
        }
    
        if (getType() == null) {
          return hasVisitMethodMatching(target);
        } else if (!getType().isAssignableFrom(target.getClass())) {
          return false;
        }
    
        try {
          return getRequirement().test(path);
        } catch (ClassCastException e) {
          // This will happen if predicte does not match the Object.
          // So, instead of using reflection to determine that, let's just catch the error
          return false;
        }
  }
  
  default <F>Boolean hasVisitMethodMatching(F target) {
    for (Method method : getClass().getMethods()) {
          if (!method.getName().equals("visit") || method.getParameterTypes().length != 1) {
            continue;
          }
          Class<?> visitorType = method.getParameterTypes()[0];
          if (visitorType.isAssignableFrom(target.getClass())) {
            return true;
          } else {
            return false;
          }
        }
        return false;
  }
  
  default <T>Predicate<List<Entry<String,Object>>> getRequirement() {
    return p -> true;
  }
  
  default <I>Predicate<List<Entry<String,Object>>> hasItem(Class<I> type,Predicate<I> predicate) {
    Predicate<List<Entry<String, Object>>> result = l -> l.stream().map(Entry::getValue).filter(i -> type.isInstance(i))
            .map(i -> type.cast(i)).anyMatch(predicate);
        return result;
  }
  
  default <P>Visitor<T> addRequirement(Class<P> type,Predicate<P> predicate) {
    return addRequirement(predicate);
  }
  
  default Visitor<T> addRequirement(Predicate predicate) {
    return new DelegatingVisitor(getType(), this) {
          @Override
          public Predicate<List<Object>> getRequirement() {
            return Visitor.this.getRequirement().and(predicate);
          }
        };
  }
  

}