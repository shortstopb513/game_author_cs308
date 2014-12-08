package engine.actions.physics;

import java.util.ArrayList;
import java.util.Collection;

import engine.GameManager;
import engine.actions.physics.PhysicsIDAction.TwoArgInterface;
import engine.gameObject.GameObject;
import engine.gameObject.Identifier;
import engine.physics.PhysicsComponent;
import engine.physics.Vector;

/**
 * 
 * @author Ben
 *
 */
public abstract class PhysicsComponentAction extends PhysicsIDAction {

	public PhysicsComponentAction(ArrayList<Identifier> id, double value) {
		super(id, value);
	}

	@Override
	public void applyPhysics(Collection<GameObject> myObjects) {
		forHelper(myObjects, determineOperation(myObjects, myValue), myValue);
	}

	protected abstract TwoArgInterface determineOperation(
			Collection<GameObject> myObjects, Object value);

}
