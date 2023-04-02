package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ServiceAccountFluent<A extends V1ServiceAccountFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public Boolean getAutomountServiceAccountToken();
  public A withAutomountServiceAccountToken(Boolean automountServiceAccountToken);
  public Boolean hasAutomountServiceAccountToken();
  public A addToImagePullSecrets(Integer index,V1LocalObjectReference item);
  public A setToImagePullSecrets(Integer index,V1LocalObjectReference item);
  public A addToImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... items);
  public A addAllToImagePullSecrets(Collection<V1LocalObjectReference> items);
  public A removeFromImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... items);
  public A removeAllFromImagePullSecrets(Collection<V1LocalObjectReference> items);
  public A removeMatchingFromImagePullSecrets(Predicate<V1LocalObjectReferenceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildImagePullSecrets instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1LocalObjectReference> getImagePullSecrets();
  public List<V1LocalObjectReference> buildImagePullSecrets();
  public V1LocalObjectReference buildImagePullSecret(Integer index);
  public V1LocalObjectReference buildFirstImagePullSecret();
  public V1LocalObjectReference buildLastImagePullSecret();
  public V1LocalObjectReference buildMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate);
  public Boolean hasMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate);
  public A withImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets);
  public A withImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... imagePullSecrets);
  public Boolean hasImagePullSecrets();
  public V1ServiceAccountFluent.ImagePullSecretsNested<A> addNewImagePullSecret();
  public V1ServiceAccountFluent.ImagePullSecretsNested<A> addNewImagePullSecretLike(V1LocalObjectReference item);
  public V1ServiceAccountFluent.ImagePullSecretsNested<A> setNewImagePullSecretLike(Integer index,V1LocalObjectReference item);
  public V1ServiceAccountFluent.ImagePullSecretsNested<A> editImagePullSecret(Integer index);
  public V1ServiceAccountFluent.ImagePullSecretsNested<A> editFirstImagePullSecret();
  public V1ServiceAccountFluent.ImagePullSecretsNested<A> editLastImagePullSecret();
  public V1ServiceAccountFluent.ImagePullSecretsNested<A> editMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate);
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
  public V1ServiceAccountFluent.MetadataNested<A> withNewMetadata();
  public V1ServiceAccountFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1ServiceAccountFluent.MetadataNested<A> editMetadata();
  public V1ServiceAccountFluent.MetadataNested<A> editOrNewMetadata();
  public V1ServiceAccountFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  public A addToSecrets(Integer index,V1ObjectReference item);
  public A setToSecrets(Integer index,V1ObjectReference item);
  public A addToSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... items);
  public A addAllToSecrets(Collection<V1ObjectReference> items);
  public A removeFromSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... items);
  public A removeAllFromSecrets(Collection<V1ObjectReference> items);
  public A removeMatchingFromSecrets(Predicate<V1ObjectReferenceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildSecrets instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ObjectReference> getSecrets();
  public List<V1ObjectReference> buildSecrets();
  public V1ObjectReference buildSecret(Integer index);
  public V1ObjectReference buildFirstSecret();
  public V1ObjectReference buildLastSecret();
  public V1ObjectReference buildMatchingSecret(Predicate<V1ObjectReferenceBuilder> predicate);
  public Boolean hasMatchingSecret(Predicate<V1ObjectReferenceBuilder> predicate);
  public A withSecrets(List<V1ObjectReference> secrets);
  public A withSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... secrets);
  public Boolean hasSecrets();
  public V1ServiceAccountFluent.SecretsNested<A> addNewSecret();
  public V1ServiceAccountFluent.SecretsNested<A> addNewSecretLike(V1ObjectReference item);
  public V1ServiceAccountFluent.SecretsNested<A> setNewSecretLike(Integer index,V1ObjectReference item);
  public V1ServiceAccountFluent.SecretsNested<A> editSecret(Integer index);
  public V1ServiceAccountFluent.SecretsNested<A> editFirstSecret();
  public V1ServiceAccountFluent.SecretsNested<A> editLastSecret();
  public V1ServiceAccountFluent.SecretsNested<A> editMatchingSecret(Predicate<V1ObjectReferenceBuilder> predicate);
  public A withAutomountServiceAccountToken();
  public interface ImagePullSecretsNested<N> extends Nested<N>,V1LocalObjectReferenceFluent<V1ServiceAccountFluent.ImagePullSecretsNested<N>>{
    public N and();
    public N endImagePullSecret();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1ServiceAccountFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SecretsNested<N> extends Nested<N>,V1ObjectReferenceFluent<V1ServiceAccountFluent.SecretsNested<N>>{
    public N and();
    public N endSecret();
    
  }
  
}