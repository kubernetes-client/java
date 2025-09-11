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
public class V1ContainerUserFluent<A extends io.kubernetes.client.openapi.models.V1ContainerUserFluent<A>> extends BaseFluent<A>{
  public V1ContainerUserFluent() {
  }
  
  public V1ContainerUserFluent(V1ContainerUser instance) {
    this.copyInstance(instance);
  }
  private V1LinuxContainerUserBuilder linux;
  
  protected void copyInstance(V1ContainerUser instance) {
    instance = instance != null ? instance : new V1ContainerUser();
    if (instance != null) {
      this.withLinux(instance.getLinux());
    }
  }
  
  public V1LinuxContainerUser buildLinux() {
    return this.linux != null ? this.linux.build() : null;
  }
  
  public A withLinux(V1LinuxContainerUser linux) {
    this._visitables.remove("linux");
    if (linux != null) {
        this.linux = new V1LinuxContainerUserBuilder(linux);
        this._visitables.get("linux").add(this.linux);
    } else {
        this.linux = null;
        this._visitables.get("linux").remove(this.linux);
    }
    return (A) this;
  }
  
  public boolean hasLinux() {
    return this.linux != null;
  }
  
  public LinuxNested<A> withNewLinux() {
    return new LinuxNested(null);
  }
  
  public LinuxNested<A> withNewLinuxLike(V1LinuxContainerUser item) {
    return new LinuxNested(item);
  }
  
  public LinuxNested<A> editLinux() {
    return this.withNewLinuxLike(Optional.ofNullable(this.buildLinux()).orElse(null));
  }
  
  public LinuxNested<A> editOrNewLinux() {
    return this.withNewLinuxLike(Optional.ofNullable(this.buildLinux()).orElse(new V1LinuxContainerUserBuilder().build()));
  }
  
  public LinuxNested<A> editOrNewLinuxLike(V1LinuxContainerUser item) {
    return this.withNewLinuxLike(Optional.ofNullable(this.buildLinux()).orElse(item));
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
    V1ContainerUserFluent that = (V1ContainerUserFluent) o;
    if (!(Objects.equals(linux, that.linux))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(linux);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(linux == null)) {
        sb.append("linux:");
        sb.append(linux);
    }
    sb.append("}");
    return sb.toString();
  }
  public class LinuxNested<N> extends V1LinuxContainerUserFluent<LinuxNested<N>> implements Nested<N>{
    LinuxNested(V1LinuxContainerUser item) {
      this.builder = new V1LinuxContainerUserBuilder(this, item);
    }
    V1LinuxContainerUserBuilder builder;
    
    public N and() {
      return (N) V1ContainerUserFluent.this.withLinux(builder.build());
    }
    
    public N endLinux() {
      return and();
    }
    
  
  }

}