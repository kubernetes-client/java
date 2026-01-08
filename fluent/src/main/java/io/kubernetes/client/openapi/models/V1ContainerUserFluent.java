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
public class V1ContainerUserFluent<A extends io.kubernetes.client.openapi.models.V1ContainerUserFluent<A>> extends BaseFluent<A>{

  private V1LinuxContainerUserBuilder linux;

  public V1ContainerUserFluent() {
  }
  
  public V1ContainerUserFluent(V1ContainerUser instance) {
    this.copyInstance(instance);
  }

  public V1LinuxContainerUser buildLinux() {
    return this.linux != null ? this.linux.build() : null;
  }
  
  protected void copyInstance(V1ContainerUser instance) {
    instance = instance != null ? instance : new V1ContainerUser();
    if (instance != null) {
      this.withLinux(instance.getLinux());
    }
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
  
  public boolean hasLinux() {
    return this.linux != null;
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
  
  public LinuxNested<A> withNewLinux() {
    return new LinuxNested(null);
  }
  
  public LinuxNested<A> withNewLinuxLike(V1LinuxContainerUser item) {
    return new LinuxNested(item);
  }
  public class LinuxNested<N> extends V1LinuxContainerUserFluent<LinuxNested<N>> implements Nested<N>{
  
    V1LinuxContainerUserBuilder builder;
  
    LinuxNested(V1LinuxContainerUser item) {
      this.builder = new V1LinuxContainerUserBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ContainerUserFluent.this.withLinux(builder.build());
    }
    
    public N endLinux() {
      return and();
    }
    
  }
}