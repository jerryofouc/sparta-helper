/*
 * Copyright © 2012-2013 mumu@yfyang. All Rights Reserved.
 */

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package io.github.sparta.helpers;

/**
 * No operation class to remove checkstyle's fall-through try/catch block.
 * @author JunHo Yoon
 * @since 3.0
 */
public final class NoOp {
	/**
	 * Private Constructor not to make the instance.
	 */
	private NoOp() {
	}
	/**
	 * No operation.
	 */
	public static void noOp() {
	}
}
