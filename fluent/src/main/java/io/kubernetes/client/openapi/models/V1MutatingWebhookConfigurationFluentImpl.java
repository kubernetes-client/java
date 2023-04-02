package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1MutatingWebhookConfigurationFluentImpl<A extends V1MutatingWebhookConfigurationFluent<A>> extends BaseFluent<A> implements V1MutatingWebhookConfigurationFluent<A>{
  public V1MutatingWebhookConfigurationFluentImpl() {
  }
  public V1MutatingWebhookConfigurationFluentImpl(V1MutatingWebhookConfiguration instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withWebhooks(instance.getWebhooks());

  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private ArrayList<V1MutatingWebhookBuilder> webhooks;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1MutatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadata() {
    return new V1MutatingWebhookConfigurationFluentImpl.MetadataNestedImpl();
  }
  public V1MutatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1MutatingWebhookConfigurationFluentImpl.MetadataNestedImpl(item);
  }
  public V1MutatingWebhookConfigurationFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1MutatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1MutatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public A addToWebhooks(Integer index,V1MutatingWebhook item) {
    if (this.webhooks == null) {this.webhooks = new ArrayList<V1MutatingWebhookBuilder>();}
    V1MutatingWebhookBuilder builder = new V1MutatingWebhookBuilder(item);_visitables.get("webhooks").add(index >= 0 ? index : _visitables.get("webhooks").size(), builder);this.webhooks.add(index >= 0 ? index : webhooks.size(), builder); return (A)this;
  }
  public A setToWebhooks(Integer index,V1MutatingWebhook item) {
    if (this.webhooks == null) {this.webhooks = new ArrayList<V1MutatingWebhookBuilder>();}
    V1MutatingWebhookBuilder builder = new V1MutatingWebhookBuilder(item);
    if (index < 0 || index >= _visitables.get("webhooks").size()) { _visitables.get("webhooks").add(builder); } else { _visitables.get("webhooks").set(index, builder);}
    if (index < 0 || index >= webhooks.size()) { webhooks.add(builder); } else { webhooks.set(index, builder);}
     return (A)this;
  }
  public A addToWebhooks(io.kubernetes.client.openapi.models.V1MutatingWebhook... items) {
    if (this.webhooks == null) {this.webhooks = new ArrayList<V1MutatingWebhookBuilder>();}
    for (V1MutatingWebhook item : items) {V1MutatingWebhookBuilder builder = new V1MutatingWebhookBuilder(item);_visitables.get("webhooks").add(builder);this.webhooks.add(builder);} return (A)this;
  }
  public A addAllToWebhooks(Collection<V1MutatingWebhook> items) {
    if (this.webhooks == null) {this.webhooks = new ArrayList<V1MutatingWebhookBuilder>();}
    for (V1MutatingWebhook item : items) {V1MutatingWebhookBuilder builder = new V1MutatingWebhookBuilder(item);_visitables.get("webhooks").add(builder);this.webhooks.add(builder);} return (A)this;
  }
  public A removeFromWebhooks(io.kubernetes.client.openapi.models.V1MutatingWebhook... items) {
    for (V1MutatingWebhook item : items) {V1MutatingWebhookBuilder builder = new V1MutatingWebhookBuilder(item);_visitables.get("webhooks").remove(builder);if (this.webhooks != null) {this.webhooks.remove(builder);}} return (A)this;
  }
  public A removeAllFromWebhooks(Collection<V1MutatingWebhook> items) {
    for (V1MutatingWebhook item : items) {V1MutatingWebhookBuilder builder = new V1MutatingWebhookBuilder(item);_visitables.get("webhooks").remove(builder);if (this.webhooks != null) {this.webhooks.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromWebhooks(Predicate<V1MutatingWebhookBuilder> predicate) {
    if (webhooks == null) return (A) this;
    final Iterator<V1MutatingWebhookBuilder> each = webhooks.iterator();
    final List visitables = _visitables.get("webhooks");
    while (each.hasNext()) {
      V1MutatingWebhookBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildWebhooks instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1MutatingWebhook> getWebhooks() {
    return webhooks != null ? build(webhooks) : null;
  }
  public List<V1MutatingWebhook> buildWebhooks() {
    return webhooks != null ? build(webhooks) : null;
  }
  public V1MutatingWebhook buildWebhook(Integer index) {
    return this.webhooks.get(index).build();
  }
  public V1MutatingWebhook buildFirstWebhook() {
    return this.webhooks.get(0).build();
  }
  public V1MutatingWebhook buildLastWebhook() {
    return this.webhooks.get(webhooks.size() - 1).build();
  }
  public V1MutatingWebhook buildMatchingWebhook(Predicate<V1MutatingWebhookBuilder> predicate) {
    for (V1MutatingWebhookBuilder item: webhooks) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingWebhook(Predicate<V1MutatingWebhookBuilder> predicate) {
    for (V1MutatingWebhookBuilder item: webhooks) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withWebhooks(List<V1MutatingWebhook> webhooks) {
    if (this.webhooks != null) { _visitables.get("webhooks").removeAll(this.webhooks);}
    if (webhooks != null) {this.webhooks = new ArrayList(); for (V1MutatingWebhook item : webhooks){this.addToWebhooks(item);}} else { this.webhooks = null;} return (A) this;
  }
  public A withWebhooks(io.kubernetes.client.openapi.models.V1MutatingWebhook... webhooks) {
    if (this.webhooks != null) {this.webhooks.clear();}
    if (webhooks != null) {for (V1MutatingWebhook item :webhooks){ this.addToWebhooks(item);}} return (A) this;
  }
  public Boolean hasWebhooks() {
    return webhooks != null && !webhooks.isEmpty();
  }
  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhook() {
    return new V1MutatingWebhookConfigurationFluentImpl.WebhooksNestedImpl();
  }
  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhookLike(V1MutatingWebhook item) {
    return new V1MutatingWebhookConfigurationFluentImpl.WebhooksNestedImpl(-1, item);
  }
  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> setNewWebhookLike(Integer index,V1MutatingWebhook item) {
    return new V1MutatingWebhookConfigurationFluentImpl.WebhooksNestedImpl(index, item);
  }
  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> editWebhook(Integer index) {
    if (webhooks.size() <= index) throw new RuntimeException("Can't edit webhooks. Index exceeds size.");
    return setNewWebhookLike(index, buildWebhook(index));
  }
  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> editFirstWebhook() {
    if (webhooks.size() == 0) throw new RuntimeException("Can't edit first webhooks. The list is empty.");
    return setNewWebhookLike(0, buildWebhook(0));
  }
  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> editLastWebhook() {
    int index = webhooks.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last webhooks. The list is empty.");
    return setNewWebhookLike(index, buildWebhook(index));
  }
  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> editMatchingWebhook(Predicate<V1MutatingWebhookBuilder> predicate) {
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
    V1MutatingWebhookConfigurationFluentImpl that = (V1MutatingWebhookConfigurationFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (webhooks != null ? !webhooks.equals(that.webhooks) :that.webhooks != null) return false;
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
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1MutatingWebhookConfigurationFluent.MetadataNested<N>> implements V1MutatingWebhookConfigurationFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1MutatingWebhookConfigurationFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class WebhooksNestedImpl<N> extends V1MutatingWebhookFluentImpl<V1MutatingWebhookConfigurationFluent.WebhooksNested<N>> implements V1MutatingWebhookConfigurationFluent.WebhooksNested<N>,Nested<N>{
    WebhooksNestedImpl(Integer index,V1MutatingWebhook item) {
      this.index = index;
      this.builder = new V1MutatingWebhookBuilder(this, item);
    }
    WebhooksNestedImpl() {
      this.index = -1;
      this.builder = new V1MutatingWebhookBuilder(this);
    }
    V1MutatingWebhookBuilder builder;
    Integer index;
    public N and() {
      return (N) V1MutatingWebhookConfigurationFluentImpl.this.setToWebhooks(index,builder.build());
    }
    public N endWebhook() {
      return and();
    }
    
  }
  
}