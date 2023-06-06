package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.util.Iterator;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ContainerFluentImpl<A extends V1ContainerFluent<A>> extends BaseFluent<A> implements V1ContainerFluent<A>{
  public V1ContainerFluentImpl() {
  }
  public V1ContainerFluentImpl(V1Container instance) {
    if (instance != null) {
      this.withArgs(instance.getArgs());
      this.withCommand(instance.getCommand());
      this.withEnv(instance.getEnv());
      this.withEnvFrom(instance.getEnvFrom());
      this.withImage(instance.getImage());
      this.withImagePullPolicy(instance.getImagePullPolicy());
      this.withLifecycle(instance.getLifecycle());
      this.withLivenessProbe(instance.getLivenessProbe());
      this.withName(instance.getName());
      this.withPorts(instance.getPorts());
      this.withReadinessProbe(instance.getReadinessProbe());
      this.withResizePolicy(instance.getResizePolicy());
      this.withResources(instance.getResources());
      this.withSecurityContext(instance.getSecurityContext());
      this.withStartupProbe(instance.getStartupProbe());
      this.withStdin(instance.getStdin());
      this.withStdinOnce(instance.getStdinOnce());
      this.withTerminationMessagePath(instance.getTerminationMessagePath());
      this.withTerminationMessagePolicy(instance.getTerminationMessagePolicy());
      this.withTty(instance.getTty());
      this.withVolumeDevices(instance.getVolumeDevices());
      this.withVolumeMounts(instance.getVolumeMounts());
      this.withWorkingDir(instance.getWorkingDir());
    }
  }
  private List<String> args;
  private List<String> command;
  private ArrayList<V1EnvVarBuilder> env;
  private ArrayList<V1EnvFromSourceBuilder> envFrom;
  private String image;
  private String imagePullPolicy;
  private V1LifecycleBuilder lifecycle;
  private V1ProbeBuilder livenessProbe;
  private String name;
  private ArrayList<V1ContainerPortBuilder> ports;
  private V1ProbeBuilder readinessProbe;
  private ArrayList<V1ContainerResizePolicyBuilder> resizePolicy;
  private V1ResourceRequirementsBuilder resources;
  private V1SecurityContextBuilder securityContext;
  private V1ProbeBuilder startupProbe;
  private Boolean stdin;
  private Boolean stdinOnce;
  private String terminationMessagePath;
  private String terminationMessagePolicy;
  private Boolean tty;
  private ArrayList<V1VolumeDeviceBuilder> volumeDevices;
  private ArrayList<V1VolumeMountBuilder> volumeMounts;
  private String workingDir;
  public A addToArgs(int index,String item) {
    if (this.args == null) {this.args = new ArrayList<String>();}
    this.args.add(index, item);
    return (A)this;
  }
  public A setToArgs(int index,String item) {
    if (this.args == null) {this.args = new ArrayList<String>();}
    this.args.set(index, item); return (A)this;
  }
  public A addToArgs(java.lang.String... items) {
    if (this.args == null) {this.args = new ArrayList<String>();}
    for (String item : items) {this.args.add(item);} return (A)this;
  }
  public A addAllToArgs(Collection<String> items) {
    if (this.args == null) {this.args = new ArrayList<String>();}
    for (String item : items) {this.args.add(item);} return (A)this;
  }
  public A removeFromArgs(java.lang.String... items) {
    for (String item : items) {if (this.args!= null){ this.args.remove(item);}} return (A)this;
  }
  public A removeAllFromArgs(Collection<String> items) {
    for (String item : items) {if (this.args!= null){ this.args.remove(item);}} return (A)this;
  }
  public List<String> getArgs() {
    return this.args;
  }
  public String getArg(int index) {
    return this.args.get(index);
  }
  public String getFirstArg() {
    return this.args.get(0);
  }
  public String getLastArg() {
    return this.args.get(args.size() - 1);
  }
  public String getMatchingArg(Predicate<String> predicate) {
    for (String item: args) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingArg(Predicate<String> predicate) {
    for (String item: args) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withArgs(List<String> args) {
    if (args != null) {this.args = new ArrayList(); for (String item : args){this.addToArgs(item);}} else { this.args = null;} return (A) this;
  }
  public A withArgs(java.lang.String... args) {
    if (this.args != null) {this.args.clear(); _visitables.remove("args"); }
    if (args != null) {for (String item :args){ this.addToArgs(item);}} return (A) this;
  }
  public Boolean hasArgs() {
    return args != null && !args.isEmpty();
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
    for (String item : items) {if (this.command!= null){ this.command.remove(item);}} return (A)this;
  }
  public A removeAllFromCommand(Collection<String> items) {
    for (String item : items) {if (this.command!= null){ this.command.remove(item);}} return (A)this;
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
    for (String item: command) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingCommand(Predicate<String> predicate) {
    for (String item: command) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withCommand(List<String> command) {
    if (command != null) {this.command = new ArrayList(); for (String item : command){this.addToCommand(item);}} else { this.command = null;} return (A) this;
  }
  public A withCommand(java.lang.String... command) {
    if (this.command != null) {this.command.clear(); _visitables.remove("command"); }
    if (command != null) {for (String item :command){ this.addToCommand(item);}} return (A) this;
  }
  public Boolean hasCommand() {
    return command != null && !command.isEmpty();
  }
  public A addToEnv(int index,V1EnvVar item) {
    if (this.env == null) {this.env = new ArrayList<V1EnvVarBuilder>();}
    V1EnvVarBuilder builder = new V1EnvVarBuilder(item);
    if (index < 0 || index >= env.size()) { _visitables.get("env").add(builder); env.add(builder); } else { _visitables.get("env").add(index, builder); env.add(index, builder);}
    return (A)this;
  }
  public A setToEnv(int index,V1EnvVar item) {
    if (this.env == null) {this.env = new ArrayList<V1EnvVarBuilder>();}
    V1EnvVarBuilder builder = new V1EnvVarBuilder(item);
    if (index < 0 || index >= env.size()) { _visitables.get("env").add(builder); env.add(builder); } else { _visitables.get("env").set(index, builder); env.set(index, builder);}
    return (A)this;
  }
  public A addToEnv(io.kubernetes.client.openapi.models.V1EnvVar... items) {
    if (this.env == null) {this.env = new ArrayList<V1EnvVarBuilder>();}
    for (V1EnvVar item : items) {V1EnvVarBuilder builder = new V1EnvVarBuilder(item);_visitables.get("env").add(builder);this.env.add(builder);} return (A)this;
  }
  public A addAllToEnv(Collection<V1EnvVar> items) {
    if (this.env == null) {this.env = new ArrayList<V1EnvVarBuilder>();}
    for (V1EnvVar item : items) {V1EnvVarBuilder builder = new V1EnvVarBuilder(item);_visitables.get("env").add(builder);this.env.add(builder);} return (A)this;
  }
  public A removeFromEnv(io.kubernetes.client.openapi.models.V1EnvVar... items) {
    for (V1EnvVar item : items) {V1EnvVarBuilder builder = new V1EnvVarBuilder(item);_visitables.get("env").remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
  }
  public A removeAllFromEnv(Collection<V1EnvVar> items) {
    for (V1EnvVar item : items) {V1EnvVarBuilder builder = new V1EnvVarBuilder(item);_visitables.get("env").remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromEnv(Predicate<V1EnvVarBuilder> predicate) {
    if (env == null) return (A) this;
    final Iterator<V1EnvVarBuilder> each = env.iterator();
    final List visitables = _visitables.get("env");
    while (each.hasNext()) {
      V1EnvVarBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildEnv instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EnvVar> getEnv() {
    return env != null ? build(env) : null;
  }
  public List<V1EnvVar> buildEnv() {
    return env != null ? build(env) : null;
  }
  public V1EnvVar buildEnv(int index) {
    return this.env.get(index).build();
  }
  public V1EnvVar buildFirstEnv() {
    return this.env.get(0).build();
  }
  public V1EnvVar buildLastEnv() {
    return this.env.get(env.size() - 1).build();
  }
  public V1EnvVar buildMatchingEnv(Predicate<V1EnvVarBuilder> predicate) {
    for (V1EnvVarBuilder item: env) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingEnv(Predicate<V1EnvVarBuilder> predicate) {
    for (V1EnvVarBuilder item: env) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withEnv(List<V1EnvVar> env) {
    if (this.env != null) { _visitables.get("env").clear();}
    if (env != null) {this.env = new ArrayList(); for (V1EnvVar item : env){this.addToEnv(item);}} else { this.env = null;} return (A) this;
  }
  public A withEnv(io.kubernetes.client.openapi.models.V1EnvVar... env) {
    if (this.env != null) {this.env.clear(); _visitables.remove("env"); }
    if (env != null) {for (V1EnvVar item :env){ this.addToEnv(item);}} return (A) this;
  }
  public Boolean hasEnv() {
    return env != null && !env.isEmpty();
  }
  public V1ContainerFluentImpl.EnvNested<A> addNewEnv() {
    return new V1ContainerFluentImpl.EnvNestedImpl();
  }
  public V1ContainerFluentImpl.EnvNested<A> addNewEnvLike(V1EnvVar item) {
    return new V1ContainerFluentImpl.EnvNestedImpl(-1, item);
  }
  public V1ContainerFluentImpl.EnvNested<A> setNewEnvLike(int index,V1EnvVar item) {
    return new V1ContainerFluentImpl.EnvNestedImpl(index, item);
  }
  public V1ContainerFluentImpl.EnvNested<A> editEnv(int index) {
    if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
    return setNewEnvLike(index, buildEnv(index));
  }
  public V1ContainerFluentImpl.EnvNested<A> editFirstEnv() {
    if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
    return setNewEnvLike(0, buildEnv(0));
  }
  public V1ContainerFluentImpl.EnvNested<A> editLastEnv() {
    int index = env.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
    return setNewEnvLike(index, buildEnv(index));
  }
  public V1ContainerFluentImpl.EnvNested<A> editMatchingEnv(Predicate<V1EnvVarBuilder> predicate) {
    int index = -1;
    for (int i=0;i<env.size();i++) { 
    if (predicate.test(env.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
    return setNewEnvLike(index, buildEnv(index));
  }
  public A addToEnvFrom(int index,V1EnvFromSource item) {
    if (this.envFrom == null) {this.envFrom = new ArrayList<V1EnvFromSourceBuilder>();}
    V1EnvFromSourceBuilder builder = new V1EnvFromSourceBuilder(item);
    if (index < 0 || index >= envFrom.size()) { _visitables.get("envFrom").add(builder); envFrom.add(builder); } else { _visitables.get("envFrom").add(index, builder); envFrom.add(index, builder);}
    return (A)this;
  }
  public A setToEnvFrom(int index,V1EnvFromSource item) {
    if (this.envFrom == null) {this.envFrom = new ArrayList<V1EnvFromSourceBuilder>();}
    V1EnvFromSourceBuilder builder = new V1EnvFromSourceBuilder(item);
    if (index < 0 || index >= envFrom.size()) { _visitables.get("envFrom").add(builder); envFrom.add(builder); } else { _visitables.get("envFrom").set(index, builder); envFrom.set(index, builder);}
    return (A)this;
  }
  public A addToEnvFrom(io.kubernetes.client.openapi.models.V1EnvFromSource... items) {
    if (this.envFrom == null) {this.envFrom = new ArrayList<V1EnvFromSourceBuilder>();}
    for (V1EnvFromSource item : items) {V1EnvFromSourceBuilder builder = new V1EnvFromSourceBuilder(item);_visitables.get("envFrom").add(builder);this.envFrom.add(builder);} return (A)this;
  }
  public A addAllToEnvFrom(Collection<V1EnvFromSource> items) {
    if (this.envFrom == null) {this.envFrom = new ArrayList<V1EnvFromSourceBuilder>();}
    for (V1EnvFromSource item : items) {V1EnvFromSourceBuilder builder = new V1EnvFromSourceBuilder(item);_visitables.get("envFrom").add(builder);this.envFrom.add(builder);} return (A)this;
  }
  public A removeFromEnvFrom(io.kubernetes.client.openapi.models.V1EnvFromSource... items) {
    for (V1EnvFromSource item : items) {V1EnvFromSourceBuilder builder = new V1EnvFromSourceBuilder(item);_visitables.get("envFrom").remove(builder);if (this.envFrom != null) {this.envFrom.remove(builder);}} return (A)this;
  }
  public A removeAllFromEnvFrom(Collection<V1EnvFromSource> items) {
    for (V1EnvFromSource item : items) {V1EnvFromSourceBuilder builder = new V1EnvFromSourceBuilder(item);_visitables.get("envFrom").remove(builder);if (this.envFrom != null) {this.envFrom.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromEnvFrom(Predicate<V1EnvFromSourceBuilder> predicate) {
    if (envFrom == null) return (A) this;
    final Iterator<V1EnvFromSourceBuilder> each = envFrom.iterator();
    final List visitables = _visitables.get("envFrom");
    while (each.hasNext()) {
      V1EnvFromSourceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildEnvFrom instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EnvFromSource> getEnvFrom() {
    return envFrom != null ? build(envFrom) : null;
  }
  public List<V1EnvFromSource> buildEnvFrom() {
    return envFrom != null ? build(envFrom) : null;
  }
  public V1EnvFromSource buildEnvFrom(int index) {
    return this.envFrom.get(index).build();
  }
  public V1EnvFromSource buildFirstEnvFrom() {
    return this.envFrom.get(0).build();
  }
  public V1EnvFromSource buildLastEnvFrom() {
    return this.envFrom.get(envFrom.size() - 1).build();
  }
  public V1EnvFromSource buildMatchingEnvFrom(Predicate<V1EnvFromSourceBuilder> predicate) {
    for (V1EnvFromSourceBuilder item: envFrom) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingEnvFrom(Predicate<V1EnvFromSourceBuilder> predicate) {
    for (V1EnvFromSourceBuilder item: envFrom) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withEnvFrom(List<V1EnvFromSource> envFrom) {
    if (this.envFrom != null) { _visitables.get("envFrom").clear();}
    if (envFrom != null) {this.envFrom = new ArrayList(); for (V1EnvFromSource item : envFrom){this.addToEnvFrom(item);}} else { this.envFrom = null;} return (A) this;
  }
  public A withEnvFrom(io.kubernetes.client.openapi.models.V1EnvFromSource... envFrom) {
    if (this.envFrom != null) {this.envFrom.clear(); _visitables.remove("envFrom"); }
    if (envFrom != null) {for (V1EnvFromSource item :envFrom){ this.addToEnvFrom(item);}} return (A) this;
  }
  public Boolean hasEnvFrom() {
    return envFrom != null && !envFrom.isEmpty();
  }
  public V1ContainerFluentImpl.EnvFromNested<A> addNewEnvFrom() {
    return new V1ContainerFluentImpl.EnvFromNestedImpl();
  }
  public V1ContainerFluentImpl.EnvFromNested<A> addNewEnvFromLike(V1EnvFromSource item) {
    return new V1ContainerFluentImpl.EnvFromNestedImpl(-1, item);
  }
  public V1ContainerFluentImpl.EnvFromNested<A> setNewEnvFromLike(int index,V1EnvFromSource item) {
    return new V1ContainerFluentImpl.EnvFromNestedImpl(index, item);
  }
  public V1ContainerFluentImpl.EnvFromNested<A> editEnvFrom(int index) {
    if (envFrom.size() <= index) throw new RuntimeException("Can't edit envFrom. Index exceeds size.");
    return setNewEnvFromLike(index, buildEnvFrom(index));
  }
  public V1ContainerFluentImpl.EnvFromNested<A> editFirstEnvFrom() {
    if (envFrom.size() == 0) throw new RuntimeException("Can't edit first envFrom. The list is empty.");
    return setNewEnvFromLike(0, buildEnvFrom(0));
  }
  public V1ContainerFluentImpl.EnvFromNested<A> editLastEnvFrom() {
    int index = envFrom.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last envFrom. The list is empty.");
    return setNewEnvFromLike(index, buildEnvFrom(index));
  }
  public V1ContainerFluentImpl.EnvFromNested<A> editMatchingEnvFrom(Predicate<V1EnvFromSourceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<envFrom.size();i++) { 
    if (predicate.test(envFrom.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching envFrom. No match found.");
    return setNewEnvFromLike(index, buildEnvFrom(index));
  }
  public String getImage() {
    return this.image;
  }
  public A withImage(String image) {
    this.image=image; return (A) this;
  }
  public Boolean hasImage() {
    return this.image != null;
  }
  public String getImagePullPolicy() {
    return this.imagePullPolicy;
  }
  public A withImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy=imagePullPolicy; return (A) this;
  }
  public Boolean hasImagePullPolicy() {
    return this.imagePullPolicy != null;
  }
  
  /**
   * This method has been deprecated, please use method buildLifecycle instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Lifecycle getLifecycle() {
    return this.lifecycle!=null ?this.lifecycle.build():null;
  }
  public V1Lifecycle buildLifecycle() {
    return this.lifecycle!=null ?this.lifecycle.build():null;
  }
  public A withLifecycle(V1Lifecycle lifecycle) {
    _visitables.get("lifecycle").remove(this.lifecycle);
    if (lifecycle!=null){ this.lifecycle= new V1LifecycleBuilder(lifecycle); _visitables.get("lifecycle").add(this.lifecycle);} else { this.lifecycle = null; _visitables.get("lifecycle").remove(this.lifecycle); } return (A) this;
  }
  public Boolean hasLifecycle() {
    return this.lifecycle != null;
  }
  public V1ContainerFluentImpl.LifecycleNested<A> withNewLifecycle() {
    return new V1ContainerFluentImpl.LifecycleNestedImpl();
  }
  public V1ContainerFluentImpl.LifecycleNested<A> withNewLifecycleLike(V1Lifecycle item) {
    return new V1ContainerFluentImpl.LifecycleNestedImpl(item);
  }
  public V1ContainerFluentImpl.LifecycleNested<A> editLifecycle() {
    return withNewLifecycleLike(getLifecycle());
  }
  public V1ContainerFluentImpl.LifecycleNested<A> editOrNewLifecycle() {
    return withNewLifecycleLike(getLifecycle() != null ? getLifecycle(): new V1LifecycleBuilder().build());
  }
  public V1ContainerFluentImpl.LifecycleNested<A> editOrNewLifecycleLike(V1Lifecycle item) {
    return withNewLifecycleLike(getLifecycle() != null ? getLifecycle(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildLivenessProbe instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Probe getLivenessProbe() {
    return this.livenessProbe!=null ?this.livenessProbe.build():null;
  }
  public V1Probe buildLivenessProbe() {
    return this.livenessProbe!=null ?this.livenessProbe.build():null;
  }
  public A withLivenessProbe(V1Probe livenessProbe) {
    _visitables.get("livenessProbe").remove(this.livenessProbe);
    if (livenessProbe!=null){ this.livenessProbe= new V1ProbeBuilder(livenessProbe); _visitables.get("livenessProbe").add(this.livenessProbe);} else { this.livenessProbe = null; _visitables.get("livenessProbe").remove(this.livenessProbe); } return (A) this;
  }
  public Boolean hasLivenessProbe() {
    return this.livenessProbe != null;
  }
  public V1ContainerFluentImpl.LivenessProbeNested<A> withNewLivenessProbe() {
    return new V1ContainerFluentImpl.LivenessProbeNestedImpl();
  }
  public V1ContainerFluentImpl.LivenessProbeNested<A> withNewLivenessProbeLike(V1Probe item) {
    return new V1ContainerFluentImpl.LivenessProbeNestedImpl(item);
  }
  public V1ContainerFluentImpl.LivenessProbeNested<A> editLivenessProbe() {
    return withNewLivenessProbeLike(getLivenessProbe());
  }
  public V1ContainerFluentImpl.LivenessProbeNested<A> editOrNewLivenessProbe() {
    return withNewLivenessProbeLike(getLivenessProbe() != null ? getLivenessProbe(): new V1ProbeBuilder().build());
  }
  public V1ContainerFluentImpl.LivenessProbeNested<A> editOrNewLivenessProbeLike(V1Probe item) {
    return withNewLivenessProbeLike(getLivenessProbe() != null ? getLivenessProbe(): item);
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public A addToPorts(int index,V1ContainerPort item) {
    if (this.ports == null) {this.ports = new ArrayList<V1ContainerPortBuilder>();}
    V1ContainerPortBuilder builder = new V1ContainerPortBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").add(index, builder); ports.add(index, builder);}
    return (A)this;
  }
  public A setToPorts(int index,V1ContainerPort item) {
    if (this.ports == null) {this.ports = new ArrayList<V1ContainerPortBuilder>();}
    V1ContainerPortBuilder builder = new V1ContainerPortBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").set(index, builder); ports.set(index, builder);}
    return (A)this;
  }
  public A addToPorts(io.kubernetes.client.openapi.models.V1ContainerPort... items) {
    if (this.ports == null) {this.ports = new ArrayList<V1ContainerPortBuilder>();}
    for (V1ContainerPort item : items) {V1ContainerPortBuilder builder = new V1ContainerPortBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  public A addAllToPorts(Collection<V1ContainerPort> items) {
    if (this.ports == null) {this.ports = new ArrayList<V1ContainerPortBuilder>();}
    for (V1ContainerPort item : items) {V1ContainerPortBuilder builder = new V1ContainerPortBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  public A removeFromPorts(io.kubernetes.client.openapi.models.V1ContainerPort... items) {
    for (V1ContainerPort item : items) {V1ContainerPortBuilder builder = new V1ContainerPortBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeAllFromPorts(Collection<V1ContainerPort> items) {
    for (V1ContainerPort item : items) {V1ContainerPortBuilder builder = new V1ContainerPortBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromPorts(Predicate<V1ContainerPortBuilder> predicate) {
    if (ports == null) return (A) this;
    final Iterator<V1ContainerPortBuilder> each = ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      V1ContainerPortBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildPorts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ContainerPort> getPorts() {
    return ports != null ? build(ports) : null;
  }
  public List<V1ContainerPort> buildPorts() {
    return ports != null ? build(ports) : null;
  }
  public V1ContainerPort buildPort(int index) {
    return this.ports.get(index).build();
  }
  public V1ContainerPort buildFirstPort() {
    return this.ports.get(0).build();
  }
  public V1ContainerPort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  public V1ContainerPort buildMatchingPort(Predicate<V1ContainerPortBuilder> predicate) {
    for (V1ContainerPortBuilder item: ports) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingPort(Predicate<V1ContainerPortBuilder> predicate) {
    for (V1ContainerPortBuilder item: ports) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPorts(List<V1ContainerPort> ports) {
    if (this.ports != null) { _visitables.get("ports").clear();}
    if (ports != null) {this.ports = new ArrayList(); for (V1ContainerPort item : ports){this.addToPorts(item);}} else { this.ports = null;} return (A) this;
  }
  public A withPorts(io.kubernetes.client.openapi.models.V1ContainerPort... ports) {
    if (this.ports != null) {this.ports.clear(); _visitables.remove("ports"); }
    if (ports != null) {for (V1ContainerPort item :ports){ this.addToPorts(item);}} return (A) this;
  }
  public Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }
  public V1ContainerFluentImpl.PortsNested<A> addNewPort() {
    return new V1ContainerFluentImpl.PortsNestedImpl();
  }
  public V1ContainerFluentImpl.PortsNested<A> addNewPortLike(V1ContainerPort item) {
    return new V1ContainerFluentImpl.PortsNestedImpl(-1, item);
  }
  public V1ContainerFluentImpl.PortsNested<A> setNewPortLike(int index,V1ContainerPort item) {
    return new V1ContainerFluentImpl.PortsNestedImpl(index, item);
  }
  public V1ContainerFluentImpl.PortsNested<A> editPort(int index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1ContainerFluentImpl.PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }
  public V1ContainerFluentImpl.PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1ContainerFluentImpl.PortsNested<A> editMatchingPort(Predicate<V1ContainerPortBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ports.size();i++) { 
    if (predicate.test(ports.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
    return setNewPortLike(index, buildPort(index));
  }
  
  /**
   * This method has been deprecated, please use method buildReadinessProbe instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Probe getReadinessProbe() {
    return this.readinessProbe!=null ?this.readinessProbe.build():null;
  }
  public V1Probe buildReadinessProbe() {
    return this.readinessProbe!=null ?this.readinessProbe.build():null;
  }
  public A withReadinessProbe(V1Probe readinessProbe) {
    _visitables.get("readinessProbe").remove(this.readinessProbe);
    if (readinessProbe!=null){ this.readinessProbe= new V1ProbeBuilder(readinessProbe); _visitables.get("readinessProbe").add(this.readinessProbe);} else { this.readinessProbe = null; _visitables.get("readinessProbe").remove(this.readinessProbe); } return (A) this;
  }
  public Boolean hasReadinessProbe() {
    return this.readinessProbe != null;
  }
  public V1ContainerFluentImpl.ReadinessProbeNested<A> withNewReadinessProbe() {
    return new V1ContainerFluentImpl.ReadinessProbeNestedImpl();
  }
  public V1ContainerFluentImpl.ReadinessProbeNested<A> withNewReadinessProbeLike(V1Probe item) {
    return new V1ContainerFluentImpl.ReadinessProbeNestedImpl(item);
  }
  public V1ContainerFluentImpl.ReadinessProbeNested<A> editReadinessProbe() {
    return withNewReadinessProbeLike(getReadinessProbe());
  }
  public V1ContainerFluentImpl.ReadinessProbeNested<A> editOrNewReadinessProbe() {
    return withNewReadinessProbeLike(getReadinessProbe() != null ? getReadinessProbe(): new V1ProbeBuilder().build());
  }
  public V1ContainerFluentImpl.ReadinessProbeNested<A> editOrNewReadinessProbeLike(V1Probe item) {
    return withNewReadinessProbeLike(getReadinessProbe() != null ? getReadinessProbe(): item);
  }
  public A addToResizePolicy(int index,V1ContainerResizePolicy item) {
    if (this.resizePolicy == null) {this.resizePolicy = new ArrayList<V1ContainerResizePolicyBuilder>();}
    V1ContainerResizePolicyBuilder builder = new V1ContainerResizePolicyBuilder(item);
    if (index < 0 || index >= resizePolicy.size()) { _visitables.get("resizePolicy").add(builder); resizePolicy.add(builder); } else { _visitables.get("resizePolicy").add(index, builder); resizePolicy.add(index, builder);}
    return (A)this;
  }
  public A setToResizePolicy(int index,V1ContainerResizePolicy item) {
    if (this.resizePolicy == null) {this.resizePolicy = new ArrayList<V1ContainerResizePolicyBuilder>();}
    V1ContainerResizePolicyBuilder builder = new V1ContainerResizePolicyBuilder(item);
    if (index < 0 || index >= resizePolicy.size()) { _visitables.get("resizePolicy").add(builder); resizePolicy.add(builder); } else { _visitables.get("resizePolicy").set(index, builder); resizePolicy.set(index, builder);}
    return (A)this;
  }
  public A addToResizePolicy(io.kubernetes.client.openapi.models.V1ContainerResizePolicy... items) {
    if (this.resizePolicy == null) {this.resizePolicy = new ArrayList<V1ContainerResizePolicyBuilder>();}
    for (V1ContainerResizePolicy item : items) {V1ContainerResizePolicyBuilder builder = new V1ContainerResizePolicyBuilder(item);_visitables.get("resizePolicy").add(builder);this.resizePolicy.add(builder);} return (A)this;
  }
  public A addAllToResizePolicy(Collection<V1ContainerResizePolicy> items) {
    if (this.resizePolicy == null) {this.resizePolicy = new ArrayList<V1ContainerResizePolicyBuilder>();}
    for (V1ContainerResizePolicy item : items) {V1ContainerResizePolicyBuilder builder = new V1ContainerResizePolicyBuilder(item);_visitables.get("resizePolicy").add(builder);this.resizePolicy.add(builder);} return (A)this;
  }
  public A removeFromResizePolicy(io.kubernetes.client.openapi.models.V1ContainerResizePolicy... items) {
    for (V1ContainerResizePolicy item : items) {V1ContainerResizePolicyBuilder builder = new V1ContainerResizePolicyBuilder(item);_visitables.get("resizePolicy").remove(builder);if (this.resizePolicy != null) {this.resizePolicy.remove(builder);}} return (A)this;
  }
  public A removeAllFromResizePolicy(Collection<V1ContainerResizePolicy> items) {
    for (V1ContainerResizePolicy item : items) {V1ContainerResizePolicyBuilder builder = new V1ContainerResizePolicyBuilder(item);_visitables.get("resizePolicy").remove(builder);if (this.resizePolicy != null) {this.resizePolicy.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromResizePolicy(Predicate<V1ContainerResizePolicyBuilder> predicate) {
    if (resizePolicy == null) return (A) this;
    final Iterator<V1ContainerResizePolicyBuilder> each = resizePolicy.iterator();
    final List visitables = _visitables.get("resizePolicy");
    while (each.hasNext()) {
      V1ContainerResizePolicyBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildResizePolicy instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ContainerResizePolicy> getResizePolicy() {
    return resizePolicy != null ? build(resizePolicy) : null;
  }
  public List<V1ContainerResizePolicy> buildResizePolicy() {
    return resizePolicy != null ? build(resizePolicy) : null;
  }
  public V1ContainerResizePolicy buildResizePolicy(int index) {
    return this.resizePolicy.get(index).build();
  }
  public V1ContainerResizePolicy buildFirstResizePolicy() {
    return this.resizePolicy.get(0).build();
  }
  public V1ContainerResizePolicy buildLastResizePolicy() {
    return this.resizePolicy.get(resizePolicy.size() - 1).build();
  }
  public V1ContainerResizePolicy buildMatchingResizePolicy(Predicate<V1ContainerResizePolicyBuilder> predicate) {
    for (V1ContainerResizePolicyBuilder item: resizePolicy) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingResizePolicy(Predicate<V1ContainerResizePolicyBuilder> predicate) {
    for (V1ContainerResizePolicyBuilder item: resizePolicy) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withResizePolicy(List<V1ContainerResizePolicy> resizePolicy) {
    if (this.resizePolicy != null) { _visitables.get("resizePolicy").clear();}
    if (resizePolicy != null) {this.resizePolicy = new ArrayList(); for (V1ContainerResizePolicy item : resizePolicy){this.addToResizePolicy(item);}} else { this.resizePolicy = null;} return (A) this;
  }
  public A withResizePolicy(io.kubernetes.client.openapi.models.V1ContainerResizePolicy... resizePolicy) {
    if (this.resizePolicy != null) {this.resizePolicy.clear(); _visitables.remove("resizePolicy"); }
    if (resizePolicy != null) {for (V1ContainerResizePolicy item :resizePolicy){ this.addToResizePolicy(item);}} return (A) this;
  }
  public Boolean hasResizePolicy() {
    return resizePolicy != null && !resizePolicy.isEmpty();
  }
  public V1ContainerFluentImpl.ResizePolicyNested<A> addNewResizePolicy() {
    return new V1ContainerFluentImpl.ResizePolicyNestedImpl();
  }
  public V1ContainerFluentImpl.ResizePolicyNested<A> addNewResizePolicyLike(V1ContainerResizePolicy item) {
    return new V1ContainerFluentImpl.ResizePolicyNestedImpl(-1, item);
  }
  public V1ContainerFluentImpl.ResizePolicyNested<A> setNewResizePolicyLike(int index,V1ContainerResizePolicy item) {
    return new V1ContainerFluentImpl.ResizePolicyNestedImpl(index, item);
  }
  public V1ContainerFluentImpl.ResizePolicyNested<A> editResizePolicy(int index) {
    if (resizePolicy.size() <= index) throw new RuntimeException("Can't edit resizePolicy. Index exceeds size.");
    return setNewResizePolicyLike(index, buildResizePolicy(index));
  }
  public V1ContainerFluentImpl.ResizePolicyNested<A> editFirstResizePolicy() {
    if (resizePolicy.size() == 0) throw new RuntimeException("Can't edit first resizePolicy. The list is empty.");
    return setNewResizePolicyLike(0, buildResizePolicy(0));
  }
  public V1ContainerFluentImpl.ResizePolicyNested<A> editLastResizePolicy() {
    int index = resizePolicy.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resizePolicy. The list is empty.");
    return setNewResizePolicyLike(index, buildResizePolicy(index));
  }
  public V1ContainerFluentImpl.ResizePolicyNested<A> editMatchingResizePolicy(Predicate<V1ContainerResizePolicyBuilder> predicate) {
    int index = -1;
    for (int i=0;i<resizePolicy.size();i++) { 
    if (predicate.test(resizePolicy.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching resizePolicy. No match found.");
    return setNewResizePolicyLike(index, buildResizePolicy(index));
  }
  
  /**
   * This method has been deprecated, please use method buildResources instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceRequirements getResources() {
    return this.resources!=null ?this.resources.build():null;
  }
  public V1ResourceRequirements buildResources() {
    return this.resources!=null ?this.resources.build():null;
  }
  public A withResources(V1ResourceRequirements resources) {
    _visitables.get("resources").remove(this.resources);
    if (resources!=null){ this.resources= new V1ResourceRequirementsBuilder(resources); _visitables.get("resources").add(this.resources);} else { this.resources = null; _visitables.get("resources").remove(this.resources); } return (A) this;
  }
  public Boolean hasResources() {
    return this.resources != null;
  }
  public V1ContainerFluentImpl.ResourcesNested<A> withNewResources() {
    return new V1ContainerFluentImpl.ResourcesNestedImpl();
  }
  public V1ContainerFluentImpl.ResourcesNested<A> withNewResourcesLike(V1ResourceRequirements item) {
    return new V1ContainerFluentImpl.ResourcesNestedImpl(item);
  }
  public V1ContainerFluentImpl.ResourcesNested<A> editResources() {
    return withNewResourcesLike(getResources());
  }
  public V1ContainerFluentImpl.ResourcesNested<A> editOrNewResources() {
    return withNewResourcesLike(getResources() != null ? getResources(): new V1ResourceRequirementsBuilder().build());
  }
  public V1ContainerFluentImpl.ResourcesNested<A> editOrNewResourcesLike(V1ResourceRequirements item) {
    return withNewResourcesLike(getResources() != null ? getResources(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSecurityContext instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecurityContext getSecurityContext() {
    return this.securityContext!=null ?this.securityContext.build():null;
  }
  public V1SecurityContext buildSecurityContext() {
    return this.securityContext!=null ?this.securityContext.build():null;
  }
  public A withSecurityContext(V1SecurityContext securityContext) {
    _visitables.get("securityContext").remove(this.securityContext);
    if (securityContext!=null){ this.securityContext= new V1SecurityContextBuilder(securityContext); _visitables.get("securityContext").add(this.securityContext);} else { this.securityContext = null; _visitables.get("securityContext").remove(this.securityContext); } return (A) this;
  }
  public Boolean hasSecurityContext() {
    return this.securityContext != null;
  }
  public V1ContainerFluentImpl.SecurityContextNested<A> withNewSecurityContext() {
    return new V1ContainerFluentImpl.SecurityContextNestedImpl();
  }
  public V1ContainerFluentImpl.SecurityContextNested<A> withNewSecurityContextLike(V1SecurityContext item) {
    return new V1ContainerFluentImpl.SecurityContextNestedImpl(item);
  }
  public V1ContainerFluentImpl.SecurityContextNested<A> editSecurityContext() {
    return withNewSecurityContextLike(getSecurityContext());
  }
  public V1ContainerFluentImpl.SecurityContextNested<A> editOrNewSecurityContext() {
    return withNewSecurityContextLike(getSecurityContext() != null ? getSecurityContext(): new V1SecurityContextBuilder().build());
  }
  public V1ContainerFluentImpl.SecurityContextNested<A> editOrNewSecurityContextLike(V1SecurityContext item) {
    return withNewSecurityContextLike(getSecurityContext() != null ? getSecurityContext(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStartupProbe instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Probe getStartupProbe() {
    return this.startupProbe!=null ?this.startupProbe.build():null;
  }
  public V1Probe buildStartupProbe() {
    return this.startupProbe!=null ?this.startupProbe.build():null;
  }
  public A withStartupProbe(V1Probe startupProbe) {
    _visitables.get("startupProbe").remove(this.startupProbe);
    if (startupProbe!=null){ this.startupProbe= new V1ProbeBuilder(startupProbe); _visitables.get("startupProbe").add(this.startupProbe);} else { this.startupProbe = null; _visitables.get("startupProbe").remove(this.startupProbe); } return (A) this;
  }
  public Boolean hasStartupProbe() {
    return this.startupProbe != null;
  }
  public V1ContainerFluentImpl.StartupProbeNested<A> withNewStartupProbe() {
    return new V1ContainerFluentImpl.StartupProbeNestedImpl();
  }
  public V1ContainerFluentImpl.StartupProbeNested<A> withNewStartupProbeLike(V1Probe item) {
    return new V1ContainerFluentImpl.StartupProbeNestedImpl(item);
  }
  public V1ContainerFluentImpl.StartupProbeNested<A> editStartupProbe() {
    return withNewStartupProbeLike(getStartupProbe());
  }
  public V1ContainerFluentImpl.StartupProbeNested<A> editOrNewStartupProbe() {
    return withNewStartupProbeLike(getStartupProbe() != null ? getStartupProbe(): new V1ProbeBuilder().build());
  }
  public V1ContainerFluentImpl.StartupProbeNested<A> editOrNewStartupProbeLike(V1Probe item) {
    return withNewStartupProbeLike(getStartupProbe() != null ? getStartupProbe(): item);
  }
  public Boolean getStdin() {
    return this.stdin;
  }
  public A withStdin(Boolean stdin) {
    this.stdin=stdin; return (A) this;
  }
  public Boolean hasStdin() {
    return this.stdin != null;
  }
  public Boolean getStdinOnce() {
    return this.stdinOnce;
  }
  public A withStdinOnce(Boolean stdinOnce) {
    this.stdinOnce=stdinOnce; return (A) this;
  }
  public Boolean hasStdinOnce() {
    return this.stdinOnce != null;
  }
  public String getTerminationMessagePath() {
    return this.terminationMessagePath;
  }
  public A withTerminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath=terminationMessagePath; return (A) this;
  }
  public Boolean hasTerminationMessagePath() {
    return this.terminationMessagePath != null;
  }
  public String getTerminationMessagePolicy() {
    return this.terminationMessagePolicy;
  }
  public A withTerminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy=terminationMessagePolicy; return (A) this;
  }
  public Boolean hasTerminationMessagePolicy() {
    return this.terminationMessagePolicy != null;
  }
  public Boolean getTty() {
    return this.tty;
  }
  public A withTty(Boolean tty) {
    this.tty=tty; return (A) this;
  }
  public Boolean hasTty() {
    return this.tty != null;
  }
  public A addToVolumeDevices(int index,V1VolumeDevice item) {
    if (this.volumeDevices == null) {this.volumeDevices = new ArrayList<V1VolumeDeviceBuilder>();}
    V1VolumeDeviceBuilder builder = new V1VolumeDeviceBuilder(item);
    if (index < 0 || index >= volumeDevices.size()) { _visitables.get("volumeDevices").add(builder); volumeDevices.add(builder); } else { _visitables.get("volumeDevices").add(index, builder); volumeDevices.add(index, builder);}
    return (A)this;
  }
  public A setToVolumeDevices(int index,V1VolumeDevice item) {
    if (this.volumeDevices == null) {this.volumeDevices = new ArrayList<V1VolumeDeviceBuilder>();}
    V1VolumeDeviceBuilder builder = new V1VolumeDeviceBuilder(item);
    if (index < 0 || index >= volumeDevices.size()) { _visitables.get("volumeDevices").add(builder); volumeDevices.add(builder); } else { _visitables.get("volumeDevices").set(index, builder); volumeDevices.set(index, builder);}
    return (A)this;
  }
  public A addToVolumeDevices(io.kubernetes.client.openapi.models.V1VolumeDevice... items) {
    if (this.volumeDevices == null) {this.volumeDevices = new ArrayList<V1VolumeDeviceBuilder>();}
    for (V1VolumeDevice item : items) {V1VolumeDeviceBuilder builder = new V1VolumeDeviceBuilder(item);_visitables.get("volumeDevices").add(builder);this.volumeDevices.add(builder);} return (A)this;
  }
  public A addAllToVolumeDevices(Collection<V1VolumeDevice> items) {
    if (this.volumeDevices == null) {this.volumeDevices = new ArrayList<V1VolumeDeviceBuilder>();}
    for (V1VolumeDevice item : items) {V1VolumeDeviceBuilder builder = new V1VolumeDeviceBuilder(item);_visitables.get("volumeDevices").add(builder);this.volumeDevices.add(builder);} return (A)this;
  }
  public A removeFromVolumeDevices(io.kubernetes.client.openapi.models.V1VolumeDevice... items) {
    for (V1VolumeDevice item : items) {V1VolumeDeviceBuilder builder = new V1VolumeDeviceBuilder(item);_visitables.get("volumeDevices").remove(builder);if (this.volumeDevices != null) {this.volumeDevices.remove(builder);}} return (A)this;
  }
  public A removeAllFromVolumeDevices(Collection<V1VolumeDevice> items) {
    for (V1VolumeDevice item : items) {V1VolumeDeviceBuilder builder = new V1VolumeDeviceBuilder(item);_visitables.get("volumeDevices").remove(builder);if (this.volumeDevices != null) {this.volumeDevices.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromVolumeDevices(Predicate<V1VolumeDeviceBuilder> predicate) {
    if (volumeDevices == null) return (A) this;
    final Iterator<V1VolumeDeviceBuilder> each = volumeDevices.iterator();
    final List visitables = _visitables.get("volumeDevices");
    while (each.hasNext()) {
      V1VolumeDeviceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildVolumeDevices instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1VolumeDevice> getVolumeDevices() {
    return volumeDevices != null ? build(volumeDevices) : null;
  }
  public List<V1VolumeDevice> buildVolumeDevices() {
    return volumeDevices != null ? build(volumeDevices) : null;
  }
  public V1VolumeDevice buildVolumeDevice(int index) {
    return this.volumeDevices.get(index).build();
  }
  public V1VolumeDevice buildFirstVolumeDevice() {
    return this.volumeDevices.get(0).build();
  }
  public V1VolumeDevice buildLastVolumeDevice() {
    return this.volumeDevices.get(volumeDevices.size() - 1).build();
  }
  public V1VolumeDevice buildMatchingVolumeDevice(Predicate<V1VolumeDeviceBuilder> predicate) {
    for (V1VolumeDeviceBuilder item: volumeDevices) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingVolumeDevice(Predicate<V1VolumeDeviceBuilder> predicate) {
    for (V1VolumeDeviceBuilder item: volumeDevices) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withVolumeDevices(List<V1VolumeDevice> volumeDevices) {
    if (this.volumeDevices != null) { _visitables.get("volumeDevices").clear();}
    if (volumeDevices != null) {this.volumeDevices = new ArrayList(); for (V1VolumeDevice item : volumeDevices){this.addToVolumeDevices(item);}} else { this.volumeDevices = null;} return (A) this;
  }
  public A withVolumeDevices(io.kubernetes.client.openapi.models.V1VolumeDevice... volumeDevices) {
    if (this.volumeDevices != null) {this.volumeDevices.clear(); _visitables.remove("volumeDevices"); }
    if (volumeDevices != null) {for (V1VolumeDevice item :volumeDevices){ this.addToVolumeDevices(item);}} return (A) this;
  }
  public Boolean hasVolumeDevices() {
    return volumeDevices != null && !volumeDevices.isEmpty();
  }
  public V1ContainerFluentImpl.VolumeDevicesNested<A> addNewVolumeDevice() {
    return new V1ContainerFluentImpl.VolumeDevicesNestedImpl();
  }
  public V1ContainerFluentImpl.VolumeDevicesNested<A> addNewVolumeDeviceLike(V1VolumeDevice item) {
    return new V1ContainerFluentImpl.VolumeDevicesNestedImpl(-1, item);
  }
  public V1ContainerFluentImpl.VolumeDevicesNested<A> setNewVolumeDeviceLike(int index,V1VolumeDevice item) {
    return new V1ContainerFluentImpl.VolumeDevicesNestedImpl(index, item);
  }
  public V1ContainerFluentImpl.VolumeDevicesNested<A> editVolumeDevice(int index) {
    if (volumeDevices.size() <= index) throw new RuntimeException("Can't edit volumeDevices. Index exceeds size.");
    return setNewVolumeDeviceLike(index, buildVolumeDevice(index));
  }
  public V1ContainerFluentImpl.VolumeDevicesNested<A> editFirstVolumeDevice() {
    if (volumeDevices.size() == 0) throw new RuntimeException("Can't edit first volumeDevices. The list is empty.");
    return setNewVolumeDeviceLike(0, buildVolumeDevice(0));
  }
  public V1ContainerFluentImpl.VolumeDevicesNested<A> editLastVolumeDevice() {
    int index = volumeDevices.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumeDevices. The list is empty.");
    return setNewVolumeDeviceLike(index, buildVolumeDevice(index));
  }
  public V1ContainerFluentImpl.VolumeDevicesNested<A> editMatchingVolumeDevice(Predicate<V1VolumeDeviceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<volumeDevices.size();i++) { 
    if (predicate.test(volumeDevices.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching volumeDevices. No match found.");
    return setNewVolumeDeviceLike(index, buildVolumeDevice(index));
  }
  public A addToVolumeMounts(int index,V1VolumeMount item) {
    if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<V1VolumeMountBuilder>();}
    V1VolumeMountBuilder builder = new V1VolumeMountBuilder(item);
    if (index < 0 || index >= volumeMounts.size()) { _visitables.get("volumeMounts").add(builder); volumeMounts.add(builder); } else { _visitables.get("volumeMounts").add(index, builder); volumeMounts.add(index, builder);}
    return (A)this;
  }
  public A setToVolumeMounts(int index,V1VolumeMount item) {
    if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<V1VolumeMountBuilder>();}
    V1VolumeMountBuilder builder = new V1VolumeMountBuilder(item);
    if (index < 0 || index >= volumeMounts.size()) { _visitables.get("volumeMounts").add(builder); volumeMounts.add(builder); } else { _visitables.get("volumeMounts").set(index, builder); volumeMounts.set(index, builder);}
    return (A)this;
  }
  public A addToVolumeMounts(io.kubernetes.client.openapi.models.V1VolumeMount... items) {
    if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<V1VolumeMountBuilder>();}
    for (V1VolumeMount item : items) {V1VolumeMountBuilder builder = new V1VolumeMountBuilder(item);_visitables.get("volumeMounts").add(builder);this.volumeMounts.add(builder);} return (A)this;
  }
  public A addAllToVolumeMounts(Collection<V1VolumeMount> items) {
    if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<V1VolumeMountBuilder>();}
    for (V1VolumeMount item : items) {V1VolumeMountBuilder builder = new V1VolumeMountBuilder(item);_visitables.get("volumeMounts").add(builder);this.volumeMounts.add(builder);} return (A)this;
  }
  public A removeFromVolumeMounts(io.kubernetes.client.openapi.models.V1VolumeMount... items) {
    for (V1VolumeMount item : items) {V1VolumeMountBuilder builder = new V1VolumeMountBuilder(item);_visitables.get("volumeMounts").remove(builder);if (this.volumeMounts != null) {this.volumeMounts.remove(builder);}} return (A)this;
  }
  public A removeAllFromVolumeMounts(Collection<V1VolumeMount> items) {
    for (V1VolumeMount item : items) {V1VolumeMountBuilder builder = new V1VolumeMountBuilder(item);_visitables.get("volumeMounts").remove(builder);if (this.volumeMounts != null) {this.volumeMounts.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromVolumeMounts(Predicate<V1VolumeMountBuilder> predicate) {
    if (volumeMounts == null) return (A) this;
    final Iterator<V1VolumeMountBuilder> each = volumeMounts.iterator();
    final List visitables = _visitables.get("volumeMounts");
    while (each.hasNext()) {
      V1VolumeMountBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildVolumeMounts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1VolumeMount> getVolumeMounts() {
    return volumeMounts != null ? build(volumeMounts) : null;
  }
  public List<V1VolumeMount> buildVolumeMounts() {
    return volumeMounts != null ? build(volumeMounts) : null;
  }
  public V1VolumeMount buildVolumeMount(int index) {
    return this.volumeMounts.get(index).build();
  }
  public V1VolumeMount buildFirstVolumeMount() {
    return this.volumeMounts.get(0).build();
  }
  public V1VolumeMount buildLastVolumeMount() {
    return this.volumeMounts.get(volumeMounts.size() - 1).build();
  }
  public V1VolumeMount buildMatchingVolumeMount(Predicate<V1VolumeMountBuilder> predicate) {
    for (V1VolumeMountBuilder item: volumeMounts) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingVolumeMount(Predicate<V1VolumeMountBuilder> predicate) {
    for (V1VolumeMountBuilder item: volumeMounts) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withVolumeMounts(List<V1VolumeMount> volumeMounts) {
    if (this.volumeMounts != null) { _visitables.get("volumeMounts").clear();}
    if (volumeMounts != null) {this.volumeMounts = new ArrayList(); for (V1VolumeMount item : volumeMounts){this.addToVolumeMounts(item);}} else { this.volumeMounts = null;} return (A) this;
  }
  public A withVolumeMounts(io.kubernetes.client.openapi.models.V1VolumeMount... volumeMounts) {
    if (this.volumeMounts != null) {this.volumeMounts.clear(); _visitables.remove("volumeMounts"); }
    if (volumeMounts != null) {for (V1VolumeMount item :volumeMounts){ this.addToVolumeMounts(item);}} return (A) this;
  }
  public Boolean hasVolumeMounts() {
    return volumeMounts != null && !volumeMounts.isEmpty();
  }
  public V1ContainerFluentImpl.VolumeMountsNested<A> addNewVolumeMount() {
    return new V1ContainerFluentImpl.VolumeMountsNestedImpl();
  }
  public V1ContainerFluentImpl.VolumeMountsNested<A> addNewVolumeMountLike(V1VolumeMount item) {
    return new V1ContainerFluentImpl.VolumeMountsNestedImpl(-1, item);
  }
  public V1ContainerFluentImpl.VolumeMountsNested<A> setNewVolumeMountLike(int index,V1VolumeMount item) {
    return new V1ContainerFluentImpl.VolumeMountsNestedImpl(index, item);
  }
  public V1ContainerFluentImpl.VolumeMountsNested<A> editVolumeMount(int index) {
    if (volumeMounts.size() <= index) throw new RuntimeException("Can't edit volumeMounts. Index exceeds size.");
    return setNewVolumeMountLike(index, buildVolumeMount(index));
  }
  public V1ContainerFluentImpl.VolumeMountsNested<A> editFirstVolumeMount() {
    if (volumeMounts.size() == 0) throw new RuntimeException("Can't edit first volumeMounts. The list is empty.");
    return setNewVolumeMountLike(0, buildVolumeMount(0));
  }
  public V1ContainerFluentImpl.VolumeMountsNested<A> editLastVolumeMount() {
    int index = volumeMounts.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumeMounts. The list is empty.");
    return setNewVolumeMountLike(index, buildVolumeMount(index));
  }
  public V1ContainerFluentImpl.VolumeMountsNested<A> editMatchingVolumeMount(Predicate<V1VolumeMountBuilder> predicate) {
    int index = -1;
    for (int i=0;i<volumeMounts.size();i++) { 
    if (predicate.test(volumeMounts.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching volumeMounts. No match found.");
    return setNewVolumeMountLike(index, buildVolumeMount(index));
  }
  public String getWorkingDir() {
    return this.workingDir;
  }
  public A withWorkingDir(String workingDir) {
    this.workingDir=workingDir; return (A) this;
  }
  public Boolean hasWorkingDir() {
    return this.workingDir != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ContainerFluentImpl that = (V1ContainerFluentImpl) o;
    if (!java.util.Objects.equals(args, that.args)) return false;

    if (!java.util.Objects.equals(command, that.command)) return false;

    if (!java.util.Objects.equals(env, that.env)) return false;

    if (!java.util.Objects.equals(envFrom, that.envFrom)) return false;

    if (!java.util.Objects.equals(image, that.image)) return false;

    if (!java.util.Objects.equals(imagePullPolicy, that.imagePullPolicy)) return false;

    if (!java.util.Objects.equals(lifecycle, that.lifecycle)) return false;

    if (!java.util.Objects.equals(livenessProbe, that.livenessProbe)) return false;

    if (!java.util.Objects.equals(name, that.name)) return false;

    if (!java.util.Objects.equals(ports, that.ports)) return false;

    if (!java.util.Objects.equals(readinessProbe, that.readinessProbe)) return false;

    if (!java.util.Objects.equals(resizePolicy, that.resizePolicy)) return false;

    if (!java.util.Objects.equals(resources, that.resources)) return false;

    if (!java.util.Objects.equals(securityContext, that.securityContext)) return false;

    if (!java.util.Objects.equals(startupProbe, that.startupProbe)) return false;

    if (!java.util.Objects.equals(stdin, that.stdin)) return false;

    if (!java.util.Objects.equals(stdinOnce, that.stdinOnce)) return false;

    if (!java.util.Objects.equals(terminationMessagePath, that.terminationMessagePath)) return false;

    if (!java.util.Objects.equals(terminationMessagePolicy, that.terminationMessagePolicy)) return false;

    if (!java.util.Objects.equals(tty, that.tty)) return false;

    if (!java.util.Objects.equals(volumeDevices, that.volumeDevices)) return false;

    if (!java.util.Objects.equals(volumeMounts, that.volumeMounts)) return false;

    if (!java.util.Objects.equals(workingDir, that.workingDir)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(args,  command,  env,  envFrom,  image,  imagePullPolicy,  lifecycle,  livenessProbe,  name,  ports,  readinessProbe,  resizePolicy,  resources,  securityContext,  startupProbe,  stdin,  stdinOnce,  terminationMessagePath,  terminationMessagePolicy,  tty,  volumeDevices,  volumeMounts,  workingDir,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (args != null && !args.isEmpty()) { sb.append("args:"); sb.append(args + ","); }
    if (command != null && !command.isEmpty()) { sb.append("command:"); sb.append(command + ","); }
    if (env != null) { sb.append("env:"); sb.append(env + ","); }
    if (envFrom != null) { sb.append("envFrom:"); sb.append(envFrom + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (imagePullPolicy != null) { sb.append("imagePullPolicy:"); sb.append(imagePullPolicy + ","); }
    if (lifecycle != null) { sb.append("lifecycle:"); sb.append(lifecycle + ","); }
    if (livenessProbe != null) { sb.append("livenessProbe:"); sb.append(livenessProbe + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (ports != null) { sb.append("ports:"); sb.append(ports + ","); }
    if (readinessProbe != null) { sb.append("readinessProbe:"); sb.append(readinessProbe + ","); }
    if (resizePolicy != null) { sb.append("resizePolicy:"); sb.append(resizePolicy + ","); }
    if (resources != null) { sb.append("resources:"); sb.append(resources + ","); }
    if (securityContext != null) { sb.append("securityContext:"); sb.append(securityContext + ","); }
    if (startupProbe != null) { sb.append("startupProbe:"); sb.append(startupProbe + ","); }
    if (stdin != null) { sb.append("stdin:"); sb.append(stdin + ","); }
    if (stdinOnce != null) { sb.append("stdinOnce:"); sb.append(stdinOnce + ","); }
    if (terminationMessagePath != null) { sb.append("terminationMessagePath:"); sb.append(terminationMessagePath + ","); }
    if (terminationMessagePolicy != null) { sb.append("terminationMessagePolicy:"); sb.append(terminationMessagePolicy + ","); }
    if (tty != null) { sb.append("tty:"); sb.append(tty + ","); }
    if (volumeDevices != null) { sb.append("volumeDevices:"); sb.append(volumeDevices + ","); }
    if (volumeMounts != null) { sb.append("volumeMounts:"); sb.append(volumeMounts + ","); }
    if (workingDir != null) { sb.append("workingDir:"); sb.append(workingDir); }
    sb.append("}");
    return sb.toString();
  }
  public A withStdin() {
    return withStdin(true);
  }
  public A withStdinOnce() {
    return withStdinOnce(true);
  }
  public A withTty() {
    return withTty(true);
  }
  class EnvNestedImpl<N> extends V1EnvVarFluentImpl<V1ContainerFluentImpl.EnvNested<N>> implements V1ContainerFluentImpl.EnvNested<N>,Nested<N>{
    EnvNestedImpl(int index,V1EnvVar item) {
      this.index = index;
      this.builder = new V1EnvVarBuilder(this, item);
    }
    EnvNestedImpl() {
      this.index = -1;
      this.builder = new V1EnvVarBuilder(this);
    }
    V1EnvVarBuilder builder;
    int index;
    public N and() {
      return (N) V1ContainerFluentImpl.this.setToEnv(index,builder.build());
    }
    public N endEnv() {
      return and();
    }
    
  }
  class EnvFromNestedImpl<N> extends V1EnvFromSourceFluentImpl<V1ContainerFluentImpl.EnvFromNested<N>> implements V1ContainerFluentImpl.EnvFromNested<N>,Nested<N>{
    EnvFromNestedImpl(int index,V1EnvFromSource item) {
      this.index = index;
      this.builder = new V1EnvFromSourceBuilder(this, item);
    }
    EnvFromNestedImpl() {
      this.index = -1;
      this.builder = new V1EnvFromSourceBuilder(this);
    }
    V1EnvFromSourceBuilder builder;
    int index;
    public N and() {
      return (N) V1ContainerFluentImpl.this.setToEnvFrom(index,builder.build());
    }
    public N endEnvFrom() {
      return and();
    }
    
  }
  class LifecycleNestedImpl<N> extends V1LifecycleFluentImpl<V1ContainerFluentImpl.LifecycleNested<N>> implements V1ContainerFluentImpl.LifecycleNested<N>,Nested<N>{
    LifecycleNestedImpl(V1Lifecycle item) {
      this.builder = new V1LifecycleBuilder(this, item);
    }
    LifecycleNestedImpl() {
      this.builder = new V1LifecycleBuilder(this);
    }
    V1LifecycleBuilder builder;
    public N and() {
      return (N) V1ContainerFluentImpl.this.withLifecycle(builder.build());
    }
    public N endLifecycle() {
      return and();
    }
    
  }
  class LivenessProbeNestedImpl<N> extends V1ProbeFluentImpl<V1ContainerFluentImpl.LivenessProbeNested<N>> implements V1ContainerFluentImpl.LivenessProbeNested<N>,Nested<N>{
    LivenessProbeNestedImpl(V1Probe item) {
      this.builder = new V1ProbeBuilder(this, item);
    }
    LivenessProbeNestedImpl() {
      this.builder = new V1ProbeBuilder(this);
    }
    V1ProbeBuilder builder;
    public N and() {
      return (N) V1ContainerFluentImpl.this.withLivenessProbe(builder.build());
    }
    public N endLivenessProbe() {
      return and();
    }
    
  }
  class PortsNestedImpl<N> extends V1ContainerPortFluentImpl<V1ContainerFluentImpl.PortsNested<N>> implements V1ContainerFluentImpl.PortsNested<N>,Nested<N>{
    PortsNestedImpl(int index,V1ContainerPort item) {
      this.index = index;
      this.builder = new V1ContainerPortBuilder(this, item);
    }
    PortsNestedImpl() {
      this.index = -1;
      this.builder = new V1ContainerPortBuilder(this);
    }
    V1ContainerPortBuilder builder;
    int index;
    public N and() {
      return (N) V1ContainerFluentImpl.this.setToPorts(index,builder.build());
    }
    public N endPort() {
      return and();
    }
    
  }
  class ReadinessProbeNestedImpl<N> extends V1ProbeFluentImpl<V1ContainerFluentImpl.ReadinessProbeNested<N>> implements V1ContainerFluentImpl.ReadinessProbeNested<N>,Nested<N>{
    ReadinessProbeNestedImpl(V1Probe item) {
      this.builder = new V1ProbeBuilder(this, item);
    }
    ReadinessProbeNestedImpl() {
      this.builder = new V1ProbeBuilder(this);
    }
    V1ProbeBuilder builder;
    public N and() {
      return (N) V1ContainerFluentImpl.this.withReadinessProbe(builder.build());
    }
    public N endReadinessProbe() {
      return and();
    }
    
  }
  class ResizePolicyNestedImpl<N> extends V1ContainerResizePolicyFluentImpl<V1ContainerFluentImpl.ResizePolicyNested<N>> implements V1ContainerFluentImpl.ResizePolicyNested<N>,Nested<N>{
    ResizePolicyNestedImpl(int index,V1ContainerResizePolicy item) {
      this.index = index;
      this.builder = new V1ContainerResizePolicyBuilder(this, item);
    }
    ResizePolicyNestedImpl() {
      this.index = -1;
      this.builder = new V1ContainerResizePolicyBuilder(this);
    }
    V1ContainerResizePolicyBuilder builder;
    int index;
    public N and() {
      return (N) V1ContainerFluentImpl.this.setToResizePolicy(index,builder.build());
    }
    public N endResizePolicy() {
      return and();
    }
    
  }
  class ResourcesNestedImpl<N> extends V1ResourceRequirementsFluentImpl<V1ContainerFluentImpl.ResourcesNested<N>> implements V1ContainerFluentImpl.ResourcesNested<N>,Nested<N>{
    ResourcesNestedImpl(V1ResourceRequirements item) {
      this.builder = new V1ResourceRequirementsBuilder(this, item);
    }
    ResourcesNestedImpl() {
      this.builder = new V1ResourceRequirementsBuilder(this);
    }
    V1ResourceRequirementsBuilder builder;
    public N and() {
      return (N) V1ContainerFluentImpl.this.withResources(builder.build());
    }
    public N endResources() {
      return and();
    }
    
  }
  class SecurityContextNestedImpl<N> extends V1SecurityContextFluentImpl<V1ContainerFluentImpl.SecurityContextNested<N>> implements V1ContainerFluentImpl.SecurityContextNested<N>,Nested<N>{
    SecurityContextNestedImpl(V1SecurityContext item) {
      this.builder = new V1SecurityContextBuilder(this, item);
    }
    SecurityContextNestedImpl() {
      this.builder = new V1SecurityContextBuilder(this);
    }
    V1SecurityContextBuilder builder;
    public N and() {
      return (N) V1ContainerFluentImpl.this.withSecurityContext(builder.build());
    }
    public N endSecurityContext() {
      return and();
    }
    
  }
  class StartupProbeNestedImpl<N> extends V1ProbeFluentImpl<V1ContainerFluentImpl.StartupProbeNested<N>> implements V1ContainerFluentImpl.StartupProbeNested<N>,Nested<N>{
    StartupProbeNestedImpl(V1Probe item) {
      this.builder = new V1ProbeBuilder(this, item);
    }
    StartupProbeNestedImpl() {
      this.builder = new V1ProbeBuilder(this);
    }
    V1ProbeBuilder builder;
    public N and() {
      return (N) V1ContainerFluentImpl.this.withStartupProbe(builder.build());
    }
    public N endStartupProbe() {
      return and();
    }
    
  }
  class VolumeDevicesNestedImpl<N> extends V1VolumeDeviceFluentImpl<V1ContainerFluentImpl.VolumeDevicesNested<N>> implements V1ContainerFluentImpl.VolumeDevicesNested<N>,Nested<N>{
    VolumeDevicesNestedImpl(int index,V1VolumeDevice item) {
      this.index = index;
      this.builder = new V1VolumeDeviceBuilder(this, item);
    }
    VolumeDevicesNestedImpl() {
      this.index = -1;
      this.builder = new V1VolumeDeviceBuilder(this);
    }
    V1VolumeDeviceBuilder builder;
    int index;
    public N and() {
      return (N) V1ContainerFluentImpl.this.setToVolumeDevices(index,builder.build());
    }
    public N endVolumeDevice() {
      return and();
    }
    
  }
  class VolumeMountsNestedImpl<N> extends V1VolumeMountFluentImpl<V1ContainerFluentImpl.VolumeMountsNested<N>> implements V1ContainerFluentImpl.VolumeMountsNested<N>,Nested<N>{
    VolumeMountsNestedImpl(int index,V1VolumeMount item) {
      this.index = index;
      this.builder = new V1VolumeMountBuilder(this, item);
    }
    VolumeMountsNestedImpl() {
      this.index = -1;
      this.builder = new V1VolumeMountBuilder(this);
    }
    V1VolumeMountBuilder builder;
    int index;
    public N and() {
      return (N) V1ContainerFluentImpl.this.setToVolumeMounts(index,builder.build());
    }
    public N endVolumeMount() {
      return and();
    }
    
  }
  
}