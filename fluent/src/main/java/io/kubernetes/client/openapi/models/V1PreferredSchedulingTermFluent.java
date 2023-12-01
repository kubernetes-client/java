package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PreferredSchedulingTermFluent<A extends V1PreferredSchedulingTermFluent<A>> extends BaseFluent<A>{
  public V1PreferredSchedulingTermFluent() {
  }
  
  public V1PreferredSchedulingTermFluent(V1PreferredSchedulingTerm instance) {
    this.copyInstance(instance);
  }
  private V1NodeSelectorTermBuilder preference;
  private Integer weight;
  
  protected void copyInstance(V1PreferredSchedulingTerm instance) {
    instance = (instance != null ? instance : new V1PreferredSchedulingTerm());
    if (instance != null) {
          this.withPreference(instance.getPreference());
          this.withWeight(instance.getWeight());
        }
  }
  
  public V1NodeSelectorTerm buildPreference() {
    return this.preference != null ? this.preference.build() : null;
  }
  
  public A withPreference(V1NodeSelectorTerm preference) {
    this._visitables.remove("preference");
    if (preference != null) {
        this.preference = new V1NodeSelectorTermBuilder(preference);
        this._visitables.get("preference").add(this.preference);
    } else {
        this.preference = null;
        this._visitables.get("preference").remove(this.preference);
    }
    return (A) this;
  }
  
  public boolean hasPreference() {
    return this.preference != null;
  }
  
  public PreferenceNested<A> withNewPreference() {
    return new PreferenceNested(null);
  }
  
  public PreferenceNested<A> withNewPreferenceLike(V1NodeSelectorTerm item) {
    return new PreferenceNested(item);
  }
  
  public PreferenceNested<A> editPreference() {
    return withNewPreferenceLike(java.util.Optional.ofNullable(buildPreference()).orElse(null));
  }
  
  public PreferenceNested<A> editOrNewPreference() {
    return withNewPreferenceLike(java.util.Optional.ofNullable(buildPreference()).orElse(new V1NodeSelectorTermBuilder().build()));
  }
  
  public PreferenceNested<A> editOrNewPreferenceLike(V1NodeSelectorTerm item) {
    return withNewPreferenceLike(java.util.Optional.ofNullable(buildPreference()).orElse(item));
  }
  
  public Integer getWeight() {
    return this.weight;
  }
  
  public A withWeight(Integer weight) {
    this.weight = weight;
    return (A) this;
  }
  
  public boolean hasWeight() {
    return this.weight != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PreferredSchedulingTermFluent that = (V1PreferredSchedulingTermFluent) o;
    if (!java.util.Objects.equals(preference, that.preference)) return false;
    if (!java.util.Objects.equals(weight, that.weight)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(preference,  weight,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (preference != null) { sb.append("preference:"); sb.append(preference + ","); }
    if (weight != null) { sb.append("weight:"); sb.append(weight); }
    sb.append("}");
    return sb.toString();
  }
  public class PreferenceNested<N> extends V1NodeSelectorTermFluent<PreferenceNested<N>> implements Nested<N>{
    PreferenceNested(V1NodeSelectorTerm item) {
      this.builder = new V1NodeSelectorTermBuilder(this, item);
    }
    V1NodeSelectorTermBuilder builder;
    
    public N and() {
      return (N) V1PreferredSchedulingTermFluent.this.withPreference(builder.build());
    }
    
    public N endPreference() {
      return and();
    }
    
  
  }

}