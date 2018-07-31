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
package org.eclipse.che.plugin.php.ide.action;

import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import org.eclipse.che.ide.CoreLocalizationConstant;
import org.eclipse.che.ide.api.app.AppContext;
import org.eclipse.che.ide.api.editor.EditorAgent;
import org.eclipse.che.ide.api.notification.NotificationManager;
import org.eclipse.che.ide.newresource.AbstractNewResourceAction;
import org.eclipse.che.ide.ui.dialogs.DialogFactory;
import org.vectomatic.dom.svg.ui.SVGResource;

/**
 * Base class for new PHP resource
 *
 * <p>Show/hide action depend on project type
 *
 * @author Kaloyan Raev
 */
public abstract class NewPhplikeResourceAction extends AbstractNewResourceAction {

  protected final AppContext appContext;

  /**
   * Creates new action.
   *
   * @param title action's title
   * @param description action's description
   * @param svgIcon
   */
  public NewPhplikeResourceAction(
      String title,
      String description,
      SVGResource svgIcon,
      DialogFactory dialogFactory,
      CoreLocalizationConstant coreLocalizationConstant,
      EventBus eventBus,
      AppContext appContext,
      NotificationManager notificationManager,
      Provider<EditorAgent> editorAgentProvider) {
    super(
        title,
        description,
        svgIcon,
        dialogFactory,
        coreLocalizationConstant,
        eventBus,
        appContext,
        notificationManager,
        editorAgentProvider);
    this.appContext = appContext;
  }
}
