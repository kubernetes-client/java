/*
Copyright 2024 The Kubernetes Authors.
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
package io.kubernetes.client.e2e.util;

import io.kubernetes.client.util.KubeConfig;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Optional;

import static io.kubernetes.client.util.KubeConfig.*;

public class TestUtils {

    public static Optional<KubeConfig> getKubeConfig() {
        return findConfigInHomeDir().flatMap(TestUtils::getKubeConfig);
    }

    public static Optional<KubeConfig> getKubeConfig(File configInHomeDir) {
        try (InputStream inputStream = Files.newInputStream(configInHomeDir.toPath());
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            KubeConfig kubeConfig = KubeConfig.loadKubeConfig(bufferedReader);
            return Optional.of(kubeConfig);
        } catch (IOException e) {
            return Optional.empty();
        }
    }

    private static Optional<File> findConfigInHomeDir() {
        final File homeDir = findHomeDir();
        if (homeDir != null) {
            final File config = new File(new File(homeDir, KUBEDIR), KUBECONFIG);
            if (config.exists()) {
                return Optional.of(config);
            }
        }
        return Optional.empty();
    }

    private static File findHomeDir() {
        final String envHome = System.getenv(ENV_HOME);
        if (envHome != null && envHome.length() > 0) {
            final File config = new File(envHome);
            if (config.exists()) {
                return config;
            }
        }
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            String homeDrive = System.getenv("HOMEDRIVE");
            String homePath = System.getenv("HOMEPATH");
            if (homeDrive != null
                    && homeDrive.length() > 0
                    && homePath != null
                    && homePath.length() > 0) {
                File homeDir = new File(new File(homeDrive), homePath);
                if (homeDir.exists()) {
                    return homeDir;
                }
            }
            String userProfile = System.getenv("USERPROFILE");
            if (userProfile != null && userProfile.length() > 0) {
                File profileDir = new File(userProfile);
                if (profileDir.exists()) {
                    return profileDir;
                }
            }
        }
        return null;
    }

}
