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

import static io.kubernetes.client.extended.kubectl.Kubectl.exec;
import static io.kubernetes.client.extended.kubectl.Kubectl.label;
import static io.kubernetes.client.extended.kubectl.Kubectl.log;
import static io.kubernetes.client.extended.kubectl.Kubectl.scale;
import static io.kubernetes.client.extended.kubectl.Kubectl.version;

import com.google.common.io.ByteStreams;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.kubectl.KubectlExec;
import io.kubernetes.client.extended.kubectl.KubectlLog;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1ReplicationController;
import io.kubernetes.client.openapi.models.V1Service;
import io.kubernetes.client.util.Config;
import java.util.Arrays;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * A Java equivalent for the kubectl command line tool. Not nearly as complete.
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.KubectlExample"
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
      case "log":
        name = args[1];
        KubectlLog log = log();
        log.name(name).namespace(ns).container(cli.getOptionValue("c", "")).execute();
        ByteStreams.copy(log.stream(), System.out);
        System.exit(0);
      case "scale":
        kind = args[1];
        name = args[2];
        if (!cli.hasOption("r")) {
          System.err.println("--replicas <n> is required");
          System.exit(-3);
        }
        int replicas = Integer.parseInt(cli.getOptionValue("r"));
        scale(client, getClassForKind(kind)).namespace(ns).name(name).replicas(replicas).execute();
        System.out.println("Deployment scaled.");
        System.exit(0);
      case "version":
        System.out.println(version(client));
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
        label(client, clazz).namespace(ns).name(name).addLabel(labelKey, labelValue);
        System.exit(0);
      case "exec":
        name = args[1];
        String[] command = Arrays.copyOfRange(args, 2, args.length);
        KubectlExec e =
            exec(client)
                .namespace(ns)
                .name(name)
                .command(command)
                .container(cli.getOptionValue("c", ""));
        System.exit(e.execute());
      default:
        System.out.println("Unknown verb: " + verb);
        System.exit(-1);
    }
  }
}
