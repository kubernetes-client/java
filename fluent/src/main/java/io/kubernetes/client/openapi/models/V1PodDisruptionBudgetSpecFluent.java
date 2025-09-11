package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import io.kubernetes.client.custom.IntOrString;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodDisruptionBudgetSpecFluent<A extends io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent<A>> extends BaseFluent<A>{
  public V1PodDisruptionBudgetSpecFluent() {
  }
  
  public V1PodDisruptionBudgetSpecFluent(V1PodDisruptionBudgetSpec instance) {
    this.copyInstance(instance);
  }
  private IntOrString maxUnavailable;
  private IntOrString minAvailable;
  private V1LabelSelectorBuilder selector;
  private String unhealthyPodEvictionPolicy;
  
  protected void copyInstance(V1PodDisruptionBudgetSpec instance) {
    instance = instance != null ? instance : new V1PodDisruptionBudgetSpec();
    if (instance != null) {
        this.withMaxUnavailable(instance.getMaxUnavailable());
        this.withMinAvailable(instance.getMinAvailable());
        this.withSelector(instance.getSelector());
        this.withUnhealthyPodEvictionPolicy(instance.getUnhealthyPodEvictionPolicy());
    }
  }
  
  public IntOrString getMaxUnavailable() {
    return this.maxUnavailable;
  }
  
  public A withMaxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return (A) this;
  }
  
  public boolean hasMaxUnavailable() {
    return this.maxUnavailable != null;
  }
  
  public A withNewMaxUnavailable(int value) {
    return (A) this.withMaxUnavailable(new IntOrString(value));
  }
  
  public A withNewMaxUnavailable(String value) {
    return (A) this.withMaxUnavailable(new IntOrString(value));
  }
  
  public IntOrString getMinAvailable() {
    return this.minAvailable;
  }
  
  public A withMinAvailable(IntOrString minAvailable) {
    this.minAvailable = minAvailable;
    return (A) this;
  }
  
  public boolean hasMinAvailable() {
    return this.minAvailable != null;
  }
  
  public A withNewMinAvailable(int value) {
    return (A) this.withMinAvailable(new IntOrString(value));
  }
  
  public A withNewMinAvailable(String value) {
    return (A) this.withMinAvailable(new IntOrString(value));
  }
  
  public V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }
  
  public A withSelector(V1LabelSelector selector) {
    this._visitables.remove("selector");
    if (selector != null) {
        this.selector = new V1LabelSelectorBuilder(selector);
        this._visitables.get("selector").add(this.selector);
    } else {
        this.selector = null;
        this._visitables.get("selector").remove(this.selector);
    }
    return (A) this;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public SelectorNested<A> withNewSelector() {
    return new SelectorNested(null);
  }
  
  public SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new SelectorNested(item);
  }
  
  public SelectorNested<A> editSelector() {
    return this.withNewSelectorLike(Optional.ofNullable(this.buildSelector()).orElse(null));
  }
  
  public SelectorNested<A> editOrNewSelector() {
    return this.withNewSelectorLike(Optional.ofNullable(this.buildSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return this.withNewSelectorLike(Optional.ofNullable(this.buildSelector()).orElse(item));
  }
  
  public String getUnhealthyPodEvictionPolicy() {
    return this.unhealthyPodEvictionPolicy;
  }
  
  public A withUnhealthyPodEvictionPolicy(String unhealthyPodEvictionPolicy) {
    this.unhealthyPodEvictionPolicy = unhealthyPodEvictionPolicy;
    return (A) this;
  }
  
  public boolean hasUnhealthyPodEvictionPolicy() {
    return this.unhealthyPodEvictionPolicy != null;
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
    V1PodDisruptionBudgetSpecFluent that = (V1PodDisruptionBudgetSpecFluent) o;
    if (!(Objects.equals(maxUnavailable, that.maxUnavailable))) {
      return false;
    }
    if (!(Objects.equals(minAvailable, that.minAvailable))) {
      return false;
    }
    if (!(Objects.equals(selector, that.selector))) {
      return false;
    }
    if (!(Objects.equals(unhealthyPodEvictionPolicy, that.unhealthyPodEvictionPolicy))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(maxUnavailable, minAvailable, selector, unhealthyPodEvictionPolicy);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(maxUnavailable == null)) {
        sb.append("maxUnavailable:");
        sb.append(maxUnavailable);
        sb.append(",");
    }
    if (!(minAvailable == null)) {
        sb.append("minAvailable:");
        sb.append(minAvailable);
        sb.append(",");
    }
    if (!(selector == null)) {
        sb.append("selector:");
        sb.append(selector);
        sb.append(",");
    }
    if (!(unhealthyPodEvictionPolicy == null)) {
        sb.append("unhealthyPodEvictionPolicy:");
        sb.append(unhealthyPodEvictionPolicy);
    }
    sb.append("}");
    return sb.toString();
  }
  public class SelectorNested<N> extends V1LabelSelectorFluent<SelectorNested<N>> implements Nested<N>{
    SelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1PodDisruptionBudgetSpecFluent.this.withSelector(builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }

}