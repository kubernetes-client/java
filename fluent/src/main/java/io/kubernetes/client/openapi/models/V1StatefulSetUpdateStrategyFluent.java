package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatefulSetUpdateStrategyFluent<A extends V1StatefulSetUpdateStrategyFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RollingUpdateStatefulSetStrategy getRollingUpdate();
  public V1RollingUpdateStatefulSetStrategy buildRollingUpdate();
  public A withRollingUpdate(V1RollingUpdateStatefulSetStrategy rollingUpdate);
  public Boolean hasRollingUpdate();
  public V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();
  public V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(V1RollingUpdateStatefulSetStrategy item);
  public V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate();
  public V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();
  public V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(V1RollingUpdateStatefulSetStrategy item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public interface RollingUpdateNested<N> extends Nested<N>,V1RollingUpdateStatefulSetStrategyFluent<V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<N>>{
    public N and();
    public N endRollingUpdate();
    
  }
  
}