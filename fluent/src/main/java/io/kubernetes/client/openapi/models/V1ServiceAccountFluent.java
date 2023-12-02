package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ServiceAccountFluent<A extends V1ServiceAccountFluent<A>> extends BaseFluent<A>{
  public V1ServiceAccountFluent() {
  }
  
  public V1ServiceAccountFluent(V1ServiceAccount instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private Boolean automountServiceAccountToken;
  private ArrayList<V1LocalObjectReferenceBuilder> imagePullSecrets;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private ArrayList<V1ObjectReferenceBuilder> secrets;
  
  protected void copyInstance(V1ServiceAccount instance) {
    instance = (instance != null ? instance : new V1ServiceAccount());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken());
          this.withImagePullSecrets(instance.getImagePullSecrets());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withSecrets(instance.getSecrets());
        }
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public Boolean getAutomountServiceAccountToken() {
    return this.automountServiceAccountToken;
  }
  
  public A withAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return (A) this;
  }
  
  public boolean hasAutomountServiceAccountToken() {
    return this.automountServiceAccountToken != null;
  }
  
  public A addToImagePullSecrets(int index,V1LocalObjectReference item) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);
    if (index < 0 || index >= imagePullSecrets.size()) { _visitables.get("imagePullSecrets").add(builder); imagePullSecrets.add(builder); } else { _visitables.get("imagePullSecrets").add(index, builder); imagePullSecrets.add(index, builder);}
    return (A)this;
  }
  
  public A setToImagePullSecrets(int index,V1LocalObjectReference item) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);
    if (index < 0 || index >= imagePullSecrets.size()) { _visitables.get("imagePullSecrets").add(builder); imagePullSecrets.add(builder); } else { _visitables.get("imagePullSecrets").set(index, builder); imagePullSecrets.set(index, builder);}
    return (A)this;
  }
  
  public A addToImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... items) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").add(builder);this.imagePullSecrets.add(builder);} return (A)this;
  }
  
  public A addAllToImagePullSecrets(Collection<V1LocalObjectReference> items) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").add(builder);this.imagePullSecrets.add(builder);} return (A)this;
  }
  
  public A removeFromImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... items) {
    if (this.imagePullSecrets == null) return (A)this;
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").remove(builder); this.imagePullSecrets.remove(builder);} return (A)this;
  }
  
  public A removeAllFromImagePullSecrets(Collection<V1LocalObjectReference> items) {
    if (this.imagePullSecrets == null) return (A)this;
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").remove(builder); this.imagePullSecrets.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromImagePullSecrets(Predicate<V1LocalObjectReferenceBuilder> predicate) {
    if (imagePullSecrets == null) return (A) this;
    final Iterator<V1LocalObjectReferenceBuilder> each = imagePullSecrets.iterator();
    final List visitables = _visitables.get("imagePullSecrets");
    while (each.hasNext()) {
      V1LocalObjectReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1LocalObjectReference> buildImagePullSecrets() {
    return this.imagePullSecrets != null ? build(imagePullSecrets) : null;
  }
  
  public V1LocalObjectReference buildImagePullSecret(int index) {
    return this.imagePullSecrets.get(index).build();
  }
  
  public V1LocalObjectReference buildFirstImagePullSecret() {
    return this.imagePullSecrets.get(0).build();
  }
  
  public V1LocalObjectReference buildLastImagePullSecret() {
    return this.imagePullSecrets.get(imagePullSecrets.size() - 1).build();
  }
  
  public V1LocalObjectReference buildMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate) {
      for (V1LocalObjectReferenceBuilder item : imagePullSecrets) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate) {
      for (V1LocalObjectReferenceBuilder item : imagePullSecrets) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    if (this.imagePullSecrets != null) {
      this._visitables.get("imagePullSecrets").clear();
    }
    if (imagePullSecrets != null) {
        this.imagePullSecrets = new ArrayList();
        for (V1LocalObjectReference item : imagePullSecrets) {
          this.addToImagePullSecrets(item);
        }
    } else {
      this.imagePullSecrets = null;
    }
    return (A) this;
  }
  
  public A withImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... imagePullSecrets) {
    if (this.imagePullSecrets != null) {
        this.imagePullSecrets.clear();
        _visitables.remove("imagePullSecrets");
    }
    if (imagePullSecrets != null) {
      for (V1LocalObjectReference item : imagePullSecrets) {
        this.addToImagePullSecrets(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasImagePullSecrets() {
    return this.imagePullSecrets != null && !this.imagePullSecrets.isEmpty();
  }
  
  public ImagePullSecretsNested<A> addNewImagePullSecret() {
    return new ImagePullSecretsNested(-1, null);
  }
  
  public ImagePullSecretsNested<A> addNewImagePullSecretLike(V1LocalObjectReference item) {
    return new ImagePullSecretsNested(-1, item);
  }
  
  public ImagePullSecretsNested<A> setNewImagePullSecretLike(int index,V1LocalObjectReference item) {
    return new ImagePullSecretsNested(index, item);
  }
  
  public ImagePullSecretsNested<A> editImagePullSecret(int index) {
    if (imagePullSecrets.size() <= index) throw new RuntimeException("Can't edit imagePullSecrets. Index exceeds size.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  
  public ImagePullSecretsNested<A> editFirstImagePullSecret() {
    if (imagePullSecrets.size() == 0) throw new RuntimeException("Can't edit first imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(0, buildImagePullSecret(0));
  }
  
  public ImagePullSecretsNested<A> editLastImagePullSecret() {
    int index = imagePullSecrets.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  
  public ImagePullSecretsNested<A> editMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<imagePullSecrets.size();i++) { 
    if (predicate.test(imagePullSecrets.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching imagePullSecrets. No match found.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(V1ObjectMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ObjectMetaBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public A addToSecrets(int index,V1ObjectReference item) {
    if (this.secrets == null) {this.secrets = new ArrayList<V1ObjectReferenceBuilder>();}
    V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);
    if (index < 0 || index >= secrets.size()) { _visitables.get("secrets").add(builder); secrets.add(builder); } else { _visitables.get("secrets").add(index, builder); secrets.add(index, builder);}
    return (A)this;
  }
  
  public A setToSecrets(int index,V1ObjectReference item) {
    if (this.secrets == null) {this.secrets = new ArrayList<V1ObjectReferenceBuilder>();}
    V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);
    if (index < 0 || index >= secrets.size()) { _visitables.get("secrets").add(builder); secrets.add(builder); } else { _visitables.get("secrets").set(index, builder); secrets.set(index, builder);}
    return (A)this;
  }
  
  public A addToSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... items) {
    if (this.secrets == null) {this.secrets = new ArrayList<V1ObjectReferenceBuilder>();}
    for (V1ObjectReference item : items) {V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("secrets").add(builder);this.secrets.add(builder);} return (A)this;
  }
  
  public A addAllToSecrets(Collection<V1ObjectReference> items) {
    if (this.secrets == null) {this.secrets = new ArrayList<V1ObjectReferenceBuilder>();}
    for (V1ObjectReference item : items) {V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("secrets").add(builder);this.secrets.add(builder);} return (A)this;
  }
  
  public A removeFromSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... items) {
    if (this.secrets == null) return (A)this;
    for (V1ObjectReference item : items) {V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("secrets").remove(builder); this.secrets.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSecrets(Collection<V1ObjectReference> items) {
    if (this.secrets == null) return (A)this;
    for (V1ObjectReference item : items) {V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("secrets").remove(builder); this.secrets.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromSecrets(Predicate<V1ObjectReferenceBuilder> predicate) {
    if (secrets == null) return (A) this;
    final Iterator<V1ObjectReferenceBuilder> each = secrets.iterator();
    final List visitables = _visitables.get("secrets");
    while (each.hasNext()) {
      V1ObjectReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1ObjectReference> buildSecrets() {
    return this.secrets != null ? build(secrets) : null;
  }
  
  public V1ObjectReference buildSecret(int index) {
    return this.secrets.get(index).build();
  }
  
  public V1ObjectReference buildFirstSecret() {
    return this.secrets.get(0).build();
  }
  
  public V1ObjectReference buildLastSecret() {
    return this.secrets.get(secrets.size() - 1).build();
  }
  
  public V1ObjectReference buildMatchingSecret(Predicate<V1ObjectReferenceBuilder> predicate) {
      for (V1ObjectReferenceBuilder item : secrets) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingSecret(Predicate<V1ObjectReferenceBuilder> predicate) {
      for (V1ObjectReferenceBuilder item : secrets) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSecrets(List<V1ObjectReference> secrets) {
    if (this.secrets != null) {
      this._visitables.get("secrets").clear();
    }
    if (secrets != null) {
        this.secrets = new ArrayList();
        for (V1ObjectReference item : secrets) {
          this.addToSecrets(item);
        }
    } else {
      this.secrets = null;
    }
    return (A) this;
  }
  
  public A withSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... secrets) {
    if (this.secrets != null) {
        this.secrets.clear();
        _visitables.remove("secrets");
    }
    if (secrets != null) {
      for (V1ObjectReference item : secrets) {
        this.addToSecrets(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSecrets() {
    return this.secrets != null && !this.secrets.isEmpty();
  }
  
  public SecretsNested<A> addNewSecret() {
    return new SecretsNested(-1, null);
  }
  
  public SecretsNested<A> addNewSecretLike(V1ObjectReference item) {
    return new SecretsNested(-1, item);
  }
  
  public SecretsNested<A> setNewSecretLike(int index,V1ObjectReference item) {
    return new SecretsNested(index, item);
  }
  
  public SecretsNested<A> editSecret(int index) {
    if (secrets.size() <= index) throw new RuntimeException("Can't edit secrets. Index exceeds size.");
    return setNewSecretLike(index, buildSecret(index));
  }
  
  public SecretsNested<A> editFirstSecret() {
    if (secrets.size() == 0) throw new RuntimeException("Can't edit first secrets. The list is empty.");
    return setNewSecretLike(0, buildSecret(0));
  }
  
  public SecretsNested<A> editLastSecret() {
    int index = secrets.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last secrets. The list is empty.");
    return setNewSecretLike(index, buildSecret(index));
  }
  
  public SecretsNested<A> editMatchingSecret(Predicate<V1ObjectReferenceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<secrets.size();i++) { 
    if (predicate.test(secrets.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching secrets. No match found.");
    return setNewSecretLike(index, buildSecret(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ServiceAccountFluent that = (V1ServiceAccountFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(automountServiceAccountToken, that.automountServiceAccountToken)) return false;
    if (!java.util.Objects.equals(imagePullSecrets, that.imagePullSecrets)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(secrets, that.secrets)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  automountServiceAccountToken,  imagePullSecrets,  kind,  metadata,  secrets,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (automountServiceAccountToken != null) { sb.append("automountServiceAccountToken:"); sb.append(automountServiceAccountToken + ","); }
    if (imagePullSecrets != null && !imagePullSecrets.isEmpty()) { sb.append("imagePullSecrets:"); sb.append(imagePullSecrets + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (secrets != null && !secrets.isEmpty()) { sb.append("secrets:"); sb.append(secrets); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAutomountServiceAccountToken() {
    return withAutomountServiceAccountToken(true);
  }
  public class ImagePullSecretsNested<N> extends V1LocalObjectReferenceFluent<ImagePullSecretsNested<N>> implements Nested<N>{
    ImagePullSecretsNested(int index,V1LocalObjectReference item) {
      this.index = index;
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }
    V1LocalObjectReferenceBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ServiceAccountFluent.this.setToImagePullSecrets(index,builder.build());
    }
    
    public N endImagePullSecret() {
      return and();
    }
    
  
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1ServiceAccountFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class SecretsNested<N> extends V1ObjectReferenceFluent<SecretsNested<N>> implements Nested<N>{
    SecretsNested(int index,V1ObjectReference item) {
      this.index = index;
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    V1ObjectReferenceBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ServiceAccountFluent.this.setToSecrets(index,builder.build());
    }
    
    public N endSecret() {
      return and();
    }
    
  
  }

}