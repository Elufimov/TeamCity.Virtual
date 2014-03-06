/*
 * Copyright 2000-2014 Eugene Petrenko
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

package com.jonnyzzz.teamcity.virtual.run;

import com.jonnyzzz.teamcity.virtual.VMConstants;
import com.jonnyzzz.teamcity.virtual.util.util.BuildProcessContinuation;
import jetbrains.buildServer.agent.BuildRunnerContext;
import jetbrains.buildServer.agent.runner.CommandLineBuildServiceFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @author Eugene Petrenko (eugene.petrenko@gmail.com)
 */
public class VagrantVM implements VMRunner {
  private final CommandLineBuildServiceFactory myCmd;

  public VagrantVM(@NotNull final CommandLineBuildServiceFactory cmd) {
    myCmd = cmd;
  }

  @NotNull
  @Override
  public String getVMName() {
    return VMConstants.VM_VAGRANT;
  }

  @NotNull
  @Override
  public String getCaption() {
    return "Vagrant";
  }

  @Override
  public void constructBuildProcess(@NotNull final BuildRunnerContext context,
                                    @NotNull final BuildProcessContinuation proc) {

  }
}