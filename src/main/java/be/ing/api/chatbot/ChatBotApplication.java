/*
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package be.ing.api.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
@RestController
public class ChatBotApplication {

  private static String version = null;

  @RequestMapping("/")
  public String home() {
    return "Hello, this api is for testing purpose! Only some functionalities are ready to be used.";
  }

  /**
   * (Optional) App Engine health check endpoint mapping.
   * @see <a href="https://cloud.google.com/appengine/docs/flexible/java/how-instances-are-managed#health_checking"></a>
   * If your app does not handle health checks, a HTTP 404 response is interpreted
   *     as a successful reply.
   */
  @RequestMapping("/_ah/health")
  public String healthy() {
    // Message body required though ignored
    return "Still surviving.";
  }

  @RequestMapping("/_ah/version")
  public String version() {
    if (version == null) {
      setVersion();
    }

    return version;
  }

  private void setVersion() {
    final Properties properties = new Properties();
    try {
      properties.load(this.getClass().getClassLoader().getResourceAsStream("application.properties"));
      version = properties.getProperty("version");
    } catch (NullPointerException | IOException e) {
      e.printStackTrace();
      version = "version unknown";
    }
  }

  public static void main(String[] args) {
    SpringApplication.run(ChatBotApplication.class, args);
  }
}
