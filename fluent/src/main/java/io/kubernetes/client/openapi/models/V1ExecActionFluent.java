package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1ExecActionFluent<A extends V1ExecActionFluent<A>> extends Fluent<A>{
  public A addToCommand(Integer index,String item);
  public A setToCommand(Integer index,String item);
  public A addToCommand(java.lang.String... items);
  public A addAllToCommand(Collection<String> items);
  public A removeFromCommand(java.lang.String... items);
  public A removeAllFromCommand(Collection<String> items);
  public List<String> getCommand();
  public String getCommand(Integer index);
  public String getFirstCommand();
  public String getLastCommand();
  public String getMatchingCommand(Predicate<String> predicate);
  public Boolean hasMatchingCommand(Predicate<String> predicate);
  public A withCommand(List<String> command);
  public A withCommand(java.lang.String... command);
  public Boolean hasCommand();
  
}