/**
 * Copyright (c) 2003-2009, Xith3D Project Group all rights reserved.
 * 
 * Portions based on the Java3D interface, Copyright by Sun Microsystems.
 * Many thanks to the developers of Java3D and Sun Microsystems for their
 * innovation and design.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * 
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * 
 * Neither the name of the 'Xith3D Project Group' nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) A
 * RISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE
 */
package org.xith3d.utility.sgtree.infoitems;

import org.xith3d.scenegraph.TransparencyAttributes;

/**
 * Xith3DTree
 * 
 * Display a Xith3D scenegraph in a Swing Tree control
 * 
 * @author Daniel Selman (Java3D version)
 * @author Hawkwind
 * @author Amos Wenger (aka BlueSky)
 */
public class SGTInfo_TransparencyAttributes extends SGTInfo_Object
{
    //
    // private static final int[] m_kCapabilityArray =
    // {
    // TransparencyAttributes.ALLOW_MODE_READ,
    // TransparencyAttributes.ALLOW_VALUE_READ
    // };
    
    public SGTInfo_TransparencyAttributes()
    {
    }
    
    @Override
    java.util.List< ? > getChildren( Object obj )
    {
        return super.getChildren( obj );
    }
    
    @Override
    public int[] getCapabilityBits()
    {
        return null;
    }
    
    @Override
    public String getInfo( Object obj )
    {
        String szText = super.getInfo( obj );
        
        szText = insertSectionBreak( szText );
        szText += "Transparency Attributes\r\n";
        
        TransparencyAttributes transparencyAttribs = (TransparencyAttributes)obj;
        
        szText += "Transparency: " + transparencyAttribs.getTransparency() + "\r\n";
        szText += "Mode: " + transparencyAttribs.getMode() + "\r\n";
        
        return szText;
    }
}
