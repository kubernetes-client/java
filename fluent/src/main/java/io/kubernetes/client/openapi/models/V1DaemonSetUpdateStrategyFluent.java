package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DaemonSetUpdateStrategyFluent<A extends io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet getRollingUpdate();
  public io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet buildRollingUpdate();
  public A withRollingUpdate(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet rollingUpdate);
  public java.lang.Boolean hasRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet item);
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet item);
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy.TypeEnum getType();
  public A withType(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy.TypeEnum type);
  public java.lang.Boolean hasType();
  public interface RollingUpdateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<N>>{
    public N and();
    public N endRollingUpdate();
    
  }
  
}