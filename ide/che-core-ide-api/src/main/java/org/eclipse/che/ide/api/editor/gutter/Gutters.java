/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.api.editor.gutter;

public final class Gutters {

  private Gutters() {}

  /** Logical identifer for the breakpoints gutter. */
  public static final String BREAKPOINTS_GUTTER = "breakpoints";

  /** Logical identifer for the vcs change markers gutter. */
  public static final String VCS_CHANGE_MARKERS_GUTTER = "vcsChangeMarkersGutter";

  /** Logical identifer for the line number gutter. */
  public static final String LINE_NUMBERS_GUTTER = "lineNumbers";

  /** Logical identifer for the annotations gutter. */
  public static final String ANNOTATION_GUTTER = "annotation";
}
