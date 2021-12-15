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
public interface V1DeploymentStrategyFluent<A extends io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1RollingUpdateDeployment getRollingUpdate();
  public io.kubernetes.client.openapi.models.V1RollingUpdateDeployment buildRollingUpdate();
  public A withRollingUpdate(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment rollingUpdate);
  public java.lang.Boolean hasRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment item);
  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> editRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment item);
  public io.kubernetes.client.openapi.models.V1DeploymentStrategy.TypeEnum getType();
  public A withType(io.kubernetes.client.openapi.models.V1DeploymentStrategy.TypeEnum type);
  public java.lang.Boolean hasType();
  public interface RollingUpdateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluent<io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<N>>{
    public N and();
    public N endRollingUpdate();
    
  }
  
}