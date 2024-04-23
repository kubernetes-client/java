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
public class V1alpha2StructuredResourceHandleFluent<A extends V1alpha2StructuredResourceHandleFluent<A>> extends BaseFluent<A>{
  public V1alpha2StructuredResourceHandleFluent() {
  }
  
  public V1alpha2StructuredResourceHandleFluent(V1alpha2StructuredResourceHandle instance) {
    this.copyInstance(instance);
  }
  private String nodeName;
  private ArrayList<V1alpha2DriverAllocationResultBuilder> results;
  private Object vendorClaimParameters;
  private Object vendorClassParameters;
  
  protected void copyInstance(V1alpha2StructuredResourceHandle instance) {
    instance = (instance != null ? instance : new V1alpha2StructuredResourceHandle());
    if (instance != null) {
          this.withNodeName(instance.getNodeName());
          this.withResults(instance.getResults());
          this.withVendorClaimParameters(instance.getVendorClaimParameters());
          this.withVendorClassParameters(instance.getVendorClassParameters());
        }
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public A addToResults(int index,V1alpha2DriverAllocationResult item) {
    if (this.results == null) {this.results = new ArrayList<V1alpha2DriverAllocationResultBuilder>();}
    V1alpha2DriverAllocationResultBuilder builder = new V1alpha2DriverAllocationResultBuilder(item);
    if (index < 0 || index >= results.size()) { _visitables.get("results").add(builder); results.add(builder); } else { _visitables.get("results").add(index, builder); results.add(index, builder);}
    return (A)this;
  }
  
  public A setToResults(int index,V1alpha2DriverAllocationResult item) {
    if (this.results == null) {this.results = new ArrayList<V1alpha2DriverAllocationResultBuilder>();}
    V1alpha2DriverAllocationResultBuilder builder = new V1alpha2DriverAllocationResultBuilder(item);
    if (index < 0 || index >= results.size()) { _visitables.get("results").add(builder); results.add(builder); } else { _visitables.get("results").set(index, builder); results.set(index, builder);}
    return (A)this;
  }
  
  public A addToResults(io.kubernetes.client.openapi.models.V1alpha2DriverAllocationResult... items) {
    if (this.results == null) {this.results = new ArrayList<V1alpha2DriverAllocationResultBuilder>();}
    for (V1alpha2DriverAllocationResult item : items) {V1alpha2DriverAllocationResultBuilder builder = new V1alpha2DriverAllocationResultBuilder(item);_visitables.get("results").add(builder);this.results.add(builder);} return (A)this;
  }
  
  public A addAllToResults(Collection<V1alpha2DriverAllocationResult> items) {
    if (this.results == null) {this.results = new ArrayList<V1alpha2DriverAllocationResultBuilder>();}
    for (V1alpha2DriverAllocationResult item : items) {V1alpha2DriverAllocationResultBuilder builder = new V1alpha2DriverAllocationResultBuilder(item);_visitables.get("results").add(builder);this.results.add(builder);} return (A)this;
  }
  
  public A removeFromResults(io.kubernetes.client.openapi.models.V1alpha2DriverAllocationResult... items) {
    if (this.results == null) return (A)this;
    for (V1alpha2DriverAllocationResult item : items) {V1alpha2DriverAllocationResultBuilder builder = new V1alpha2DriverAllocationResultBuilder(item);_visitables.get("results").remove(builder); this.results.remove(builder);} return (A)this;
  }
  
  public A removeAllFromResults(Collection<V1alpha2DriverAllocationResult> items) {
    if (this.results == null) return (A)this;
    for (V1alpha2DriverAllocationResult item : items) {V1alpha2DriverAllocationResultBuilder builder = new V1alpha2DriverAllocationResultBuilder(item);_visitables.get("results").remove(builder); this.results.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromResults(Predicate<V1alpha2DriverAllocationResultBuilder> predicate) {
    if (results == null) return (A) this;
    final Iterator<V1alpha2DriverAllocationResultBuilder> each = results.iterator();
    final List visitables = _visitables.get("results");
    while (each.hasNext()) {
      V1alpha2DriverAllocationResultBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha2DriverAllocationResult> buildResults() {
    return this.results != null ? build(results) : null;
  }
  
  public V1alpha2DriverAllocationResult buildResult(int index) {
    return this.results.get(index).build();
  }
  
  public V1alpha2DriverAllocationResult buildFirstResult() {
    return this.results.get(0).build();
  }
  
  public V1alpha2DriverAllocationResult buildLastResult() {
    return this.results.get(results.size() - 1).build();
  }
  
  public V1alpha2DriverAllocationResult buildMatchingResult(Predicate<V1alpha2DriverAllocationResultBuilder> predicate) {
      for (V1alpha2DriverAllocationResultBuilder item : results) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingResult(Predicate<V1alpha2DriverAllocationResultBuilder> predicate) {
      for (V1alpha2DriverAllocationResultBuilder item : results) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResults(List<V1alpha2DriverAllocationResult> results) {
    if (this.results != null) {
      this._visitables.get("results").clear();
    }
    if (results != null) {
        this.results = new ArrayList();
        for (V1alpha2DriverAllocationResult item : results) {
          this.addToResults(item);
        }
    } else {
      this.results = null;
    }
    return (A) this;
  }
  
  public A withResults(io.kubernetes.client.openapi.models.V1alpha2DriverAllocationResult... results) {
    if (this.results != null) {
        this.results.clear();
        _visitables.remove("results");
    }
    if (results != null) {
      for (V1alpha2DriverAllocationResult item : results) {
        this.addToResults(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResults() {
    return this.results != null && !this.results.isEmpty();
  }
  
  public ResultsNested<A> addNewResult() {
    return new ResultsNested(-1, null);
  }
  
  public ResultsNested<A> addNewResultLike(V1alpha2DriverAllocationResult item) {
    return new ResultsNested(-1, item);
  }
  
  public ResultsNested<A> setNewResultLike(int index,V1alpha2DriverAllocationResult item) {
    return new ResultsNested(index, item);
  }
  
  public ResultsNested<A> editResult(int index) {
    if (results.size() <= index) throw new RuntimeException("Can't edit results. Index exceeds size.");
    return setNewResultLike(index, buildResult(index));
  }
  
  public ResultsNested<A> editFirstResult() {
    if (results.size() == 0) throw new RuntimeException("Can't edit first results. The list is empty.");
    return setNewResultLike(0, buildResult(0));
  }
  
  public ResultsNested<A> editLastResult() {
    int index = results.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last results. The list is empty.");
    return setNewResultLike(index, buildResult(index));
  }
  
  public ResultsNested<A> editMatchingResult(Predicate<V1alpha2DriverAllocationResultBuilder> predicate) {
    int index = -1;
    for (int i=0;i<results.size();i++) { 
    if (predicate.test(results.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching results. No match found.");
    return setNewResultLike(index, buildResult(index));
  }
  
  public Object getVendorClaimParameters() {
    return this.vendorClaimParameters;
  }
  
  public A withVendorClaimParameters(Object vendorClaimParameters) {
    this.vendorClaimParameters = vendorClaimParameters;
    return (A) this;
  }
  
  public boolean hasVendorClaimParameters() {
    return this.vendorClaimParameters != null;
  }
  
  public Object getVendorClassParameters() {
    return this.vendorClassParameters;
  }
  
  public A withVendorClassParameters(Object vendorClassParameters) {
    this.vendorClassParameters = vendorClassParameters;
    return (A) this;
  }
  
  public boolean hasVendorClassParameters() {
    return this.vendorClassParameters != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2StructuredResourceHandleFluent that = (V1alpha2StructuredResourceHandleFluent) o;
    if (!java.util.Objects.equals(nodeName, that.nodeName)) return false;
    if (!java.util.Objects.equals(results, that.results)) return false;
    if (!java.util.Objects.equals(vendorClaimParameters, that.vendorClaimParameters)) return false;
    if (!java.util.Objects.equals(vendorClassParameters, that.vendorClassParameters)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(nodeName,  results,  vendorClaimParameters,  vendorClassParameters,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (nodeName != null) { sb.append("nodeName:"); sb.append(nodeName + ","); }
    if (results != null && !results.isEmpty()) { sb.append("results:"); sb.append(results + ","); }
    if (vendorClaimParameters != null) { sb.append("vendorClaimParameters:"); sb.append(vendorClaimParameters + ","); }
    if (vendorClassParameters != null) { sb.append("vendorClassParameters:"); sb.append(vendorClassParameters); }
    sb.append("}");
    return sb.toString();
  }
  public class ResultsNested<N> extends V1alpha2DriverAllocationResultFluent<ResultsNested<N>> implements Nested<N>{
    ResultsNested(int index,V1alpha2DriverAllocationResult item) {
      this.index = index;
      this.builder = new V1alpha2DriverAllocationResultBuilder(this, item);
    }
    V1alpha2DriverAllocationResultBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha2StructuredResourceHandleFluent.this.setToResults(index,builder.build());
    }
    
    public N endResult() {
      return and();
    }
    
  
  }

}