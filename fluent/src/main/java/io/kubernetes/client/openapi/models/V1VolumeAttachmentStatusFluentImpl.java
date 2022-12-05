package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1VolumeAttachmentStatusFluentImpl<A extends V1VolumeAttachmentStatusFluent<A>> extends BaseFluent<A> implements V1VolumeAttachmentStatusFluent<A>{
  public V1VolumeAttachmentStatusFluentImpl() {
  }
  public V1VolumeAttachmentStatusFluentImpl(V1VolumeAttachmentStatus instance) {
    this.withAttachError(instance.getAttachError());

    this.withAttached(instance.getAttached());

    this.withAttachmentMetadata(instance.getAttachmentMetadata());

    this.withDetachError(instance.getDetachError());

  }
  private V1VolumeErrorBuilder attachError;
  private Boolean attached;
  private Map<String,String> attachmentMetadata;
  private V1VolumeErrorBuilder detachError;
  
  /**
   * This method has been deprecated, please use method buildAttachError instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeError getAttachError() {
    return this.attachError!=null ?this.attachError.build():null;
  }
  public V1VolumeError buildAttachError() {
    return this.attachError!=null ?this.attachError.build():null;
  }
  public A withAttachError(V1VolumeError attachError) {
    _visitables.get("attachError").remove(this.attachError);
    if (attachError!=null){ this.attachError= new V1VolumeErrorBuilder(attachError); _visitables.get("attachError").add(this.attachError);} else { this.attachError = null; _visitables.get("attachError").remove(this.attachError); } return (A) this;
  }
  public Boolean hasAttachError() {
    return this.attachError != null;
  }
  public V1VolumeAttachmentStatusFluent.AttachErrorNested<A> withNewAttachError() {
    return new V1VolumeAttachmentStatusFluentImpl.AttachErrorNestedImpl();
  }
  public V1VolumeAttachmentStatusFluent.AttachErrorNested<A> withNewAttachErrorLike(V1VolumeError item) {
    return new V1VolumeAttachmentStatusFluentImpl.AttachErrorNestedImpl(item);
  }
  public V1VolumeAttachmentStatusFluent.AttachErrorNested<A> editAttachError() {
    return withNewAttachErrorLike(getAttachError());
  }
  public V1VolumeAttachmentStatusFluent.AttachErrorNested<A> editOrNewAttachError() {
    return withNewAttachErrorLike(getAttachError() != null ? getAttachError(): new V1VolumeErrorBuilder().build());
  }
  public V1VolumeAttachmentStatusFluent.AttachErrorNested<A> editOrNewAttachErrorLike(V1VolumeError item) {
    return withNewAttachErrorLike(getAttachError() != null ? getAttachError(): item);
  }
  public Boolean getAttached() {
    return this.attached;
  }
  public A withAttached(Boolean attached) {
    this.attached=attached; return (A) this;
  }
  public Boolean hasAttached() {
    return this.attached != null;
  }
  public A addToAttachmentMetadata(String key,String value) {
    if(this.attachmentMetadata == null && key != null && value != null) { this.attachmentMetadata = new LinkedHashMap(); }
    if(key != null && value != null) {this.attachmentMetadata.put(key, value);} return (A)this;
  }
  public A addToAttachmentMetadata(Map<String,String> map) {
    if(this.attachmentMetadata == null && map != null) { this.attachmentMetadata = new LinkedHashMap(); }
    if(map != null) { this.attachmentMetadata.putAll(map);} return (A)this;
  }
  public A removeFromAttachmentMetadata(String key) {
    if(this.attachmentMetadata == null) { return (A) this; }
    if(key != null && this.attachmentMetadata != null) {this.attachmentMetadata.remove(key);} return (A)this;
  }
  public A removeFromAttachmentMetadata(Map<String,String> map) {
    if(this.attachmentMetadata == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.attachmentMetadata != null){this.attachmentMetadata.remove(key);}}} return (A)this;
  }
  public Map<String,String> getAttachmentMetadata() {
    return this.attachmentMetadata;
  }
  public <K,V>A withAttachmentMetadata(Map<String,String> attachmentMetadata) {
    if (attachmentMetadata == null) { this.attachmentMetadata =  null;} else {this.attachmentMetadata = new LinkedHashMap(attachmentMetadata);} return (A) this;
  }
  public Boolean hasAttachmentMetadata() {
    return this.attachmentMetadata != null;
  }
  
  /**
   * This method has been deprecated, please use method buildDetachError instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeError getDetachError() {
    return this.detachError!=null ?this.detachError.build():null;
  }
  public V1VolumeError buildDetachError() {
    return this.detachError!=null ?this.detachError.build():null;
  }
  public A withDetachError(V1VolumeError detachError) {
    _visitables.get("detachError").remove(this.detachError);
    if (detachError!=null){ this.detachError= new V1VolumeErrorBuilder(detachError); _visitables.get("detachError").add(this.detachError);} else { this.detachError = null; _visitables.get("detachError").remove(this.detachError); } return (A) this;
  }
  public Boolean hasDetachError() {
    return this.detachError != null;
  }
  public V1VolumeAttachmentStatusFluent.DetachErrorNested<A> withNewDetachError() {
    return new V1VolumeAttachmentStatusFluentImpl.DetachErrorNestedImpl();
  }
  public V1VolumeAttachmentStatusFluent.DetachErrorNested<A> withNewDetachErrorLike(V1VolumeError item) {
    return new V1VolumeAttachmentStatusFluentImpl.DetachErrorNestedImpl(item);
  }
  public V1VolumeAttachmentStatusFluent.DetachErrorNested<A> editDetachError() {
    return withNewDetachErrorLike(getDetachError());
  }
  public V1VolumeAttachmentStatusFluent.DetachErrorNested<A> editOrNewDetachError() {
    return withNewDetachErrorLike(getDetachError() != null ? getDetachError(): new V1VolumeErrorBuilder().build());
  }
  public V1VolumeAttachmentStatusFluent.DetachErrorNested<A> editOrNewDetachErrorLike(V1VolumeError item) {
    return withNewDetachErrorLike(getDetachError() != null ? getDetachError(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeAttachmentStatusFluentImpl that = (V1VolumeAttachmentStatusFluentImpl) o;
    if (attachError != null ? !attachError.equals(that.attachError) :that.attachError != null) return false;
    if (attached != null ? !attached.equals(that.attached) :that.attached != null) return false;
    if (attachmentMetadata != null ? !attachmentMetadata.equals(that.attachmentMetadata) :that.attachmentMetadata != null) return false;
    if (detachError != null ? !detachError.equals(that.detachError) :that.detachError != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(attachError,  attached,  attachmentMetadata,  detachError,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (attachError != null) { sb.append("attachError:"); sb.append(attachError + ","); }
    if (attached != null) { sb.append("attached:"); sb.append(attached + ","); }
    if (attachmentMetadata != null && !attachmentMetadata.isEmpty()) { sb.append("attachmentMetadata:"); sb.append(attachmentMetadata + ","); }
    if (detachError != null) { sb.append("detachError:"); sb.append(detachError); }
    sb.append("}");
    return sb.toString();
  }
  public A withAttached() {
    return withAttached(true);
  }
  class AttachErrorNestedImpl<N> extends V1VolumeErrorFluentImpl<V1VolumeAttachmentStatusFluent.AttachErrorNested<N>> implements V1VolumeAttachmentStatusFluent.AttachErrorNested<N>,Nested<N>{
    AttachErrorNestedImpl(V1VolumeError item) {
      this.builder = new V1VolumeErrorBuilder(this, item);
    }
    AttachErrorNestedImpl() {
      this.builder = new V1VolumeErrorBuilder(this);
    }
    V1VolumeErrorBuilder builder;
    public N and() {
      return (N) V1VolumeAttachmentStatusFluentImpl.this.withAttachError(builder.build());
    }
    public N endAttachError() {
      return and();
    }
    
  }
  class DetachErrorNestedImpl<N> extends V1VolumeErrorFluentImpl<V1VolumeAttachmentStatusFluent.DetachErrorNested<N>> implements V1VolumeAttachmentStatusFluent.DetachErrorNested<N>,Nested<N>{
    DetachErrorNestedImpl(V1VolumeError item) {
      this.builder = new V1VolumeErrorBuilder(this, item);
    }
    DetachErrorNestedImpl() {
      this.builder = new V1VolumeErrorBuilder(this);
    }
    V1VolumeErrorBuilder builder;
    public N and() {
      return (N) V1VolumeAttachmentStatusFluentImpl.this.withDetachError(builder.build());
    }
    public N endDetachError() {
      return and();
    }
    
  }
  
}