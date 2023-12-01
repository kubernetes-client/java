package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1TypeCheckingFluent<A extends V1alpha1TypeCheckingFluent<A>> extends BaseFluent<A>{
  public V1alpha1TypeCheckingFluent() {
  }
  
  public V1alpha1TypeCheckingFluent(V1alpha1TypeChecking instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1alpha1ExpressionWarningBuilder> expressionWarnings;
  
  protected void copyInstance(V1alpha1TypeChecking instance) {
    instance = (instance != null ? instance : new V1alpha1TypeChecking());
    if (instance != null) {
          this.withExpressionWarnings(instance.getExpressionWarnings());
        }
  }
  
  public A addToExpressionWarnings(int index,V1alpha1ExpressionWarning item) {
    if (this.expressionWarnings == null) {this.expressionWarnings = new ArrayList<V1alpha1ExpressionWarningBuilder>();}
    V1alpha1ExpressionWarningBuilder builder = new V1alpha1ExpressionWarningBuilder(item);
    if (index < 0 || index >= expressionWarnings.size()) { _visitables.get("expressionWarnings").add(builder); expressionWarnings.add(builder); } else { _visitables.get("expressionWarnings").add(index, builder); expressionWarnings.add(index, builder);}
    return (A)this;
  }
  
  public A setToExpressionWarnings(int index,V1alpha1ExpressionWarning item) {
    if (this.expressionWarnings == null) {this.expressionWarnings = new ArrayList<V1alpha1ExpressionWarningBuilder>();}
    V1alpha1ExpressionWarningBuilder builder = new V1alpha1ExpressionWarningBuilder(item);
    if (index < 0 || index >= expressionWarnings.size()) { _visitables.get("expressionWarnings").add(builder); expressionWarnings.add(builder); } else { _visitables.get("expressionWarnings").set(index, builder); expressionWarnings.set(index, builder);}
    return (A)this;
  }
  
  public A addToExpressionWarnings(io.kubernetes.client.openapi.models.V1alpha1ExpressionWarning... items) {
    if (this.expressionWarnings == null) {this.expressionWarnings = new ArrayList<V1alpha1ExpressionWarningBuilder>();}
    for (V1alpha1ExpressionWarning item : items) {V1alpha1ExpressionWarningBuilder builder = new V1alpha1ExpressionWarningBuilder(item);_visitables.get("expressionWarnings").add(builder);this.expressionWarnings.add(builder);} return (A)this;
  }
  
  public A addAllToExpressionWarnings(Collection<V1alpha1ExpressionWarning> items) {
    if (this.expressionWarnings == null) {this.expressionWarnings = new ArrayList<V1alpha1ExpressionWarningBuilder>();}
    for (V1alpha1ExpressionWarning item : items) {V1alpha1ExpressionWarningBuilder builder = new V1alpha1ExpressionWarningBuilder(item);_visitables.get("expressionWarnings").add(builder);this.expressionWarnings.add(builder);} return (A)this;
  }
  
  public A removeFromExpressionWarnings(io.kubernetes.client.openapi.models.V1alpha1ExpressionWarning... items) {
    if (this.expressionWarnings == null) return (A)this;
    for (V1alpha1ExpressionWarning item : items) {V1alpha1ExpressionWarningBuilder builder = new V1alpha1ExpressionWarningBuilder(item);_visitables.get("expressionWarnings").remove(builder); this.expressionWarnings.remove(builder);} return (A)this;
  }
  
  public A removeAllFromExpressionWarnings(Collection<V1alpha1ExpressionWarning> items) {
    if (this.expressionWarnings == null) return (A)this;
    for (V1alpha1ExpressionWarning item : items) {V1alpha1ExpressionWarningBuilder builder = new V1alpha1ExpressionWarningBuilder(item);_visitables.get("expressionWarnings").remove(builder); this.expressionWarnings.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromExpressionWarnings(Predicate<V1alpha1ExpressionWarningBuilder> predicate) {
    if (expressionWarnings == null) return (A) this;
    final Iterator<V1alpha1ExpressionWarningBuilder> each = expressionWarnings.iterator();
    final List visitables = _visitables.get("expressionWarnings");
    while (each.hasNext()) {
      V1alpha1ExpressionWarningBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha1ExpressionWarning> buildExpressionWarnings() {
    return this.expressionWarnings != null ? build(expressionWarnings) : null;
  }
  
  public V1alpha1ExpressionWarning buildExpressionWarning(int index) {
    return this.expressionWarnings.get(index).build();
  }
  
  public V1alpha1ExpressionWarning buildFirstExpressionWarning() {
    return this.expressionWarnings.get(0).build();
  }
  
  public V1alpha1ExpressionWarning buildLastExpressionWarning() {
    return this.expressionWarnings.get(expressionWarnings.size() - 1).build();
  }
  
  public V1alpha1ExpressionWarning buildMatchingExpressionWarning(Predicate<V1alpha1ExpressionWarningBuilder> predicate) {
      for (V1alpha1ExpressionWarningBuilder item : expressionWarnings) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingExpressionWarning(Predicate<V1alpha1ExpressionWarningBuilder> predicate) {
      for (V1alpha1ExpressionWarningBuilder item : expressionWarnings) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withExpressionWarnings(List<V1alpha1ExpressionWarning> expressionWarnings) {
    if (this.expressionWarnings != null) {
      this._visitables.get("expressionWarnings").clear();
    }
    if (expressionWarnings != null) {
        this.expressionWarnings = new ArrayList();
        for (V1alpha1ExpressionWarning item : expressionWarnings) {
          this.addToExpressionWarnings(item);
        }
    } else {
      this.expressionWarnings = null;
    }
    return (A) this;
  }
  
  public A withExpressionWarnings(io.kubernetes.client.openapi.models.V1alpha1ExpressionWarning... expressionWarnings) {
    if (this.expressionWarnings != null) {
        this.expressionWarnings.clear();
        _visitables.remove("expressionWarnings");
    }
    if (expressionWarnings != null) {
      for (V1alpha1ExpressionWarning item : expressionWarnings) {
        this.addToExpressionWarnings(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasExpressionWarnings() {
    return this.expressionWarnings != null && !this.expressionWarnings.isEmpty();
  }
  
  public ExpressionWarningsNested<A> addNewExpressionWarning() {
    return new ExpressionWarningsNested(-1, null);
  }
  
  public ExpressionWarningsNested<A> addNewExpressionWarningLike(V1alpha1ExpressionWarning item) {
    return new ExpressionWarningsNested(-1, item);
  }
  
  public ExpressionWarningsNested<A> setNewExpressionWarningLike(int index,V1alpha1ExpressionWarning item) {
    return new ExpressionWarningsNested(index, item);
  }
  
  public ExpressionWarningsNested<A> editExpressionWarning(int index) {
    if (expressionWarnings.size() <= index) throw new RuntimeException("Can't edit expressionWarnings. Index exceeds size.");
    return setNewExpressionWarningLike(index, buildExpressionWarning(index));
  }
  
  public ExpressionWarningsNested<A> editFirstExpressionWarning() {
    if (expressionWarnings.size() == 0) throw new RuntimeException("Can't edit first expressionWarnings. The list is empty.");
    return setNewExpressionWarningLike(0, buildExpressionWarning(0));
  }
  
  public ExpressionWarningsNested<A> editLastExpressionWarning() {
    int index = expressionWarnings.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last expressionWarnings. The list is empty.");
    return setNewExpressionWarningLike(index, buildExpressionWarning(index));
  }
  
  public ExpressionWarningsNested<A> editMatchingExpressionWarning(Predicate<V1alpha1ExpressionWarningBuilder> predicate) {
    int index = -1;
    for (int i=0;i<expressionWarnings.size();i++) { 
    if (predicate.test(expressionWarnings.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching expressionWarnings. No match found.");
    return setNewExpressionWarningLike(index, buildExpressionWarning(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1TypeCheckingFluent that = (V1alpha1TypeCheckingFluent) o;
    if (!java.util.Objects.equals(expressionWarnings, that.expressionWarnings)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(expressionWarnings,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (expressionWarnings != null && !expressionWarnings.isEmpty()) { sb.append("expressionWarnings:"); sb.append(expressionWarnings); }
    sb.append("}");
    return sb.toString();
  }
  public class ExpressionWarningsNested<N> extends V1alpha1ExpressionWarningFluent<ExpressionWarningsNested<N>> implements Nested<N>{
    ExpressionWarningsNested(int index,V1alpha1ExpressionWarning item) {
      this.index = index;
      this.builder = new V1alpha1ExpressionWarningBuilder(this, item);
    }
    V1alpha1ExpressionWarningBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha1TypeCheckingFluent.this.setToExpressionWarnings(index,builder.build());
    }
    
    public N endExpressionWarning() {
      return and();
    }
    
  
  }

}