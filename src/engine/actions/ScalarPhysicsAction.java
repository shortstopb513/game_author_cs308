package engine.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import engine.actions.PhysicsIDAction.TwoArgInterface;
import engine.gameObject.GameObject;
import engine.gameObject.Identifier;
import engine.physics.Mass;
import engine.physics.Scalar;

/**
 * 
 * @author Ben
 *
 */
public abstract class ScalarPhysicsAction extends PhysicsComponentAction {

	public ScalarPhysicsAction(List<Identifier> id, Double value) {
		super(id, value);
		// TODO Auto-generated constructor stub
	}

	protected TwoArgInterface determineOperation(
			Collection<GameObject> myObjects, Object value) {
		// Scalar is abstract and will be overwritten anyway, so for now it's a
		// mass
		Scalar a = new Mass(0);
		return (x, y) -> x.getPhysicsBody().addScalar(
				determineScalar((Double) value, a));
	}

	protected abstract Scalar determineScalar(double value, Scalar scalar);
}
