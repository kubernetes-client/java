/*
Copyright 2026 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ListMetaFluent<A extends io.kubernetes.client.openapi.models.V1ListMetaFluent<A>> extends BaseFluent<A>{

  private String _continue;
  private Long remainingItemCount;
  private String resourceVersion;
  private String selfLink;
  private V1ShardInfoBuilder shardInfo;

  public V1ListMetaFluent() {
  }
  
  public V1ListMetaFluent(V1ListMeta instance) {
    this.copyInstance(instance);
  }

  public V1ShardInfo buildShardInfo() {
    return this.shardInfo != null ? this.shardInfo.build() : null;
  }
  
  protected void copyInstance(V1ListMeta instance) {
    instance = instance != null ? instance : new V1ListMeta();
    if (instance != null) {
        this.withRemainingItemCount(instance.getRemainingItemCount());
        this.withResourceVersion(instance.getResourceVersion());
        this.withSelfLink(instance.getSelfLink());
        this.withShardInfo(instance.getShardInfo());
    }
  }
  
  public ShardInfoNested<A> editOrNewShardInfo() {
    return this.withNewShardInfoLike(Optional.ofNullable(this.buildShardInfo()).orElse(new V1ShardInfoBuilder().build()));
  }
  
  public ShardInfoNested<A> editOrNewShardInfoLike(V1ShardInfo item) {
    return this.withNewShardInfoLike(Optional.ofNullable(this.buildShardInfo()).orElse(item));
  }
  
  public ShardInfoNested<A> editShardInfo() {
    return this.withNewShardInfoLike(Optional.ofNullable(this.buildShardInfo()).orElse(null));
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
    V1ListMetaFluent that = (V1ListMetaFluent) o;
    if (!(Objects.equals(_continue, that._continue))) {
      return false;
    }
    if (!(Objects.equals(remainingItemCount, that.remainingItemCount))) {
      return false;
    }
    if (!(Objects.equals(resourceVersion, that.resourceVersion))) {
      return false;
    }
    if (!(Objects.equals(selfLink, that.selfLink))) {
      return false;
    }
    if (!(Objects.equals(shardInfo, that.shardInfo))) {
      return false;
    }
    return true;
  }
  
  public String getContinue() {
    return this._continue;
  }
  
  public Long getRemainingItemCount() {
    return this.remainingItemCount;
  }
  
  public String getResourceVersion() {
    return this.resourceVersion;
  }
  
  public String getSelfLink() {
    return this.selfLink;
  }
  
  public boolean hasContinue() {
    return this._continue != null;
  }
  
  public boolean hasRemainingItemCount() {
    return this.remainingItemCount != null;
  }
  
  public boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }
  
  public boolean hasSelfLink() {
    return this.selfLink != null;
  }
  
  public boolean hasShardInfo() {
    return this.shardInfo != null;
  }
  
  public int hashCode() {
    return Objects.hash(_continue, remainingItemCount, resourceVersion, selfLink, shardInfo);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(_continue == null)) {
        sb.append("_continue:");
        sb.append(_continue);
        sb.append(",");
    }
    if (!(remainingItemCount == null)) {
        sb.append("remainingItemCount:");
        sb.append(remainingItemCount);
        sb.append(",");
    }
    if (!(resourceVersion == null)) {
        sb.append("resourceVersion:");
        sb.append(resourceVersion);
        sb.append(",");
    }
    if (!(selfLink == null)) {
        sb.append("selfLink:");
        sb.append(selfLink);
        sb.append(",");
    }
    if (!(shardInfo == null)) {
        sb.append("shardInfo:");
        sb.append(shardInfo);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withContinue(String _continue) {
    this._continue = _continue;
    return (A) this;
  }
  
  public ShardInfoNested<A> withNewShardInfo() {
    return new ShardInfoNested(null);
  }
  
  public ShardInfoNested<A> withNewShardInfoLike(V1ShardInfo item) {
    return new ShardInfoNested(item);
  }
  
  public A withRemainingItemCount(Long remainingItemCount) {
    this.remainingItemCount = remainingItemCount;
    return (A) this;
  }
  
  public A withResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return (A) this;
  }
  
  public A withSelfLink(String selfLink) {
    this.selfLink = selfLink;
    return (A) this;
  }
  
  public A withShardInfo(V1ShardInfo shardInfo) {
    this._visitables.remove("shardInfo");
    if (shardInfo != null) {
        this.shardInfo = new V1ShardInfoBuilder(shardInfo);
        this._visitables.get("shardInfo").add(this.shardInfo);
    } else {
        this.shardInfo = null;
        this._visitables.get("shardInfo").remove(this.shardInfo);
    }
    return (A) this;
  }
  public class ShardInfoNested<N> extends V1ShardInfoFluent<ShardInfoNested<N>> implements Nested<N>{
  
    V1ShardInfoBuilder builder;
  
    ShardInfoNested(V1ShardInfo item) {
      this.builder = new V1ShardInfoBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ListMetaFluent.this.withShardInfo(builder.build());
    }
    
    public N endShardInfo() {
      return and();
    }
    
  }
}