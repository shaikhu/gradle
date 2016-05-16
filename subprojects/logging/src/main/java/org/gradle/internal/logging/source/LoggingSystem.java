/*
 * Copyright 2016 the original author or authors.
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

package org.gradle.internal.logging.source;

/**
 * Some configurable logging system, whose state can be snapshot, mutated and restored.
 */
public interface LoggingSystem {
    /**
     * Snapshots the current configuration state of this logging system.
     */
    Snapshot snapshot();

    /**
     * Resets this logging system to some previous configuration state.
     */
    void restore(Snapshot state);

    interface Snapshot {
    }
}
