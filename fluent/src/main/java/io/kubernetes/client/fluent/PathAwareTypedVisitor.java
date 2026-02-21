package io.kubernetes.client.fluent;

import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map.Entry;
public class PathAwareTypedVisitor<V,P> extends TypedVisitor<V>{

  private final Class<P> parentType;
  private final Class<V> type;

  PathAwareTypedVisitor() {
    List<Class> args = Visitors.getTypeArguments(PathAwareTypedVisitor.class, getClass());
        if (args == null || args.isEmpty()) {
          throw new IllegalStateException("Could not determine type arguments for path aware typed visitor.");
        }
        this.type = (Class<V>) args.get(0);
        this.parentType = (Class<P>) args.get(1);
  }

  public P getParent(List<Entry<String,Object>> path) {
    return path.size() - 1 >= 0 ? (P) path.get(path.size() - 1) : null;
  }
  
  public Class<P> getParentType() {
    return parentType;
  }
  
  public void visit(V element) {
    
  }
  
  public void visit(List<Entry<String,Object>> path,V element) {
    visit(element);
  }
  
}