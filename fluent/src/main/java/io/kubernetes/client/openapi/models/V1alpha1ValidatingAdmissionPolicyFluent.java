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
public interface V1alpha1ValidatingAdmissionPolicyFluent<A extends V1alpha1ValidatingAdmissionPolicyFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
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
  public V1alpha1ValidatingAdmissionPolicyFluent.MetadataNested<A> withNewMetadata();
  public V1alpha1ValidatingAdmissionPolicyFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1alpha1ValidatingAdmissionPolicyFluent.MetadataNested<A> editMetadata();
  public V1alpha1ValidatingAdmissionPolicyFluent.MetadataNested<A> editOrNewMetadata();
  public V1alpha1ValidatingAdmissionPolicyFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ValidatingAdmissionPolicySpec getSpec();
  public V1alpha1ValidatingAdmissionPolicySpec buildSpec();
  public A withSpec(V1alpha1ValidatingAdmissionPolicySpec spec);
  public Boolean hasSpec();
  public V1alpha1ValidatingAdmissionPolicyFluent.SpecNested<A> withNewSpec();
  public V1alpha1ValidatingAdmissionPolicyFluent.SpecNested<A> withNewSpecLike(V1alpha1ValidatingAdmissionPolicySpec item);
  public V1alpha1ValidatingAdmissionPolicyFluent.SpecNested<A> editSpec();
  public V1alpha1ValidatingAdmissionPolicyFluent.SpecNested<A> editOrNewSpec();
  public V1alpha1ValidatingAdmissionPolicyFluent.SpecNested<A> editOrNewSpecLike(V1alpha1ValidatingAdmissionPolicySpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ValidatingAdmissionPolicyStatus getStatus();
  public V1alpha1ValidatingAdmissionPolicyStatus buildStatus();
  public A withStatus(V1alpha1ValidatingAdmissionPolicyStatus status);
  public Boolean hasStatus();
  public V1alpha1ValidatingAdmissionPolicyFluent.StatusNested<A> withNewStatus();
  public V1alpha1ValidatingAdmissionPolicyFluent.StatusNested<A> withNewStatusLike(V1alpha1ValidatingAdmissionPolicyStatus item);
  public V1alpha1ValidatingAdmissionPolicyFluent.StatusNested<A> editStatus();
  public V1alpha1ValidatingAdmissionPolicyFluent.StatusNested<A> editOrNewStatus();
  public V1alpha1ValidatingAdmissionPolicyFluent.StatusNested<A> editOrNewStatusLike(V1alpha1ValidatingAdmissionPolicyStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1alpha1ValidatingAdmissionPolicyFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1alpha1ValidatingAdmissionPolicySpecFluent<V1alpha1ValidatingAdmissionPolicyFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1alpha1ValidatingAdmissionPolicyStatusFluent<V1alpha1ValidatingAdmissionPolicyFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}