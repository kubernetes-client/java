package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

public interface V1ExecActionFluent<A extends io.kubernetes.client.openapi.models.V1ExecActionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToCommand(int index,java.lang.String item);
    public A setToCommand(int index,java.lang.String item);
    public A addToCommand(java.lang.String... items);
    public A addAllToCommand(java.util.Collection<java.lang.String> items);
    public A removeFromCommand(java.lang.String... items);
    public A removeAllFromCommand(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getCommand();
    public java.lang.String getCommand(int index);
    public java.lang.String getFirstCommand();
    public java.lang.String getLastCommand();
    public java.lang.String getMatchingCommand(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingCommand(java.util.function.Predicate<java.lang.String> predicate);
    public A withCommand(java.util.List<java.lang.String> command);
    public A withCommand(java.lang.String... command);
    public java.lang.Boolean hasCommand();
    public A addNewCommand(java.lang.String original);
}
