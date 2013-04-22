/*
 * Copyright 2002-2013 SCOOP Software GmbH
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
package de.scoopgmbh.copper.gui.util;

import javafx.scene.control.ProgressIndicator;

public class ComponentUtil {
	
	public static ProgressIndicator createProgressIndicator(){
		ProgressIndicator indicator = new ProgressIndicator();
		
		indicator.setStyle("-fx-background-color: rgba(230,230,230,0.7);" +
					"-fx-padding: 5em 5em 5em 5em;");

		return indicator;
	}

}
