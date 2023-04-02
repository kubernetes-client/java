package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DeploymentStrategyFluent<A extends V1DeploymentStrategyFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RollingUpdateDeployment getRollingUpdate();
  public V1RollingUpdateDeployment buildRollingUpdate();
  public A withRollingUpdate(V1RollingUpdateDeployment rollingUpdate);
  public Boolean hasRollingUpdate();
  public V1DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();
  public V1DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(V1RollingUpdateDeployment item);
  public V1DeploymentStrategyFluent.RollingUpdateNested<A> editRollingUpdate();
  public V1DeploymentStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();
  public V1DeploymentStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(V1RollingUpdateDeployment item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public interface RollingUpdateNested<N> extends Nested<N>,V1RollingUpdateDeploymentFluent<V1DeploymentStrategyFluent.RollingUpdateNested<N>>{
    public N and();
    public N endRollingUpdate();
    
  }
  
}