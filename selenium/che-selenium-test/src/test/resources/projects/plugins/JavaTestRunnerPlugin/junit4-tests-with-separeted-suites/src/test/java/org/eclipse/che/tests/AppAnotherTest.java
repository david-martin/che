/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which is available at http://www.eclipse.org/legal/epl-2.0.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.tests;

import org.eclipse.che.example.Hello;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppAnotherTest {

    @Test
    public void shouldSuccessOfAppAnother() {
        assertTrue(new Hello().returnHello().startsWith("Hello"));
    }

    @Test
    public void shouldFailOfAppAnother() {
        assertTrue(new Hello().returnHello().endsWith("Hello"));
    }


}
