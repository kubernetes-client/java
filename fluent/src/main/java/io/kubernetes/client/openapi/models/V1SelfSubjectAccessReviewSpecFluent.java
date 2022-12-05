package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SelfSubjectAccessReviewSpecFluent<A extends V1SelfSubjectAccessReviewSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildNonResourceAttributes instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NonResourceAttributes getNonResourceAttributes();
  public V1NonResourceAttributes buildNonResourceAttributes();
  public A withNonResourceAttributes(V1NonResourceAttributes nonResourceAttributes);
  public Boolean hasNonResourceAttributes();
  public V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributes();
  public V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributesLike(V1NonResourceAttributes item);
  public V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editNonResourceAttributes();
  public V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributes();
  public V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributesLike(V1NonResourceAttributes item);
  
  /**
   * This method has been deprecated, please use method buildResourceAttributes instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceAttributes getResourceAttributes();
  public V1ResourceAttributes buildResourceAttributes();
  public A withResourceAttributes(V1ResourceAttributes resourceAttributes);
  public Boolean hasResourceAttributes();
  public V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributes();
  public V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributesLike(V1ResourceAttributes item);
  public V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editResourceAttributes();
  public V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributes();
  public V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributesLike(V1ResourceAttributes item);
  public interface NonResourceAttributesNested<N> extends Nested<N>,V1NonResourceAttributesFluent<V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>>{
    public N and();
    public N endNonResourceAttributes();
    
  }
  public interface ResourceAttributesNested<N> extends Nested<N>,V1ResourceAttributesFluent<V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<N>>{
    public N and();
    public N endResourceAttributes();
    
  }
  
}