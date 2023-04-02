package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ExecActionFluentImpl<A extends V1ExecActionFluent<A>> extends BaseFluent<A> implements V1ExecActionFluent<A>{
  public V1ExecActionFluentImpl() {
  }
  public V1ExecActionFluentImpl(V1ExecAction instance) {
    this.withCommand(instance.getCommand());

  }
  private List<String> command;
  public A addToCommand(Integer index,String item) {
    if (this.command == null) {this.command = new ArrayList<String>();}
    this.command.add(index, item);
    return (A)this;
  }
  public A setToCommand(Integer index,String item) {
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
    for (String item : items) {if (this.command!= null){ this.command.remove(item);}} return (A)this;
  }
  public A removeAllFromCommand(Collection<String> items) {
    for (String item : items) {if (this.command!= null){ this.command.remove(item);}} return (A)this;
  }
  public List<String> getCommand() {
    return this.command;
  }
  public String getCommand(Integer index) {
    return this.command.get(index);
  }
  public String getFirstCommand() {
    return this.command.get(0);
  }
  public String getLastCommand() {
    return this.command.get(command.size() - 1);
  }
  public String getMatchingCommand(Predicate<String> predicate) {
    for (String item: command) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingCommand(Predicate<String> predicate) {
    for (String item: command) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withCommand(List<String> command) {
    if (command != null) {this.command = new ArrayList(); for (String item : command){this.addToCommand(item);}} else { this.command = null;} return (A) this;
  }
  public A withCommand(java.lang.String... command) {
    if (this.command != null) {this.command.clear();}
    if (command != null) {for (String item :command){ this.addToCommand(item);}} return (A) this;
  }
  public Boolean hasCommand() {
    return command != null && !command.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ExecActionFluentImpl that = (V1ExecActionFluentImpl) o;
    if (command != null ? !command.equals(that.command) :that.command != null) return false;
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