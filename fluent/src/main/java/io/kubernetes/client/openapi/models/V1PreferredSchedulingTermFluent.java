package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PreferredSchedulingTermFluent<A extends V1PreferredSchedulingTermFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildPreference instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelectorTerm getPreference();
  public V1NodeSelectorTerm buildPreference();
  public A withPreference(V1NodeSelectorTerm preference);
  public Boolean hasPreference();
  public V1PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreference();
  public V1PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreferenceLike(V1NodeSelectorTerm item);
  public V1PreferredSchedulingTermFluent.PreferenceNested<A> editPreference();
  public V1PreferredSchedulingTermFluent.PreferenceNested<A> editOrNewPreference();
  public V1PreferredSchedulingTermFluent.PreferenceNested<A> editOrNewPreferenceLike(V1NodeSelectorTerm item);
  public Integer getWeight();
  public A withWeight(Integer weight);
  public Boolean hasWeight();
  public interface PreferenceNested<N> extends Nested<N>,V1NodeSelectorTermFluent<V1PreferredSchedulingTermFluent.PreferenceNested<N>>{
    public N and();
    public N endPreference();
    
  }
  
}