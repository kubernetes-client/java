package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CustomResourceSubresourcesFluent<A extends V1CustomResourceSubresourcesFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildScale instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceSubresourceScale getScale();
  public V1CustomResourceSubresourceScale buildScale();
  public A withScale(V1CustomResourceSubresourceScale scale);
  public Boolean hasScale();
  public V1CustomResourceSubresourcesFluent.ScaleNested<A> withNewScale();
  public V1CustomResourceSubresourcesFluent.ScaleNested<A> withNewScaleLike(V1CustomResourceSubresourceScale item);
  public V1CustomResourceSubresourcesFluent.ScaleNested<A> editScale();
  public V1CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScale();
  public V1CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScaleLike(V1CustomResourceSubresourceScale item);
  public Object getStatus();
  public A withStatus(Object status);
  public Boolean hasStatus();
  public interface ScaleNested<N> extends Nested<N>,V1CustomResourceSubresourceScaleFluent<V1CustomResourceSubresourcesFluent.ScaleNested<N>>{
    public N and();
    public N endScale();
    
  }
  
}