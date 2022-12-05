package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DaemonSetUpdateStrategyFluent<A extends V1DaemonSetUpdateStrategyFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RollingUpdateDaemonSet getRollingUpdate();
  public V1RollingUpdateDaemonSet buildRollingUpdate();
  public A withRollingUpdate(V1RollingUpdateDaemonSet rollingUpdate);
  public Boolean hasRollingUpdate();
  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();
  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(V1RollingUpdateDaemonSet item);
  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate();
  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();
  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(V1RollingUpdateDaemonSet item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public interface RollingUpdateNested<N> extends Nested<N>,V1RollingUpdateDaemonSetFluent<V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<N>>{
    public N and();
    public N endRollingUpdate();
    
  }
  
}