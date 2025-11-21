package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1TypeCheckingFluent<A extends io.kubernetes.client.openapi.models.V1TypeCheckingFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1ExpressionWarningBuilder> expressionWarnings;

  public V1TypeCheckingFluent() {
  }
  
  public V1TypeCheckingFluent(V1TypeChecking instance) {
    this.copyInstance(instance);
  }

  public A addAllToExpressionWarnings(Collection<V1ExpressionWarning> items) {
    if (this.expressionWarnings == null) {
      this.expressionWarnings = new ArrayList();
    }
    for (V1ExpressionWarning item : items) {
        V1ExpressionWarningBuilder builder = new V1ExpressionWarningBuilder(item);
        _visitables.get("expressionWarnings").add(builder);
        this.expressionWarnings.add(builder);
    }
    return (A) this;
  }
  
  public ExpressionWarningsNested<A> addNewExpressionWarning() {
    return new ExpressionWarningsNested(-1, null);
  }
  
  public ExpressionWarningsNested<A> addNewExpressionWarningLike(V1ExpressionWarning item) {
    return new ExpressionWarningsNested(-1, item);
  }
  
  public A addToExpressionWarnings(V1ExpressionWarning... items) {
    if (this.expressionWarnings == null) {
      this.expressionWarnings = new ArrayList();
    }
    for (V1ExpressionWarning item : items) {
        V1ExpressionWarningBuilder builder = new V1ExpressionWarningBuilder(item);
        _visitables.get("expressionWarnings").add(builder);
        this.expressionWarnings.add(builder);
    }
    return (A) this;
  }
  
  public A addToExpressionWarnings(int index,V1ExpressionWarning item) {
    if (this.expressionWarnings == null) {
      this.expressionWarnings = new ArrayList();
    }
    V1ExpressionWarningBuilder builder = new V1ExpressionWarningBuilder(item);
    if (index < 0 || index >= expressionWarnings.size()) {
        _visitables.get("expressionWarnings").add(builder);
        expressionWarnings.add(builder);
    } else {
        _visitables.get("expressionWarnings").add(builder);
        expressionWarnings.add(index, builder);
    }
    return (A) this;
  }
  
  public V1ExpressionWarning buildExpressionWarning(int index) {
    return this.expressionWarnings.get(index).build();
  }
  
  public List<V1ExpressionWarning> buildExpressionWarnings() {
    return this.expressionWarnings != null ? build(expressionWarnings) : null;
  }
  
  public V1ExpressionWarning buildFirstExpressionWarning() {
    return this.expressionWarnings.get(0).build();
  }
  
  public V1ExpressionWarning buildLastExpressionWarning() {
    return this.expressionWarnings.get(expressionWarnings.size() - 1).build();
  }
  
  public V1ExpressionWarning buildMatchingExpressionWarning(Predicate<V1ExpressionWarningBuilder> predicate) {
      for (V1ExpressionWarningBuilder item : expressionWarnings) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1TypeChecking instance) {
    instance = instance != null ? instance : new V1TypeChecking();
    if (instance != null) {
      this.withExpressionWarnings(instance.getExpressionWarnings());
    }
  }
  
  public ExpressionWarningsNested<A> editExpressionWarning(int index) {
    if (expressionWarnings.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "expressionWarnings"));
    }
    return this.setNewExpressionWarningLike(index, this.buildExpressionWarning(index));
  }
  
  public ExpressionWarningsNested<A> editFirstExpressionWarning() {
    if (expressionWarnings.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "expressionWarnings"));
    }
    return this.setNewExpressionWarningLike(0, this.buildExpressionWarning(0));
  }
  
  public ExpressionWarningsNested<A> editLastExpressionWarning() {
    int index = expressionWarnings.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "expressionWarnings"));
    }
    return this.setNewExpressionWarningLike(index, this.buildExpressionWarning(index));
  }
  
  public ExpressionWarningsNested<A> editMatchingExpressionWarning(Predicate<V1ExpressionWarningBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < expressionWarnings.size();i++) {
      if (predicate.test(expressionWarnings.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "expressionWarnings"));
    }
    return this.setNewExpressionWarningLike(index, this.buildExpressionWarning(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1TypeCheckingFluent that = (V1TypeCheckingFluent) o;
    if (!(Objects.equals(expressionWarnings, that.expressionWarnings))) {
      return false;
    }
    return true;
  }
  
  public boolean hasExpressionWarnings() {
    return this.expressionWarnings != null && !(this.expressionWarnings.isEmpty());
  }
  
  public boolean hasMatchingExpressionWarning(Predicate<V1ExpressionWarningBuilder> predicate) {
      for (V1ExpressionWarningBuilder item : expressionWarnings) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(expressionWarnings);
  }
  
  public A removeAllFromExpressionWarnings(Collection<V1ExpressionWarning> items) {
    if (this.expressionWarnings == null) {
      return (A) this;
    }
    for (V1ExpressionWarning item : items) {
        V1ExpressionWarningBuilder builder = new V1ExpressionWarningBuilder(item);
        _visitables.get("expressionWarnings").remove(builder);
        this.expressionWarnings.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromExpressionWarnings(V1ExpressionWarning... items) {
    if (this.expressionWarnings == null) {
      return (A) this;
    }
    for (V1ExpressionWarning item : items) {
        V1ExpressionWarningBuilder builder = new V1ExpressionWarningBuilder(item);
        _visitables.get("expressionWarnings").remove(builder);
        this.expressionWarnings.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromExpressionWarnings(Predicate<V1ExpressionWarningBuilder> predicate) {
    if (expressionWarnings == null) {
      return (A) this;
    }
    Iterator<V1ExpressionWarningBuilder> each = expressionWarnings.iterator();
    List visitables = _visitables.get("expressionWarnings");
    while (each.hasNext()) {
        V1ExpressionWarningBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ExpressionWarningsNested<A> setNewExpressionWarningLike(int index,V1ExpressionWarning item) {
    return new ExpressionWarningsNested(index, item);
  }
  
  public A setToExpressionWarnings(int index,V1ExpressionWarning item) {
    if (this.expressionWarnings == null) {
      this.expressionWarnings = new ArrayList();
    }
    V1ExpressionWarningBuilder builder = new V1ExpressionWarningBuilder(item);
    if (index < 0 || index >= expressionWarnings.size()) {
        _visitables.get("expressionWarnings").add(builder);
        expressionWarnings.add(builder);
    } else {
        _visitables.get("expressionWarnings").add(builder);
        expressionWarnings.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(expressionWarnings == null) && !(expressionWarnings.isEmpty())) {
        sb.append("expressionWarnings:");
        sb.append(expressionWarnings);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withExpressionWarnings(List<V1ExpressionWarning> expressionWarnings) {
    if (this.expressionWarnings != null) {
      this._visitables.get("expressionWarnings").clear();
    }
    if (expressionWarnings != null) {
        this.expressionWarnings = new ArrayList();
        for (V1ExpressionWarning item : expressionWarnings) {
          this.addToExpressionWarnings(item);
        }
    } else {
      this.expressionWarnings = null;
    }
    return (A) this;
  }
  
  public A withExpressionWarnings(V1ExpressionWarning... expressionWarnings) {
    if (this.expressionWarnings != null) {
        this.expressionWarnings.clear();
        _visitables.remove("expressionWarnings");
    }
    if (expressionWarnings != null) {
      for (V1ExpressionWarning item : expressionWarnings) {
        this.addToExpressionWarnings(item);
      }
    }
    return (A) this;
  }
  public class ExpressionWarningsNested<N> extends V1ExpressionWarningFluent<ExpressionWarningsNested<N>> implements Nested<N>{
  
    V1ExpressionWarningBuilder builder;
    int index;
  
    ExpressionWarningsNested(int index,V1ExpressionWarning item) {
      this.index = index;
      this.builder = new V1ExpressionWarningBuilder(this, item);
    }
  
    public N and() {
      return (N) V1TypeCheckingFluent.this.setToExpressionWarnings(index, builder.build());
    }
    
    public N endExpressionWarning() {
      return and();
    }
    
  }
}