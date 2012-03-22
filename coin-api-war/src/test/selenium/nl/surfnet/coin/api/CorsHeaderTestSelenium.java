/*
 * Copyright 2012 SURFnet bv, The Netherlands
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.surfnet.coin.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CorsHeaderTestSelenium extends ImplicitGrantTestSelenium {

  @Before
  public void login() throws Exception {
    super.implicitGrant();

  }

  @Test
  public void corsHeader() throws Exception {
  // TODO: test for existence of Cors-header. But how? WebDriver does not expose http headers.
    // Should be an integration test then, using HttpClient and client-credentials profile?
  }
}
