/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1ContainerFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ContainerFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ContainerFluent<A> {
  public V1ContainerFluentImpl() {}

  public V1ContainerFluentImpl(io.kubernetes.client.openapi.models.V1Container instance) {
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

  private java.util.List<java.lang.String> args;
  private java.util.List<java.lang.String> command;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1EnvVarBuilder> env;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder> envFrom;
  private java.lang.String image;
  private io.kubernetes.client.openapi.models.V1Container.ImagePullPolicyEnum imagePullPolicy;
  private io.kubernetes.client.openapi.models.V1LifecycleBuilder lifecycle;
  private io.kubernetes.client.openapi.models.V1ProbeBuilder livenessProbe;
  private java.lang.String name;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerPortBuilder> ports;
  private io.kubernetes.client.openapi.models.V1ProbeBuilder readinessProbe;
  private io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder resources;
  private io.kubernetes.client.openapi.models.V1SecurityContextBuilder securityContext;
  private io.kubernetes.client.openapi.models.V1ProbeBuilder startupProbe;
  private java.lang.Boolean stdin;
  private java.lang.Boolean stdinOnce;
  private java.lang.String terminationMessagePath;
  private io.kubernetes.client.openapi.models.V1Container.TerminationMessagePolicyEnum
      terminationMessagePolicy;
  private java.lang.Boolean tty;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>
      volumeDevices;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>
      volumeMounts;
  private java.lang.String workingDir;

  public A addToArgs(java.lang.Integer index, java.lang.String item) {
    if (this.args == null) {
      this.args = new java.util.ArrayList<java.lang.String>();
    }
    this.args.add(index, item);
    return (A) this;
  }

  public A setToArgs(java.lang.Integer index, java.lang.String item) {
    if (this.args == null) {
      this.args = new java.util.ArrayList<java.lang.String>();
    }
    this.args.set(index, item);
    return (A) this;
  }

  public A addToArgs(java.lang.String... items) {
    if (this.args == null) {
      this.args = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.args.add(item);
    }
    return (A) this;
  }

  public A addAllToArgs(java.util.Collection<java.lang.String> items) {
    if (this.args == null) {
      this.args = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.args.add(item);
    }
    return (A) this;
  }

  public A removeFromArgs(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.args != null) {
        this.args.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromArgs(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.args != null) {
        this.args.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getArgs() {
    return this.args;
  }

  public java.lang.String getArg(java.lang.Integer index) {
    return this.args.get(index);
  }

  public java.lang.String getFirstArg() {
    return this.args.get(0);
  }

  public java.lang.String getLastArg() {
    return this.args.get(args.size() - 1);
  }

  public java.lang.String getMatchingArg(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : args) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingArg(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : args) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withArgs(java.util.List<java.lang.String> args) {
    if (args != null) {
      this.args = new java.util.ArrayList();
      for (java.lang.String item : args) {
        this.addToArgs(item);
      }
    } else {
      this.args = null;
    }
    return (A) this;
  }

  public A withArgs(java.lang.String... args) {
    if (this.args != null) {
      this.args.clear();
    }
    if (args != null) {
      for (java.lang.String item : args) {
        this.addToArgs(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasArgs() {
    return args != null && !args.isEmpty();
  }

  public A addNewArg(java.lang.String original) {
    return (A) addToArgs(new String(original));
  }

  public A addToCommand(java.lang.Integer index, java.lang.String item) {
    if (this.command == null) {
      this.command = new java.util.ArrayList<java.lang.String>();
    }
    this.command.add(index, item);
    return (A) this;
  }

  public A setToCommand(java.lang.Integer index, java.lang.String item) {
    if (this.command == null) {
      this.command = new java.util.ArrayList<java.lang.String>();
    }
    this.command.set(index, item);
    return (A) this;
  }

  public A addToCommand(java.lang.String... items) {
    if (this.command == null) {
      this.command = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.command.add(item);
    }
    return (A) this;
  }

  public A addAllToCommand(java.util.Collection<java.lang.String> items) {
    if (this.command == null) {
      this.command = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.command.add(item);
    }
    return (A) this;
  }

  public A removeFromCommand(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.command != null) {
        this.command.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromCommand(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.command != null) {
        this.command.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getCommand() {
    return this.command;
  }

  public java.lang.String getCommand(java.lang.Integer index) {
    return this.command.get(index);
  }

  public java.lang.String getFirstCommand() {
    return this.command.get(0);
  }

  public java.lang.String getLastCommand() {
    return this.command.get(command.size() - 1);
  }

  public java.lang.String getMatchingCommand(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : command) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingCommand(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : command) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withCommand(java.util.List<java.lang.String> command) {
    if (command != null) {
      this.command = new java.util.ArrayList();
      for (java.lang.String item : command) {
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
    }
    if (command != null) {
      for (java.lang.String item : command) {
        this.addToCommand(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasCommand() {
    return command != null && !command.isEmpty();
  }

  public A addNewCommand(java.lang.String original) {
    return (A) addToCommand(new String(original));
  }

  public A addToEnv(java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvVar item) {
    if (this.env == null) {
      this.env = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EnvVarBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EnvVarBuilder builder =
        new io.kubernetes.client.openapi.models.V1EnvVarBuilder(item);
    _visitables.get("env").add(index >= 0 ? index : _visitables.get("env").size(), builder);
    this.env.add(index >= 0 ? index : env.size(), builder);
    return (A) this;
  }

  public A setToEnv(java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvVar item) {
    if (this.env == null) {
      this.env = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EnvVarBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EnvVarBuilder builder =
        new io.kubernetes.client.openapi.models.V1EnvVarBuilder(item);
    if (index < 0 || index >= _visitables.get("env").size()) {
      _visitables.get("env").add(builder);
    } else {
      _visitables.get("env").set(index, builder);
    }
    if (index < 0 || index >= env.size()) {
      env.add(builder);
    } else {
      env.set(index, builder);
    }
    return (A) this;
  }

  public A addToEnv(io.kubernetes.client.openapi.models.V1EnvVar... items) {
    if (this.env == null) {
      this.env = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EnvVarBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1EnvVar item : items) {
      io.kubernetes.client.openapi.models.V1EnvVarBuilder builder =
          new io.kubernetes.client.openapi.models.V1EnvVarBuilder(item);
      _visitables.get("env").add(builder);
      this.env.add(builder);
    }
    return (A) this;
  }

  public A addAllToEnv(java.util.Collection<io.kubernetes.client.openapi.models.V1EnvVar> items) {
    if (this.env == null) {
      this.env = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EnvVarBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1EnvVar item : items) {
      io.kubernetes.client.openapi.models.V1EnvVarBuilder builder =
          new io.kubernetes.client.openapi.models.V1EnvVarBuilder(item);
      _visitables.get("env").add(builder);
      this.env.add(builder);
    }
    return (A) this;
  }

  public A removeFromEnv(io.kubernetes.client.openapi.models.V1EnvVar... items) {
    for (io.kubernetes.client.openapi.models.V1EnvVar item : items) {
      io.kubernetes.client.openapi.models.V1EnvVarBuilder builder =
          new io.kubernetes.client.openapi.models.V1EnvVarBuilder(item);
      _visitables.get("env").remove(builder);
      if (this.env != null) {
        this.env.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromEnv(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EnvVar> items) {
    for (io.kubernetes.client.openapi.models.V1EnvVar item : items) {
      io.kubernetes.client.openapi.models.V1EnvVarBuilder builder =
          new io.kubernetes.client.openapi.models.V1EnvVarBuilder(item);
      _visitables.get("env").remove(builder);
      if (this.env != null) {
        this.env.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromEnv(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvVarBuilder> predicate) {
    if (env == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1EnvVarBuilder> each = env.iterator();
    final List visitables = _visitables.get("env");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1EnvVarBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildEnv instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EnvVar> getEnv() {
    return env != null ? build(env) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1EnvVar> buildEnv() {
    return env != null ? build(env) : null;
  }

  public io.kubernetes.client.openapi.models.V1EnvVar buildEnv(java.lang.Integer index) {
    return this.env.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1EnvVar buildFirstEnv() {
    return this.env.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1EnvVar buildLastEnv() {
    return this.env.get(env.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1EnvVar buildMatchingEnv(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvVarBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V1EnvVarBuilder item : env) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingEnv(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvVarBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V1EnvVarBuilder item : env) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withEnv(java.util.List<io.kubernetes.client.openapi.models.V1EnvVar> env) {
    if (this.env != null) {
      _visitables.get("env").removeAll(this.env);
    }
    if (env != null) {
      this.env = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1EnvVar item : env) {
        this.addToEnv(item);
      }
    } else {
      this.env = null;
    }
    return (A) this;
  }

  public A withEnv(io.kubernetes.client.openapi.models.V1EnvVar... env) {
    if (this.env != null) {
      this.env.clear();
    }
    if (env != null) {
      for (io.kubernetes.client.openapi.models.V1EnvVar item : env) {
        this.addToEnv(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasEnv() {
    return env != null && !env.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvNested<A> addNewEnv() {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.EnvNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvNested<A> addNewEnvLike(
      io.kubernetes.client.openapi.models.V1EnvVar item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.EnvNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvNested<A> setNewEnvLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvVar item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.EnvNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvNested<A> editEnv(
      java.lang.Integer index) {
    if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
    return setNewEnvLike(index, buildEnv(index));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvNested<A> editFirstEnv() {
    if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
    return setNewEnvLike(0, buildEnv(0));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvNested<A> editLastEnv() {
    int index = env.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
    return setNewEnvLike(index, buildEnv(index));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvNested<A> editMatchingEnv(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvVarBuilder> predicate) {
    int index = -1;
    for (int i = 0; i < env.size(); i++) {
      if (predicate.test(env.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
    return setNewEnvLike(index, buildEnv(index));
  }

  public A addToEnvFrom(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvFromSource item) {
    if (this.envFrom == null) {
      this.envFrom =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder builder =
        new io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder(item);
    _visitables.get("envFrom").add(index >= 0 ? index : _visitables.get("envFrom").size(), builder);
    this.envFrom.add(index >= 0 ? index : envFrom.size(), builder);
    return (A) this;
  }

  public A setToEnvFrom(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvFromSource item) {
    if (this.envFrom == null) {
      this.envFrom =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder builder =
        new io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder(item);
    if (index < 0 || index >= _visitables.get("envFrom").size()) {
      _visitables.get("envFrom").add(builder);
    } else {
      _visitables.get("envFrom").set(index, builder);
    }
    if (index < 0 || index >= envFrom.size()) {
      envFrom.add(builder);
    } else {
      envFrom.set(index, builder);
    }
    return (A) this;
  }

  public A addToEnvFrom(io.kubernetes.client.openapi.models.V1EnvFromSource... items) {
    if (this.envFrom == null) {
      this.envFrom =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1EnvFromSource item : items) {
      io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder builder =
          new io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder(item);
      _visitables.get("envFrom").add(builder);
      this.envFrom.add(builder);
    }
    return (A) this;
  }

  public A addAllToEnvFrom(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EnvFromSource> items) {
    if (this.envFrom == null) {
      this.envFrom =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1EnvFromSource item : items) {
      io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder builder =
          new io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder(item);
      _visitables.get("envFrom").add(builder);
      this.envFrom.add(builder);
    }
    return (A) this;
  }

  public A removeFromEnvFrom(io.kubernetes.client.openapi.models.V1EnvFromSource... items) {
    for (io.kubernetes.client.openapi.models.V1EnvFromSource item : items) {
      io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder builder =
          new io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder(item);
      _visitables.get("envFrom").remove(builder);
      if (this.envFrom != null) {
        this.envFrom.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromEnvFrom(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EnvFromSource> items) {
    for (io.kubernetes.client.openapi.models.V1EnvFromSource item : items) {
      io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder builder =
          new io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder(item);
      _visitables.get("envFrom").remove(builder);
      if (this.envFrom != null) {
        this.envFrom.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromEnvFrom(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>
          predicate) {
    if (envFrom == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder> each =
        envFrom.iterator();
    final List visitables = _visitables.get("envFrom");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildEnvFrom instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EnvFromSource> getEnvFrom() {
    return envFrom != null ? build(envFrom) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1EnvFromSource> buildEnvFrom() {
    return envFrom != null ? build(envFrom) : null;
  }

  public io.kubernetes.client.openapi.models.V1EnvFromSource buildEnvFrom(java.lang.Integer index) {
    return this.envFrom.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1EnvFromSource buildFirstEnvFrom() {
    return this.envFrom.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1EnvFromSource buildLastEnvFrom() {
    return this.envFrom.get(envFrom.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1EnvFromSource buildMatchingEnvFrom(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder item : envFrom) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingEnvFrom(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder item : envFrom) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withEnvFrom(
      java.util.List<io.kubernetes.client.openapi.models.V1EnvFromSource> envFrom) {
    if (this.envFrom != null) {
      _visitables.get("envFrom").removeAll(this.envFrom);
    }
    if (envFrom != null) {
      this.envFrom = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1EnvFromSource item : envFrom) {
        this.addToEnvFrom(item);
      }
    } else {
      this.envFrom = null;
    }
    return (A) this;
  }

  public A withEnvFrom(io.kubernetes.client.openapi.models.V1EnvFromSource... envFrom) {
    if (this.envFrom != null) {
      this.envFrom.clear();
    }
    if (envFrom != null) {
      for (io.kubernetes.client.openapi.models.V1EnvFromSource item : envFrom) {
        this.addToEnvFrom(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasEnvFrom() {
    return envFrom != null && !envFrom.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvFromNested<A> addNewEnvFrom() {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.EnvFromNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvFromNested<A> addNewEnvFromLike(
      io.kubernetes.client.openapi.models.V1EnvFromSource item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.EnvFromNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvFromNested<A> setNewEnvFromLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvFromSource item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.EnvFromNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvFromNested<A> editEnvFrom(
      java.lang.Integer index) {
    if (envFrom.size() <= index)
      throw new RuntimeException("Can't edit envFrom. Index exceeds size.");
    return setNewEnvFromLike(index, buildEnvFrom(index));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvFromNested<A> editFirstEnvFrom() {
    if (envFrom.size() == 0)
      throw new RuntimeException("Can't edit first envFrom. The list is empty.");
    return setNewEnvFromLike(0, buildEnvFrom(0));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvFromNested<A> editLastEnvFrom() {
    int index = envFrom.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last envFrom. The list is empty.");
    return setNewEnvFromLike(index, buildEnvFrom(index));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.EnvFromNested<A> editMatchingEnvFrom(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>
          predicate) {
    int index = -1;
    for (int i = 0; i < envFrom.size(); i++) {
      if (predicate.test(envFrom.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching envFrom. No match found.");
    return setNewEnvFromLike(index, buildEnvFrom(index));
  }

  public java.lang.String getImage() {
    return this.image;
  }

  public A withImage(java.lang.String image) {
    this.image = image;
    return (A) this;
  }

  public java.lang.Boolean hasImage() {
    return this.image != null;
  }

  /** Method is deprecated. use withImage instead. */
  @java.lang.Deprecated
  public A withNewImage(java.lang.String original) {
    return (A) withImage(new String(original));
  }

  public io.kubernetes.client.openapi.models.V1Container.ImagePullPolicyEnum getImagePullPolicy() {
    return this.imagePullPolicy;
  }

  public A withImagePullPolicy(
      io.kubernetes.client.openapi.models.V1Container.ImagePullPolicyEnum imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasImagePullPolicy() {
    return this.imagePullPolicy != null;
  }

  /**
   * This method has been deprecated, please use method buildLifecycle instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Lifecycle getLifecycle() {
    return this.lifecycle != null ? this.lifecycle.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1Lifecycle buildLifecycle() {
    return this.lifecycle != null ? this.lifecycle.build() : null;
  }

  public A withLifecycle(io.kubernetes.client.openapi.models.V1Lifecycle lifecycle) {
    _visitables.get("lifecycle").remove(this.lifecycle);
    if (lifecycle != null) {
      this.lifecycle = new io.kubernetes.client.openapi.models.V1LifecycleBuilder(lifecycle);
      _visitables.get("lifecycle").add(this.lifecycle);
    }
    return (A) this;
  }

  public java.lang.Boolean hasLifecycle() {
    return this.lifecycle != null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.LifecycleNested<A>
      withNewLifecycle() {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.LifecycleNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.LifecycleNested<A>
      withNewLifecycleLike(io.kubernetes.client.openapi.models.V1Lifecycle item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.LifecycleNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.LifecycleNested<A> editLifecycle() {
    return withNewLifecycleLike(getLifecycle());
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.LifecycleNested<A>
      editOrNewLifecycle() {
    return withNewLifecycleLike(
        getLifecycle() != null
            ? getLifecycle()
            : new io.kubernetes.client.openapi.models.V1LifecycleBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.LifecycleNested<A>
      editOrNewLifecycleLike(io.kubernetes.client.openapi.models.V1Lifecycle item) {
    return withNewLifecycleLike(getLifecycle() != null ? getLifecycle() : item);
  }

  /**
   * This method has been deprecated, please use method buildLivenessProbe instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Probe getLivenessProbe() {
    return this.livenessProbe != null ? this.livenessProbe.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1Probe buildLivenessProbe() {
    return this.livenessProbe != null ? this.livenessProbe.build() : null;
  }

  public A withLivenessProbe(io.kubernetes.client.openapi.models.V1Probe livenessProbe) {
    _visitables.get("livenessProbe").remove(this.livenessProbe);
    if (livenessProbe != null) {
      this.livenessProbe = new io.kubernetes.client.openapi.models.V1ProbeBuilder(livenessProbe);
      _visitables.get("livenessProbe").add(this.livenessProbe);
    }
    return (A) this;
  }

  public java.lang.Boolean hasLivenessProbe() {
    return this.livenessProbe != null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.LivenessProbeNested<A>
      withNewLivenessProbe() {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.LivenessProbeNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.LivenessProbeNested<A>
      withNewLivenessProbeLike(io.kubernetes.client.openapi.models.V1Probe item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.LivenessProbeNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.LivenessProbeNested<A>
      editLivenessProbe() {
    return withNewLivenessProbeLike(getLivenessProbe());
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.LivenessProbeNested<A>
      editOrNewLivenessProbe() {
    return withNewLivenessProbeLike(
        getLivenessProbe() != null
            ? getLivenessProbe()
            : new io.kubernetes.client.openapi.models.V1ProbeBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.LivenessProbeNested<A>
      editOrNewLivenessProbeLike(io.kubernetes.client.openapi.models.V1Probe item) {
    return withNewLivenessProbeLike(getLivenessProbe() != null ? getLivenessProbe() : item);
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A) withName(new String(original));
  }

  public A addToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerPort item) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerPortBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ContainerPortBuilder builder =
        new io.kubernetes.client.openapi.models.V1ContainerPortBuilder(item);
    _visitables.get("ports").add(index >= 0 ? index : _visitables.get("ports").size(), builder);
    this.ports.add(index >= 0 ? index : ports.size(), builder);
    return (A) this;
  }

  public A setToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerPort item) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerPortBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ContainerPortBuilder builder =
        new io.kubernetes.client.openapi.models.V1ContainerPortBuilder(item);
    if (index < 0 || index >= _visitables.get("ports").size()) {
      _visitables.get("ports").add(builder);
    } else {
      _visitables.get("ports").set(index, builder);
    }
    if (index < 0 || index >= ports.size()) {
      ports.add(builder);
    } else {
      ports.set(index, builder);
    }
    return (A) this;
  }

  public A addToPorts(io.kubernetes.client.openapi.models.V1ContainerPort... items) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerPortBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ContainerPort item : items) {
      io.kubernetes.client.openapi.models.V1ContainerPortBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerPortBuilder(item);
      _visitables.get("ports").add(builder);
      this.ports.add(builder);
    }
    return (A) this;
  }

  public A addAllToPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerPort> items) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerPortBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ContainerPort item : items) {
      io.kubernetes.client.openapi.models.V1ContainerPortBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerPortBuilder(item);
      _visitables.get("ports").add(builder);
      this.ports.add(builder);
    }
    return (A) this;
  }

  public A removeFromPorts(io.kubernetes.client.openapi.models.V1ContainerPort... items) {
    for (io.kubernetes.client.openapi.models.V1ContainerPort item : items) {
      io.kubernetes.client.openapi.models.V1ContainerPortBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerPortBuilder(item);
      _visitables.get("ports").remove(builder);
      if (this.ports != null) {
        this.ports.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerPort> items) {
    for (io.kubernetes.client.openapi.models.V1ContainerPort item : items) {
      io.kubernetes.client.openapi.models.V1ContainerPortBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerPortBuilder(item);
      _visitables.get("ports").remove(builder);
      if (this.ports != null) {
        this.ports.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromPorts(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerPortBuilder>
          predicate) {
    if (ports == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ContainerPortBuilder> each =
        ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ContainerPortBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildPorts instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerPort> getPorts() {
    return ports != null ? build(ports) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerPort> buildPorts() {
    return ports != null ? build(ports) : null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerPort buildPort(java.lang.Integer index) {
    return this.ports.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1ContainerPort buildFirstPort() {
    return this.ports.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1ContainerPort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1ContainerPort buildMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerPortBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ContainerPortBuilder item : ports) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerPortBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ContainerPortBuilder item : ports) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPorts(java.util.List<io.kubernetes.client.openapi.models.V1ContainerPort> ports) {
    if (this.ports != null) {
      _visitables.get("ports").removeAll(this.ports);
    }
    if (ports != null) {
      this.ports = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1ContainerPort item : ports) {
        this.addToPorts(item);
      }
    } else {
      this.ports = null;
    }
    return (A) this;
  }

  public A withPorts(io.kubernetes.client.openapi.models.V1ContainerPort... ports) {
    if (this.ports != null) {
      this.ports.clear();
    }
    if (ports != null) {
      for (io.kubernetes.client.openapi.models.V1ContainerPort item : ports) {
        this.addToPorts(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.PortsNested<A> addNewPort() {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.PortsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.PortsNested<A> addNewPortLike(
      io.kubernetes.client.openapi.models.V1ContainerPort item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.PortsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.PortsNested<A> setNewPortLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerPort item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.PortsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.PortsNested<A> editPort(
      java.lang.Integer index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.PortsNested<A> editMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerPortBuilder>
          predicate) {
    int index = -1;
    for (int i = 0; i < ports.size(); i++) {
      if (predicate.test(ports.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
    return setNewPortLike(index, buildPort(index));
  }

  /**
   * This method has been deprecated, please use method buildReadinessProbe instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Probe getReadinessProbe() {
    return this.readinessProbe != null ? this.readinessProbe.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1Probe buildReadinessProbe() {
    return this.readinessProbe != null ? this.readinessProbe.build() : null;
  }

  public A withReadinessProbe(io.kubernetes.client.openapi.models.V1Probe readinessProbe) {
    _visitables.get("readinessProbe").remove(this.readinessProbe);
    if (readinessProbe != null) {
      this.readinessProbe = new io.kubernetes.client.openapi.models.V1ProbeBuilder(readinessProbe);
      _visitables.get("readinessProbe").add(this.readinessProbe);
    }
    return (A) this;
  }

  public java.lang.Boolean hasReadinessProbe() {
    return this.readinessProbe != null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.ReadinessProbeNested<A>
      withNewReadinessProbe() {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.ReadinessProbeNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.ReadinessProbeNested<A>
      withNewReadinessProbeLike(io.kubernetes.client.openapi.models.V1Probe item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.ReadinessProbeNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.ReadinessProbeNested<A>
      editReadinessProbe() {
    return withNewReadinessProbeLike(getReadinessProbe());
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.ReadinessProbeNested<A>
      editOrNewReadinessProbe() {
    return withNewReadinessProbeLike(
        getReadinessProbe() != null
            ? getReadinessProbe()
            : new io.kubernetes.client.openapi.models.V1ProbeBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.ReadinessProbeNested<A>
      editOrNewReadinessProbeLike(io.kubernetes.client.openapi.models.V1Probe item) {
    return withNewReadinessProbeLike(getReadinessProbe() != null ? getReadinessProbe() : item);
  }

  /**
   * This method has been deprecated, please use method buildResources instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ResourceRequirements getResources() {
    return this.resources != null ? this.resources.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ResourceRequirements buildResources() {
    return this.resources != null ? this.resources.build() : null;
  }

  public A withResources(io.kubernetes.client.openapi.models.V1ResourceRequirements resources) {
    _visitables.get("resources").remove(this.resources);
    if (resources != null) {
      this.resources =
          new io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder(resources);
      _visitables.get("resources").add(this.resources);
    }
    return (A) this;
  }

  public java.lang.Boolean hasResources() {
    return this.resources != null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.ResourcesNested<A>
      withNewResources() {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.ResourcesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.ResourcesNested<A>
      withNewResourcesLike(io.kubernetes.client.openapi.models.V1ResourceRequirements item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.ResourcesNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.ResourcesNested<A> editResources() {
    return withNewResourcesLike(getResources());
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.ResourcesNested<A>
      editOrNewResources() {
    return withNewResourcesLike(
        getResources() != null
            ? getResources()
            : new io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.ResourcesNested<A>
      editOrNewResourcesLike(io.kubernetes.client.openapi.models.V1ResourceRequirements item) {
    return withNewResourcesLike(getResources() != null ? getResources() : item);
  }

  /**
   * This method has been deprecated, please use method buildSecurityContext instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecurityContext getSecurityContext() {
    return this.securityContext != null ? this.securityContext.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SecurityContext buildSecurityContext() {
    return this.securityContext != null ? this.securityContext.build() : null;
  }

  public A withSecurityContext(
      io.kubernetes.client.openapi.models.V1SecurityContext securityContext) {
    _visitables.get("securityContext").remove(this.securityContext);
    if (securityContext != null) {
      this.securityContext =
          new io.kubernetes.client.openapi.models.V1SecurityContextBuilder(securityContext);
      _visitables.get("securityContext").add(this.securityContext);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSecurityContext() {
    return this.securityContext != null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.SecurityContextNested<A>
      withNewSecurityContext() {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl
        .SecurityContextNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.SecurityContextNested<A>
      withNewSecurityContextLike(io.kubernetes.client.openapi.models.V1SecurityContext item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.SecurityContextNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.SecurityContextNested<A>
      editSecurityContext() {
    return withNewSecurityContextLike(getSecurityContext());
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.SecurityContextNested<A>
      editOrNewSecurityContext() {
    return withNewSecurityContextLike(
        getSecurityContext() != null
            ? getSecurityContext()
            : new io.kubernetes.client.openapi.models.V1SecurityContextBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.SecurityContextNested<A>
      editOrNewSecurityContextLike(io.kubernetes.client.openapi.models.V1SecurityContext item) {
    return withNewSecurityContextLike(getSecurityContext() != null ? getSecurityContext() : item);
  }

  /**
   * This method has been deprecated, please use method buildStartupProbe instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Probe getStartupProbe() {
    return this.startupProbe != null ? this.startupProbe.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1Probe buildStartupProbe() {
    return this.startupProbe != null ? this.startupProbe.build() : null;
  }

  public A withStartupProbe(io.kubernetes.client.openapi.models.V1Probe startupProbe) {
    _visitables.get("startupProbe").remove(this.startupProbe);
    if (startupProbe != null) {
      this.startupProbe = new io.kubernetes.client.openapi.models.V1ProbeBuilder(startupProbe);
      _visitables.get("startupProbe").add(this.startupProbe);
    }
    return (A) this;
  }

  public java.lang.Boolean hasStartupProbe() {
    return this.startupProbe != null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.StartupProbeNested<A>
      withNewStartupProbe() {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.StartupProbeNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.StartupProbeNested<A>
      withNewStartupProbeLike(io.kubernetes.client.openapi.models.V1Probe item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.StartupProbeNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.StartupProbeNested<A>
      editStartupProbe() {
    return withNewStartupProbeLike(getStartupProbe());
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.StartupProbeNested<A>
      editOrNewStartupProbe() {
    return withNewStartupProbeLike(
        getStartupProbe() != null
            ? getStartupProbe()
            : new io.kubernetes.client.openapi.models.V1ProbeBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.StartupProbeNested<A>
      editOrNewStartupProbeLike(io.kubernetes.client.openapi.models.V1Probe item) {
    return withNewStartupProbeLike(getStartupProbe() != null ? getStartupProbe() : item);
  }

  public java.lang.Boolean getStdin() {
    return this.stdin;
  }

  public A withStdin(java.lang.Boolean stdin) {
    this.stdin = stdin;
    return (A) this;
  }

  public java.lang.Boolean hasStdin() {
    return this.stdin != null;
  }

  public java.lang.Boolean getStdinOnce() {
    return this.stdinOnce;
  }

  public A withStdinOnce(java.lang.Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return (A) this;
  }

  public java.lang.Boolean hasStdinOnce() {
    return this.stdinOnce != null;
  }

  public java.lang.String getTerminationMessagePath() {
    return this.terminationMessagePath;
  }

  public A withTerminationMessagePath(java.lang.String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
    return (A) this;
  }

  public java.lang.Boolean hasTerminationMessagePath() {
    return this.terminationMessagePath != null;
  }

  /** Method is deprecated. use withTerminationMessagePath instead. */
  @java.lang.Deprecated
  public A withNewTerminationMessagePath(java.lang.String original) {
    return (A) withTerminationMessagePath(new String(original));
  }

  public io.kubernetes.client.openapi.models.V1Container.TerminationMessagePolicyEnum
      getTerminationMessagePolicy() {
    return this.terminationMessagePolicy;
  }

  public A withTerminationMessagePolicy(
      io.kubernetes.client.openapi.models.V1Container.TerminationMessagePolicyEnum
          terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
    return (A) this;
  }

  public java.lang.Boolean hasTerminationMessagePolicy() {
    return this.terminationMessagePolicy != null;
  }

  public java.lang.Boolean getTty() {
    return this.tty;
  }

  public A withTty(java.lang.Boolean tty) {
    this.tty = tty;
    return (A) this;
  }

  public java.lang.Boolean hasTty() {
    return this.tty != null;
  }

  public A addToVolumeDevices(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeDevice item) {
    if (this.volumeDevices == null) {
      this.volumeDevices =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder builder =
        new io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder(item);
    _visitables
        .get("volumeDevices")
        .add(index >= 0 ? index : _visitables.get("volumeDevices").size(), builder);
    this.volumeDevices.add(index >= 0 ? index : volumeDevices.size(), builder);
    return (A) this;
  }

  public A setToVolumeDevices(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeDevice item) {
    if (this.volumeDevices == null) {
      this.volumeDevices =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder builder =
        new io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder(item);
    if (index < 0 || index >= _visitables.get("volumeDevices").size()) {
      _visitables.get("volumeDevices").add(builder);
    } else {
      _visitables.get("volumeDevices").set(index, builder);
    }
    if (index < 0 || index >= volumeDevices.size()) {
      volumeDevices.add(builder);
    } else {
      volumeDevices.set(index, builder);
    }
    return (A) this;
  }

  public A addToVolumeDevices(io.kubernetes.client.openapi.models.V1VolumeDevice... items) {
    if (this.volumeDevices == null) {
      this.volumeDevices =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1VolumeDevice item : items) {
      io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder(item);
      _visitables.get("volumeDevices").add(builder);
      this.volumeDevices.add(builder);
    }
    return (A) this;
  }

  public A addAllToVolumeDevices(
      java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeDevice> items) {
    if (this.volumeDevices == null) {
      this.volumeDevices =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1VolumeDevice item : items) {
      io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder(item);
      _visitables.get("volumeDevices").add(builder);
      this.volumeDevices.add(builder);
    }
    return (A) this;
  }

  public A removeFromVolumeDevices(io.kubernetes.client.openapi.models.V1VolumeDevice... items) {
    for (io.kubernetes.client.openapi.models.V1VolumeDevice item : items) {
      io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder(item);
      _visitables.get("volumeDevices").remove(builder);
      if (this.volumeDevices != null) {
        this.volumeDevices.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromVolumeDevices(
      java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeDevice> items) {
    for (io.kubernetes.client.openapi.models.V1VolumeDevice item : items) {
      io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder(item);
      _visitables.get("volumeDevices").remove(builder);
      if (this.volumeDevices != null) {
        this.volumeDevices.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromVolumeDevices(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>
          predicate) {
    if (volumeDevices == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder> each =
        volumeDevices.iterator();
    final List visitables = _visitables.get("volumeDevices");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildVolumeDevices instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeDevice> getVolumeDevices() {
    return volumeDevices != null ? build(volumeDevices) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeDevice> buildVolumeDevices() {
    return volumeDevices != null ? build(volumeDevices) : null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeDevice buildVolumeDevice(
      java.lang.Integer index) {
    return this.volumeDevices.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1VolumeDevice buildFirstVolumeDevice() {
    return this.volumeDevices.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1VolumeDevice buildLastVolumeDevice() {
    return this.volumeDevices.get(volumeDevices.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1VolumeDevice buildMatchingVolumeDevice(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder item : volumeDevices) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingVolumeDevice(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder item : volumeDevices) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withVolumeDevices(
      java.util.List<io.kubernetes.client.openapi.models.V1VolumeDevice> volumeDevices) {
    if (this.volumeDevices != null) {
      _visitables.get("volumeDevices").removeAll(this.volumeDevices);
    }
    if (volumeDevices != null) {
      this.volumeDevices = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1VolumeDevice item : volumeDevices) {
        this.addToVolumeDevices(item);
      }
    } else {
      this.volumeDevices = null;
    }
    return (A) this;
  }

  public A withVolumeDevices(io.kubernetes.client.openapi.models.V1VolumeDevice... volumeDevices) {
    if (this.volumeDevices != null) {
      this.volumeDevices.clear();
    }
    if (volumeDevices != null) {
      for (io.kubernetes.client.openapi.models.V1VolumeDevice item : volumeDevices) {
        this.addToVolumeDevices(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasVolumeDevices() {
    return volumeDevices != null && !volumeDevices.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeDevicesNested<A>
      addNewVolumeDevice() {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.VolumeDevicesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeDevicesNested<A>
      addNewVolumeDeviceLike(io.kubernetes.client.openapi.models.V1VolumeDevice item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.VolumeDevicesNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeDevicesNested<A>
      setNewVolumeDeviceLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeDevice item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.VolumeDevicesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeDevicesNested<A>
      editVolumeDevice(java.lang.Integer index) {
    if (volumeDevices.size() <= index)
      throw new RuntimeException("Can't edit volumeDevices. Index exceeds size.");
    return setNewVolumeDeviceLike(index, buildVolumeDevice(index));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeDevicesNested<A>
      editFirstVolumeDevice() {
    if (volumeDevices.size() == 0)
      throw new RuntimeException("Can't edit first volumeDevices. The list is empty.");
    return setNewVolumeDeviceLike(0, buildVolumeDevice(0));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeDevicesNested<A>
      editLastVolumeDevice() {
    int index = volumeDevices.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumeDevices. The list is empty.");
    return setNewVolumeDeviceLike(index, buildVolumeDevice(index));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeDevicesNested<A>
      editMatchingVolumeDevice(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < volumeDevices.size(); i++) {
      if (predicate.test(volumeDevices.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching volumeDevices. No match found.");
    return setNewVolumeDeviceLike(index, buildVolumeDevice(index));
  }

  public A addToVolumeMounts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeMount item) {
    if (this.volumeMounts == null) {
      this.volumeMounts =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>();
    }
    io.kubernetes.client.openapi.models.V1VolumeMountBuilder builder =
        new io.kubernetes.client.openapi.models.V1VolumeMountBuilder(item);
    _visitables
        .get("volumeMounts")
        .add(index >= 0 ? index : _visitables.get("volumeMounts").size(), builder);
    this.volumeMounts.add(index >= 0 ? index : volumeMounts.size(), builder);
    return (A) this;
  }

  public A setToVolumeMounts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeMount item) {
    if (this.volumeMounts == null) {
      this.volumeMounts =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>();
    }
    io.kubernetes.client.openapi.models.V1VolumeMountBuilder builder =
        new io.kubernetes.client.openapi.models.V1VolumeMountBuilder(item);
    if (index < 0 || index >= _visitables.get("volumeMounts").size()) {
      _visitables.get("volumeMounts").add(builder);
    } else {
      _visitables.get("volumeMounts").set(index, builder);
    }
    if (index < 0 || index >= volumeMounts.size()) {
      volumeMounts.add(builder);
    } else {
      volumeMounts.set(index, builder);
    }
    return (A) this;
  }

  public A addToVolumeMounts(io.kubernetes.client.openapi.models.V1VolumeMount... items) {
    if (this.volumeMounts == null) {
      this.volumeMounts =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1VolumeMount item : items) {
      io.kubernetes.client.openapi.models.V1VolumeMountBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeMountBuilder(item);
      _visitables.get("volumeMounts").add(builder);
      this.volumeMounts.add(builder);
    }
    return (A) this;
  }

  public A addAllToVolumeMounts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeMount> items) {
    if (this.volumeMounts == null) {
      this.volumeMounts =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1VolumeMount item : items) {
      io.kubernetes.client.openapi.models.V1VolumeMountBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeMountBuilder(item);
      _visitables.get("volumeMounts").add(builder);
      this.volumeMounts.add(builder);
    }
    return (A) this;
  }

  public A removeFromVolumeMounts(io.kubernetes.client.openapi.models.V1VolumeMount... items) {
    for (io.kubernetes.client.openapi.models.V1VolumeMount item : items) {
      io.kubernetes.client.openapi.models.V1VolumeMountBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeMountBuilder(item);
      _visitables.get("volumeMounts").remove(builder);
      if (this.volumeMounts != null) {
        this.volumeMounts.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromVolumeMounts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeMount> items) {
    for (io.kubernetes.client.openapi.models.V1VolumeMount item : items) {
      io.kubernetes.client.openapi.models.V1VolumeMountBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeMountBuilder(item);
      _visitables.get("volumeMounts").remove(builder);
      if (this.volumeMounts != null) {
        this.volumeMounts.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromVolumeMounts(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>
          predicate) {
    if (volumeMounts == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1VolumeMountBuilder> each =
        volumeMounts.iterator();
    final List visitables = _visitables.get("volumeMounts");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1VolumeMountBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildVolumeMounts instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeMount> getVolumeMounts() {
    return volumeMounts != null ? build(volumeMounts) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeMount> buildVolumeMounts() {
    return volumeMounts != null ? build(volumeMounts) : null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeMount buildVolumeMount(
      java.lang.Integer index) {
    return this.volumeMounts.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1VolumeMount buildFirstVolumeMount() {
    return this.volumeMounts.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1VolumeMount buildLastVolumeMount() {
    return this.volumeMounts.get(volumeMounts.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1VolumeMount buildMatchingVolumeMount(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1VolumeMountBuilder item : volumeMounts) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingVolumeMount(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1VolumeMountBuilder item : volumeMounts) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withVolumeMounts(
      java.util.List<io.kubernetes.client.openapi.models.V1VolumeMount> volumeMounts) {
    if (this.volumeMounts != null) {
      _visitables.get("volumeMounts").removeAll(this.volumeMounts);
    }
    if (volumeMounts != null) {
      this.volumeMounts = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1VolumeMount item : volumeMounts) {
        this.addToVolumeMounts(item);
      }
    } else {
      this.volumeMounts = null;
    }
    return (A) this;
  }

  public A withVolumeMounts(io.kubernetes.client.openapi.models.V1VolumeMount... volumeMounts) {
    if (this.volumeMounts != null) {
      this.volumeMounts.clear();
    }
    if (volumeMounts != null) {
      for (io.kubernetes.client.openapi.models.V1VolumeMount item : volumeMounts) {
        this.addToVolumeMounts(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasVolumeMounts() {
    return volumeMounts != null && !volumeMounts.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeMountsNested<A>
      addNewVolumeMount() {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.VolumeMountsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeMountsNested<A>
      addNewVolumeMountLike(io.kubernetes.client.openapi.models.V1VolumeMount item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.VolumeMountsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeMountsNested<A>
      setNewVolumeMountLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeMount item) {
    return new io.kubernetes.client.openapi.models.V1ContainerFluentImpl.VolumeMountsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeMountsNested<A>
      editVolumeMount(java.lang.Integer index) {
    if (volumeMounts.size() <= index)
      throw new RuntimeException("Can't edit volumeMounts. Index exceeds size.");
    return setNewVolumeMountLike(index, buildVolumeMount(index));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeMountsNested<A>
      editFirstVolumeMount() {
    if (volumeMounts.size() == 0)
      throw new RuntimeException("Can't edit first volumeMounts. The list is empty.");
    return setNewVolumeMountLike(0, buildVolumeMount(0));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeMountsNested<A>
      editLastVolumeMount() {
    int index = volumeMounts.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumeMounts. The list is empty.");
    return setNewVolumeMountLike(index, buildVolumeMount(index));
  }

  public io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeMountsNested<A>
      editMatchingVolumeMount(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < volumeMounts.size(); i++) {
      if (predicate.test(volumeMounts.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching volumeMounts. No match found.");
    return setNewVolumeMountLike(index, buildVolumeMount(index));
  }

  public java.lang.String getWorkingDir() {
    return this.workingDir;
  }

  public A withWorkingDir(java.lang.String workingDir) {
    this.workingDir = workingDir;
    return (A) this;
  }

  public java.lang.Boolean hasWorkingDir() {
    return this.workingDir != null;
  }

  /** Method is deprecated. use withWorkingDir instead. */
  @java.lang.Deprecated
  public A withNewWorkingDir(java.lang.String original) {
    return (A) withWorkingDir(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ContainerFluentImpl that = (V1ContainerFluentImpl) o;
    if (args != null ? !args.equals(that.args) : that.args != null) return false;
    if (command != null ? !command.equals(that.command) : that.command != null) return false;
    if (env != null ? !env.equals(that.env) : that.env != null) return false;
    if (envFrom != null ? !envFrom.equals(that.envFrom) : that.envFrom != null) return false;
    if (image != null ? !image.equals(that.image) : that.image != null) return false;
    if (imagePullPolicy != null
        ? !imagePullPolicy.equals(that.imagePullPolicy)
        : that.imagePullPolicy != null) return false;
    if (lifecycle != null ? !lifecycle.equals(that.lifecycle) : that.lifecycle != null)
      return false;
    if (livenessProbe != null
        ? !livenessProbe.equals(that.livenessProbe)
        : that.livenessProbe != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (ports != null ? !ports.equals(that.ports) : that.ports != null) return false;
    if (readinessProbe != null
        ? !readinessProbe.equals(that.readinessProbe)
        : that.readinessProbe != null) return false;
    if (resources != null ? !resources.equals(that.resources) : that.resources != null)
      return false;
    if (securityContext != null
        ? !securityContext.equals(that.securityContext)
        : that.securityContext != null) return false;
    if (startupProbe != null ? !startupProbe.equals(that.startupProbe) : that.startupProbe != null)
      return false;
    if (stdin != null ? !stdin.equals(that.stdin) : that.stdin != null) return false;
    if (stdinOnce != null ? !stdinOnce.equals(that.stdinOnce) : that.stdinOnce != null)
      return false;
    if (terminationMessagePath != null
        ? !terminationMessagePath.equals(that.terminationMessagePath)
        : that.terminationMessagePath != null) return false;
    if (terminationMessagePolicy != null
        ? !terminationMessagePolicy.equals(that.terminationMessagePolicy)
        : that.terminationMessagePolicy != null) return false;
    if (tty != null ? !tty.equals(that.tty) : that.tty != null) return false;
    if (volumeDevices != null
        ? !volumeDevices.equals(that.volumeDevices)
        : that.volumeDevices != null) return false;
    if (volumeMounts != null ? !volumeMounts.equals(that.volumeMounts) : that.volumeMounts != null)
      return false;
    if (workingDir != null ? !workingDir.equals(that.workingDir) : that.workingDir != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        args,
        command,
        env,
        envFrom,
        image,
        imagePullPolicy,
        lifecycle,
        livenessProbe,
        name,
        ports,
        readinessProbe,
        resources,
        securityContext,
        startupProbe,
        stdin,
        stdinOnce,
        terminationMessagePath,
        terminationMessagePolicy,
        tty,
        volumeDevices,
        volumeMounts,
        workingDir,
        super.hashCode());
  }

  public class EnvNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1EnvVarFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerFluent.EnvNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerFluent.EnvNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    EnvNestedImpl(java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvVar item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1EnvVarBuilder(this, item);
    }

    EnvNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1EnvVarBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1EnvVarBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ContainerFluentImpl.this.setToEnv(index, builder.build());
    }

    public N endEnv() {
      return and();
    }
  }

  public class EnvFromNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1EnvFromSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerFluent.EnvFromNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerFluent.EnvFromNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    EnvFromNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvFromSource item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder(this, item);
    }

    EnvFromNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ContainerFluentImpl.this.setToEnvFrom(index, builder.build());
    }

    public N endEnvFrom() {
      return and();
    }
  }

  public class LifecycleNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LifecycleFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerFluent.LifecycleNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerFluent.LifecycleNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    LifecycleNestedImpl(io.kubernetes.client.openapi.models.V1Lifecycle item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LifecycleBuilder(this, item);
    }

    LifecycleNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LifecycleBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LifecycleBuilder builder;

    public N and() {
      return (N) V1ContainerFluentImpl.this.withLifecycle(builder.build());
    }

    public N endLifecycle() {
      return and();
    }
  }

  public class LivenessProbeNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ProbeFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerFluent.LivenessProbeNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerFluent.LivenessProbeNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    LivenessProbeNestedImpl(io.kubernetes.client.openapi.models.V1Probe item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ProbeBuilder(this, item);
    }

    LivenessProbeNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ProbeBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ProbeBuilder builder;

    public N and() {
      return (N) V1ContainerFluentImpl.this.withLivenessProbe(builder.build());
    }

    public N endLivenessProbe() {
      return and();
    }
  }

  public class PortsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ContainerPortFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerFluent.PortsNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerFluent.PortsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PortsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerPort item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1ContainerPortBuilder(this, item);
    }

    PortsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ContainerPortBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ContainerPortBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ContainerFluentImpl.this.setToPorts(index, builder.build());
    }

    public N endPort() {
      return and();
    }
  }

  public class ReadinessProbeNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ProbeFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerFluent.ReadinessProbeNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerFluent.ReadinessProbeNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ReadinessProbeNestedImpl(io.kubernetes.client.openapi.models.V1Probe item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ProbeBuilder(this, item);
    }

    ReadinessProbeNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ProbeBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ProbeBuilder builder;

    public N and() {
      return (N) V1ContainerFluentImpl.this.withReadinessProbe(builder.build());
    }

    public N endReadinessProbe() {
      return and();
    }
  }

  public class ResourcesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ResourceRequirementsFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerFluent.ResourcesNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerFluent.ResourcesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ResourcesNestedImpl(io.kubernetes.client.openapi.models.V1ResourceRequirements item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder(this, item);
    }

    ResourcesNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder builder;

    public N and() {
      return (N) V1ContainerFluentImpl.this.withResources(builder.build());
    }

    public N endResources() {
      return and();
    }
  }

  public class SecurityContextNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SecurityContextFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerFluent.SecurityContextNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerFluent.SecurityContextNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SecurityContextNestedImpl(io.kubernetes.client.openapi.models.V1SecurityContext item) {
      this.builder = new io.kubernetes.client.openapi.models.V1SecurityContextBuilder(this, item);
    }

    SecurityContextNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SecurityContextBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SecurityContextBuilder builder;

    public N and() {
      return (N) V1ContainerFluentImpl.this.withSecurityContext(builder.build());
    }

    public N endSecurityContext() {
      return and();
    }
  }

  public class StartupProbeNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ProbeFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerFluent.StartupProbeNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerFluent.StartupProbeNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    StartupProbeNestedImpl(io.kubernetes.client.openapi.models.V1Probe item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ProbeBuilder(this, item);
    }

    StartupProbeNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ProbeBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ProbeBuilder builder;

    public N and() {
      return (N) V1ContainerFluentImpl.this.withStartupProbe(builder.build());
    }

    public N endStartupProbe() {
      return and();
    }
  }

  public class VolumeDevicesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1VolumeDeviceFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeDevicesNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeDevicesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    VolumeDevicesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeDevice item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder(this, item);
    }

    VolumeDevicesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ContainerFluentImpl.this.setToVolumeDevices(index, builder.build());
    }

    public N endVolumeDevice() {
      return and();
    }
  }

  public class VolumeMountsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1VolumeMountFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeMountsNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerFluent.VolumeMountsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    VolumeMountsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeMount item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeMountBuilder(this, item);
    }

    VolumeMountsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeMountBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1VolumeMountBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ContainerFluentImpl.this.setToVolumeMounts(index, builder.build());
    }

    public N endVolumeMount() {
      return and();
    }
  }
}
