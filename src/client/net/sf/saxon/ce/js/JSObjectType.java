package client.net.sf.saxon.ce.js;

import client.net.sf.saxon.ce.Configuration;
import client.net.sf.saxon.ce.om.Item;
import client.net.sf.saxon.ce.om.NamePool;
import client.net.sf.saxon.ce.type.*;

/**
 *
 */
public class JSObjectType implements ItemType {

    private static JSObjectType THE_INSTANCE = new JSObjectType();

    public static JSObjectType getInstance() {
        return THE_INSTANCE;
    }

    public boolean isAtomicType() {
        return false;
    }

    public boolean matchesItem(Item item, boolean allowURIPromotion, Configuration config) {
        return item instanceof JSObjectValue;
    }

    public ItemType getSuperType(TypeHierarchy th) {
        return AnyItemType.getInstance();
    }

    public ItemType getPrimitiveItemType() {
        return AnyItemType.getInstance();
    }

    public int getPrimitiveType() {
        return Type.ITEM;
    }

    public String toString(NamePool pool) {
        return "JavaScriptObject";
    }

    public AtomicType getAtomizedItemType() {
        return null;
    }
}

// This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
// If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
// This Source Code Form is “Incompatible With Secondary Licenses”, as defined by the Mozilla Public License, v. 2.0.


