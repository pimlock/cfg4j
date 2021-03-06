/*
 * Copyright 2015 Norbert Potocki (norbert.potocki@nort.pl)
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
package org.cfg4j.source.refresh.strategy;

import org.cfg4j.source.refresh.RefreshStrategy;
import org.cfg4j.source.refresh.Refreshable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link RefreshStrategy} that refreshes the resource only once - the moment the {@link #init(Refreshable)} is called.
 */
public class OnInitRefreshStrategy implements RefreshStrategy {

  private static final Logger LOG = LoggerFactory.getLogger(OnInitRefreshStrategy.class);

  @Override
  public void init(Refreshable resource) {
    LOG.info("Initializing " + OnInitRefreshStrategy.class);
        resource.refresh();
  }

  @Override
  public void shutdown() {
    LOG.info("Shutting down " + OnInitRefreshStrategy.class);
  }
}
