package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EphemeralContainerFluent<A extends io.kubernetes.client.openapi.models.V1EphemeralContainerFluent<A>> extends BaseFluent<A>{

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
  private String restartPolicy;
  private ArrayList<V1ContainerRestartRuleBuilder> restartPolicyRules;
  private V1SecurityContextBuilder securityContext;
  private V1ProbeBuilder startupProbe;
  private Boolean stdin;
  private Boolean stdinOnce;
  private String targetContainerName;
  private String terminationMessagePath;
  private String terminationMessagePolicy;
  private Boolean tty;
  private ArrayList<V1VolumeDeviceBuilder> volumeDevices;
  private ArrayList<V1VolumeMountBuilder> volumeMounts;
  private String workingDir;

  public V1EphemeralContainerFluent() {
  }
  
  public V1EphemeralContainerFluent(V1EphemeralContainer instance) {
    this.copyInstance(instance);
  }

  public A addAllToArgs(Collection<String> items) {
    if (this.args == null) {
      this.args = new ArrayList();
    }
    for (String item : items) {
      this.args.add(item);
    }
    return (A) this;
  }
  
  public A addAllToCommand(Collection<String> items) {
    if (this.command == null) {
      this.command = new ArrayList();
    }
    for (String item : items) {
      this.command.add(item);
    }
    return (A) this;
  }
  
  public A addAllToEnv(Collection<V1EnvVar> items) {
    if (this.env == null) {
      this.env = new ArrayList();
    }
    for (V1EnvVar item : items) {
        V1EnvVarBuilder builder = new V1EnvVarBuilder(item);
        _visitables.get("env").add(builder);
        this.env.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToEnvFrom(Collection<V1EnvFromSource> items) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList();
    }
    for (V1EnvFromSource item : items) {
        V1EnvFromSourceBuilder builder = new V1EnvFromSourceBuilder(item);
        _visitables.get("envFrom").add(builder);
        this.envFrom.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToPorts(Collection<V1ContainerPort> items) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    for (V1ContainerPort item : items) {
        V1ContainerPortBuilder builder = new V1ContainerPortBuilder(item);
        _visitables.get("ports").add(builder);
        this.ports.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToResizePolicy(Collection<V1ContainerResizePolicy> items) {
    if (this.resizePolicy == null) {
      this.resizePolicy = new ArrayList();
    }
    for (V1ContainerResizePolicy item : items) {
        V1ContainerResizePolicyBuilder builder = new V1ContainerResizePolicyBuilder(item);
        _visitables.get("resizePolicy").add(builder);
        this.resizePolicy.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToRestartPolicyRules(Collection<V1ContainerRestartRule> items) {
    if (this.restartPolicyRules == null) {
      this.restartPolicyRules = new ArrayList();
    }
    for (V1ContainerRestartRule item : items) {
        V1ContainerRestartRuleBuilder builder = new V1ContainerRestartRuleBuilder(item);
        _visitables.get("restartPolicyRules").add(builder);
        this.restartPolicyRules.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToVolumeDevices(Collection<V1VolumeDevice> items) {
    if (this.volumeDevices == null) {
      this.volumeDevices = new ArrayList();
    }
    for (V1VolumeDevice item : items) {
        V1VolumeDeviceBuilder builder = new V1VolumeDeviceBuilder(item);
        _visitables.get("volumeDevices").add(builder);
        this.volumeDevices.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToVolumeMounts(Collection<V1VolumeMount> items) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList();
    }
    for (V1VolumeMount item : items) {
        V1VolumeMountBuilder builder = new V1VolumeMountBuilder(item);
        _visitables.get("volumeMounts").add(builder);
        this.volumeMounts.add(builder);
    }
    return (A) this;
  }
  
  public EnvNested<A> addNewEnv() {
    return new EnvNested(-1, null);
  }
  
  public EnvFromNested<A> addNewEnvFrom() {
    return new EnvFromNested(-1, null);
  }
  
  public EnvFromNested<A> addNewEnvFromLike(V1EnvFromSource item) {
    return new EnvFromNested(-1, item);
  }
  
  public EnvNested<A> addNewEnvLike(V1EnvVar item) {
    return new EnvNested(-1, item);
  }
  
  public PortsNested<A> addNewPort() {
    return new PortsNested(-1, null);
  }
  
  public PortsNested<A> addNewPortLike(V1ContainerPort item) {
    return new PortsNested(-1, item);
  }
  
  public ResizePolicyNested<A> addNewResizePolicy() {
    return new ResizePolicyNested(-1, null);
  }
  
  public ResizePolicyNested<A> addNewResizePolicyLike(V1ContainerResizePolicy item) {
    return new ResizePolicyNested(-1, item);
  }
  
  public RestartPolicyRulesNested<A> addNewRestartPolicyRule() {
    return new RestartPolicyRulesNested(-1, null);
  }
  
  public RestartPolicyRulesNested<A> addNewRestartPolicyRuleLike(V1ContainerRestartRule item) {
    return new RestartPolicyRulesNested(-1, item);
  }
  
  public VolumeDevicesNested<A> addNewVolumeDevice() {
    return new VolumeDevicesNested(-1, null);
  }
  
  public VolumeDevicesNested<A> addNewVolumeDeviceLike(V1VolumeDevice item) {
    return new VolumeDevicesNested(-1, item);
  }
  
  public VolumeMountsNested<A> addNewVolumeMount() {
    return new VolumeMountsNested(-1, null);
  }
  
  public VolumeMountsNested<A> addNewVolumeMountLike(V1VolumeMount item) {
    return new VolumeMountsNested(-1, item);
  }
  
  public A addToArgs(String... items) {
    if (this.args == null) {
      this.args = new ArrayList();
    }
    for (String item : items) {
      this.args.add(item);
    }
    return (A) this;
  }
  
  public A addToArgs(int index,String item) {
    if (this.args == null) {
      this.args = new ArrayList();
    }
    this.args.add(index, item);
    return (A) this;
  }
  
  public A addToCommand(String... items) {
    if (this.command == null) {
      this.command = new ArrayList();
    }
    for (String item : items) {
      this.command.add(item);
    }
    return (A) this;
  }
  
  public A addToCommand(int index,String item) {
    if (this.command == null) {
      this.command = new ArrayList();
    }
    this.command.add(index, item);
    return (A) this;
  }
  
  public A addToEnv(V1EnvVar... items) {
    if (this.env == null) {
      this.env = new ArrayList();
    }
    for (V1EnvVar item : items) {
        V1EnvVarBuilder builder = new V1EnvVarBuilder(item);
        _visitables.get("env").add(builder);
        this.env.add(builder);
    }
    return (A) this;
  }
  
  public A addToEnv(int index,V1EnvVar item) {
    if (this.env == null) {
      this.env = new ArrayList();
    }
    V1EnvVarBuilder builder = new V1EnvVarBuilder(item);
    if (index < 0 || index >= env.size()) {
        _visitables.get("env").add(builder);
        env.add(builder);
    } else {
        _visitables.get("env").add(builder);
        env.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToEnvFrom(V1EnvFromSource... items) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList();
    }
    for (V1EnvFromSource item : items) {
        V1EnvFromSourceBuilder builder = new V1EnvFromSourceBuilder(item);
        _visitables.get("envFrom").add(builder);
        this.envFrom.add(builder);
    }
    return (A) this;
  }
  
  public A addToEnvFrom(int index,V1EnvFromSource item) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList();
    }
    V1EnvFromSourceBuilder builder = new V1EnvFromSourceBuilder(item);
    if (index < 0 || index >= envFrom.size()) {
        _visitables.get("envFrom").add(builder);
        envFrom.add(builder);
    } else {
        _visitables.get("envFrom").add(builder);
        envFrom.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToPorts(V1ContainerPort... items) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    for (V1ContainerPort item : items) {
        V1ContainerPortBuilder builder = new V1ContainerPortBuilder(item);
        _visitables.get("ports").add(builder);
        this.ports.add(builder);
    }
    return (A) this;
  }
  
  public A addToPorts(int index,V1ContainerPort item) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    V1ContainerPortBuilder builder = new V1ContainerPortBuilder(item);
    if (index < 0 || index >= ports.size()) {
        _visitables.get("ports").add(builder);
        ports.add(builder);
    } else {
        _visitables.get("ports").add(builder);
        ports.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToResizePolicy(V1ContainerResizePolicy... items) {
    if (this.resizePolicy == null) {
      this.resizePolicy = new ArrayList();
    }
    for (V1ContainerResizePolicy item : items) {
        V1ContainerResizePolicyBuilder builder = new V1ContainerResizePolicyBuilder(item);
        _visitables.get("resizePolicy").add(builder);
        this.resizePolicy.add(builder);
    }
    return (A) this;
  }
  
  public A addToResizePolicy(int index,V1ContainerResizePolicy item) {
    if (this.resizePolicy == null) {
      this.resizePolicy = new ArrayList();
    }
    V1ContainerResizePolicyBuilder builder = new V1ContainerResizePolicyBuilder(item);
    if (index < 0 || index >= resizePolicy.size()) {
        _visitables.get("resizePolicy").add(builder);
        resizePolicy.add(builder);
    } else {
        _visitables.get("resizePolicy").add(builder);
        resizePolicy.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToRestartPolicyRules(V1ContainerRestartRule... items) {
    if (this.restartPolicyRules == null) {
      this.restartPolicyRules = new ArrayList();
    }
    for (V1ContainerRestartRule item : items) {
        V1ContainerRestartRuleBuilder builder = new V1ContainerRestartRuleBuilder(item);
        _visitables.get("restartPolicyRules").add(builder);
        this.restartPolicyRules.add(builder);
    }
    return (A) this;
  }
  
  public A addToRestartPolicyRules(int index,V1ContainerRestartRule item) {
    if (this.restartPolicyRules == null) {
      this.restartPolicyRules = new ArrayList();
    }
    V1ContainerRestartRuleBuilder builder = new V1ContainerRestartRuleBuilder(item);
    if (index < 0 || index >= restartPolicyRules.size()) {
        _visitables.get("restartPolicyRules").add(builder);
        restartPolicyRules.add(builder);
    } else {
        _visitables.get("restartPolicyRules").add(builder);
        restartPolicyRules.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToVolumeDevices(V1VolumeDevice... items) {
    if (this.volumeDevices == null) {
      this.volumeDevices = new ArrayList();
    }
    for (V1VolumeDevice item : items) {
        V1VolumeDeviceBuilder builder = new V1VolumeDeviceBuilder(item);
        _visitables.get("volumeDevices").add(builder);
        this.volumeDevices.add(builder);
    }
    return (A) this;
  }
  
  public A addToVolumeDevices(int index,V1VolumeDevice item) {
    if (this.volumeDevices == null) {
      this.volumeDevices = new ArrayList();
    }
    V1VolumeDeviceBuilder builder = new V1VolumeDeviceBuilder(item);
    if (index < 0 || index >= volumeDevices.size()) {
        _visitables.get("volumeDevices").add(builder);
        volumeDevices.add(builder);
    } else {
        _visitables.get("volumeDevices").add(builder);
        volumeDevices.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToVolumeMounts(V1VolumeMount... items) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList();
    }
    for (V1VolumeMount item : items) {
        V1VolumeMountBuilder builder = new V1VolumeMountBuilder(item);
        _visitables.get("volumeMounts").add(builder);
        this.volumeMounts.add(builder);
    }
    return (A) this;
  }
  
  public A addToVolumeMounts(int index,V1VolumeMount item) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList();
    }
    V1VolumeMountBuilder builder = new V1VolumeMountBuilder(item);
    if (index < 0 || index >= volumeMounts.size()) {
        _visitables.get("volumeMounts").add(builder);
        volumeMounts.add(builder);
    } else {
        _visitables.get("volumeMounts").add(builder);
        volumeMounts.add(index, builder);
    }
    return (A) this;
  }
  
  public List<V1EnvVar> buildEnv() {
    return this.env != null ? build(env) : null;
  }
  
  public V1EnvVar buildEnv(int index) {
    return this.env.get(index).build();
  }
  
  public List<V1EnvFromSource> buildEnvFrom() {
    return this.envFrom != null ? build(envFrom) : null;
  }
  
  public V1EnvFromSource buildEnvFrom(int index) {
    return this.envFrom.get(index).build();
  }
  
  public V1EnvVar buildFirstEnv() {
    return this.env.get(0).build();
  }
  
  public V1EnvFromSource buildFirstEnvFrom() {
    return this.envFrom.get(0).build();
  }
  
  public V1ContainerPort buildFirstPort() {
    return this.ports.get(0).build();
  }
  
  public V1ContainerResizePolicy buildFirstResizePolicy() {
    return this.resizePolicy.get(0).build();
  }
  
  public V1ContainerRestartRule buildFirstRestartPolicyRule() {
    return this.restartPolicyRules.get(0).build();
  }
  
  public V1VolumeDevice buildFirstVolumeDevice() {
    return this.volumeDevices.get(0).build();
  }
  
  public V1VolumeMount buildFirstVolumeMount() {
    return this.volumeMounts.get(0).build();
  }
  
  public V1EnvVar buildLastEnv() {
    return this.env.get(env.size() - 1).build();
  }
  
  public V1EnvFromSource buildLastEnvFrom() {
    return this.envFrom.get(envFrom.size() - 1).build();
  }
  
  public V1ContainerPort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  
  public V1ContainerResizePolicy buildLastResizePolicy() {
    return this.resizePolicy.get(resizePolicy.size() - 1).build();
  }
  
  public V1ContainerRestartRule buildLastRestartPolicyRule() {
    return this.restartPolicyRules.get(restartPolicyRules.size() - 1).build();
  }
  
  public V1VolumeDevice buildLastVolumeDevice() {
    return this.volumeDevices.get(volumeDevices.size() - 1).build();
  }
  
  public V1VolumeMount buildLastVolumeMount() {
    return this.volumeMounts.get(volumeMounts.size() - 1).build();
  }
  
  public V1Lifecycle buildLifecycle() {
    return this.lifecycle != null ? this.lifecycle.build() : null;
  }
  
  public V1Probe buildLivenessProbe() {
    return this.livenessProbe != null ? this.livenessProbe.build() : null;
  }
  
  public V1EnvVar buildMatchingEnv(Predicate<V1EnvVarBuilder> predicate) {
      for (V1EnvVarBuilder item : env) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1EnvFromSource buildMatchingEnvFrom(Predicate<V1EnvFromSourceBuilder> predicate) {
      for (V1EnvFromSourceBuilder item : envFrom) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1ContainerPort buildMatchingPort(Predicate<V1ContainerPortBuilder> predicate) {
      for (V1ContainerPortBuilder item : ports) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1ContainerResizePolicy buildMatchingResizePolicy(Predicate<V1ContainerResizePolicyBuilder> predicate) {
      for (V1ContainerResizePolicyBuilder item : resizePolicy) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1ContainerRestartRule buildMatchingRestartPolicyRule(Predicate<V1ContainerRestartRuleBuilder> predicate) {
      for (V1ContainerRestartRuleBuilder item : restartPolicyRules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1VolumeDevice buildMatchingVolumeDevice(Predicate<V1VolumeDeviceBuilder> predicate) {
      for (V1VolumeDeviceBuilder item : volumeDevices) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1VolumeMount buildMatchingVolumeMount(Predicate<V1VolumeMountBuilder> predicate) {
      for (V1VolumeMountBuilder item : volumeMounts) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1ContainerPort buildPort(int index) {
    return this.ports.get(index).build();
  }
  
  public List<V1ContainerPort> buildPorts() {
    return this.ports != null ? build(ports) : null;
  }
  
  public V1Probe buildReadinessProbe() {
    return this.readinessProbe != null ? this.readinessProbe.build() : null;
  }
  
  public List<V1ContainerResizePolicy> buildResizePolicy() {
    return this.resizePolicy != null ? build(resizePolicy) : null;
  }
  
  public V1ContainerResizePolicy buildResizePolicy(int index) {
    return this.resizePolicy.get(index).build();
  }
  
  public V1ResourceRequirements buildResources() {
    return this.resources != null ? this.resources.build() : null;
  }
  
  public V1ContainerRestartRule buildRestartPolicyRule(int index) {
    return this.restartPolicyRules.get(index).build();
  }
  
  public List<V1ContainerRestartRule> buildRestartPolicyRules() {
    return this.restartPolicyRules != null ? build(restartPolicyRules) : null;
  }
  
  public V1SecurityContext buildSecurityContext() {
    return this.securityContext != null ? this.securityContext.build() : null;
  }
  
  public V1Probe buildStartupProbe() {
    return this.startupProbe != null ? this.startupProbe.build() : null;
  }
  
  public V1VolumeDevice buildVolumeDevice(int index) {
    return this.volumeDevices.get(index).build();
  }
  
  public List<V1VolumeDevice> buildVolumeDevices() {
    return this.volumeDevices != null ? build(volumeDevices) : null;
  }
  
  public V1VolumeMount buildVolumeMount(int index) {
    return this.volumeMounts.get(index).build();
  }
  
  public List<V1VolumeMount> buildVolumeMounts() {
    return this.volumeMounts != null ? build(volumeMounts) : null;
  }
  
  protected void copyInstance(V1EphemeralContainer instance) {
    instance = instance != null ? instance : new V1EphemeralContainer();
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
        this.withRestartPolicy(instance.getRestartPolicy());
        this.withRestartPolicyRules(instance.getRestartPolicyRules());
        this.withSecurityContext(instance.getSecurityContext());
        this.withStartupProbe(instance.getStartupProbe());
        this.withStdin(instance.getStdin());
        this.withStdinOnce(instance.getStdinOnce());
        this.withTargetContainerName(instance.getTargetContainerName());
        this.withTerminationMessagePath(instance.getTerminationMessagePath());
        this.withTerminationMessagePolicy(instance.getTerminationMessagePolicy());
        this.withTty(instance.getTty());
        this.withVolumeDevices(instance.getVolumeDevices());
        this.withVolumeMounts(instance.getVolumeMounts());
        this.withWorkingDir(instance.getWorkingDir());
    }
  }
  
  public EnvNested<A> editEnv(int index) {
    if (env.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "env"));
    }
    return this.setNewEnvLike(index, this.buildEnv(index));
  }
  
  public EnvFromNested<A> editEnvFrom(int index) {
    if (envFrom.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "envFrom"));
    }
    return this.setNewEnvFromLike(index, this.buildEnvFrom(index));
  }
  
  public EnvNested<A> editFirstEnv() {
    if (env.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "env"));
    }
    return this.setNewEnvLike(0, this.buildEnv(0));
  }
  
  public EnvFromNested<A> editFirstEnvFrom() {
    if (envFrom.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "envFrom"));
    }
    return this.setNewEnvFromLike(0, this.buildEnvFrom(0));
  }
  
  public PortsNested<A> editFirstPort() {
    if (ports.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "ports"));
    }
    return this.setNewPortLike(0, this.buildPort(0));
  }
  
  public ResizePolicyNested<A> editFirstResizePolicy() {
    if (resizePolicy.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "resizePolicy"));
    }
    return this.setNewResizePolicyLike(0, this.buildResizePolicy(0));
  }
  
  public RestartPolicyRulesNested<A> editFirstRestartPolicyRule() {
    if (restartPolicyRules.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "restartPolicyRules"));
    }
    return this.setNewRestartPolicyRuleLike(0, this.buildRestartPolicyRule(0));
  }
  
  public VolumeDevicesNested<A> editFirstVolumeDevice() {
    if (volumeDevices.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "volumeDevices"));
    }
    return this.setNewVolumeDeviceLike(0, this.buildVolumeDevice(0));
  }
  
  public VolumeMountsNested<A> editFirstVolumeMount() {
    if (volumeMounts.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "volumeMounts"));
    }
    return this.setNewVolumeMountLike(0, this.buildVolumeMount(0));
  }
  
  public EnvNested<A> editLastEnv() {
    int index = env.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "env"));
    }
    return this.setNewEnvLike(index, this.buildEnv(index));
  }
  
  public EnvFromNested<A> editLastEnvFrom() {
    int index = envFrom.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "envFrom"));
    }
    return this.setNewEnvFromLike(index, this.buildEnvFrom(index));
  }
  
  public PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "ports"));
    }
    return this.setNewPortLike(index, this.buildPort(index));
  }
  
  public ResizePolicyNested<A> editLastResizePolicy() {
    int index = resizePolicy.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "resizePolicy"));
    }
    return this.setNewResizePolicyLike(index, this.buildResizePolicy(index));
  }
  
  public RestartPolicyRulesNested<A> editLastRestartPolicyRule() {
    int index = restartPolicyRules.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "restartPolicyRules"));
    }
    return this.setNewRestartPolicyRuleLike(index, this.buildRestartPolicyRule(index));
  }
  
  public VolumeDevicesNested<A> editLastVolumeDevice() {
    int index = volumeDevices.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "volumeDevices"));
    }
    return this.setNewVolumeDeviceLike(index, this.buildVolumeDevice(index));
  }
  
  public VolumeMountsNested<A> editLastVolumeMount() {
    int index = volumeMounts.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "volumeMounts"));
    }
    return this.setNewVolumeMountLike(index, this.buildVolumeMount(index));
  }
  
  public LifecycleNested<A> editLifecycle() {
    return this.withNewLifecycleLike(Optional.ofNullable(this.buildLifecycle()).orElse(null));
  }
  
  public LivenessProbeNested<A> editLivenessProbe() {
    return this.withNewLivenessProbeLike(Optional.ofNullable(this.buildLivenessProbe()).orElse(null));
  }
  
  public EnvNested<A> editMatchingEnv(Predicate<V1EnvVarBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < env.size();i++) {
      if (predicate.test(env.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "env"));
    }
    return this.setNewEnvLike(index, this.buildEnv(index));
  }
  
  public EnvFromNested<A> editMatchingEnvFrom(Predicate<V1EnvFromSourceBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < envFrom.size();i++) {
      if (predicate.test(envFrom.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "envFrom"));
    }
    return this.setNewEnvFromLike(index, this.buildEnvFrom(index));
  }
  
  public PortsNested<A> editMatchingPort(Predicate<V1ContainerPortBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < ports.size();i++) {
      if (predicate.test(ports.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "ports"));
    }
    return this.setNewPortLike(index, this.buildPort(index));
  }
  
  public ResizePolicyNested<A> editMatchingResizePolicy(Predicate<V1ContainerResizePolicyBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < resizePolicy.size();i++) {
      if (predicate.test(resizePolicy.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "resizePolicy"));
    }
    return this.setNewResizePolicyLike(index, this.buildResizePolicy(index));
  }
  
  public RestartPolicyRulesNested<A> editMatchingRestartPolicyRule(Predicate<V1ContainerRestartRuleBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < restartPolicyRules.size();i++) {
      if (predicate.test(restartPolicyRules.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "restartPolicyRules"));
    }
    return this.setNewRestartPolicyRuleLike(index, this.buildRestartPolicyRule(index));
  }
  
  public VolumeDevicesNested<A> editMatchingVolumeDevice(Predicate<V1VolumeDeviceBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < volumeDevices.size();i++) {
      if (predicate.test(volumeDevices.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "volumeDevices"));
    }
    return this.setNewVolumeDeviceLike(index, this.buildVolumeDevice(index));
  }
  
  public VolumeMountsNested<A> editMatchingVolumeMount(Predicate<V1VolumeMountBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < volumeMounts.size();i++) {
      if (predicate.test(volumeMounts.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "volumeMounts"));
    }
    return this.setNewVolumeMountLike(index, this.buildVolumeMount(index));
  }
  
  public LifecycleNested<A> editOrNewLifecycle() {
    return this.withNewLifecycleLike(Optional.ofNullable(this.buildLifecycle()).orElse(new V1LifecycleBuilder().build()));
  }
  
  public LifecycleNested<A> editOrNewLifecycleLike(V1Lifecycle item) {
    return this.withNewLifecycleLike(Optional.ofNullable(this.buildLifecycle()).orElse(item));
  }
  
  public LivenessProbeNested<A> editOrNewLivenessProbe() {
    return this.withNewLivenessProbeLike(Optional.ofNullable(this.buildLivenessProbe()).orElse(new V1ProbeBuilder().build()));
  }
  
  public LivenessProbeNested<A> editOrNewLivenessProbeLike(V1Probe item) {
    return this.withNewLivenessProbeLike(Optional.ofNullable(this.buildLivenessProbe()).orElse(item));
  }
  
  public ReadinessProbeNested<A> editOrNewReadinessProbe() {
    return this.withNewReadinessProbeLike(Optional.ofNullable(this.buildReadinessProbe()).orElse(new V1ProbeBuilder().build()));
  }
  
  public ReadinessProbeNested<A> editOrNewReadinessProbeLike(V1Probe item) {
    return this.withNewReadinessProbeLike(Optional.ofNullable(this.buildReadinessProbe()).orElse(item));
  }
  
  public ResourcesNested<A> editOrNewResources() {
    return this.withNewResourcesLike(Optional.ofNullable(this.buildResources()).orElse(new V1ResourceRequirementsBuilder().build()));
  }
  
  public ResourcesNested<A> editOrNewResourcesLike(V1ResourceRequirements item) {
    return this.withNewResourcesLike(Optional.ofNullable(this.buildResources()).orElse(item));
  }
  
  public SecurityContextNested<A> editOrNewSecurityContext() {
    return this.withNewSecurityContextLike(Optional.ofNullable(this.buildSecurityContext()).orElse(new V1SecurityContextBuilder().build()));
  }
  
  public SecurityContextNested<A> editOrNewSecurityContextLike(V1SecurityContext item) {
    return this.withNewSecurityContextLike(Optional.ofNullable(this.buildSecurityContext()).orElse(item));
  }
  
  public StartupProbeNested<A> editOrNewStartupProbe() {
    return this.withNewStartupProbeLike(Optional.ofNullable(this.buildStartupProbe()).orElse(new V1ProbeBuilder().build()));
  }
  
  public StartupProbeNested<A> editOrNewStartupProbeLike(V1Probe item) {
    return this.withNewStartupProbeLike(Optional.ofNullable(this.buildStartupProbe()).orElse(item));
  }
  
  public PortsNested<A> editPort(int index) {
    if (ports.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "ports"));
    }
    return this.setNewPortLike(index, this.buildPort(index));
  }
  
  public ReadinessProbeNested<A> editReadinessProbe() {
    return this.withNewReadinessProbeLike(Optional.ofNullable(this.buildReadinessProbe()).orElse(null));
  }
  
  public ResizePolicyNested<A> editResizePolicy(int index) {
    if (resizePolicy.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "resizePolicy"));
    }
    return this.setNewResizePolicyLike(index, this.buildResizePolicy(index));
  }
  
  public ResourcesNested<A> editResources() {
    return this.withNewResourcesLike(Optional.ofNullable(this.buildResources()).orElse(null));
  }
  
  public RestartPolicyRulesNested<A> editRestartPolicyRule(int index) {
    if (restartPolicyRules.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "restartPolicyRules"));
    }
    return this.setNewRestartPolicyRuleLike(index, this.buildRestartPolicyRule(index));
  }
  
  public SecurityContextNested<A> editSecurityContext() {
    return this.withNewSecurityContextLike(Optional.ofNullable(this.buildSecurityContext()).orElse(null));
  }
  
  public StartupProbeNested<A> editStartupProbe() {
    return this.withNewStartupProbeLike(Optional.ofNullable(this.buildStartupProbe()).orElse(null));
  }
  
  public VolumeDevicesNested<A> editVolumeDevice(int index) {
    if (volumeDevices.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "volumeDevices"));
    }
    return this.setNewVolumeDeviceLike(index, this.buildVolumeDevice(index));
  }
  
  public VolumeMountsNested<A> editVolumeMount(int index) {
    if (volumeMounts.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "volumeMounts"));
    }
    return this.setNewVolumeMountLike(index, this.buildVolumeMount(index));
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
    V1EphemeralContainerFluent that = (V1EphemeralContainerFluent) o;
    if (!(Objects.equals(args, that.args))) {
      return false;
    }
    if (!(Objects.equals(command, that.command))) {
      return false;
    }
    if (!(Objects.equals(env, that.env))) {
      return false;
    }
    if (!(Objects.equals(envFrom, that.envFrom))) {
      return false;
    }
    if (!(Objects.equals(image, that.image))) {
      return false;
    }
    if (!(Objects.equals(imagePullPolicy, that.imagePullPolicy))) {
      return false;
    }
    if (!(Objects.equals(lifecycle, that.lifecycle))) {
      return false;
    }
    if (!(Objects.equals(livenessProbe, that.livenessProbe))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(ports, that.ports))) {
      return false;
    }
    if (!(Objects.equals(readinessProbe, that.readinessProbe))) {
      return false;
    }
    if (!(Objects.equals(resizePolicy, that.resizePolicy))) {
      return false;
    }
    if (!(Objects.equals(resources, that.resources))) {
      return false;
    }
    if (!(Objects.equals(restartPolicy, that.restartPolicy))) {
      return false;
    }
    if (!(Objects.equals(restartPolicyRules, that.restartPolicyRules))) {
      return false;
    }
    if (!(Objects.equals(securityContext, that.securityContext))) {
      return false;
    }
    if (!(Objects.equals(startupProbe, that.startupProbe))) {
      return false;
    }
    if (!(Objects.equals(stdin, that.stdin))) {
      return false;
    }
    if (!(Objects.equals(stdinOnce, that.stdinOnce))) {
      return false;
    }
    if (!(Objects.equals(targetContainerName, that.targetContainerName))) {
      return false;
    }
    if (!(Objects.equals(terminationMessagePath, that.terminationMessagePath))) {
      return false;
    }
    if (!(Objects.equals(terminationMessagePolicy, that.terminationMessagePolicy))) {
      return false;
    }
    if (!(Objects.equals(tty, that.tty))) {
      return false;
    }
    if (!(Objects.equals(volumeDevices, that.volumeDevices))) {
      return false;
    }
    if (!(Objects.equals(volumeMounts, that.volumeMounts))) {
      return false;
    }
    if (!(Objects.equals(workingDir, that.workingDir))) {
      return false;
    }
    return true;
  }
  
  public String getArg(int index) {
    return this.args.get(index);
  }
  
  public List<String> getArgs() {
    return this.args;
  }
  
  public List<String> getCommand() {
    return this.command;
  }
  
  public String getCommand(int index) {
    return this.command.get(index);
  }
  
  public String getFirstArg() {
    return this.args.get(0);
  }
  
  public String getFirstCommand() {
    return this.command.get(0);
  }
  
  public String getImage() {
    return this.image;
  }
  
  public String getImagePullPolicy() {
    return this.imagePullPolicy;
  }
  
  public String getLastArg() {
    return this.args.get(args.size() - 1);
  }
  
  public String getLastCommand() {
    return this.command.get(command.size() - 1);
  }
  
  public String getMatchingArg(Predicate<String> predicate) {
      for (String item : args) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingCommand(Predicate<String> predicate) {
      for (String item : command) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getRestartPolicy() {
    return this.restartPolicy;
  }
  
  public Boolean getStdin() {
    return this.stdin;
  }
  
  public Boolean getStdinOnce() {
    return this.stdinOnce;
  }
  
  public String getTargetContainerName() {
    return this.targetContainerName;
  }
  
  public String getTerminationMessagePath() {
    return this.terminationMessagePath;
  }
  
  public String getTerminationMessagePolicy() {
    return this.terminationMessagePolicy;
  }
  
  public Boolean getTty() {
    return this.tty;
  }
  
  public String getWorkingDir() {
    return this.workingDir;
  }
  
  public boolean hasArgs() {
    return this.args != null && !(this.args.isEmpty());
  }
  
  public boolean hasCommand() {
    return this.command != null && !(this.command.isEmpty());
  }
  
  public boolean hasEnv() {
    return this.env != null && !(this.env.isEmpty());
  }
  
  public boolean hasEnvFrom() {
    return this.envFrom != null && !(this.envFrom.isEmpty());
  }
  
  public boolean hasImage() {
    return this.image != null;
  }
  
  public boolean hasImagePullPolicy() {
    return this.imagePullPolicy != null;
  }
  
  public boolean hasLifecycle() {
    return this.lifecycle != null;
  }
  
  public boolean hasLivenessProbe() {
    return this.livenessProbe != null;
  }
  
  public boolean hasMatchingArg(Predicate<String> predicate) {
      for (String item : args) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingCommand(Predicate<String> predicate) {
      for (String item : command) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingEnv(Predicate<V1EnvVarBuilder> predicate) {
      for (V1EnvVarBuilder item : env) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingEnvFrom(Predicate<V1EnvFromSourceBuilder> predicate) {
      for (V1EnvFromSourceBuilder item : envFrom) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingPort(Predicate<V1ContainerPortBuilder> predicate) {
      for (V1ContainerPortBuilder item : ports) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingResizePolicy(Predicate<V1ContainerResizePolicyBuilder> predicate) {
      for (V1ContainerResizePolicyBuilder item : resizePolicy) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingRestartPolicyRule(Predicate<V1ContainerRestartRuleBuilder> predicate) {
      for (V1ContainerRestartRuleBuilder item : restartPolicyRules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingVolumeDevice(Predicate<V1VolumeDeviceBuilder> predicate) {
      for (V1VolumeDeviceBuilder item : volumeDevices) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingVolumeMount(Predicate<V1VolumeMountBuilder> predicate) {
      for (V1VolumeMountBuilder item : volumeMounts) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasPorts() {
    return this.ports != null && !(this.ports.isEmpty());
  }
  
  public boolean hasReadinessProbe() {
    return this.readinessProbe != null;
  }
  
  public boolean hasResizePolicy() {
    return this.resizePolicy != null && !(this.resizePolicy.isEmpty());
  }
  
  public boolean hasResources() {
    return this.resources != null;
  }
  
  public boolean hasRestartPolicy() {
    return this.restartPolicy != null;
  }
  
  public boolean hasRestartPolicyRules() {
    return this.restartPolicyRules != null && !(this.restartPolicyRules.isEmpty());
  }
  
  public boolean hasSecurityContext() {
    return this.securityContext != null;
  }
  
  public boolean hasStartupProbe() {
    return this.startupProbe != null;
  }
  
  public boolean hasStdin() {
    return this.stdin != null;
  }
  
  public boolean hasStdinOnce() {
    return this.stdinOnce != null;
  }
  
  public boolean hasTargetContainerName() {
    return this.targetContainerName != null;
  }
  
  public boolean hasTerminationMessagePath() {
    return this.terminationMessagePath != null;
  }
  
  public boolean hasTerminationMessagePolicy() {
    return this.terminationMessagePolicy != null;
  }
  
  public boolean hasTty() {
    return this.tty != null;
  }
  
  public boolean hasVolumeDevices() {
    return this.volumeDevices != null && !(this.volumeDevices.isEmpty());
  }
  
  public boolean hasVolumeMounts() {
    return this.volumeMounts != null && !(this.volumeMounts.isEmpty());
  }
  
  public boolean hasWorkingDir() {
    return this.workingDir != null;
  }
  
  public int hashCode() {
    return Objects.hash(args, command, env, envFrom, image, imagePullPolicy, lifecycle, livenessProbe, name, ports, readinessProbe, resizePolicy, resources, restartPolicy, restartPolicyRules, securityContext, startupProbe, stdin, stdinOnce, targetContainerName, terminationMessagePath, terminationMessagePolicy, tty, volumeDevices, volumeMounts, workingDir);
  }
  
  public A removeAllFromArgs(Collection<String> items) {
    if (this.args == null) {
      return (A) this;
    }
    for (String item : items) {
      this.args.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromCommand(Collection<String> items) {
    if (this.command == null) {
      return (A) this;
    }
    for (String item : items) {
      this.command.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromEnv(Collection<V1EnvVar> items) {
    if (this.env == null) {
      return (A) this;
    }
    for (V1EnvVar item : items) {
        V1EnvVarBuilder builder = new V1EnvVarBuilder(item);
        _visitables.get("env").remove(builder);
        this.env.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromEnvFrom(Collection<V1EnvFromSource> items) {
    if (this.envFrom == null) {
      return (A) this;
    }
    for (V1EnvFromSource item : items) {
        V1EnvFromSourceBuilder builder = new V1EnvFromSourceBuilder(item);
        _visitables.get("envFrom").remove(builder);
        this.envFrom.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromPorts(Collection<V1ContainerPort> items) {
    if (this.ports == null) {
      return (A) this;
    }
    for (V1ContainerPort item : items) {
        V1ContainerPortBuilder builder = new V1ContainerPortBuilder(item);
        _visitables.get("ports").remove(builder);
        this.ports.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromResizePolicy(Collection<V1ContainerResizePolicy> items) {
    if (this.resizePolicy == null) {
      return (A) this;
    }
    for (V1ContainerResizePolicy item : items) {
        V1ContainerResizePolicyBuilder builder = new V1ContainerResizePolicyBuilder(item);
        _visitables.get("resizePolicy").remove(builder);
        this.resizePolicy.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromRestartPolicyRules(Collection<V1ContainerRestartRule> items) {
    if (this.restartPolicyRules == null) {
      return (A) this;
    }
    for (V1ContainerRestartRule item : items) {
        V1ContainerRestartRuleBuilder builder = new V1ContainerRestartRuleBuilder(item);
        _visitables.get("restartPolicyRules").remove(builder);
        this.restartPolicyRules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromVolumeDevices(Collection<V1VolumeDevice> items) {
    if (this.volumeDevices == null) {
      return (A) this;
    }
    for (V1VolumeDevice item : items) {
        V1VolumeDeviceBuilder builder = new V1VolumeDeviceBuilder(item);
        _visitables.get("volumeDevices").remove(builder);
        this.volumeDevices.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromVolumeMounts(Collection<V1VolumeMount> items) {
    if (this.volumeMounts == null) {
      return (A) this;
    }
    for (V1VolumeMount item : items) {
        V1VolumeMountBuilder builder = new V1VolumeMountBuilder(item);
        _visitables.get("volumeMounts").remove(builder);
        this.volumeMounts.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromArgs(String... items) {
    if (this.args == null) {
      return (A) this;
    }
    for (String item : items) {
      this.args.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromCommand(String... items) {
    if (this.command == null) {
      return (A) this;
    }
    for (String item : items) {
      this.command.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromEnv(V1EnvVar... items) {
    if (this.env == null) {
      return (A) this;
    }
    for (V1EnvVar item : items) {
        V1EnvVarBuilder builder = new V1EnvVarBuilder(item);
        _visitables.get("env").remove(builder);
        this.env.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromEnvFrom(V1EnvFromSource... items) {
    if (this.envFrom == null) {
      return (A) this;
    }
    for (V1EnvFromSource item : items) {
        V1EnvFromSourceBuilder builder = new V1EnvFromSourceBuilder(item);
        _visitables.get("envFrom").remove(builder);
        this.envFrom.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromPorts(V1ContainerPort... items) {
    if (this.ports == null) {
      return (A) this;
    }
    for (V1ContainerPort item : items) {
        V1ContainerPortBuilder builder = new V1ContainerPortBuilder(item);
        _visitables.get("ports").remove(builder);
        this.ports.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromResizePolicy(V1ContainerResizePolicy... items) {
    if (this.resizePolicy == null) {
      return (A) this;
    }
    for (V1ContainerResizePolicy item : items) {
        V1ContainerResizePolicyBuilder builder = new V1ContainerResizePolicyBuilder(item);
        _visitables.get("resizePolicy").remove(builder);
        this.resizePolicy.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromRestartPolicyRules(V1ContainerRestartRule... items) {
    if (this.restartPolicyRules == null) {
      return (A) this;
    }
    for (V1ContainerRestartRule item : items) {
        V1ContainerRestartRuleBuilder builder = new V1ContainerRestartRuleBuilder(item);
        _visitables.get("restartPolicyRules").remove(builder);
        this.restartPolicyRules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromVolumeDevices(V1VolumeDevice... items) {
    if (this.volumeDevices == null) {
      return (A) this;
    }
    for (V1VolumeDevice item : items) {
        V1VolumeDeviceBuilder builder = new V1VolumeDeviceBuilder(item);
        _visitables.get("volumeDevices").remove(builder);
        this.volumeDevices.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromVolumeMounts(V1VolumeMount... items) {
    if (this.volumeMounts == null) {
      return (A) this;
    }
    for (V1VolumeMount item : items) {
        V1VolumeMountBuilder builder = new V1VolumeMountBuilder(item);
        _visitables.get("volumeMounts").remove(builder);
        this.volumeMounts.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromEnv(Predicate<V1EnvVarBuilder> predicate) {
    if (env == null) {
      return (A) this;
    }
    Iterator<V1EnvVarBuilder> each = env.iterator();
    List visitables = _visitables.get("env");
    while (each.hasNext()) {
        V1EnvVarBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromEnvFrom(Predicate<V1EnvFromSourceBuilder> predicate) {
    if (envFrom == null) {
      return (A) this;
    }
    Iterator<V1EnvFromSourceBuilder> each = envFrom.iterator();
    List visitables = _visitables.get("envFrom");
    while (each.hasNext()) {
        V1EnvFromSourceBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromPorts(Predicate<V1ContainerPortBuilder> predicate) {
    if (ports == null) {
      return (A) this;
    }
    Iterator<V1ContainerPortBuilder> each = ports.iterator();
    List visitables = _visitables.get("ports");
    while (each.hasNext()) {
        V1ContainerPortBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromResizePolicy(Predicate<V1ContainerResizePolicyBuilder> predicate) {
    if (resizePolicy == null) {
      return (A) this;
    }
    Iterator<V1ContainerResizePolicyBuilder> each = resizePolicy.iterator();
    List visitables = _visitables.get("resizePolicy");
    while (each.hasNext()) {
        V1ContainerResizePolicyBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromRestartPolicyRules(Predicate<V1ContainerRestartRuleBuilder> predicate) {
    if (restartPolicyRules == null) {
      return (A) this;
    }
    Iterator<V1ContainerRestartRuleBuilder> each = restartPolicyRules.iterator();
    List visitables = _visitables.get("restartPolicyRules");
    while (each.hasNext()) {
        V1ContainerRestartRuleBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromVolumeDevices(Predicate<V1VolumeDeviceBuilder> predicate) {
    if (volumeDevices == null) {
      return (A) this;
    }
    Iterator<V1VolumeDeviceBuilder> each = volumeDevices.iterator();
    List visitables = _visitables.get("volumeDevices");
    while (each.hasNext()) {
        V1VolumeDeviceBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromVolumeMounts(Predicate<V1VolumeMountBuilder> predicate) {
    if (volumeMounts == null) {
      return (A) this;
    }
    Iterator<V1VolumeMountBuilder> each = volumeMounts.iterator();
    List visitables = _visitables.get("volumeMounts");
    while (each.hasNext()) {
        V1VolumeMountBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public EnvFromNested<A> setNewEnvFromLike(int index,V1EnvFromSource item) {
    return new EnvFromNested(index, item);
  }
  
  public EnvNested<A> setNewEnvLike(int index,V1EnvVar item) {
    return new EnvNested(index, item);
  }
  
  public PortsNested<A> setNewPortLike(int index,V1ContainerPort item) {
    return new PortsNested(index, item);
  }
  
  public ResizePolicyNested<A> setNewResizePolicyLike(int index,V1ContainerResizePolicy item) {
    return new ResizePolicyNested(index, item);
  }
  
  public RestartPolicyRulesNested<A> setNewRestartPolicyRuleLike(int index,V1ContainerRestartRule item) {
    return new RestartPolicyRulesNested(index, item);
  }
  
  public VolumeDevicesNested<A> setNewVolumeDeviceLike(int index,V1VolumeDevice item) {
    return new VolumeDevicesNested(index, item);
  }
  
  public VolumeMountsNested<A> setNewVolumeMountLike(int index,V1VolumeMount item) {
    return new VolumeMountsNested(index, item);
  }
  
  public A setToArgs(int index,String item) {
    if (this.args == null) {
      this.args = new ArrayList();
    }
    this.args.set(index, item);
    return (A) this;
  }
  
  public A setToCommand(int index,String item) {
    if (this.command == null) {
      this.command = new ArrayList();
    }
    this.command.set(index, item);
    return (A) this;
  }
  
  public A setToEnv(int index,V1EnvVar item) {
    if (this.env == null) {
      this.env = new ArrayList();
    }
    V1EnvVarBuilder builder = new V1EnvVarBuilder(item);
    if (index < 0 || index >= env.size()) {
        _visitables.get("env").add(builder);
        env.add(builder);
    } else {
        _visitables.get("env").add(builder);
        env.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToEnvFrom(int index,V1EnvFromSource item) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList();
    }
    V1EnvFromSourceBuilder builder = new V1EnvFromSourceBuilder(item);
    if (index < 0 || index >= envFrom.size()) {
        _visitables.get("envFrom").add(builder);
        envFrom.add(builder);
    } else {
        _visitables.get("envFrom").add(builder);
        envFrom.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToPorts(int index,V1ContainerPort item) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    V1ContainerPortBuilder builder = new V1ContainerPortBuilder(item);
    if (index < 0 || index >= ports.size()) {
        _visitables.get("ports").add(builder);
        ports.add(builder);
    } else {
        _visitables.get("ports").add(builder);
        ports.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToResizePolicy(int index,V1ContainerResizePolicy item) {
    if (this.resizePolicy == null) {
      this.resizePolicy = new ArrayList();
    }
    V1ContainerResizePolicyBuilder builder = new V1ContainerResizePolicyBuilder(item);
    if (index < 0 || index >= resizePolicy.size()) {
        _visitables.get("resizePolicy").add(builder);
        resizePolicy.add(builder);
    } else {
        _visitables.get("resizePolicy").add(builder);
        resizePolicy.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToRestartPolicyRules(int index,V1ContainerRestartRule item) {
    if (this.restartPolicyRules == null) {
      this.restartPolicyRules = new ArrayList();
    }
    V1ContainerRestartRuleBuilder builder = new V1ContainerRestartRuleBuilder(item);
    if (index < 0 || index >= restartPolicyRules.size()) {
        _visitables.get("restartPolicyRules").add(builder);
        restartPolicyRules.add(builder);
    } else {
        _visitables.get("restartPolicyRules").add(builder);
        restartPolicyRules.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToVolumeDevices(int index,V1VolumeDevice item) {
    if (this.volumeDevices == null) {
      this.volumeDevices = new ArrayList();
    }
    V1VolumeDeviceBuilder builder = new V1VolumeDeviceBuilder(item);
    if (index < 0 || index >= volumeDevices.size()) {
        _visitables.get("volumeDevices").add(builder);
        volumeDevices.add(builder);
    } else {
        _visitables.get("volumeDevices").add(builder);
        volumeDevices.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToVolumeMounts(int index,V1VolumeMount item) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList();
    }
    V1VolumeMountBuilder builder = new V1VolumeMountBuilder(item);
    if (index < 0 || index >= volumeMounts.size()) {
        _visitables.get("volumeMounts").add(builder);
        volumeMounts.add(builder);
    } else {
        _visitables.get("volumeMounts").add(builder);
        volumeMounts.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(args == null) && !(args.isEmpty())) {
        sb.append("args:");
        sb.append(args);
        sb.append(",");
    }
    if (!(command == null) && !(command.isEmpty())) {
        sb.append("command:");
        sb.append(command);
        sb.append(",");
    }
    if (!(env == null) && !(env.isEmpty())) {
        sb.append("env:");
        sb.append(env);
        sb.append(",");
    }
    if (!(envFrom == null) && !(envFrom.isEmpty())) {
        sb.append("envFrom:");
        sb.append(envFrom);
        sb.append(",");
    }
    if (!(image == null)) {
        sb.append("image:");
        sb.append(image);
        sb.append(",");
    }
    if (!(imagePullPolicy == null)) {
        sb.append("imagePullPolicy:");
        sb.append(imagePullPolicy);
        sb.append(",");
    }
    if (!(lifecycle == null)) {
        sb.append("lifecycle:");
        sb.append(lifecycle);
        sb.append(",");
    }
    if (!(livenessProbe == null)) {
        sb.append("livenessProbe:");
        sb.append(livenessProbe);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(ports == null) && !(ports.isEmpty())) {
        sb.append("ports:");
        sb.append(ports);
        sb.append(",");
    }
    if (!(readinessProbe == null)) {
        sb.append("readinessProbe:");
        sb.append(readinessProbe);
        sb.append(",");
    }
    if (!(resizePolicy == null) && !(resizePolicy.isEmpty())) {
        sb.append("resizePolicy:");
        sb.append(resizePolicy);
        sb.append(",");
    }
    if (!(resources == null)) {
        sb.append("resources:");
        sb.append(resources);
        sb.append(",");
    }
    if (!(restartPolicy == null)) {
        sb.append("restartPolicy:");
        sb.append(restartPolicy);
        sb.append(",");
    }
    if (!(restartPolicyRules == null) && !(restartPolicyRules.isEmpty())) {
        sb.append("restartPolicyRules:");
        sb.append(restartPolicyRules);
        sb.append(",");
    }
    if (!(securityContext == null)) {
        sb.append("securityContext:");
        sb.append(securityContext);
        sb.append(",");
    }
    if (!(startupProbe == null)) {
        sb.append("startupProbe:");
        sb.append(startupProbe);
        sb.append(",");
    }
    if (!(stdin == null)) {
        sb.append("stdin:");
        sb.append(stdin);
        sb.append(",");
    }
    if (!(stdinOnce == null)) {
        sb.append("stdinOnce:");
        sb.append(stdinOnce);
        sb.append(",");
    }
    if (!(targetContainerName == null)) {
        sb.append("targetContainerName:");
        sb.append(targetContainerName);
        sb.append(",");
    }
    if (!(terminationMessagePath == null)) {
        sb.append("terminationMessagePath:");
        sb.append(terminationMessagePath);
        sb.append(",");
    }
    if (!(terminationMessagePolicy == null)) {
        sb.append("terminationMessagePolicy:");
        sb.append(terminationMessagePolicy);
        sb.append(",");
    }
    if (!(tty == null)) {
        sb.append("tty:");
        sb.append(tty);
        sb.append(",");
    }
    if (!(volumeDevices == null) && !(volumeDevices.isEmpty())) {
        sb.append("volumeDevices:");
        sb.append(volumeDevices);
        sb.append(",");
    }
    if (!(volumeMounts == null) && !(volumeMounts.isEmpty())) {
        sb.append("volumeMounts:");
        sb.append(volumeMounts);
        sb.append(",");
    }
    if (!(workingDir == null)) {
        sb.append("workingDir:");
        sb.append(workingDir);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withArgs(List<String> args) {
    if (args != null) {
        this.args = new ArrayList();
        for (String item : args) {
          this.addToArgs(item);
        }
    } else {
      this.args = null;
    }
    return (A) this;
  }
  
  public A withArgs(String... args) {
    if (this.args != null) {
        this.args.clear();
        _visitables.remove("args");
    }
    if (args != null) {
      for (String item : args) {
        this.addToArgs(item);
      }
    }
    return (A) this;
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
  
  public A withCommand(String... command) {
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
  
  public A withEnv(List<V1EnvVar> env) {
    if (this.env != null) {
      this._visitables.get("env").clear();
    }
    if (env != null) {
        this.env = new ArrayList();
        for (V1EnvVar item : env) {
          this.addToEnv(item);
        }
    } else {
      this.env = null;
    }
    return (A) this;
  }
  
  public A withEnv(V1EnvVar... env) {
    if (this.env != null) {
        this.env.clear();
        _visitables.remove("env");
    }
    if (env != null) {
      for (V1EnvVar item : env) {
        this.addToEnv(item);
      }
    }
    return (A) this;
  }
  
  public A withEnvFrom(List<V1EnvFromSource> envFrom) {
    if (this.envFrom != null) {
      this._visitables.get("envFrom").clear();
    }
    if (envFrom != null) {
        this.envFrom = new ArrayList();
        for (V1EnvFromSource item : envFrom) {
          this.addToEnvFrom(item);
        }
    } else {
      this.envFrom = null;
    }
    return (A) this;
  }
  
  public A withEnvFrom(V1EnvFromSource... envFrom) {
    if (this.envFrom != null) {
        this.envFrom.clear();
        _visitables.remove("envFrom");
    }
    if (envFrom != null) {
      for (V1EnvFromSource item : envFrom) {
        this.addToEnvFrom(item);
      }
    }
    return (A) this;
  }
  
  public A withImage(String image) {
    this.image = image;
    return (A) this;
  }
  
  public A withImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return (A) this;
  }
  
  public A withLifecycle(V1Lifecycle lifecycle) {
    this._visitables.remove("lifecycle");
    if (lifecycle != null) {
        this.lifecycle = new V1LifecycleBuilder(lifecycle);
        this._visitables.get("lifecycle").add(this.lifecycle);
    } else {
        this.lifecycle = null;
        this._visitables.get("lifecycle").remove(this.lifecycle);
    }
    return (A) this;
  }
  
  public A withLivenessProbe(V1Probe livenessProbe) {
    this._visitables.remove("livenessProbe");
    if (livenessProbe != null) {
        this.livenessProbe = new V1ProbeBuilder(livenessProbe);
        this._visitables.get("livenessProbe").add(this.livenessProbe);
    } else {
        this.livenessProbe = null;
        this._visitables.get("livenessProbe").remove(this.livenessProbe);
    }
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public LifecycleNested<A> withNewLifecycle() {
    return new LifecycleNested(null);
  }
  
  public LifecycleNested<A> withNewLifecycleLike(V1Lifecycle item) {
    return new LifecycleNested(item);
  }
  
  public LivenessProbeNested<A> withNewLivenessProbe() {
    return new LivenessProbeNested(null);
  }
  
  public LivenessProbeNested<A> withNewLivenessProbeLike(V1Probe item) {
    return new LivenessProbeNested(item);
  }
  
  public ReadinessProbeNested<A> withNewReadinessProbe() {
    return new ReadinessProbeNested(null);
  }
  
  public ReadinessProbeNested<A> withNewReadinessProbeLike(V1Probe item) {
    return new ReadinessProbeNested(item);
  }
  
  public ResourcesNested<A> withNewResources() {
    return new ResourcesNested(null);
  }
  
  public ResourcesNested<A> withNewResourcesLike(V1ResourceRequirements item) {
    return new ResourcesNested(item);
  }
  
  public SecurityContextNested<A> withNewSecurityContext() {
    return new SecurityContextNested(null);
  }
  
  public SecurityContextNested<A> withNewSecurityContextLike(V1SecurityContext item) {
    return new SecurityContextNested(item);
  }
  
  public StartupProbeNested<A> withNewStartupProbe() {
    return new StartupProbeNested(null);
  }
  
  public StartupProbeNested<A> withNewStartupProbeLike(V1Probe item) {
    return new StartupProbeNested(item);
  }
  
  public A withPorts(List<V1ContainerPort> ports) {
    if (this.ports != null) {
      this._visitables.get("ports").clear();
    }
    if (ports != null) {
        this.ports = new ArrayList();
        for (V1ContainerPort item : ports) {
          this.addToPorts(item);
        }
    } else {
      this.ports = null;
    }
    return (A) this;
  }
  
  public A withPorts(V1ContainerPort... ports) {
    if (this.ports != null) {
        this.ports.clear();
        _visitables.remove("ports");
    }
    if (ports != null) {
      for (V1ContainerPort item : ports) {
        this.addToPorts(item);
      }
    }
    return (A) this;
  }
  
  public A withReadinessProbe(V1Probe readinessProbe) {
    this._visitables.remove("readinessProbe");
    if (readinessProbe != null) {
        this.readinessProbe = new V1ProbeBuilder(readinessProbe);
        this._visitables.get("readinessProbe").add(this.readinessProbe);
    } else {
        this.readinessProbe = null;
        this._visitables.get("readinessProbe").remove(this.readinessProbe);
    }
    return (A) this;
  }
  
  public A withResizePolicy(List<V1ContainerResizePolicy> resizePolicy) {
    if (this.resizePolicy != null) {
      this._visitables.get("resizePolicy").clear();
    }
    if (resizePolicy != null) {
        this.resizePolicy = new ArrayList();
        for (V1ContainerResizePolicy item : resizePolicy) {
          this.addToResizePolicy(item);
        }
    } else {
      this.resizePolicy = null;
    }
    return (A) this;
  }
  
  public A withResizePolicy(V1ContainerResizePolicy... resizePolicy) {
    if (this.resizePolicy != null) {
        this.resizePolicy.clear();
        _visitables.remove("resizePolicy");
    }
    if (resizePolicy != null) {
      for (V1ContainerResizePolicy item : resizePolicy) {
        this.addToResizePolicy(item);
      }
    }
    return (A) this;
  }
  
  public A withResources(V1ResourceRequirements resources) {
    this._visitables.remove("resources");
    if (resources != null) {
        this.resources = new V1ResourceRequirementsBuilder(resources);
        this._visitables.get("resources").add(this.resources);
    } else {
        this.resources = null;
        this._visitables.get("resources").remove(this.resources);
    }
    return (A) this;
  }
  
  public A withRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return (A) this;
  }
  
  public A withRestartPolicyRules(List<V1ContainerRestartRule> restartPolicyRules) {
    if (this.restartPolicyRules != null) {
      this._visitables.get("restartPolicyRules").clear();
    }
    if (restartPolicyRules != null) {
        this.restartPolicyRules = new ArrayList();
        for (V1ContainerRestartRule item : restartPolicyRules) {
          this.addToRestartPolicyRules(item);
        }
    } else {
      this.restartPolicyRules = null;
    }
    return (A) this;
  }
  
  public A withRestartPolicyRules(V1ContainerRestartRule... restartPolicyRules) {
    if (this.restartPolicyRules != null) {
        this.restartPolicyRules.clear();
        _visitables.remove("restartPolicyRules");
    }
    if (restartPolicyRules != null) {
      for (V1ContainerRestartRule item : restartPolicyRules) {
        this.addToRestartPolicyRules(item);
      }
    }
    return (A) this;
  }
  
  public A withSecurityContext(V1SecurityContext securityContext) {
    this._visitables.remove("securityContext");
    if (securityContext != null) {
        this.securityContext = new V1SecurityContextBuilder(securityContext);
        this._visitables.get("securityContext").add(this.securityContext);
    } else {
        this.securityContext = null;
        this._visitables.get("securityContext").remove(this.securityContext);
    }
    return (A) this;
  }
  
  public A withStartupProbe(V1Probe startupProbe) {
    this._visitables.remove("startupProbe");
    if (startupProbe != null) {
        this.startupProbe = new V1ProbeBuilder(startupProbe);
        this._visitables.get("startupProbe").add(this.startupProbe);
    } else {
        this.startupProbe = null;
        this._visitables.get("startupProbe").remove(this.startupProbe);
    }
    return (A) this;
  }
  
  public A withStdin() {
    return withStdin(true);
  }
  
  public A withStdin(Boolean stdin) {
    this.stdin = stdin;
    return (A) this;
  }
  
  public A withStdinOnce() {
    return withStdinOnce(true);
  }
  
  public A withStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return (A) this;
  }
  
  public A withTargetContainerName(String targetContainerName) {
    this.targetContainerName = targetContainerName;
    return (A) this;
  }
  
  public A withTerminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
    return (A) this;
  }
  
  public A withTerminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
    return (A) this;
  }
  
  public A withTty() {
    return withTty(true);
  }
  
  public A withTty(Boolean tty) {
    this.tty = tty;
    return (A) this;
  }
  
  public A withVolumeDevices(List<V1VolumeDevice> volumeDevices) {
    if (this.volumeDevices != null) {
      this._visitables.get("volumeDevices").clear();
    }
    if (volumeDevices != null) {
        this.volumeDevices = new ArrayList();
        for (V1VolumeDevice item : volumeDevices) {
          this.addToVolumeDevices(item);
        }
    } else {
      this.volumeDevices = null;
    }
    return (A) this;
  }
  
  public A withVolumeDevices(V1VolumeDevice... volumeDevices) {
    if (this.volumeDevices != null) {
        this.volumeDevices.clear();
        _visitables.remove("volumeDevices");
    }
    if (volumeDevices != null) {
      for (V1VolumeDevice item : volumeDevices) {
        this.addToVolumeDevices(item);
      }
    }
    return (A) this;
  }
  
  public A withVolumeMounts(List<V1VolumeMount> volumeMounts) {
    if (this.volumeMounts != null) {
      this._visitables.get("volumeMounts").clear();
    }
    if (volumeMounts != null) {
        this.volumeMounts = new ArrayList();
        for (V1VolumeMount item : volumeMounts) {
          this.addToVolumeMounts(item);
        }
    } else {
      this.volumeMounts = null;
    }
    return (A) this;
  }
  
  public A withVolumeMounts(V1VolumeMount... volumeMounts) {
    if (this.volumeMounts != null) {
        this.volumeMounts.clear();
        _visitables.remove("volumeMounts");
    }
    if (volumeMounts != null) {
      for (V1VolumeMount item : volumeMounts) {
        this.addToVolumeMounts(item);
      }
    }
    return (A) this;
  }
  
  public A withWorkingDir(String workingDir) {
    this.workingDir = workingDir;
    return (A) this;
  }
  public class EnvFromNested<N> extends V1EnvFromSourceFluent<EnvFromNested<N>> implements Nested<N>{
  
    V1EnvFromSourceBuilder builder;
    int index;
  
    EnvFromNested(int index,V1EnvFromSource item) {
      this.index = index;
      this.builder = new V1EnvFromSourceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.setToEnvFrom(index, builder.build());
    }
    
    public N endEnvFrom() {
      return and();
    }
    
  }
  public class EnvNested<N> extends V1EnvVarFluent<EnvNested<N>> implements Nested<N>{
  
    V1EnvVarBuilder builder;
    int index;
  
    EnvNested(int index,V1EnvVar item) {
      this.index = index;
      this.builder = new V1EnvVarBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.setToEnv(index, builder.build());
    }
    
    public N endEnv() {
      return and();
    }
    
  }
  public class LifecycleNested<N> extends V1LifecycleFluent<LifecycleNested<N>> implements Nested<N>{
  
    V1LifecycleBuilder builder;
  
    LifecycleNested(V1Lifecycle item) {
      this.builder = new V1LifecycleBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.withLifecycle(builder.build());
    }
    
    public N endLifecycle() {
      return and();
    }
    
  }
  public class LivenessProbeNested<N> extends V1ProbeFluent<LivenessProbeNested<N>> implements Nested<N>{
  
    V1ProbeBuilder builder;
  
    LivenessProbeNested(V1Probe item) {
      this.builder = new V1ProbeBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.withLivenessProbe(builder.build());
    }
    
    public N endLivenessProbe() {
      return and();
    }
    
  }
  public class PortsNested<N> extends V1ContainerPortFluent<PortsNested<N>> implements Nested<N>{
  
    V1ContainerPortBuilder builder;
    int index;
  
    PortsNested(int index,V1ContainerPort item) {
      this.index = index;
      this.builder = new V1ContainerPortBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.setToPorts(index, builder.build());
    }
    
    public N endPort() {
      return and();
    }
    
  }
  public class ReadinessProbeNested<N> extends V1ProbeFluent<ReadinessProbeNested<N>> implements Nested<N>{
  
    V1ProbeBuilder builder;
  
    ReadinessProbeNested(V1Probe item) {
      this.builder = new V1ProbeBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.withReadinessProbe(builder.build());
    }
    
    public N endReadinessProbe() {
      return and();
    }
    
  }
  public class ResizePolicyNested<N> extends V1ContainerResizePolicyFluent<ResizePolicyNested<N>> implements Nested<N>{
  
    V1ContainerResizePolicyBuilder builder;
    int index;
  
    ResizePolicyNested(int index,V1ContainerResizePolicy item) {
      this.index = index;
      this.builder = new V1ContainerResizePolicyBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.setToResizePolicy(index, builder.build());
    }
    
    public N endResizePolicy() {
      return and();
    }
    
  }
  public class ResourcesNested<N> extends V1ResourceRequirementsFluent<ResourcesNested<N>> implements Nested<N>{
  
    V1ResourceRequirementsBuilder builder;
  
    ResourcesNested(V1ResourceRequirements item) {
      this.builder = new V1ResourceRequirementsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.withResources(builder.build());
    }
    
    public N endResources() {
      return and();
    }
    
  }
  public class RestartPolicyRulesNested<N> extends V1ContainerRestartRuleFluent<RestartPolicyRulesNested<N>> implements Nested<N>{
  
    V1ContainerRestartRuleBuilder builder;
    int index;
  
    RestartPolicyRulesNested(int index,V1ContainerRestartRule item) {
      this.index = index;
      this.builder = new V1ContainerRestartRuleBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.setToRestartPolicyRules(index, builder.build());
    }
    
    public N endRestartPolicyRule() {
      return and();
    }
    
  }
  public class SecurityContextNested<N> extends V1SecurityContextFluent<SecurityContextNested<N>> implements Nested<N>{
  
    V1SecurityContextBuilder builder;
  
    SecurityContextNested(V1SecurityContext item) {
      this.builder = new V1SecurityContextBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.withSecurityContext(builder.build());
    }
    
    public N endSecurityContext() {
      return and();
    }
    
  }
  public class StartupProbeNested<N> extends V1ProbeFluent<StartupProbeNested<N>> implements Nested<N>{
  
    V1ProbeBuilder builder;
  
    StartupProbeNested(V1Probe item) {
      this.builder = new V1ProbeBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.withStartupProbe(builder.build());
    }
    
    public N endStartupProbe() {
      return and();
    }
    
  }
  public class VolumeDevicesNested<N> extends V1VolumeDeviceFluent<VolumeDevicesNested<N>> implements Nested<N>{
  
    V1VolumeDeviceBuilder builder;
    int index;
  
    VolumeDevicesNested(int index,V1VolumeDevice item) {
      this.index = index;
      this.builder = new V1VolumeDeviceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.setToVolumeDevices(index, builder.build());
    }
    
    public N endVolumeDevice() {
      return and();
    }
    
  }
  public class VolumeMountsNested<N> extends V1VolumeMountFluent<VolumeMountsNested<N>> implements Nested<N>{
  
    V1VolumeMountBuilder builder;
    int index;
  
    VolumeMountsNested(int index,V1VolumeMount item) {
      this.index = index;
      this.builder = new V1VolumeMountBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralContainerFluent.this.setToVolumeMounts(index, builder.build());
    }
    
    public N endVolumeMount() {
      return and();
    }
    
  }
}