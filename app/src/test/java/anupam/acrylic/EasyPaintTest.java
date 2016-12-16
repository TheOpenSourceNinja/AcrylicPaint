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

import android.net.Uri;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class EasyPaintTest {
	@Before
	public void setUp( ) throws Exception {
		
	}
	
	@After
	public void tearDown( ) throws Exception {
		
	}
	
	/*
	@Test
	public void onCreate( ) throws Exception {
		//Just creating some dummy tests for now. They will always fail. Replace this with a real test:
		assertFalse( "Test not implemented", true );
	}
	
	@Test
	public void onBackPressed( ) throws Exception {
		//Just creating some dummy tests for now. They will always fail. Replace this with a real test:
		assertFalse( "Test not implemented", true );
	}
	
	@Test
	public void colorChanged( ) throws Exception {
		//Just creating some dummy tests for now. They will always fail. Replace this with a real test:
		assertFalse( "Test not implemented", true );
	}
	
	@Test
	public void onCreateOptionsMenu( ) throws Exception {
		//Just creating some dummy tests for now. They will always fail. Replace this with a real test:
		assertFalse( "Test not implemented", true );
	}
	
	@Test
	public void onPrepareOptionsMenu( ) throws Exception {
		//Just creating some dummy tests for now. They will always fail. Replace this with a real test:
		assertFalse( "Test not implemented", true );
	}
	
	@Test
	public void onOptionsItemSelected( ) throws Exception {
		//Just creating some dummy tests for now. They will always fail. Replace this with a real test:
		assertFalse( "Test not implemented", true );
	}
	
	@Test
	public void onActivityResult( ) throws Exception {
		//Just creating some dummy tests for now. They will always fail. Replace this with a real test:
		assertFalse( "Test not implemented", true );
	}
	*/
	
	@Rule
	public ExpectedException thrown = ExpectedException.none( );
	
	@Test
	public void setBackgroundUriNull( ) throws Exception {
		EasyPaint testObject = new EasyPaint();
		testObject.setBackgroundUri( null ); //Should just return without throwing an exception
	}
	
	//Testing what happens when the URI points to a nonexistent file
	/* I couldn't figure out how to do the following test, so I'm commenting it out for now ~TheOpenSourceNinja
	@Rule
	public ExpectedException thrown2 = ExpectedException.none( );
	@Mock
	Uri uri;
	@Test
	public void setBackgroundUriNonexistent( ) throws Exception {
		EasyPaint testObject = new EasyPaint();
		testObject.setBackgroundUri( uri ); //This function should handle the exception itself, not throw it
	}
	*/
	
	//Testing what happens when the URI points to a badly formatted file
	/* I couldn't figure out how to do the following test, so I'm commenting it out for now ~TheOpenSourceNinja
	@Rule
	public ExpectedException thrown2 = ExpectedException.none( );
	@Mock
	Uri uri;
	File file;
	@Test
	public void setBackgroundUriBadFile( ) throws Exception {
		EasyPaint testObject = new EasyPaint();
		testObject.setBackgroundUri( uri ); //This function should handle the exception itself, not throw it
	}
	*/
	
	/*
	@Test
	public void loadFromIntents( ) throws Exception {
		EasyPaint testObject = new EasyPaint();
		testObject.loadFromIntents();
	}
	*/
}
