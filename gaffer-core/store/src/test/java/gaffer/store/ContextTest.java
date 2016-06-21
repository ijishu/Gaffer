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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import gaffer.user.User;
import org.junit.Test;

public class ContextTest {
    @Test
    public void shouldConstructContextWithUser() {
        // Given
        final User user = new User();

        // When
        final Context context = new Context(user);

        // Then
        assertEquals(user, context.getUser());
        assertTrue(context.getCache().isEmpty());
    }

    @Test
    public void shouldConstructContextWithUnknownUser() {
        // Given
        // When
        final Context context = new Context();

        // Then
        assertEquals(User.UNKNOWN_USER_ID, context.getUser().getUserId());
    }
}