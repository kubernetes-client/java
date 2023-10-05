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
package io.kubernetes.client.persister;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import io.kubernetes.client.persister.ConfigPersister;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

public class FilePersister implements ConfigPersister {
  File configFile;

  public FilePersister(String filename) {
    this(new File(filename));
  }

  public FilePersister(File file) {
    this.configFile = file;
  }

  public void save(
      ArrayList<Object> contexts,
      ArrayList<Object> clusters,
      ArrayList<Object> users,
      Object preferences,
      String currentContext)
      throws IOException {
    HashMap<String, Object> config = new HashMap<>();
    config.put("apiVersion", "v1");
    config.put("kind", "Config");
    config.put("current-context", currentContext);
    config.put("preferences", preferences);

    config.put("clusters", clusters);
    config.put("contexts", contexts);
    config.put("users", users);

    // Note this is imperfect, should protect against other processes writing this file too...
    synchronized (configFile) {
      try (FileWriter fw = new FileWriter(configFile)) {
        Yaml yaml = new Yaml(new SafeConstructor(new LoaderOptions()));
        yaml.dump(config, fw);
        fw.flush();
      }
    }
  }
}
