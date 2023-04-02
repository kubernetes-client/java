package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1AffinityFluent<A extends V1AffinityFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildNodeAffinity instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeAffinity getNodeAffinity();
  public V1NodeAffinity buildNodeAffinity();
  public A withNodeAffinity(V1NodeAffinity nodeAffinity);
  public Boolean hasNodeAffinity();
  public V1AffinityFluent.NodeAffinityNested<A> withNewNodeAffinity();
  public V1AffinityFluent.NodeAffinityNested<A> withNewNodeAffinityLike(V1NodeAffinity item);
  public V1AffinityFluent.NodeAffinityNested<A> editNodeAffinity();
  public V1AffinityFluent.NodeAffinityNested<A> editOrNewNodeAffinity();
  public V1AffinityFluent.NodeAffinityNested<A> editOrNewNodeAffinityLike(V1NodeAffinity item);
  
  /**
   * This method has been deprecated, please use method buildPodAffinity instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodAffinity getPodAffinity();
  public V1PodAffinity buildPodAffinity();
  public A withPodAffinity(V1PodAffinity podAffinity);
  public Boolean hasPodAffinity();
  public V1AffinityFluent.PodAffinityNested<A> withNewPodAffinity();
  public V1AffinityFluent.PodAffinityNested<A> withNewPodAffinityLike(V1PodAffinity item);
  public V1AffinityFluent.PodAffinityNested<A> editPodAffinity();
  public V1AffinityFluent.PodAffinityNested<A> editOrNewPodAffinity();
  public V1AffinityFluent.PodAffinityNested<A> editOrNewPodAffinityLike(V1PodAffinity item);
  
  /**
   * This method has been deprecated, please use method buildPodAntiAffinity instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodAntiAffinity getPodAntiAffinity();
  public V1PodAntiAffinity buildPodAntiAffinity();
  public A withPodAntiAffinity(V1PodAntiAffinity podAntiAffinity);
  public Boolean hasPodAntiAffinity();
  public V1AffinityFluent.PodAntiAffinityNested<A> withNewPodAntiAffinity();
  public V1AffinityFluent.PodAntiAffinityNested<A> withNewPodAntiAffinityLike(V1PodAntiAffinity item);
  public V1AffinityFluent.PodAntiAffinityNested<A> editPodAntiAffinity();
  public V1AffinityFluent.PodAntiAffinityNested<A> editOrNewPodAntiAffinity();
  public V1AffinityFluent.PodAntiAffinityNested<A> editOrNewPodAntiAffinityLike(V1PodAntiAffinity item);
  public interface NodeAffinityNested<N> extends Nested<N>,V1NodeAffinityFluent<V1AffinityFluent.NodeAffinityNested<N>>{
    public N and();
    public N endNodeAffinity();
    
  }
  public interface PodAffinityNested<N> extends Nested<N>,V1PodAffinityFluent<V1AffinityFluent.PodAffinityNested<N>>{
    public N and();
    public N endPodAffinity();
    
  }
  public interface PodAntiAffinityNested<N> extends Nested<N>,V1PodAntiAffinityFluent<V1AffinityFluent.PodAntiAffinityNested<N>>{
    public N and();
    public N endPodAntiAffinity();
    
  }
  
}