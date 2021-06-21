package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

public class V1ExecActionFluentImpl<A extends io.kubernetes.client.openapi.models.V1ExecActionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ExecActionFluent<A> {

    private java.util.List<java.lang.String> command;

    public V1ExecActionFluentImpl() {
    }

    public V1ExecActionFluentImpl(io.kubernetes.client.openapi.models.V1ExecAction instance) {
        this.withCommand(instance.getCommand());
    }

    public A addToCommand(int index,java.lang.String item) {
        if (this.command == null) {this.command = new java.util.ArrayList<java.lang.String>();}
        this.command.add(index, item);
        return (A)this;
    }

    public A setToCommand(int index,java.lang.String item) {
        if (this.command == null) {this.command = new java.util.ArrayList<java.lang.String>();}
        this.command.set(index, item); return (A)this;
    }

    public A addToCommand(java.lang.String... items) {
        if (this.command == null) {this.command = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.command.add(item);} return (A)this;
    }

    public A addAllToCommand(java.util.Collection<java.lang.String> items) {
        if (this.command == null) {this.command = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.command.add(item);} return (A)this;
    }

    public A removeFromCommand(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.command!= null){ this.command.remove(item);}} return (A)this;
    }

    public A removeAllFromCommand(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.command!= null){ this.command.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getCommand() {
        return this.command;
    }

    public java.lang.String getCommand(int index) {
        return this.command.get(index);
    }

    public java.lang.String getFirstCommand() {
        return this.command.get(0);
    }

    public java.lang.String getLastCommand() {
        return this.command.get(command.size() - 1);
    }

    public java.lang.String getMatchingCommand(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: command) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingCommand(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: command) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withCommand(java.util.List<java.lang.String> command) {
        if (this.command != null) { _visitables.get("command").removeAll(this.command);}
        if (command != null) {this.command = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : command){this.addToCommand(item);}} else { this.command = null;} return (A) this;
    }

    public A withCommand(java.lang.String... command) {
        if (this.command != null) {this.command.clear();}
        if (command != null) {for (java.lang.String item :command){ this.addToCommand(item);}} return (A) this;
    }

    public java.lang.Boolean hasCommand() {
        return command != null && !command.isEmpty();
    }

    public A addNewCommand(java.lang.String original) {
        return (A)addToCommand(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ExecActionFluentImpl that = (V1ExecActionFluentImpl) o;
        if (command != null ? !command.equals(that.command) :that.command != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(command,  super.hashCode());
    }

}
