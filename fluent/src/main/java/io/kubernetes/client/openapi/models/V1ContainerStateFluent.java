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
public class V1ContainerStateFluent<A extends io.kubernetes.client.openapi.models.V1ContainerStateFluent<A>> extends BaseFluent<A>{

  private V1ContainerStateRunningBuilder running;
  private V1ContainerStateTerminatedBuilder terminated;
  private V1ContainerStateWaitingBuilder waiting;

  public V1ContainerStateFluent() {
  }
  
  public V1ContainerStateFluent(V1ContainerState instance) {
    this.copyInstance(instance);
  }

  public V1ContainerStateRunning buildRunning() {
    return this.running != null ? this.running.build() : null;
  }
  
  public V1ContainerStateTerminated buildTerminated() {
    return this.terminated != null ? this.terminated.build() : null;
  }
  
  public V1ContainerStateWaiting buildWaiting() {
    return this.waiting != null ? this.waiting.build() : null;
  }
  
  protected void copyInstance(V1ContainerState instance) {
    instance = instance != null ? instance : new V1ContainerState();
    if (instance != null) {
        this.withRunning(instance.getRunning());
        this.withTerminated(instance.getTerminated());
        this.withWaiting(instance.getWaiting());
    }
  }
  
  public RunningNested<A> editOrNewRunning() {
    return this.withNewRunningLike(Optional.ofNullable(this.buildRunning()).orElse(new V1ContainerStateRunningBuilder().build()));
  }
  
  public RunningNested<A> editOrNewRunningLike(V1ContainerStateRunning item) {
    return this.withNewRunningLike(Optional.ofNullable(this.buildRunning()).orElse(item));
  }
  
  public TerminatedNested<A> editOrNewTerminated() {
    return this.withNewTerminatedLike(Optional.ofNullable(this.buildTerminated()).orElse(new V1ContainerStateTerminatedBuilder().build()));
  }
  
  public TerminatedNested<A> editOrNewTerminatedLike(V1ContainerStateTerminated item) {
    return this.withNewTerminatedLike(Optional.ofNullable(this.buildTerminated()).orElse(item));
  }
  
  public WaitingNested<A> editOrNewWaiting() {
    return this.withNewWaitingLike(Optional.ofNullable(this.buildWaiting()).orElse(new V1ContainerStateWaitingBuilder().build()));
  }
  
  public WaitingNested<A> editOrNewWaitingLike(V1ContainerStateWaiting item) {
    return this.withNewWaitingLike(Optional.ofNullable(this.buildWaiting()).orElse(item));
  }
  
  public RunningNested<A> editRunning() {
    return this.withNewRunningLike(Optional.ofNullable(this.buildRunning()).orElse(null));
  }
  
  public TerminatedNested<A> editTerminated() {
    return this.withNewTerminatedLike(Optional.ofNullable(this.buildTerminated()).orElse(null));
  }
  
  public WaitingNested<A> editWaiting() {
    return this.withNewWaitingLike(Optional.ofNullable(this.buildWaiting()).orElse(null));
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
    V1ContainerStateFluent that = (V1ContainerStateFluent) o;
    if (!(Objects.equals(running, that.running))) {
      return false;
    }
    if (!(Objects.equals(terminated, that.terminated))) {
      return false;
    }
    if (!(Objects.equals(waiting, that.waiting))) {
      return false;
    }
    return true;
  }
  
  public boolean hasRunning() {
    return this.running != null;
  }
  
  public boolean hasTerminated() {
    return this.terminated != null;
  }
  
  public boolean hasWaiting() {
    return this.waiting != null;
  }
  
  public int hashCode() {
    return Objects.hash(running, terminated, waiting);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(running == null)) {
        sb.append("running:");
        sb.append(running);
        sb.append(",");
    }
    if (!(terminated == null)) {
        sb.append("terminated:");
        sb.append(terminated);
        sb.append(",");
    }
    if (!(waiting == null)) {
        sb.append("waiting:");
        sb.append(waiting);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public RunningNested<A> withNewRunning() {
    return new RunningNested(null);
  }
  
  public RunningNested<A> withNewRunningLike(V1ContainerStateRunning item) {
    return new RunningNested(item);
  }
  
  public TerminatedNested<A> withNewTerminated() {
    return new TerminatedNested(null);
  }
  
  public TerminatedNested<A> withNewTerminatedLike(V1ContainerStateTerminated item) {
    return new TerminatedNested(item);
  }
  
  public WaitingNested<A> withNewWaiting() {
    return new WaitingNested(null);
  }
  
  public WaitingNested<A> withNewWaitingLike(V1ContainerStateWaiting item) {
    return new WaitingNested(item);
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
  public class RunningNested<N> extends V1ContainerStateRunningFluent<RunningNested<N>> implements Nested<N>{
  
    V1ContainerStateRunningBuilder builder;
  
    RunningNested(V1ContainerStateRunning item) {
      this.builder = new V1ContainerStateRunningBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ContainerStateFluent.this.withRunning(builder.build());
    }
    
    public N endRunning() {
      return and();
    }
    
  }
  public class TerminatedNested<N> extends V1ContainerStateTerminatedFluent<TerminatedNested<N>> implements Nested<N>{
  
    V1ContainerStateTerminatedBuilder builder;
  
    TerminatedNested(V1ContainerStateTerminated item) {
      this.builder = new V1ContainerStateTerminatedBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ContainerStateFluent.this.withTerminated(builder.build());
    }
    
    public N endTerminated() {
      return and();
    }
    
  }
  public class WaitingNested<N> extends V1ContainerStateWaitingFluent<WaitingNested<N>> implements Nested<N>{
  
    V1ContainerStateWaitingBuilder builder;
  
    WaitingNested(V1ContainerStateWaiting item) {
      this.builder = new V1ContainerStateWaitingBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ContainerStateFluent.this.withWaiting(builder.build());
    }
    
    public N endWaiting() {
      return and();
    }
    
  }
}