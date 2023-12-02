package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ExecActionFluent<A extends V1ExecActionFluent<A>> extends BaseFluent<A>{
  public V1ExecActionFluent() {
  }
  
  public V1ExecActionFluent(V1ExecAction instance) {
    this.copyInstance(instance);
  }
  private List<String> command;
  
  protected void copyInstance(V1ExecAction instance) {
    instance = (instance != null ? instance : new V1ExecAction());
    if (instance != null) {
          this.withCommand(instance.getCommand());
        }
  }
  
  public A addToCommand(int index,String item) {
    if (this.command == null) {this.command = new ArrayList<String>();}
    this.command.add(index, item);
    return (A)this;
  }
  
  public A setToCommand(int index,String item) {
    if (this.command == null) {this.command = new ArrayList<String>();}
    this.command.set(index, item); return (A)this;
  }
  
  public A addToCommand(java.lang.String... items) {
    if (this.command == null) {this.command = new ArrayList<String>();}
    for (String item : items) {this.command.add(item);} return (A)this;
  }
  
  public A addAllToCommand(Collection<String> items) {
    if (this.command == null) {this.command = new ArrayList<String>();}
    for (String item : items) {this.command.add(item);} return (A)this;
  }
  
  public A removeFromCommand(java.lang.String... items) {
    if (this.command == null) return (A)this;
    for (String item : items) { this.command.remove(item);} return (A)this;
  }
  
  public A removeAllFromCommand(Collection<String> items) {
    if (this.command == null) return (A)this;
    for (String item : items) { this.command.remove(item);} return (A)this;
  }
  
  public List<String> getCommand() {
    return this.command;
  }
  
  public String getCommand(int index) {
    return this.command.get(index);
  }
  
  public String getFirstCommand() {
    return this.command.get(0);
  }
  
  public String getLastCommand() {
    return this.command.get(command.size() - 1);
  }
  
  public String getMatchingCommand(Predicate<String> predicate) {
      for (String item : command) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingCommand(Predicate<String> predicate) {
      for (String item : command) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withCommand(List<String> command) {
    if (command != null) {
        this.command = new ArrayList();
        for (String item : command) {
          this.addToCommand(item);
        }
    } else {
      this.command = null;
    }
    return (A) this;
  }
  
  public A withCommand(java.lang.String... command) {
    if (this.command != null) {
        this.command.clear();
        _visitables.remove("command");
    }
    if (command != null) {
      for (String item : command) {
        this.addToCommand(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasCommand() {
    return this.command != null && !this.command.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ExecActionFluent that = (V1ExecActionFluent) o;
    if (!java.util.Objects.equals(command, that.command)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(command,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (command != null && !command.isEmpty()) { sb.append("command:"); sb.append(command); }
    sb.append("}");
    return sb.toString();
  }
  

}