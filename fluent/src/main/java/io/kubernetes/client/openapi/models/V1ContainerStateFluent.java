package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ContainerStateFluent<A extends V1ContainerStateFluent<A>> extends BaseFluent<A>{
  public V1ContainerStateFluent() {
  }
  
  public V1ContainerStateFluent(V1ContainerState instance) {
    this.copyInstance(instance);
  }
  private V1ContainerStateRunningBuilder running;
  private V1ContainerStateTerminatedBuilder terminated;
  private V1ContainerStateWaitingBuilder waiting;
  
  protected void copyInstance(V1ContainerState instance) {
    instance = (instance != null ? instance : new V1ContainerState());
    if (instance != null) {
          this.withRunning(instance.getRunning());
          this.withTerminated(instance.getTerminated());
          this.withWaiting(instance.getWaiting());
        }
  }
  
  public V1ContainerStateRunning buildRunning() {
    return this.running != null ? this.running.build() : null;
  }
  
  public A withRunning(V1ContainerStateRunning running) {
    this._visitables.remove("running");
    if (running != null) {
        this.running = new V1ContainerStateRunningBuilder(running);
        this._visitables.get("running").add(this.running);
    } else {
        this.running = null;
        this._visitables.get("running").remove(this.running);
    }
    return (A) this;
  }
  
  public boolean hasRunning() {
    return this.running != null;
  }
  
  public RunningNested<A> withNewRunning() {
    return new RunningNested(null);
  }
  
  public RunningNested<A> withNewRunningLike(V1ContainerStateRunning item) {
    return new RunningNested(item);
  }
  
  public RunningNested<A> editRunning() {
    return withNewRunningLike(java.util.Optional.ofNullable(buildRunning()).orElse(null));
  }
  
  public RunningNested<A> editOrNewRunning() {
    return withNewRunningLike(java.util.Optional.ofNullable(buildRunning()).orElse(new V1ContainerStateRunningBuilder().build()));
  }
  
  public RunningNested<A> editOrNewRunningLike(V1ContainerStateRunning item) {
    return withNewRunningLike(java.util.Optional.ofNullable(buildRunning()).orElse(item));
  }
  
  public V1ContainerStateTerminated buildTerminated() {
    return this.terminated != null ? this.terminated.build() : null;
  }
  
  public A withTerminated(V1ContainerStateTerminated terminated) {
    this._visitables.remove("terminated");
    if (terminated != null) {
        this.terminated = new V1ContainerStateTerminatedBuilder(terminated);
        this._visitables.get("terminated").add(this.terminated);
    } else {
        this.terminated = null;
        this._visitables.get("terminated").remove(this.terminated);
    }
    return (A) this;
  }
  
  public boolean hasTerminated() {
    return this.terminated != null;
  }
  
  public TerminatedNested<A> withNewTerminated() {
    return new TerminatedNested(null);
  }
  
  public TerminatedNested<A> withNewTerminatedLike(V1ContainerStateTerminated item) {
    return new TerminatedNested(item);
  }
  
  public TerminatedNested<A> editTerminated() {
    return withNewTerminatedLike(java.util.Optional.ofNullable(buildTerminated()).orElse(null));
  }
  
  public TerminatedNested<A> editOrNewTerminated() {
    return withNewTerminatedLike(java.util.Optional.ofNullable(buildTerminated()).orElse(new V1ContainerStateTerminatedBuilder().build()));
  }
  
  public TerminatedNested<A> editOrNewTerminatedLike(V1ContainerStateTerminated item) {
    return withNewTerminatedLike(java.util.Optional.ofNullable(buildTerminated()).orElse(item));
  }
  
  public V1ContainerStateWaiting buildWaiting() {
    return this.waiting != null ? this.waiting.build() : null;
  }
  
  public A withWaiting(V1ContainerStateWaiting waiting) {
    this._visitables.remove("waiting");
    if (waiting != null) {
        this.waiting = new V1ContainerStateWaitingBuilder(waiting);
        this._visitables.get("waiting").add(this.waiting);
    } else {
        this.waiting = null;
        this._visitables.get("waiting").remove(this.waiting);
    }
    return (A) this;
  }
  
  public boolean hasWaiting() {
    return this.waiting != null;
  }
  
  public WaitingNested<A> withNewWaiting() {
    return new WaitingNested(null);
  }
  
  public WaitingNested<A> withNewWaitingLike(V1ContainerStateWaiting item) {
    return new WaitingNested(item);
  }
  
  public WaitingNested<A> editWaiting() {
    return withNewWaitingLike(java.util.Optional.ofNullable(buildWaiting()).orElse(null));
  }
  
  public WaitingNested<A> editOrNewWaiting() {
    return withNewWaitingLike(java.util.Optional.ofNullable(buildWaiting()).orElse(new V1ContainerStateWaitingBuilder().build()));
  }
  
  public WaitingNested<A> editOrNewWaitingLike(V1ContainerStateWaiting item) {
    return withNewWaitingLike(java.util.Optional.ofNullable(buildWaiting()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ContainerStateFluent that = (V1ContainerStateFluent) o;
    if (!java.util.Objects.equals(running, that.running)) return false;
    if (!java.util.Objects.equals(terminated, that.terminated)) return false;
    if (!java.util.Objects.equals(waiting, that.waiting)) return false;
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
  public class RunningNested<N> extends V1ContainerStateRunningFluent<RunningNested<N>> implements Nested<N>{
    RunningNested(V1ContainerStateRunning item) {
      this.builder = new V1ContainerStateRunningBuilder(this, item);
    }
    V1ContainerStateRunningBuilder builder;
    
    public N and() {
      return (N) V1ContainerStateFluent.this.withRunning(builder.build());
    }
    
    public N endRunning() {
      return and();
    }
    
  
  }
  public class TerminatedNested<N> extends V1ContainerStateTerminatedFluent<TerminatedNested<N>> implements Nested<N>{
    TerminatedNested(V1ContainerStateTerminated item) {
      this.builder = new V1ContainerStateTerminatedBuilder(this, item);
    }
    V1ContainerStateTerminatedBuilder builder;
    
    public N and() {
      return (N) V1ContainerStateFluent.this.withTerminated(builder.build());
    }
    
    public N endTerminated() {
      return and();
    }
    
  
  }
  public class WaitingNested<N> extends V1ContainerStateWaitingFluent<WaitingNested<N>> implements Nested<N>{
    WaitingNested(V1ContainerStateWaiting item) {
      this.builder = new V1ContainerStateWaitingBuilder(this, item);
    }
    V1ContainerStateWaitingBuilder builder;
    
    public N and() {
      return (N) V1ContainerStateFluent.this.withWaiting(builder.build());
    }
    
    public N endWaiting() {
      return and();
    }
    
  
  }

}