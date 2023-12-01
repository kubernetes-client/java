package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EndpointConditionsFluent<A extends V1EndpointConditionsFluent<A>> extends BaseFluent<A>{
  public V1EndpointConditionsFluent() {
  }
  
  public V1EndpointConditionsFluent(V1EndpointConditions instance) {
    this.copyInstance(instance);
  }
  private Boolean ready;
  private Boolean serving;
  private Boolean terminating;
  
  protected void copyInstance(V1EndpointConditions instance) {
    instance = (instance != null ? instance : new V1EndpointConditions());
    if (instance != null) {
          this.withReady(instance.getReady());
          this.withServing(instance.getServing());
          this.withTerminating(instance.getTerminating());
        }
  }
  
  public Boolean getReady() {
    return this.ready;
  }
  
  public A withReady(Boolean ready) {
    this.ready = ready;
    return (A) this;
  }
  
  public boolean hasReady() {
    return this.ready != null;
  }
  
  public Boolean getServing() {
    return this.serving;
  }
  
  public A withServing(Boolean serving) {
    this.serving = serving;
    return (A) this;
  }
  
  public boolean hasServing() {
    return this.serving != null;
  }
  
  public Boolean getTerminating() {
    return this.terminating;
  }
  
  public A withTerminating(Boolean terminating) {
    this.terminating = terminating;
    return (A) this;
  }
  
  public boolean hasTerminating() {
    return this.terminating != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EndpointConditionsFluent that = (V1EndpointConditionsFluent) o;
    if (!java.util.Objects.equals(ready, that.ready)) return false;
    if (!java.util.Objects.equals(serving, that.serving)) return false;
    if (!java.util.Objects.equals(terminating, that.terminating)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(ready,  serving,  terminating,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (ready != null) { sb.append("ready:"); sb.append(ready + ","); }
    if (serving != null) { sb.append("serving:"); sb.append(serving + ","); }
    if (terminating != null) { sb.append("terminating:"); sb.append(terminating); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReady() {
    return withReady(true);
  }
  
  public A withServing() {
    return withServing(true);
  }
  
  public A withTerminating() {
    return withTerminating(true);
  }
  

}