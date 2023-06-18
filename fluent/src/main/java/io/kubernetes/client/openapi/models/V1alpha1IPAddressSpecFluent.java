package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1IPAddressSpecFluent<A extends V1alpha1IPAddressSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildParentRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ParentReference getParentRef();
  public V1alpha1ParentReference buildParentRef();
  public A withParentRef(V1alpha1ParentReference parentRef);
  public Boolean hasParentRef();
  public V1alpha1IPAddressSpecFluent.ParentRefNested<A> withNewParentRef();
  public V1alpha1IPAddressSpecFluent.ParentRefNested<A> withNewParentRefLike(V1alpha1ParentReference item);
  public V1alpha1IPAddressSpecFluent.ParentRefNested<A> editParentRef();
  public V1alpha1IPAddressSpecFluent.ParentRefNested<A> editOrNewParentRef();
  public V1alpha1IPAddressSpecFluent.ParentRefNested<A> editOrNewParentRefLike(V1alpha1ParentReference item);
  public interface ParentRefNested<N> extends Nested<N>,V1alpha1ParentReferenceFluent<V1alpha1IPAddressSpecFluent.ParentRefNested<N>>{
    public N and();
    public N endParentRef();
    
  }
  
}