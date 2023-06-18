package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha2ResourceClaimSpecFluent<A extends V1alpha2ResourceClaimSpecFluent<A>> extends Fluent<A>{
  public String getAllocationMode();
  public A withAllocationMode(String allocationMode);
  public Boolean hasAllocationMode();
  
  /**
   * This method has been deprecated, please use method buildParametersRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2ResourceClaimParametersReference getParametersRef();
  public V1alpha2ResourceClaimParametersReference buildParametersRef();
  public A withParametersRef(V1alpha2ResourceClaimParametersReference parametersRef);
  public Boolean hasParametersRef();
  public V1alpha2ResourceClaimSpecFluent.ParametersRefNested<A> withNewParametersRef();
  public V1alpha2ResourceClaimSpecFluent.ParametersRefNested<A> withNewParametersRefLike(V1alpha2ResourceClaimParametersReference item);
  public V1alpha2ResourceClaimSpecFluent.ParametersRefNested<A> editParametersRef();
  public V1alpha2ResourceClaimSpecFluent.ParametersRefNested<A> editOrNewParametersRef();
  public V1alpha2ResourceClaimSpecFluent.ParametersRefNested<A> editOrNewParametersRefLike(V1alpha2ResourceClaimParametersReference item);
  public String getResourceClassName();
  public A withResourceClassName(String resourceClassName);
  public Boolean hasResourceClassName();
  public interface ParametersRefNested<N> extends Nested<N>,V1alpha2ResourceClaimParametersReferenceFluent<V1alpha2ResourceClaimSpecFluent.ParametersRefNested<N>>{
    public N and();
    public N endParametersRef();
    
  }
  
}