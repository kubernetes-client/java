package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ValidatingWebhookConfigurationFluent<A extends V1ValidatingWebhookConfigurationFluent<A>> extends BaseFluent<A>{
  public V1ValidatingWebhookConfigurationFluent() {
  }
  
  public V1ValidatingWebhookConfigurationFluent(V1ValidatingWebhookConfiguration instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private ArrayList<V1ValidatingWebhookBuilder> webhooks;
  
  protected void copyInstance(V1ValidatingWebhookConfiguration instance) {
    instance = (instance != null ? instance : new V1ValidatingWebhookConfiguration());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withWebhooks(instance.getWebhooks());
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
  
  public A addToWebhooks(int index,V1ValidatingWebhook item) {
    if (this.webhooks == null) {this.webhooks = new ArrayList<V1ValidatingWebhookBuilder>();}
    V1ValidatingWebhookBuilder builder = new V1ValidatingWebhookBuilder(item);
    if (index < 0 || index >= webhooks.size()) { _visitables.get("webhooks").add(builder); webhooks.add(builder); } else { _visitables.get("webhooks").add(index, builder); webhooks.add(index, builder);}
    return (A)this;
  }
  
  public A setToWebhooks(int index,V1ValidatingWebhook item) {
    if (this.webhooks == null) {this.webhooks = new ArrayList<V1ValidatingWebhookBuilder>();}
    V1ValidatingWebhookBuilder builder = new V1ValidatingWebhookBuilder(item);
    if (index < 0 || index >= webhooks.size()) { _visitables.get("webhooks").add(builder); webhooks.add(builder); } else { _visitables.get("webhooks").set(index, builder); webhooks.set(index, builder);}
    return (A)this;
  }
  
  public A addToWebhooks(io.kubernetes.client.openapi.models.V1ValidatingWebhook... items) {
    if (this.webhooks == null) {this.webhooks = new ArrayList<V1ValidatingWebhookBuilder>();}
    for (V1ValidatingWebhook item : items) {V1ValidatingWebhookBuilder builder = new V1ValidatingWebhookBuilder(item);_visitables.get("webhooks").add(builder);this.webhooks.add(builder);} return (A)this;
  }
  
  public A addAllToWebhooks(Collection<V1ValidatingWebhook> items) {
    if (this.webhooks == null) {this.webhooks = new ArrayList<V1ValidatingWebhookBuilder>();}
    for (V1ValidatingWebhook item : items) {V1ValidatingWebhookBuilder builder = new V1ValidatingWebhookBuilder(item);_visitables.get("webhooks").add(builder);this.webhooks.add(builder);} return (A)this;
  }
  
  public A removeFromWebhooks(io.kubernetes.client.openapi.models.V1ValidatingWebhook... items) {
    if (this.webhooks == null) return (A)this;
    for (V1ValidatingWebhook item : items) {V1ValidatingWebhookBuilder builder = new V1ValidatingWebhookBuilder(item);_visitables.get("webhooks").remove(builder); this.webhooks.remove(builder);} return (A)this;
  }
  
  public A removeAllFromWebhooks(Collection<V1ValidatingWebhook> items) {
    if (this.webhooks == null) return (A)this;
    for (V1ValidatingWebhook item : items) {V1ValidatingWebhookBuilder builder = new V1ValidatingWebhookBuilder(item);_visitables.get("webhooks").remove(builder); this.webhooks.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromWebhooks(Predicate<V1ValidatingWebhookBuilder> predicate) {
    if (webhooks == null) return (A) this;
    final Iterator<V1ValidatingWebhookBuilder> each = webhooks.iterator();
    final List visitables = _visitables.get("webhooks");
    while (each.hasNext()) {
      V1ValidatingWebhookBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1ValidatingWebhook> buildWebhooks() {
    return this.webhooks != null ? build(webhooks) : null;
  }
  
  public V1ValidatingWebhook buildWebhook(int index) {
    return this.webhooks.get(index).build();
  }
  
  public V1ValidatingWebhook buildFirstWebhook() {
    return this.webhooks.get(0).build();
  }
  
  public V1ValidatingWebhook buildLastWebhook() {
    return this.webhooks.get(webhooks.size() - 1).build();
  }
  
  public V1ValidatingWebhook buildMatchingWebhook(Predicate<V1ValidatingWebhookBuilder> predicate) {
      for (V1ValidatingWebhookBuilder item : webhooks) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingWebhook(Predicate<V1ValidatingWebhookBuilder> predicate) {
      for (V1ValidatingWebhookBuilder item : webhooks) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withWebhooks(List<V1ValidatingWebhook> webhooks) {
    if (this.webhooks != null) {
      this._visitables.get("webhooks").clear();
    }
    if (webhooks != null) {
        this.webhooks = new ArrayList();
        for (V1ValidatingWebhook item : webhooks) {
          this.addToWebhooks(item);
        }
    } else {
      this.webhooks = null;
    }
    return (A) this;
  }
  
  public A withWebhooks(io.kubernetes.client.openapi.models.V1ValidatingWebhook... webhooks) {
    if (this.webhooks != null) {
        this.webhooks.clear();
        _visitables.remove("webhooks");
    }
    if (webhooks != null) {
      for (V1ValidatingWebhook item : webhooks) {
        this.addToWebhooks(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasWebhooks() {
    return this.webhooks != null && !this.webhooks.isEmpty();
  }
  
  public WebhooksNested<A> addNewWebhook() {
    return new WebhooksNested(-1, null);
  }
  
  public WebhooksNested<A> addNewWebhookLike(V1ValidatingWebhook item) {
    return new WebhooksNested(-1, item);
  }
  
  public WebhooksNested<A> setNewWebhookLike(int index,V1ValidatingWebhook item) {
    return new WebhooksNested(index, item);
  }
  
  public WebhooksNested<A> editWebhook(int index) {
    if (webhooks.size() <= index) throw new RuntimeException("Can't edit webhooks. Index exceeds size.");
    return setNewWebhookLike(index, buildWebhook(index));
  }
  
  public WebhooksNested<A> editFirstWebhook() {
    if (webhooks.size() == 0) throw new RuntimeException("Can't edit first webhooks. The list is empty.");
    return setNewWebhookLike(0, buildWebhook(0));
  }
  
  public WebhooksNested<A> editLastWebhook() {
    int index = webhooks.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last webhooks. The list is empty.");
    return setNewWebhookLike(index, buildWebhook(index));
  }
  
  public WebhooksNested<A> editMatchingWebhook(Predicate<V1ValidatingWebhookBuilder> predicate) {
    int index = -1;
    for (int i=0;i<webhooks.size();i++) { 
    if (predicate.test(webhooks.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching webhooks. No match found.");
    return setNewWebhookLike(index, buildWebhook(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ValidatingWebhookConfigurationFluent that = (V1ValidatingWebhookConfigurationFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(webhooks, that.webhooks)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  webhooks,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (webhooks != null && !webhooks.isEmpty()) { sb.append("webhooks:"); sb.append(webhooks); }
    sb.append("}");
    return sb.toString();
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1ValidatingWebhookConfigurationFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class WebhooksNested<N> extends V1ValidatingWebhookFluent<WebhooksNested<N>> implements Nested<N>{
    WebhooksNested(int index,V1ValidatingWebhook item) {
      this.index = index;
      this.builder = new V1ValidatingWebhookBuilder(this, item);
    }
    V1ValidatingWebhookBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ValidatingWebhookConfigurationFluent.this.setToWebhooks(index,builder.build());
    }
    
    public N endWebhook() {
      return and();
    }
    
  
  }

}