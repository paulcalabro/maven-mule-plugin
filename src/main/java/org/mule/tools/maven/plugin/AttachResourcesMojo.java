/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.tools.maven.plugin;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @phase validate
 * @goal attach-resources
 */
public class AttachResourcesMojo extends AbstractMuleMojo
{
    public void execute() throws MojoExecutionException, MojoFailureException
    {
        String appFolder = this.appDirectory.getAbsolutePath();
        
        getLog().info("attaching " + appFolder);
        
        this.project.addCompileSourceRoot(appFolder);
    }
}

