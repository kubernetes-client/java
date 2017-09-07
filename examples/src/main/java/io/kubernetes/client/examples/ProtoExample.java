/*
Copyright 2017 The Kubernetes Authors.
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

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.ProtoClient;
import io.kubernetes.client.proto.V1.Pod;
import io.kubernetes.client.proto.V1.PodList;
import io.kubernetes.client.util.Config;

import java.io.IOException;


/**
 * A simple example of how to use the Java API
 * 
 * Easiest way to run this:
 *   mvn exec:java -Dexec.mainClass="io.kubernetes.client.examples.ProtoExample"
 * 
 * From inside $REPO_DIR/examples
 */
public class ProtoExample {
    public static void main(String[] args) throws IOException, ApiException, InterruptedException {
        ApiClient client = Config.defaultClient();
        Configuration.setDefaultApiClient(client);

        ProtoClient pc = new ProtoClient(client);
        PodList list = pc.list(PodList.newBuilder(), "/api/v1/namespaces/default/pods");

        if (list.getItemsCount() > 0) {
            Pod p = list.getItems(0);
            System.out.println(p.toString());
        }
    }
}
