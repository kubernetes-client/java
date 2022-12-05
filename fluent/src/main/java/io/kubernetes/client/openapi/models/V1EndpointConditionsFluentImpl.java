package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1EndpointConditionsFluentImpl<A extends V1EndpointConditionsFluent<A>> extends BaseFluent<A> implements V1EndpointConditionsFluent<A>{
  public V1EndpointConditionsFluentImpl() {
  }
  public V1EndpointConditionsFluentImpl(V1EndpointConditions instance) {
    this.withReady(instance.getReady());

    this.withServing(instance.getServing());

    this.withTerminating(instance.getTerminating());

  }
  private Boolean ready;
  private Boolean serving;
  private Boolean terminating;
  public Boolean getReady() {
    return this.ready;
  }
  public A withReady(Boolean ready) {
    this.ready=ready; return (A) this;
  }
  public Boolean hasReady() {
    return this.ready != null;
  }
  public Boolean getServing() {
    return this.serving;
  }
  public A withServing(Boolean serving) {
    this.serving=serving; return (A) this;
  }
  public Boolean hasServing() {
    return this.serving != null;
  }
  public Boolean getTerminating() {
    return this.terminating;
  }
  public A withTerminating(Boolean terminating) {
    this.terminating=terminating; return (A) this;
  }
  public Boolean hasTerminating() {
    return this.terminating != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EndpointConditionsFluentImpl that = (V1EndpointConditionsFluentImpl) o;
    if (ready != null ? !ready.equals(that.ready) :that.ready != null) return false;
    if (serving != null ? !serving.equals(that.serving) :that.serving != null) return false;
    if (terminating != null ? !terminating.equals(that.terminating) :that.terminating != null) return false;
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