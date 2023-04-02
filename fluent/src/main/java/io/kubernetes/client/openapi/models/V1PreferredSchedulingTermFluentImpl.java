package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PreferredSchedulingTermFluentImpl<A extends V1PreferredSchedulingTermFluent<A>> extends BaseFluent<A> implements V1PreferredSchedulingTermFluent<A>{
  public V1PreferredSchedulingTermFluentImpl() {
  }
  public V1PreferredSchedulingTermFluentImpl(V1PreferredSchedulingTerm instance) {
    this.withPreference(instance.getPreference());

    this.withWeight(instance.getWeight());

  }
  private V1NodeSelectorTermBuilder preference;
  private Integer weight;
  
  /**
   * This method has been deprecated, please use method buildPreference instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelectorTerm getPreference() {
    return this.preference!=null ?this.preference.build():null;
  }
  public V1NodeSelectorTerm buildPreference() {
    return this.preference!=null ?this.preference.build():null;
  }
  public A withPreference(V1NodeSelectorTerm preference) {
    _visitables.get("preference").remove(this.preference);
    if (preference!=null){ this.preference= new V1NodeSelectorTermBuilder(preference); _visitables.get("preference").add(this.preference);} else { this.preference = null; _visitables.get("preference").remove(this.preference); } return (A) this;
  }
  public Boolean hasPreference() {
    return this.preference != null;
  }
  public V1PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreference() {
    return new V1PreferredSchedulingTermFluentImpl.PreferenceNestedImpl();
  }
  public V1PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreferenceLike(V1NodeSelectorTerm item) {
    return new V1PreferredSchedulingTermFluentImpl.PreferenceNestedImpl(item);
  }
  public V1PreferredSchedulingTermFluent.PreferenceNested<A> editPreference() {
    return withNewPreferenceLike(getPreference());
  }
  public V1PreferredSchedulingTermFluent.PreferenceNested<A> editOrNewPreference() {
    return withNewPreferenceLike(getPreference() != null ? getPreference(): new V1NodeSelectorTermBuilder().build());
  }
  public V1PreferredSchedulingTermFluent.PreferenceNested<A> editOrNewPreferenceLike(V1NodeSelectorTerm item) {
    return withNewPreferenceLike(getPreference() != null ? getPreference(): item);
  }
  public Integer getWeight() {
    return this.weight;
  }
  public A withWeight(Integer weight) {
    this.weight=weight; return (A) this;
  }
  public Boolean hasWeight() {
    return this.weight != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PreferredSchedulingTermFluentImpl that = (V1PreferredSchedulingTermFluentImpl) o;
    if (preference != null ? !preference.equals(that.preference) :that.preference != null) return false;
    if (weight != null ? !weight.equals(that.weight) :that.weight != null) return false;
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
  class PreferenceNestedImpl<N> extends V1NodeSelectorTermFluentImpl<V1PreferredSchedulingTermFluent.PreferenceNested<N>> implements V1PreferredSchedulingTermFluent.PreferenceNested<N>,Nested<N>{
    PreferenceNestedImpl(V1NodeSelectorTerm item) {
      this.builder = new V1NodeSelectorTermBuilder(this, item);
    }
    PreferenceNestedImpl() {
      this.builder = new V1NodeSelectorTermBuilder(this);
    }
    V1NodeSelectorTermBuilder builder;
    public N and() {
      return (N) V1PreferredSchedulingTermFluentImpl.this.withPreference(builder.build());
    }
    public N endPreference() {
      return and();
    }
    
  }
  
}