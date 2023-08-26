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
public interface V1alpha2ResourceClassFluent<A extends V1alpha2ResourceClassFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public String getDriverName();
  public A withDriverName(String driverName);
  public Boolean hasDriverName();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V1alpha2ResourceClassFluent.MetadataNested<A> withNewMetadata();
  public V1alpha2ResourceClassFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1alpha2ResourceClassFluent.MetadataNested<A> editMetadata();
  public V1alpha2ResourceClassFluent.MetadataNested<A> editOrNewMetadata();
  public V1alpha2ResourceClassFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildParametersRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2ResourceClassParametersReference getParametersRef();
  public V1alpha2ResourceClassParametersReference buildParametersRef();
  public A withParametersRef(V1alpha2ResourceClassParametersReference parametersRef);
  public Boolean hasParametersRef();
  public V1alpha2ResourceClassFluent.ParametersRefNested<A> withNewParametersRef();
  public V1alpha2ResourceClassFluent.ParametersRefNested<A> withNewParametersRefLike(V1alpha2ResourceClassParametersReference item);
  public V1alpha2ResourceClassFluent.ParametersRefNested<A> editParametersRef();
  public V1alpha2ResourceClassFluent.ParametersRefNested<A> editOrNewParametersRef();
  public V1alpha2ResourceClassFluent.ParametersRefNested<A> editOrNewParametersRefLike(V1alpha2ResourceClassParametersReference item);
  
  /**
   * This method has been deprecated, please use method buildSuitableNodes instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getSuitableNodes();
  public V1NodeSelector buildSuitableNodes();
  public A withSuitableNodes(V1NodeSelector suitableNodes);
  public Boolean hasSuitableNodes();
  public V1alpha2ResourceClassFluent.SuitableNodesNested<A> withNewSuitableNodes();
  public V1alpha2ResourceClassFluent.SuitableNodesNested<A> withNewSuitableNodesLike(V1NodeSelector item);
  public V1alpha2ResourceClassFluent.SuitableNodesNested<A> editSuitableNodes();
  public V1alpha2ResourceClassFluent.SuitableNodesNested<A> editOrNewSuitableNodes();
  public V1alpha2ResourceClassFluent.SuitableNodesNested<A> editOrNewSuitableNodesLike(V1NodeSelector item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1alpha2ResourceClassFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface ParametersRefNested<N> extends Nested<N>,V1alpha2ResourceClassParametersReferenceFluent<V1alpha2ResourceClassFluent.ParametersRefNested<N>>{
    public N and();
    public N endParametersRef();
    
  }
  public interface SuitableNodesNested<N> extends Nested<N>,V1NodeSelectorFluent<V1alpha2ResourceClassFluent.SuitableNodesNested<N>>{
    public N and();
    public N endSuitableNodes();
    
  }
  
}