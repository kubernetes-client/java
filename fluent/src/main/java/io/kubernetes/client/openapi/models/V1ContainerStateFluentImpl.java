package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ContainerStateFluentImpl<A extends V1ContainerStateFluent<A>> extends BaseFluent<A> implements V1ContainerStateFluent<A>{
  public V1ContainerStateFluentImpl() {
  }
  public V1ContainerStateFluentImpl(V1ContainerState instance) {
    this.withRunning(instance.getRunning());

    this.withTerminated(instance.getTerminated());

    this.withWaiting(instance.getWaiting());

  }
  private V1ContainerStateRunningBuilder running;
  private V1ContainerStateTerminatedBuilder terminated;
  private V1ContainerStateWaitingBuilder waiting;
  
  /**
   * This method has been deprecated, please use method buildRunning instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ContainerStateRunning getRunning() {
    return this.running!=null ?this.running.build():null;
  }
  public V1ContainerStateRunning buildRunning() {
    return this.running!=null ?this.running.build():null;
  }
  public A withRunning(V1ContainerStateRunning running) {
    _visitables.get("running").remove(this.running);
    if (running!=null){ this.running= new V1ContainerStateRunningBuilder(running); _visitables.get("running").add(this.running);} else { this.running = null; _visitables.get("running").remove(this.running); } return (A) this;
  }
  public Boolean hasRunning() {
    return this.running != null;
  }
  public V1ContainerStateFluent.RunningNested<A> withNewRunning() {
    return new V1ContainerStateFluentImpl.RunningNestedImpl();
  }
  public V1ContainerStateFluent.RunningNested<A> withNewRunningLike(V1ContainerStateRunning item) {
    return new V1ContainerStateFluentImpl.RunningNestedImpl(item);
  }
  public V1ContainerStateFluent.RunningNested<A> editRunning() {
    return withNewRunningLike(getRunning());
  }
  public V1ContainerStateFluent.RunningNested<A> editOrNewRunning() {
    return withNewRunningLike(getRunning() != null ? getRunning(): new V1ContainerStateRunningBuilder().build());
  }
  public V1ContainerStateFluent.RunningNested<A> editOrNewRunningLike(V1ContainerStateRunning item) {
    return withNewRunningLike(getRunning() != null ? getRunning(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildTerminated instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ContainerStateTerminated getTerminated() {
    return this.terminated!=null ?this.terminated.build():null;
  }
  public V1ContainerStateTerminated buildTerminated() {
    return this.terminated!=null ?this.terminated.build():null;
  }
  public A withTerminated(V1ContainerStateTerminated terminated) {
    _visitables.get("terminated").remove(this.terminated);
    if (terminated!=null){ this.terminated= new V1ContainerStateTerminatedBuilder(terminated); _visitables.get("terminated").add(this.terminated);} else { this.terminated = null; _visitables.get("terminated").remove(this.terminated); } return (A) this;
  }
  public Boolean hasTerminated() {
    return this.terminated != null;
  }
  public V1ContainerStateFluent.TerminatedNested<A> withNewTerminated() {
    return new V1ContainerStateFluentImpl.TerminatedNestedImpl();
  }
  public V1ContainerStateFluent.TerminatedNested<A> withNewTerminatedLike(V1ContainerStateTerminated item) {
    return new V1ContainerStateFluentImpl.TerminatedNestedImpl(item);
  }
  public V1ContainerStateFluent.TerminatedNested<A> editTerminated() {
    return withNewTerminatedLike(getTerminated());
  }
  public V1ContainerStateFluent.TerminatedNested<A> editOrNewTerminated() {
    return withNewTerminatedLike(getTerminated() != null ? getTerminated(): new V1ContainerStateTerminatedBuilder().build());
  }
  public V1ContainerStateFluent.TerminatedNested<A> editOrNewTerminatedLike(V1ContainerStateTerminated item) {
    return withNewTerminatedLike(getTerminated() != null ? getTerminated(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildWaiting instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ContainerStateWaiting getWaiting() {
    return this.waiting!=null ?this.waiting.build():null;
  }
  public V1ContainerStateWaiting buildWaiting() {
    return this.waiting!=null ?this.waiting.build():null;
  }
  public A withWaiting(V1ContainerStateWaiting waiting) {
    _visitables.get("waiting").remove(this.waiting);
    if (waiting!=null){ this.waiting= new V1ContainerStateWaitingBuilder(waiting); _visitables.get("waiting").add(this.waiting);} else { this.waiting = null; _visitables.get("waiting").remove(this.waiting); } return (A) this;
  }
  public Boolean hasWaiting() {
    return this.waiting != null;
  }
  public V1ContainerStateFluent.WaitingNested<A> withNewWaiting() {
    return new V1ContainerStateFluentImpl.WaitingNestedImpl();
  }
  public V1ContainerStateFluent.WaitingNested<A> withNewWaitingLike(V1ContainerStateWaiting item) {
    return new V1ContainerStateFluentImpl.WaitingNestedImpl(item);
  }
  public V1ContainerStateFluent.WaitingNested<A> editWaiting() {
    return withNewWaitingLike(getWaiting());
  }
  public V1ContainerStateFluent.WaitingNested<A> editOrNewWaiting() {
    return withNewWaitingLike(getWaiting() != null ? getWaiting(): new V1ContainerStateWaitingBuilder().build());
  }
  public V1ContainerStateFluent.WaitingNested<A> editOrNewWaitingLike(V1ContainerStateWaiting item) {
    return withNewWaitingLike(getWaiting() != null ? getWaiting(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ContainerStateFluentImpl that = (V1ContainerStateFluentImpl) o;
    if (running != null ? !running.equals(that.running) :that.running != null) return false;
    if (terminated != null ? !terminated.equals(that.terminated) :that.terminated != null) return false;
    if (waiting != null ? !waiting.equals(that.waiting) :that.waiting != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(running,  terminated,  waiting,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (running != null) { sb.append("running:"); sb.append(running + ","); }
    if (terminated != null) { sb.append("terminated:"); sb.append(terminated + ","); }
    if (waiting != null) { sb.append("waiting:"); sb.append(waiting); }
    sb.append("}");
    return sb.toString();
  }
  class RunningNestedImpl<N> extends V1ContainerStateRunningFluentImpl<V1ContainerStateFluent.RunningNested<N>> implements V1ContainerStateFluent.RunningNested<N>,Nested<N>{
    RunningNestedImpl(V1ContainerStateRunning item) {
      this.builder = new V1ContainerStateRunningBuilder(this, item);
    }
    RunningNestedImpl() {
      this.builder = new V1ContainerStateRunningBuilder(this);
    }
    V1ContainerStateRunningBuilder builder;
    public N and() {
      return (N) V1ContainerStateFluentImpl.this.withRunning(builder.build());
    }
    public N endRunning() {
      return and();
    }
    
  }
  class TerminatedNestedImpl<N> extends V1ContainerStateTerminatedFluentImpl<V1ContainerStateFluent.TerminatedNested<N>> implements V1ContainerStateFluent.TerminatedNested<N>,Nested<N>{
    TerminatedNestedImpl(V1ContainerStateTerminated item) {
      this.builder = new V1ContainerStateTerminatedBuilder(this, item);
    }
    TerminatedNestedImpl() {
      this.builder = new V1ContainerStateTerminatedBuilder(this);
    }
    V1ContainerStateTerminatedBuilder builder;
    public N and() {
      return (N) V1ContainerStateFluentImpl.this.withTerminated(builder.build());
    }
    public N endTerminated() {
      return and();
    }
    
  }
  class WaitingNestedImpl<N> extends V1ContainerStateWaitingFluentImpl<V1ContainerStateFluent.WaitingNested<N>> implements V1ContainerStateFluent.WaitingNested<N>,Nested<N>{
    WaitingNestedImpl(V1ContainerStateWaiting item) {
      this.builder = new V1ContainerStateWaitingBuilder(this, item);
    }
    WaitingNestedImpl() {
      this.builder = new V1ContainerStateWaitingBuilder(this);
    }
    V1ContainerStateWaitingBuilder builder;
    public N and() {
      return (N) V1ContainerStateFluentImpl.this.withWaiting(builder.build());
    }
    public N endWaiting() {
      return and();
    }
    
  }
  
}