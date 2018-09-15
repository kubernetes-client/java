/*
Copyright 2018 The Kubernetes Authors.
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
import io.kubernetes.client.util.Config;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * A simple example of how to parse a Kubernetes object.
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.ParseExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class ParseExample {
  public static void main(String[] args) throws IOException, ApiException, ClassNotFoundException {
    if (args.length < 2) {
      System.err.println("Usage: ParseExample <file-name> <class-name e.g. V1Pod>");
      System.exit(1);
    }
    ApiClient client = Config.defaultClient();
    FileReader json = new FileReader(args[0]);
    Object obj =
        client
            .getJSON()
            .getGson()
            .fromJson(json, Class.forName("io.kubernetes.client.models." + args[1]));

    String output = client.getJSON().getGson().toJson(obj);

    // Test round tripping...
    Object obj2 =
        client
            .getJSON()
            .getGson()
            .fromJson(
                new StringReader(output), Class.forName("io.kubernetes.client.models." + args[1]));

    String output2 = client.getJSON().getGson().toJson(obj2);

    // Validate round trip
    if (!output.equals(output2)) {
      System.err.println("Error, expected:\n" + output + "\nto equal\n" + output2);
      System.exit(2);
    }

    System.out.println(output);
  }
}
