package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeConfigStatusFluent<A extends io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<A>> extends BaseFluent<A>{
  public V1NodeConfigStatusFluent() {
  }
  
  public V1NodeConfigStatusFluent(V1NodeConfigStatus instance) {
    this.copyInstance(instance);
  }
  private V1NodeConfigSourceBuilder active;
  private V1NodeConfigSourceBuilder assigned;
  private String error;
  private V1NodeConfigSourceBuilder lastKnownGood;
  
  protected void copyInstance(V1NodeConfigStatus instance) {
    instance = instance != null ? instance : new V1NodeConfigStatus();
    if (instance != null) {
        this.withActive(instance.getActive());
        this.withAssigned(instance.getAssigned());
        this.withError(instance.getError());
        this.withLastKnownGood(instance.getLastKnownGood());
    }
  }
  
  public V1NodeConfigSource buildActive() {
    return this.active != null ? this.active.build() : null;
  }
  
  public A withActive(V1NodeConfigSource active) {
    this._visitables.remove("active");
    if (active != null) {
        this.active = new V1NodeConfigSourceBuilder(active);
        this._visitables.get("active").add(this.active);
    } else {
        this.active = null;
        this._visitables.get("active").remove(this.active);
    }
    return (A) this;
  }
  
  public boolean hasActive() {
    return this.active != null;
  }
  
  public ActiveNested<A> withNewActive() {
    return new ActiveNested(null);
  }
  
  public ActiveNested<A> withNewActiveLike(V1NodeConfigSource item) {
    return new ActiveNested(item);
  }
  
  public ActiveNested<A> editActive() {
    return this.withNewActiveLike(Optional.ofNullable(this.buildActive()).orElse(null));
  }
  
  public ActiveNested<A> editOrNewActive() {
    return this.withNewActiveLike(Optional.ofNullable(this.buildActive()).orElse(new V1NodeConfigSourceBuilder().build()));
  }
  
  public ActiveNested<A> editOrNewActiveLike(V1NodeConfigSource item) {
    return this.withNewActiveLike(Optional.ofNullable(this.buildActive()).orElse(item));
  }
  
  public V1NodeConfigSource buildAssigned() {
    return this.assigned != null ? this.assigned.build() : null;
  }
  
  public A withAssigned(V1NodeConfigSource assigned) {
    this._visitables.remove("assigned");
    if (assigned != null) {
        this.assigned = new V1NodeConfigSourceBuilder(assigned);
        this._visitables.get("assigned").add(this.assigned);
    } else {
        this.assigned = null;
        this._visitables.get("assigned").remove(this.assigned);
    }
    return (A) this;
  }
  
  public boolean hasAssigned() {
    return this.assigned != null;
  }
  
  public AssignedNested<A> withNewAssigned() {
    return new AssignedNested(null);
  }
  
  public AssignedNested<A> withNewAssignedLike(V1NodeConfigSource item) {
    return new AssignedNested(item);
  }
  
  public AssignedNested<A> editAssigned() {
    return this.withNewAssignedLike(Optional.ofNullable(this.buildAssigned()).orElse(null));
  }
  
  public AssignedNested<A> editOrNewAssigned() {
    return this.withNewAssignedLike(Optional.ofNullable(this.buildAssigned()).orElse(new V1NodeConfigSourceBuilder().build()));
  }
  
  public AssignedNested<A> editOrNewAssignedLike(V1NodeConfigSource item) {
    return this.withNewAssignedLike(Optional.ofNullable(this.buildAssigned()).orElse(item));
  }
  
  public String getError() {
    return this.error;
  }
  
  public A withError(String error) {
    this.error = error;
    return (A) this;
  }
  
  public boolean hasError() {
    return this.error != null;
  }
  
  public V1NodeConfigSource buildLastKnownGood() {
    return this.lastKnownGood != null ? this.lastKnownGood.build() : null;
  }
  
  public A withLastKnownGood(V1NodeConfigSource lastKnownGood) {
    this._visitables.remove("lastKnownGood");
    if (lastKnownGood != null) {
        this.lastKnownGood = new V1NodeConfigSourceBuilder(lastKnownGood);
        this._visitables.get("lastKnownGood").add(this.lastKnownGood);
    } else {
        this.lastKnownGood = null;
        this._visitables.get("lastKnownGood").remove(this.lastKnownGood);
    }
    return (A) this;
  }
  
  public boolean hasLastKnownGood() {
    return this.lastKnownGood != null;
  }
  
  public LastKnownGoodNested<A> withNewLastKnownGood() {
    return new LastKnownGoodNested(null);
  }
  
  public LastKnownGoodNested<A> withNewLastKnownGoodLike(V1NodeConfigSource item) {
    return new LastKnownGoodNested(item);
  }
  
  public LastKnownGoodNested<A> editLastKnownGood() {
    return this.withNewLastKnownGoodLike(Optional.ofNullable(this.buildLastKnownGood()).orElse(null));
  }
  
  public LastKnownGoodNested<A> editOrNewLastKnownGood() {
    return this.withNewLastKnownGoodLike(Optional.ofNullable(this.buildLastKnownGood()).orElse(new V1NodeConfigSourceBuilder().build()));
  }
  
  public LastKnownGoodNested<A> editOrNewLastKnownGoodLike(V1NodeConfigSource item) {
    return this.withNewLastKnownGoodLike(Optional.ofNullable(this.buildLastKnownGood()).orElse(item));
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
    V1NodeConfigStatusFluent that = (V1NodeConfigStatusFluent) o;
    if (!(Objects.equals(active, that.active))) {
      return false;
    }
    if (!(Objects.equals(assigned, that.assigned))) {
      return false;
    }
    if (!(Objects.equals(error, that.error))) {
      return false;
    }
    if (!(Objects.equals(lastKnownGood, that.lastKnownGood))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(active, assigned, error, lastKnownGood);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(active == null)) {
        sb.append("active:");
        sb.append(active);
        sb.append(",");
    }
    if (!(assigned == null)) {
        sb.append("assigned:");
        sb.append(assigned);
        sb.append(",");
    }
    if (!(error == null)) {
        sb.append("error:");
        sb.append(error);
        sb.append(",");
    }
    if (!(lastKnownGood == null)) {
        sb.append("lastKnownGood:");
        sb.append(lastKnownGood);
    }
    sb.append("}");
    return sb.toString();
  }
  public class ActiveNested<N> extends V1NodeConfigSourceFluent<ActiveNested<N>> implements Nested<N>{
    ActiveNested(V1NodeConfigSource item) {
      this.builder = new V1NodeConfigSourceBuilder(this, item);
    }
    V1NodeConfigSourceBuilder builder;
    
    public N and() {
      return (N) V1NodeConfigStatusFluent.this.withActive(builder.build());
    }
    
    public N endActive() {
      return and();
    }
    
  
  }
  public class AssignedNested<N> extends V1NodeConfigSourceFluent<AssignedNested<N>> implements Nested<N>{
    AssignedNested(V1NodeConfigSource item) {
      this.builder = new V1NodeConfigSourceBuilder(this, item);
    }
    V1NodeConfigSourceBuilder builder;
    
    public N and() {
      return (N) V1NodeConfigStatusFluent.this.withAssigned(builder.build());
    }
    
    public N endAssigned() {
      return and();
    }
    
  
  }
  public class LastKnownGoodNested<N> extends V1NodeConfigSourceFluent<LastKnownGoodNested<N>> implements Nested<N>{
    LastKnownGoodNested(V1NodeConfigSource item) {
      this.builder = new V1NodeConfigSourceBuilder(this, item);
    }
    V1NodeConfigSourceBuilder builder;
    
    public N and() {
      return (N) V1NodeConfigStatusFluent.this.withLastKnownGood(builder.build());
    }
    
    public N endLastKnownGood() {
      return and();
    }
    
  
  }

}