/*
 *    Copyright 2017 Chimerapps
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.chimerapps.alexa.home.model.color;

import com.chimerapps.alexa.home.model.Color;

/**
 * @author Nicola Verbeeck
 * Date 11/04/2017.
 */
public class AchievedColorState {

	private final Color color;

	public AchievedColorState(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
