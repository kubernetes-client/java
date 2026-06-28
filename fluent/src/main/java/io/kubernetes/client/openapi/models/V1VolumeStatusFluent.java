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
public class V1VolumeStatusFluent<A extends io.kubernetes.client.openapi.models.V1VolumeStatusFluent<A>> extends BaseFluent<A>{

  private V1ImageVolumeStatusBuilder image;

  public V1VolumeStatusFluent() {
  }
  
  public V1VolumeStatusFluent(V1VolumeStatus instance) {
    this.copyInstance(instance);
  }

  public V1ImageVolumeStatus buildImage() {
    return this.image != null ? this.image.build() : null;
  }
  
  protected void copyInstance(V1VolumeStatus instance) {
    instance = instance != null ? instance : new V1VolumeStatus();
    if (instance != null) {
      this.withImage(instance.getImage());
    }
  }
  
  public ImageNested<A> editImage() {
    return this.withNewImageLike(Optional.ofNullable(this.buildImage()).orElse(null));
  }
  
  public ImageNested<A> editOrNewImage() {
    return this.withNewImageLike(Optional.ofNullable(this.buildImage()).orElse(new V1ImageVolumeStatusBuilder().build()));
  }
  
  public ImageNested<A> editOrNewImageLike(V1ImageVolumeStatus item) {
    return this.withNewImageLike(Optional.ofNullable(this.buildImage()).orElse(item));
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
    V1VolumeStatusFluent that = (V1VolumeStatusFluent) o;
    if (!(Objects.equals(image, that.image))) {
      return false;
    }
    return true;
  }
  
  public boolean hasImage() {
    return this.image != null;
  }
  
  public int hashCode() {
    return Objects.hash(image);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(image == null)) {
        sb.append("image:");
        sb.append(image);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withImage(V1ImageVolumeStatus image) {
    this._visitables.remove("image");
    if (image != null) {
        this.image = new V1ImageVolumeStatusBuilder(image);
        this._visitables.get("image").add(this.image);
    } else {
        this.image = null;
        this._visitables.get("image").remove(this.image);
    }
    return (A) this;
  }
  
  public ImageNested<A> withNewImage() {
    return new ImageNested(null);
  }
  
  public ImageNested<A> withNewImageLike(V1ImageVolumeStatus item) {
    return new ImageNested(item);
  }
  public class ImageNested<N> extends V1ImageVolumeStatusFluent<ImageNested<N>> implements Nested<N>{
  
    V1ImageVolumeStatusBuilder builder;
  
    ImageNested(V1ImageVolumeStatus item) {
      this.builder = new V1ImageVolumeStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V1VolumeStatusFluent.this.withImage(builder.build());
    }
    
    public N endImage() {
      return and();
    }
    
  }
}