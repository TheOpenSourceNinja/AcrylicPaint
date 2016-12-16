/*
 * Copyright (C) 2014, 2016 Valerio Bozzolan & James Dearing (TheOpenSourceNinja)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package anupam.acrylic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.endsWith;
import org.hamcrest.core.CombinableMatcher;

public class PlacesTest {
	@Before
	public void setUp( ) throws Exception {
		
	}
	
	@After
	public void tearDown( ) throws Exception {
		
	}
	
	/*
	@Test
	public void getScreenshotFolder( ) throws Exception {
		Places testObject = new Places();
		File folder = testObject.getScreenshotFolder();
		assertThat( folder.getPath(), endsWith( "/Acrylic Paint/" ) );
	}
	
	@Test
	public void getCameraTempFolder( ) throws Exception {
		//Just creating some dummy tests for now. They will always fail. Replace this with a real test:
		assertFalse( "Test not implemented", true );
	}
	
	@Test
	public void getCameraTempFile( ) throws Exception {
		//Just creating some dummy tests for now. They will always fail. Replace this with a real test:
		assertFalse( "Test not implemented", true );
	}
	*/
}
