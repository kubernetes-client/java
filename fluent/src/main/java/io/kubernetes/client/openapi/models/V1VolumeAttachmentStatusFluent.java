package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1VolumeAttachmentStatusFluent<A extends io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<A>> extends BaseFluent<A>{

  private V1VolumeErrorBuilder attachError;
  private Boolean attached;
  private Map<String,String> attachmentMetadata;
  private V1VolumeErrorBuilder detachError;

  public V1VolumeAttachmentStatusFluent() {
  }
  
  public V1VolumeAttachmentStatusFluent(V1VolumeAttachmentStatus instance) {
    this.copyInstance(instance);
  }

  public A addToAttachmentMetadata(Map<String,String> map) {
    if (this.attachmentMetadata == null && map != null) {
      this.attachmentMetadata = new LinkedHashMap();
    }
    if (map != null) {
      this.attachmentMetadata.putAll(map);
    }
    return (A) this;
  }
  
  public A addToAttachmentMetadata(String key,String value) {
    if (this.attachmentMetadata == null && key != null && value != null) {
      this.attachmentMetadata = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.attachmentMetadata.put(key, value);
    }
    return (A) this;
  }
  
  public V1VolumeError buildAttachError() {
    return this.attachError != null ? this.attachError.build() : null;
  }
  
  public V1VolumeError buildDetachError() {
    return this.detachError != null ? this.detachError.build() : null;
  }
  
  protected void copyInstance(V1VolumeAttachmentStatus instance) {
    instance = instance != null ? instance : new V1VolumeAttachmentStatus();
    if (instance != null) {
        this.withAttachError(instance.getAttachError());
        this.withAttached(instance.getAttached());
        this.withAttachmentMetadata(instance.getAttachmentMetadata());
        this.withDetachError(instance.getDetachError());
    }
  }
  
  public AttachErrorNested<A> editAttachError() {
    return this.withNewAttachErrorLike(Optional.ofNullable(this.buildAttachError()).orElse(null));
  }
  
  public DetachErrorNested<A> editDetachError() {
    return this.withNewDetachErrorLike(Optional.ofNullable(this.buildDetachError()).orElse(null));
  }
  
  public AttachErrorNested<A> editOrNewAttachError() {
    return this.withNewAttachErrorLike(Optional.ofNullable(this.buildAttachError()).orElse(new V1VolumeErrorBuilder().build()));
  }
  
  public AttachErrorNested<A> editOrNewAttachErrorLike(V1VolumeError item) {
    return this.withNewAttachErrorLike(Optional.ofNullable(this.buildAttachError()).orElse(item));
  }
  
  public DetachErrorNested<A> editOrNewDetachError() {
    return this.withNewDetachErrorLike(Optional.ofNullable(this.buildDetachError()).orElse(new V1VolumeErrorBuilder().build()));
  }
  
  public DetachErrorNested<A> editOrNewDetachErrorLike(V1VolumeError item) {
    return this.withNewDetachErrorLike(Optional.ofNullable(this.buildDetachError()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1VolumeAttachmentStatusFluent that = (V1VolumeAttachmentStatusFluent) o;
    if (!(Objects.equals(attachError, that.attachError))) {
      return false;
    }
    if (!(Objects.equals(attached, that.attached))) {
      return false;
    }
    if (!(Objects.equals(attachmentMetadata, that.attachmentMetadata))) {
      return false;
    }
    if (!(Objects.equals(detachError, that.detachError))) {
      return false;
    }
    return true;
  }
  
  public Boolean getAttached() {
    return this.attached;
  }
  
  public Map<String,String> getAttachmentMetadata() {
    return this.attachmentMetadata;
  }
  
  public boolean hasAttachError() {
    return this.attachError != null;
  }
  
  public boolean hasAttached() {
    return this.attached != null;
  }
  
  public boolean hasAttachmentMetadata() {
    return this.attachmentMetadata != null;
  }
  
  public boolean hasDetachError() {
    return this.detachError != null;
  }
  
  public int hashCode() {
    return Objects.hash(attachError, attached, attachmentMetadata, detachError);
  }
  
  public A removeFromAttachmentMetadata(String key) {
    if (this.attachmentMetadata == null) {
      return (A) this;
    }
    if (key != null && this.attachmentMetadata != null) {
      this.attachmentMetadata.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromAttachmentMetadata(Map<String,String> map) {
    if (this.attachmentMetadata == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.attachmentMetadata != null) {
          this.attachmentMetadata.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(attachError == null)) {
        sb.append("attachError:");
        sb.append(attachError);
        sb.append(",");
    }
    if (!(attached == null)) {
        sb.append("attached:");
        sb.append(attached);
        sb.append(",");
    }
    if (!(attachmentMetadata == null) && !(attachmentMetadata.isEmpty())) {
        sb.append("attachmentMetadata:");
        sb.append(attachmentMetadata);
        sb.append(",");
    }
    if (!(detachError == null)) {
        sb.append("detachError:");
        sb.append(detachError);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAttachError(V1VolumeError attachError) {
    this._visitables.remove("attachError");
    if (attachError != null) {
        this.attachError = new V1VolumeErrorBuilder(attachError);
        this._visitables.get("attachError").add(this.attachError);
    } else {
        this.attachError = null;
        this._visitables.get("attachError").remove(this.attachError);
    }
    return (A) this;
  }
  
  public A withAttached() {
    return withAttached(true);
  }
  
  public A withAttached(Boolean attached) {
    this.attached = attached;
    return (A) this;
  }
  
  public <K,V>A withAttachmentMetadata(Map<String,String> attachmentMetadata) {
    if (attachmentMetadata == null) {
      this.attachmentMetadata = null;
    } else {
      this.attachmentMetadata = new LinkedHashMap(attachmentMetadata);
    }
    return (A) this;
  }
  
  public A withDetachError(V1VolumeError detachError) {
    this._visitables.remove("detachError");
    if (detachError != null) {
        this.detachError = new V1VolumeErrorBuilder(detachError);
        this._visitables.get("detachError").add(this.detachError);
    } else {
        this.detachError = null;
        this._visitables.get("detachError").remove(this.detachError);
    }
    return (A) this;
  }
  
  public AttachErrorNested<A> withNewAttachError() {
    return new AttachErrorNested(null);
  }
  
  public AttachErrorNested<A> withNewAttachErrorLike(V1VolumeError item) {
    return new AttachErrorNested(item);
  }
  
  public DetachErrorNested<A> withNewDetachError() {
    return new DetachErrorNested(null);
  }
  
  public DetachErrorNested<A> withNewDetachErrorLike(V1VolumeError item) {
    return new DetachErrorNested(item);
  }
  public class AttachErrorNested<N> extends V1VolumeErrorFluent<AttachErrorNested<N>> implements Nested<N>{
  
    V1VolumeErrorBuilder builder;
  
    AttachErrorNested(V1VolumeError item) {
      this.builder = new V1VolumeErrorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1VolumeAttachmentStatusFluent.this.withAttachError(builder.build());
    }
    
    public N endAttachError() {
      return and();
    }
    
  }
  public class DetachErrorNested<N> extends V1VolumeErrorFluent<DetachErrorNested<N>> implements Nested<N>{
  
    V1VolumeErrorBuilder builder;
  
    DetachErrorNested(V1VolumeError item) {
      this.builder = new V1VolumeErrorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1VolumeAttachmentStatusFluent.this.withDetachError(builder.build());
    }
    
    public N endDetachError() {
      return and();
    }
    
  }
}