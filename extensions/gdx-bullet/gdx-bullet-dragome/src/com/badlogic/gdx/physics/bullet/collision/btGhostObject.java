/*-------------------------------------------------------
 * This file was automatically generated by XpeCodeGen
 *
 * Dont make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

/** @author xpenatan */
public class btGhostObject extends btCollisionObject {

    protected void create() {
        resetObj(createNative(), true);
    }

    private static long createNative() {
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var cobj=new Bullet.btGhostObject();",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(cobj);",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj=Bullet.wrapPointer(this.$$$cPointer,Bullet.btGhostObject);",this);
	}

    public int getNumOverlappingObjects() {
		checkPointer();
		return com.dragome.commons.javascript.ScriptHelper.evalInt("this.$$$jsObj.getNumOverlappingObjects();",this);
    }

    public btCollisionObject getOverlappingObject(int index, btCollisionWorld world) {
		checkPointer();
		long addr = 0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("addr=Bullet.getPointer(this.$$$jsObj.getOverlappingObject(index));",this);
		return world.bodies.get(addr);
    }
}