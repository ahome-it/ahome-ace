/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.ace.client;

/**
 * Represents a cursor position.
 */
public class AceEditorCursorPosition {
	private final int row, column;

	/**
	 * Constructor.
	 * 
	 * @param row
	 *            row (0 for first row)
	 * @param column
	 *            column (0 for first column)
	 */
	public AceEditorCursorPosition(int row, int column) {
		this.row = row;
		this.column = column;
	}

	/**
	 * @return the row (0 for first row)
	 */
	public int getRow() {
		return row;
	}

	/**
	 * @return the column (0 for first column)
	 */
	public int getColumn() {
		return column;
	}

	@Override
	public String toString() {
		return row + ":" + column;
	}
}
