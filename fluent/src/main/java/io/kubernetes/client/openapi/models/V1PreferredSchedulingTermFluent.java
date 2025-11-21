package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PreferredSchedulingTermFluent<A extends io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent<A>> extends BaseFluent<A>{

  private V1NodeSelectorTermBuilder preference;
  private Integer weight;

  public V1PreferredSchedulingTermFluent() {
  }
  
  public V1PreferredSchedulingTermFluent(V1PreferredSchedulingTerm instance) {
    this.copyInstance(instance);
  }

  public V1NodeSelectorTerm buildPreference() {
    return this.preference != null ? this.preference.build() : null;
  }
  
  protected void copyInstance(V1PreferredSchedulingTerm instance) {
    instance = instance != null ? instance : new V1PreferredSchedulingTerm();
    if (instance != null) {
        this.withPreference(instance.getPreference());
        this.withWeight(instance.getWeight());
    }
  }
  
  public PreferenceNested<A> editOrNewPreference() {
    return this.withNewPreferenceLike(Optional.ofNullable(this.buildPreference()).orElse(new V1NodeSelectorTermBuilder().build()));
  }
  
  public PreferenceNested<A> editOrNewPreferenceLike(V1NodeSelectorTerm item) {
    return this.withNewPreferenceLike(Optional.ofNullable(this.buildPreference()).orElse(item));
  }
  
  public PreferenceNested<A> editPreference() {
    return this.withNewPreferenceLike(Optional.ofNullable(this.buildPreference()).orElse(null));
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
    V1PreferredSchedulingTermFluent that = (V1PreferredSchedulingTermFluent) o;
    if (!(Objects.equals(preference, that.preference))) {
      return false;
    }
    if (!(Objects.equals(weight, that.weight))) {
      return false;
    }
    return true;
  }
  
  public Integer getWeight() {
    return this.weight;
  }
  
  public boolean hasPreference() {
    return this.preference != null;
  }
  
  public boolean hasWeight() {
    return this.weight != null;
  }
  
  public int hashCode() {
    return Objects.hash(preference, weight);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(preference == null)) {
        sb.append("preference:");
        sb.append(preference);
        sb.append(",");
    }
    if (!(weight == null)) {
        sb.append("weight:");
        sb.append(weight);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public PreferenceNested<A> withNewPreference() {
    return new PreferenceNested(null);
  }
  
  public PreferenceNested<A> withNewPreferenceLike(V1NodeSelectorTerm item) {
    return new PreferenceNested(item);
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
  
  public A withWeight(Integer weight) {
    this.weight = weight;
    return (A) this;
  }
  public class PreferenceNested<N> extends V1NodeSelectorTermFluent<PreferenceNested<N>> implements Nested<N>{
  
    V1NodeSelectorTermBuilder builder;
  
    PreferenceNested(V1NodeSelectorTerm item) {
      this.builder = new V1NodeSelectorTermBuilder(this, item);
    }
  
    public N and() {
      return (N) V1PreferredSchedulingTermFluent.this.withPreference(builder.build());
    }
    
    public N endPreference() {
      return and();
    }
    
  }
}