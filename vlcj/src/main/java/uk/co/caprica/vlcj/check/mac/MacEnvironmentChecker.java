/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2009, 2010 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.check.mac;

import java.util.ArrayList;
import java.util.List;

import uk.co.caprica.vlcj.check.EnvironmentChecker;

public class MacEnvironmentChecker extends EnvironmentChecker {

  private static final String SHARED_LIBRARY_NAME = "";

  private static final List<String> SHARED_LIBRARY_PATHS = new ArrayList<String>();
  
  @Override
  protected String getSharedLibraryName() {
    return SHARED_LIBRARY_NAME;
  }

  @Override
  protected List<String> getSharedLibraryPaths() {
    return SHARED_LIBRARY_PATHS;
  }

  @Override
  protected void checkNativeEnvironment() {
  }
}
