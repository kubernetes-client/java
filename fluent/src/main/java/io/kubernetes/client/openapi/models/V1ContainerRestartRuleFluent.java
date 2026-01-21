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
public class V1ContainerRestartRuleFluent<A extends io.kubernetes.client.openapi.models.V1ContainerRestartRuleFluent<A>> extends BaseFluent<A>{

  private String action;
  private V1ContainerRestartRuleOnExitCodesBuilder exitCodes;

  public V1ContainerRestartRuleFluent() {
  }
  
  public V1ContainerRestartRuleFluent(V1ContainerRestartRule instance) {
    this.copyInstance(instance);
  }

  public V1ContainerRestartRuleOnExitCodes buildExitCodes() {
    return this.exitCodes != null ? this.exitCodes.build() : null;
  }
  
  protected void copyInstance(V1ContainerRestartRule instance) {
    instance = instance != null ? instance : new V1ContainerRestartRule();
    if (instance != null) {
        this.withAction(instance.getAction());
        this.withExitCodes(instance.getExitCodes());
    }
  }
  
  public ExitCodesNested<A> editExitCodes() {
    return this.withNewExitCodesLike(Optional.ofNullable(this.buildExitCodes()).orElse(null));
  }
  
  public ExitCodesNested<A> editOrNewExitCodes() {
    return this.withNewExitCodesLike(Optional.ofNullable(this.buildExitCodes()).orElse(new V1ContainerRestartRuleOnExitCodesBuilder().build()));
  }
  
  public ExitCodesNested<A> editOrNewExitCodesLike(V1ContainerRestartRuleOnExitCodes item) {
    return this.withNewExitCodesLike(Optional.ofNullable(this.buildExitCodes()).orElse(item));
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
    V1ContainerRestartRuleFluent that = (V1ContainerRestartRuleFluent) o;
    if (!(Objects.equals(action, that.action))) {
      return false;
    }
    if (!(Objects.equals(exitCodes, that.exitCodes))) {
      return false;
    }
    return true;
  }
  
  public String getAction() {
    return this.action;
  }
  
  public boolean hasAction() {
    return this.action != null;
  }
  
  public boolean hasExitCodes() {
    return this.exitCodes != null;
  }
  
  public int hashCode() {
    return Objects.hash(action, exitCodes);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(action == null)) {
        sb.append("action:");
        sb.append(action);
        sb.append(",");
    }
    if (!(exitCodes == null)) {
        sb.append("exitCodes:");
        sb.append(exitCodes);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAction(String action) {
    this.action = action;
    return (A) this;
  }
  
  public A withExitCodes(V1ContainerRestartRuleOnExitCodes exitCodes) {
    this._visitables.remove("exitCodes");
    if (exitCodes != null) {
        this.exitCodes = new V1ContainerRestartRuleOnExitCodesBuilder(exitCodes);
        this._visitables.get("exitCodes").add(this.exitCodes);
    } else {
        this.exitCodes = null;
        this._visitables.get("exitCodes").remove(this.exitCodes);
    }
    return (A) this;
  }
  
  public ExitCodesNested<A> withNewExitCodes() {
    return new ExitCodesNested(null);
  }
  
  public ExitCodesNested<A> withNewExitCodesLike(V1ContainerRestartRuleOnExitCodes item) {
    return new ExitCodesNested(item);
  }
  public class ExitCodesNested<N> extends V1ContainerRestartRuleOnExitCodesFluent<ExitCodesNested<N>> implements Nested<N>{
  
    V1ContainerRestartRuleOnExitCodesBuilder builder;
  
    ExitCodesNested(V1ContainerRestartRuleOnExitCodes item) {
      this.builder = new V1ContainerRestartRuleOnExitCodesBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ContainerRestartRuleFluent.this.withExitCodes(builder.build());
    }
    
    public N endExitCodes() {
      return and();
    }
    
  }
}