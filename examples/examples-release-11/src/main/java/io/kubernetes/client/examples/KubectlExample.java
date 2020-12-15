/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client.examples;

import static io.kubernetes.client.extended.kubectl.Kubectl.apiResources;
import static io.kubernetes.client.extended.kubectl.Kubectl.copy;
import static io.kubernetes.client.extended.kubectl.Kubectl.cordon;
import static io.kubernetes.client.extended.kubectl.Kubectl.delete;
import static io.kubernetes.client.extended.kubectl.Kubectl.drain;
import static io.kubernetes.client.extended.kubectl.Kubectl.exec;
import static io.kubernetes.client.extended.kubectl.Kubectl.label;
import static io.kubernetes.client.extended.kubectl.Kubectl.log;
import static io.kubernetes.client.extended.kubectl.Kubectl.portforward;
import static io.kubernetes.client.extended.kubectl.Kubectl.scale;
import static io.kubernetes.client.extended.kubectl.Kubectl.taint;
import static io.kubernetes.client.extended.kubectl.Kubectl.top;
import static io.kubernetes.client.extended.kubectl.Kubectl.uncordon;
import static io.kubernetes.client.extended.kubectl.Kubectl.version;
import static io.kubernetes.client.extended.kubectl.KubectlTop.podMetricSum;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.custom.NodeMetrics;
import io.kubernetes.client.custom.PodMetrics;
import io.kubernetes.client.extended.kubectl.KubectlExec;
import io.kubernetes.client.extended.kubectl.KubectlPortForward;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1ReplicationController;
import io.kubernetes.client.openapi.models.V1Service;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.Streams;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.lang3.tuple.Pair;

/**
 * A Java equivalent for the kubectl command line tool. Not nearly as complete.
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.KubectlExample" -Dexec.args="log some-pod"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class KubectlExample {
  static Class<? extends KubernetesObject> getClassForKind(String kind) {
    switch (kind) {
      case "pod":
      case "pods":
        return V1Pod.class;
      case "deployment":
      case "deployments":
        return V1Deployment.class;
      case "service":
      case "services":
        return V1Service.class;
      case "node":
      case "nodes":
        return V1Node.class;
      case "replicationcontroller":
      case "replicationcontrollers":
        return V1ReplicationController.class;
    }
    return null;
  }

  private static final String PADDING = "                              ";

  private static String pad(String value) {
    while (value.length() < PADDING.length()) {
      value += " ";
    }
    return value;
  }

  public static void main(String[] args)
      throws java.io.IOException, KubectlException, ParseException {
    ApiClient client = Config.defaultClient();

    Options options = new Options();
    options.addOption(new Option("n", "namespace", true, "The namespace for the resource"));
    options.addOption(new Option("r", "replicas", true, "The number of replicas to scale to"));
    options.addOption(new Option("c", "container", true, "The container in a pod to connect to"));
    DefaultParser parser = new DefaultParser();
    CommandLine cli = parser.parse(options, args);

    args = cli.getArgs();
    String verb = args[0];
    String ns = cli.getOptionValue("n", "default");
    String kind = null;
    String name = null;

    switch (verb) {
      case "delete":
        kind = args[1];
        name = args[2];
        delete(getClassForKind(kind)).namespace(ns).name(name).execute();
      case "drain":
        name = args[1];
        drain().apiClient(client).name(name).execute();
        System.out.println("Node drained");
        System.exit(0);
      case "cordon":
        name = args[1];
        cordon().apiClient(client).name(name).execute();
        System.out.println("Node cordoned");
        System.exit(0);
      case "uncordon":
        name = args[1];
        uncordon().apiClient(client).name(name).execute();
        System.out.println("Node uncordoned");
        System.exit(0);
      case "top":
        String what = args[1];
        switch (what) {
          case "nodes":
          case "node":
            List<Pair<V1Node, NodeMetrics>> nodes =
                top(V1Node.class, NodeMetrics.class).apiClient(client).metric("cpu").execute();
            System.out.println(pad("Node") + "\tCPU\t\tMemory");
            for (Pair<V1Node, NodeMetrics> node : nodes) {
              System.out.println(
                  pad(node.getLeft().getMetadata().getName())
                      + "\t"
                      + node.getRight().getUsage().get("cpu").getNumber()
                      + "\t"
                      + node.getRight().getUsage().get("memory").getNumber());
            }
            System.exit(0);
          case "pods":
          case "pod":
            List<Pair<V1Pod, PodMetrics>> pods =
                top(V1Pod.class, PodMetrics.class)
                    .apiClient(client)
                    .namespace(ns)
                    .metric("cpu")
                    .execute();
            System.out.println(pad("Pod") + "\tCPU\t\tMemory");
            for (Pair<V1Pod, PodMetrics> pod : pods) {
              System.out.println(
                  pad(pod.getLeft().getMetadata().getName())
                      + "\t"
                      + podMetricSum(pod.getRight(), "cpu")
                      + "\t"
                      + podMetricSum(pod.getRight(), "memory"));
            }
            System.exit(0);
        }
        System.err.println("Unknown top argument: " + what);
        System.exit(-1);
      case "cp":
        String from = args[1];
        String to = args[2];
        if (from.indexOf(":") != -1) {
          String[] parts = from.split(":");
          name = parts[0];
          from = parts[1];
          copy()
              .apiClient(client)
              .namespace(ns)
              .name(name)
              .container(cli.getOptionValue("c", ""))
              .fromPod(from)
              .to(to)
              .execute();
        } else if (to.indexOf(":") != -1) {
          String[] parts = to.split(":");
          name = parts[0];
          to = parts[1];
          copy()
              .apiClient(client)
              .namespace(ns)
              .name(name)
              .container(cli.getOptionValue("c", ""))
              .from(from)
              .toPod(to)
              .execute();
        } else {
          System.err.println("Missing pod name for copy.");
          System.exit(-1);
        }
        System.out.println("Copied " + from + " -> " + to);
        System.exit(0);
      case "taint":
        name = args[1];
        String taintSpec = args[2];
        boolean remove = taintSpec.endsWith("-");
        int ix = taintSpec.indexOf("=");
        int ix2 = taintSpec.indexOf(":");

        if (remove) {
          taintSpec = taintSpec.substring(0, taintSpec.length() - 2);
          String key = ix == -1 ? taintSpec : taintSpec.substring(0, ix);
          String effect = ix == -1 ? null : taintSpec.substring(ix + 1);

          if (effect == null) {
            taint().apiClient(client).name(name).removeTaint(key).execute();
          } else {
            taint().apiClient(client).name(name).removeTaint(key, effect).execute();
          }
          System.exit(0);
        }
        if (ix2 == -1) {
          System.err.println("key:effect or key=value:effect is required.");
          System.exit(-1);
        }
        String key = taintSpec.substring(0, ix == -1 ? ix2 : ix);
        String value = ix == -1 ? null : taintSpec.substring(ix + 1, ix2);
        String effect = taintSpec.substring(ix2 + 1);

        if (value == null) {
          taint().apiClient(client).name(name).addTaint(key, effect).execute();
        } else {
          taint().apiClient(client).name(name).addTaint(key, value, effect).execute();
        }
        System.exit(0);
      case "portforward":
        name = args[1];
        KubectlPortForward forward = portforward().apiClient(client).name(name).namespace(ns);
        for (int i = 2; i < args.length; i++) {
          String port = args[i];
          String[] ports = port.split(":");
          System.out.println("Forwarding " + ns + "/" + name + " " + ports[0] + "->" + ports[1]);
          forward.ports(Integer.parseInt(ports[0]), Integer.parseInt(ports[1]));
        }
        forward.execute();
        System.exit(0);
      case "log":
        name = args[1];
        Streams.copy(
            log()
                .apiClient(client)
                .name(name)
                .namespace(ns)
                .container(cli.getOptionValue("c", ""))
                .execute(),
            System.out);
        System.exit(0);
      case "scale":
        kind = args[1];
        name = args[2];
        if (!cli.hasOption("r")) {
          System.err.println("--replicas <n> is required");
          System.exit(-3);
        }
        int replicas = Integer.parseInt(cli.getOptionValue("r"));
        scale(getClassForKind(kind))
            .apiClient(client)
            .namespace(ns)
            .name(name)
            .replicas(replicas)
            .execute();
        System.out.println("Deployment scaled.");
        System.exit(0);
      case "version":
        System.out.println(version().apiClient(client));
        System.exit(0);
      case "label":
        kind = args[1];
        name = args[2];
        String labelKey = args[3];
        String labelValue = args[4];
        Class<? extends KubernetesObject> clazz = getClassForKind(kind);
        if (clazz == null) {
          System.err.println("Unknown kind: " + kind);
          System.exit(-2);
        }
        label(clazz).apiClient(client).namespace(ns).name(name).addLabel(labelKey, labelValue);
        System.exit(0);
      case "exec":
        name = args[1];
        String[] command = Arrays.copyOfRange(args, 2, args.length);
        KubectlExec e =
            exec()
                .apiClient(client)
                .namespace(ns)
                .name(name)
                .command(command)
                .container(cli.getOptionValue("c", ""));
        System.exit(e.execute());
      case "api-resources":
        apiResources().apiClient(client).execute().stream()
            .forEach(
                r ->
                    System.out.printf(
                        "%s\t\t%s\t\t%s\t\t%s\n",
                        r.getResourcePlural(), r.getGroup(), r.getKind(), r.getNamespaced()));
        System.exit(0);
      default:
        System.out.println("Unknown verb: " + verb);
        System.exit(-1);
    }
  }
}
