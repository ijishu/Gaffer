/*
 * Copyright 2016 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gaffer.store;

/**
 * A <code>StoreTrait</code> defines functionality for {@link gaffer.store.Store} implementations.
 */
public enum StoreTrait {
    /**
     * Similar {@link gaffer.data.element.Element}s are aggregated/merged together.
     */
    AGGREGATION,

    /**
     * Most stores should have this trait as if you use Operation.validateFilter(Element) in you handlers,
     * it will deal with the filtering for you.
     * {@link gaffer.data.element.Element}s are filtered using {@link gaffer.function.FilterFunction}s defined in a
     * {@link gaffer.data.elementdefinition.view.View}.
     */
    FILTERING,

    /**
     * {@link gaffer.data.element.Element} {@link gaffer.data.element.Properties} are transformed using
     * {@link gaffer.function.TransformFunction}s defined in a {@link gaffer.data.elementdefinition.view.View}.
     */
    TRANSFORMATION,

    /**
     * Elements will be validated continuously and removed if they are found to
     * be invalid based on {@link gaffer.function.FilterFunction}s defined in the
     * {@link gaffer.store.schema.Schema}.
     */
    STORE_VALIDATION
}
