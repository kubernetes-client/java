package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1NamespaceSpecFluentImpl<A extends V1NamespaceSpecFluent<A>> extends BaseFluent<A> implements V1NamespaceSpecFluent<A>{
  public V1NamespaceSpecFluentImpl() {
  }
  public V1NamespaceSpecFluentImpl(V1NamespaceSpec instance) {
    this.withFinalizers(instance.getFinalizers());

  }
  private List<String> finalizers;
  public A addToFinalizers(Integer index,String item) {
    if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
    this.finalizers.add(index, item);
    return (A)this;
  }
  public A setToFinalizers(Integer index,String item) {
    if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
    this.finalizers.set(index, item); return (A)this;
  }
  public A addToFinalizers(java.lang.String... items) {
    if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
    for (String item : items) {this.finalizers.add(item);} return (A)this;
  }
  public A addAllToFinalizers(Collection<String> items) {
    if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
    for (String item : items) {this.finalizers.add(item);} return (A)this;
  }
  public A removeFromFinalizers(java.lang.String... items) {
    for (String item : items) {if (this.finalizers!= null){ this.finalizers.remove(item);}} return (A)this;
  }
  public A removeAllFromFinalizers(Collection<String> items) {
    for (String item : items) {if (this.finalizers!= null){ this.finalizers.remove(item);}} return (A)this;
  }
  public List<String> getFinalizers() {
    return this.finalizers;
  }
  public String getFinalizer(Integer index) {
    return this.finalizers.get(index);
  }
  public String getFirstFinalizer() {
    return this.finalizers.get(0);
  }
  public String getLastFinalizer() {
    return this.finalizers.get(finalizers.size() - 1);
  }
  public String getMatchingFinalizer(Predicate<String> predicate) {
    for (String item: finalizers) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingFinalizer(Predicate<String> predicate) {
    for (String item: finalizers) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withFinalizers(List<String> finalizers) {
    if (finalizers != null) {this.finalizers = new ArrayList(); for (String item : finalizers){this.addToFinalizers(item);}} else { this.finalizers = null;} return (A) this;
  }
  public A withFinalizers(java.lang.String... finalizers) {
    if (this.finalizers != null) {this.finalizers.clear();}
    if (finalizers != null) {for (String item :finalizers){ this.addToFinalizers(item);}} return (A) this;
  }
  public Boolean hasFinalizers() {
    return finalizers != null && !finalizers.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NamespaceSpecFluentImpl that = (V1NamespaceSpecFluentImpl) o;
    if (finalizers != null ? !finalizers.equals(that.finalizers) :that.finalizers != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(finalizers,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (finalizers != null && !finalizers.isEmpty()) { sb.append("finalizers:"); sb.append(finalizers); }
    sb.append("}");
    return sb.toString();
  }
  
}