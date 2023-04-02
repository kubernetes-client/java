package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeConfigStatusFluent<A extends V1NodeConfigStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildActive instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeConfigSource getActive();
  public V1NodeConfigSource buildActive();
  public A withActive(V1NodeConfigSource active);
  public Boolean hasActive();
  public V1NodeConfigStatusFluent.ActiveNested<A> withNewActive();
  public V1NodeConfigStatusFluent.ActiveNested<A> withNewActiveLike(V1NodeConfigSource item);
  public V1NodeConfigStatusFluent.ActiveNested<A> editActive();
  public V1NodeConfigStatusFluent.ActiveNested<A> editOrNewActive();
  public V1NodeConfigStatusFluent.ActiveNested<A> editOrNewActiveLike(V1NodeConfigSource item);
  
  /**
   * This method has been deprecated, please use method buildAssigned instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeConfigSource getAssigned();
  public V1NodeConfigSource buildAssigned();
  public A withAssigned(V1NodeConfigSource assigned);
  public Boolean hasAssigned();
  public V1NodeConfigStatusFluent.AssignedNested<A> withNewAssigned();
  public V1NodeConfigStatusFluent.AssignedNested<A> withNewAssignedLike(V1NodeConfigSource item);
  public V1NodeConfigStatusFluent.AssignedNested<A> editAssigned();
  public V1NodeConfigStatusFluent.AssignedNested<A> editOrNewAssigned();
  public V1NodeConfigStatusFluent.AssignedNested<A> editOrNewAssignedLike(V1NodeConfigSource item);
  public String getError();
  public A withError(String error);
  public Boolean hasError();
  
  /**
   * This method has been deprecated, please use method buildLastKnownGood instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeConfigSource getLastKnownGood();
  public V1NodeConfigSource buildLastKnownGood();
  public A withLastKnownGood(V1NodeConfigSource lastKnownGood);
  public Boolean hasLastKnownGood();
  public V1NodeConfigStatusFluent.LastKnownGoodNested<A> withNewLastKnownGood();
  public V1NodeConfigStatusFluent.LastKnownGoodNested<A> withNewLastKnownGoodLike(V1NodeConfigSource item);
  public V1NodeConfigStatusFluent.LastKnownGoodNested<A> editLastKnownGood();
  public V1NodeConfigStatusFluent.LastKnownGoodNested<A> editOrNewLastKnownGood();
  public V1NodeConfigStatusFluent.LastKnownGoodNested<A> editOrNewLastKnownGoodLike(V1NodeConfigSource item);
  public interface ActiveNested<N> extends Nested<N>,V1NodeConfigSourceFluent<V1NodeConfigStatusFluent.ActiveNested<N>>{
    public N and();
    public N endActive();
    
  }
  public interface AssignedNested<N> extends Nested<N>,V1NodeConfigSourceFluent<V1NodeConfigStatusFluent.AssignedNested<N>>{
    public N and();
    public N endAssigned();
    
  }
  public interface LastKnownGoodNested<N> extends Nested<N>,V1NodeConfigSourceFluent<V1NodeConfigStatusFluent.LastKnownGoodNested<N>>{
    public N and();
    public N endLastKnownGood();
    
  }
  
}