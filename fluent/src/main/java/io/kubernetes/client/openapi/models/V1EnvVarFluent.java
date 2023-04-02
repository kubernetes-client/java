package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EnvVarFluent<A extends V1EnvVarFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getValue();
  public A withValue(String value);
  public Boolean hasValue();
  
  /**
   * This method has been deprecated, please use method buildValueFrom instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EnvVarSource getValueFrom();
  public V1EnvVarSource buildValueFrom();
  public A withValueFrom(V1EnvVarSource valueFrom);
  public Boolean hasValueFrom();
  public V1EnvVarFluent.ValueFromNested<A> withNewValueFrom();
  public V1EnvVarFluent.ValueFromNested<A> withNewValueFromLike(V1EnvVarSource item);
  public V1EnvVarFluent.ValueFromNested<A> editValueFrom();
  public V1EnvVarFluent.ValueFromNested<A> editOrNewValueFrom();
  public V1EnvVarFluent.ValueFromNested<A> editOrNewValueFromLike(V1EnvVarSource item);
  public interface ValueFromNested<N> extends Nested<N>,V1EnvVarSourceFluent<V1EnvVarFluent.ValueFromNested<N>>{
    public N and();
    public N endValueFrom();
    
  }
  
}