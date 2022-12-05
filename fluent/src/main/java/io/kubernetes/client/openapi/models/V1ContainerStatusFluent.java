package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ContainerStatusFluent<A extends V1ContainerStatusFluent<A>> extends Fluent<A>{
  public String getContainerID();
  public A withContainerID(String containerID);
  public Boolean hasContainerID();
  public String getImage();
  public A withImage(String image);
  public Boolean hasImage();
  public String getImageID();
  public A withImageID(String imageID);
  public Boolean hasImageID();
  
  /**
   * This method has been deprecated, please use method buildLastState instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ContainerState getLastState();
  public V1ContainerState buildLastState();
  public A withLastState(V1ContainerState lastState);
  public Boolean hasLastState();
  public V1ContainerStatusFluent.LastStateNested<A> withNewLastState();
  public V1ContainerStatusFluent.LastStateNested<A> withNewLastStateLike(V1ContainerState item);
  public V1ContainerStatusFluent.LastStateNested<A> editLastState();
  public V1ContainerStatusFluent.LastStateNested<A> editOrNewLastState();
  public V1ContainerStatusFluent.LastStateNested<A> editOrNewLastStateLike(V1ContainerState item);
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public Boolean getReady();
  public A withReady(Boolean ready);
  public Boolean hasReady();
  public Integer getRestartCount();
  public A withRestartCount(Integer restartCount);
  public Boolean hasRestartCount();
  public Boolean getStarted();
  public A withStarted(Boolean started);
  public Boolean hasStarted();
  
  /**
   * This method has been deprecated, please use method buildState instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ContainerState getState();
  public V1ContainerState buildState();
  public A withState(V1ContainerState state);
  public Boolean hasState();
  public V1ContainerStatusFluent.StateNested<A> withNewState();
  public V1ContainerStatusFluent.StateNested<A> withNewStateLike(V1ContainerState item);
  public V1ContainerStatusFluent.StateNested<A> editState();
  public V1ContainerStatusFluent.StateNested<A> editOrNewState();
  public V1ContainerStatusFluent.StateNested<A> editOrNewStateLike(V1ContainerState item);
  public A withReady();
  public A withStarted();
  public interface LastStateNested<N> extends Nested<N>,V1ContainerStateFluent<V1ContainerStatusFluent.LastStateNested<N>>{
    public N and();
    public N endLastState();
    
  }
  public interface StateNested<N> extends Nested<N>,V1ContainerStateFluent<V1ContainerStatusFluent.StateNested<N>>{
    public N and();
    public N endState();
    
  }
  
}